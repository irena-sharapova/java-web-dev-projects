package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Beef stew", "delicious potato and meat", 24.0, "main course");
        MenuItem item2 = new MenuItem("Milk bread", "delicious sweet bread", 10.0, "desserts");
        MenuItem item3 = new MenuItem("Salsa", "delicious Mexican food", 18.0, "appetizer");
        MenuItem item4 = new MenuItem("Chicken and Rice Soup", "delicious hot soup", 16.0, "main course" );
        MenuItem item5 = new MenuItem("Lemon Blueberry Cake", "delicious bluberry cake", 20.0, "desserts");

        System.out.println(item3.isNew());

        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        menu.removeItem(item2);
        System.out.println(menu);

    }

}
