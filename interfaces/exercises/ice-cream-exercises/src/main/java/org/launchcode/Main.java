package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        System.out.println("Sorted Flavors:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        // If you want to sort cones, use the ConeComparator
        Comparator<Cone> coneComparator = new ConeComparator();
        cones.sort(coneComparator);

        // Print sorted cones
        System.out.println("Sorted Cones:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
    }
}