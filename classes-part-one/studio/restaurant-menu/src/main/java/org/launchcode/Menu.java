package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();

    }

    @Override
    public String toString() {
        return "Menu last updated on: " + lastUpdated + "\nItems: " + menuItems;
    }
}

