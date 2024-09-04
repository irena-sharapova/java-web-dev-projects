package org.launchcode;

import java.util.Scanner;

public class AreaRactangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of your rectangle?");
        Integer length = input.nextInt();

        System.out.println("What is the width of your rectangle?");
        Integer width = input.nextInt();

        Integer areaRectangle = length * width;
        System.out.println("Your rectangle area " + areaRectangle + "cm\u00B2");

        input.close();
    }
}
