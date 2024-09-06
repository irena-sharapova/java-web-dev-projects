package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        double radius = input.nextDouble();

      //  double pi = Math.PI;

       double areaCircle = Circle.getArea(radius);
        System.out.println("Your circle area " + areaCircle + "cm\u00B2");

        input.close();
    }
}
