package org.launchcode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class MenuItem {
    //Fields
    private String name;
    private String description;
    private double price;
    private String category;
    //private boolean isNew;
    private final LocalDate dateAdded;

    //Constructor
    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
//        this.isNew = isNew;
        this.dateAdded = LocalDate.now();
    }

    //getters & setters
    public LocalDate getDateAdded() {
        return dateAdded;
    }

//    public boolean isNew() {
//        return isNew;
//    }
//
//    public void setNew(boolean aNew) {
//        isNew = aNew;
//    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isNew() {
        LocalDate today = LocalDate.now();
        double days = getDateAdded().until(today, ChronoUnit.DAYS);
        return days < 90;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - " + price + " USD";
    }
}

