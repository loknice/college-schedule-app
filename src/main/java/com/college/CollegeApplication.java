package com.college;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CollegeApplication implements CommandLineRunner {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public static void main(String[] args) {
        SpringApplication.run(CollegeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Schedule from CSV");
            System.out.println("2. View All Schedules");
            System.out.println("3. Drop All Schedules");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addScheduleFromCsv();
                    break;
                case 2:
                    viewAllSchedules();
                    break;
                case 3:
                    dropAllSchedules();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addScheduleFromCsv() {
        try (CSVReader reader = new CSVReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("schedule.csv")))) {
            List<String[]> records = reader.readAll();
            
            records.remove(0); // Remove the first line with column titles

            List<Schedule> scheduleList = new ArrayList<>();
            for (String[] record : records) {
                Schedule schedule = new Schedule(
                    record[0], // studentFirstName
                    record[1], // studentLastName
                    record[2], // teacherFirstName
                    record[3], // teacherLastName
                    record[4], // courseName
                    record[5], // departmentName
                    record[6], // roomNumber
                    record[7], // semester
                    record[8], // year
                    record[9], // startTime
                    record[10] // endTime
                );

                scheduleList.add(schedule);
            }
            
            scheduleRepository.saveAll(scheduleList);
            System.out.println(scheduleList.size() + " schedules added successfully from CSV.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to add schedules from CSV.");
        }
    }

    private void viewAllSchedules() {
        List<Schedule> schedules = scheduleRepository.findAll();
        if (schedules.isEmpty()) {
            System.out.println("No schedules found.");
        } else {
            System.out.println("Found " + schedules.size() + " schedules:");
            schedules.forEach(System.out::println);
        }
    }

    private void dropAllSchedules() {
        scheduleRepository.deleteAll();
        System.out.println("All schedules have been dropped.");
    }
}