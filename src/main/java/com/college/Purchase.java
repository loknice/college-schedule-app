package com.college;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
  Колекція, в якій зберігається документ бази даних MongoDB, що представляє інформацію про покупки.
*/
@Document(collection = "purchases")
public class Purchase {
    @Id
    private String id;
    private String customerFullName;
    private String storeAddress;
    private String productName;
    private String paymentMethod;
    private String purchaseDate;
    private String bonusCardNumber;
    private String city;
    private String productGroup;
    private String expiryDate;
    private String storeDepartment;
    private String quantity;
    private double purchaseAmount;
    private double earnedBonuses;
    private double discountPercentage;

    // Конструктор
    public Purchase(String customerFullName, String storeAddress, String productName, String paymentMethod, String purchaseDate,
                    String bonusCardNumber, String city, String productGroup, String expiryDate, String storeDepartment,
                    String quantity, double purchaseAmount, double earnedBonuses, double discountPercentage) {
        this.customerFullName = customerFullName;
        this.storeAddress = storeAddress;
        this.productName = productName;
        this.paymentMethod = paymentMethod;
        this.purchaseDate = purchaseDate;
        this.bonusCardNumber = bonusCardNumber;
        this.city = city;
        this.productGroup = productGroup;
        this.expiryDate = expiryDate;
        this.storeDepartment = storeDepartment;
        this.quantity = quantity;
        this.purchaseAmount = purchaseAmount;
        this.earnedBonuses = earnedBonuses;
        this.discountPercentage = discountPercentage;
    }

    // Геттери та сеттери
    public String getId() {
        return id;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getBonusCardNumber() {
        return bonusCardNumber;
    }

    public void setBonusCardNumber(String bonusCardNumber) {
        this.bonusCardNumber = bonusCardNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getStoreDepartment() {
        return storeDepartment;
    }

    public void setStoreDepartment(String storeDepartment) {
        this.storeDepartment = storeDepartment;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public double getEarnedBonuses() {
        return earnedBonuses;
    }

    public void setEarnedBonuses(double earnedBonuses) {
        this.earnedBonuses = earnedBonuses;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    // Метод для читабельного представлення об'єкта
    @Override
    public String toString() {
        return "Purchase {" +
                "id='" + id + '\'' +
                ", customerFullName='" + customerFullName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", productName='" + productName + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", bonusCardNumber='" + bonusCardNumber + '\'' +
                ", city='" + city + '\'' +
                ", productGroup='" + productGroup + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", storeDepartment='" + storeDepartment + '\'' +
                ", quantity='" + quantity + '\'' +
                ", purchaseAmount=" + purchaseAmount +
                ", earnedBonuses=" + earnedBonuses +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
