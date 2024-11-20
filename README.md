# Приклад Java-програми ведення розкладу коледжу з використанням СКБД MongoDB

## Кроки для виконання
1. Завантажте і встановіть Java Development Kit 23 for Windows.
1. Завантажте Maven з https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.zip і розпакуйте його на локальний комп'ютер.
1. В Windows в параметрах системи додайте системну змінну MAVEN_HOME=<шлях до папки з Maven>
1. В Windows в параметрах системи додайте `;<шлях до папки з Maven>\bin` в системну змінну PATH.
1. Встановіть СКБД MongoDB Community Server вибрати варіант установки Complete -> "Run service as Network Service user"
1. Встановіть MongoDB Compass (GUI).
1. Створіть базу даних `college-db` і колекцію в ній `college-schedule`.
1. Зберить програму використовуючи команду `mvn clean install`.
1. Запустіть програму за допомогою команди `mvn exec:java -Dexec.mainClass="com.college.CollegeApplication"`.

## Результати виконання програми
'''
  .   ____          _            __ _ _  
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \ 
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.4)

2024-11-20 21:33:49.672  INFO 12432 --- [           main] com.college.CollegeApplication           : Starting CollegeApplication using Java 23 on DESKTOP-11MK3R9 with PID 12432 (C:\Users\dmitr\OneDrive\Documents\GitHub\college-schedule-app\target\classes started by dmitr in C:\Users\dmitr\OneDrive\Documents\GitHub\college-schedule-app)
2024-11-20 21:33:49.675  INFO 12432 --- [           main] com.college.CollegeApplication           : No active profile set, falling back to default profiles: default
2024-11-20 21:33:50.502  INFO 12432 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2024-11-20 21:33:50.586  INFO 12432 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 75 ms. Found 1 MongoDB repository interfaces.
2024-11-20 21:33:51.213  INFO 12432 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms'}
2024-11-20 21:33:51.342  INFO 12432 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:11}] to localhost:27017  
2024-11-20 21:33:51.342  INFO 12432 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:12}] to localhost:27017  
2024-11-20 21:33:51.344  INFO 12432 --- [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=38080400}
2024-11-20 21:33:52.699  INFO 12432 --- [           main] com.college.CollegeApplication           : Started CollegeApplication in 3.642 seconds (JVM running for 4.569)
1. Додати розклад з CSV-файлу
2. Подивитись розклад        
3. Видалити розклад
4. Вихід
Введіть номер команди (1-4): 1
2024-11-20 21:33:59.582  INFO 12432 --- [           main] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:13}] to localhost:27017
5 документів з рядками з розкладу завантажено з CSV.
1. Додати розклад з CSV-файлу
2. Подивитись розклад        
3. Видалити розклад
4. Вихід
Введіть номер команди (1-4): 2
Знайдено 20 документів розкладу:
Schedule { id="673aa2f413fe5d569e53fd48"
 studentFirstName="Аліса"
 studentLastName="Мельник"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"    
 departmentName="Комп`ютерні науки"     
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa2f413fe5d569e53fd49"
 studentFirstName="Катерина"
 studentLastName="Левченко"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa2f413fe5d569e53fd4a"
 studentFirstName="Дмитро"
 studentLastName="Шевченко"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa2f413fe5d569e53fd4b"
 studentFirstName="Богдан"
 studentLastName="Іванов"
 teacherFirstName="Оксана"
 teacherLastName="Коваль"
 courseName="Математичний аналіз I"
 departmentName="Математика"
 roomNumber="212"
 semester="Осінь"
 year="2024"
 startTime="11:00:00"
 endTime="12:30:00"
}
Schedule { id="673aa2f413fe5d569e53fd4c"
 studentFirstName="Олена"
 studentLastName="Петренко"
 teacherFirstName="Оксана"
 teacherLastName="Коваль"
 courseName="Математичний аналіз I"
 departmentName="Математика"
 roomNumber="212"
 semester="Осінь"
 year="2024"
 startTime="11:00:00"
 endTime="12:30:00"
}
Schedule { id="673aa30113fe5d569e53fd4d"
 studentFirstName="Аліса"
 studentLastName="Мельник"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa30113fe5d569e53fd4e"
 studentFirstName="Катерина"
 studentLastName="Левченко"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa30113fe5d569e53fd4f"
 studentFirstName="Дмитро"
 studentLastName="Шевченко"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa30113fe5d569e53fd50"
 studentFirstName="Богдан"
 studentLastName="Іванов"
 teacherFirstName="Оксана"
 teacherLastName="Коваль"
 courseName="Математичний аналіз I"
 departmentName="Математика"
 roomNumber="212"
 semester="Осінь"
 year="2024"
 startTime="11:00:00"
 endTime="12:30:00"
}
Schedule { id="673aa30113fe5d569e53fd51"
 studentFirstName="Олена"
 studentLastName="Петренко"
 teacherFirstName="Оксана"
 teacherLastName="Коваль"
 courseName="Математичний аналіз I"
 departmentName="Математика"
 roomNumber="212"
 semester="Осінь"
 year="2024"
 startTime="11:00:00"
 endTime="12:30:00"
}
Schedule { id="673aa3646ff0d85594b317f3"
 studentFirstName="Аліса"
 studentLastName="Мельник"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa3646ff0d85594b317f4"
 studentFirstName="Катерина"
 studentLastName="Левченко"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa3646ff0d85594b317f5"
 studentFirstName="Дмитро"
 studentLastName="Шевченко"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673aa3646ff0d85594b317f6"
 studentFirstName="Богдан"
 studentLastName="Іванов"
 teacherFirstName="Оксана"
 teacherLastName="Коваль"
 courseName="Математичний аналіз I"
 departmentName="Математика"
 roomNumber="212"
 semester="Осінь"
 year="2024"
 startTime="11:00:00"
 endTime="12:30:00"
}
Schedule { id="673aa3646ff0d85594b317f7"
 studentFirstName="Олена"
 studentLastName="Петренко"
 teacherFirstName="Оксана"
 teacherLastName="Коваль"
 courseName="Математичний аналіз I"
 departmentName="Математика"
 roomNumber="212"
 semester="Осінь"
 year="2024"
 startTime="11:00:00"
 endTime="12:30:00"
}
Schedule { id="673e39a74b10ed1ccf6b5b6e"
 studentFirstName="Аліса"
 studentLastName="Мельник"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673e39a74b10ed1ccf6b5b6f"
 studentFirstName="Катерина"
 studentLastName="Левченко"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673e39a74b10ed1ccf6b5b70"
 studentFirstName="Дмитро"
 studentLastName="Шевченко"
 teacherFirstName="Іван"
 teacherLastName="Петренко"
 courseName="Вступ до програмування"
 departmentName="Комп`ютерні науки"
 roomNumber="210"
 semester="Осінь"
 year="2024"
 startTime="09:00:00"
 endTime="10:30:00"
}
Schedule { id="673e39a74b10ed1ccf6b5b71"
 studentFirstName="Богдан"
 studentLastName="Іванов"
 teacherFirstName="Оксана"
 teacherLastName="Коваль"
 courseName="Математичний аналіз I"
 departmentName="Математика"
 roomNumber="212"
 semester="Осінь"
 year="2024"
 startTime="11:00:00"
 endTime="12:30:00"
}
Schedule { id="673e39a74b10ed1ccf6b5b72"
 studentFirstName="Олена"
 studentLastName="Петренко"
 teacherFirstName="Оксана"
 teacherLastName="Коваль"
 courseName="Математичний аналіз I"
 departmentName="Математика"
 roomNumber="212"
 semester="Осінь"
 year="2024"
 startTime="11:00:00"
 endTime="12:30:00"
}
1. Додати розклад з CSV-файлу
2. Подивитись розклад
3. Видалити розклад
4. Вихід
Введіть номер команди (1-4): 3
Розклад видалено.
1. Додати розклад з CSV-файлу
2. Подивитись розклад
3. Видалити розклад
4. Вихід
Введіть номер команди (1-4): 4
2024-11-20 21:34:09.339  INFO 12432 --- [ionShutdownHook] org.mongodb.driver.connection            : Closed connection [connectionId{localValue:3, serverValue:13}] to localhost:27017 because the pool has been closed.
'''