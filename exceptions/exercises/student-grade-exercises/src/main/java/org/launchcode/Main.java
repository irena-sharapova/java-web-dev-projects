package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(10, 2);
        Divide(10,0);


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            try {
                int points = CheckFileExtension(fileName);
                System.out.println(student + " receives " + points +" points");
            } catch (Exception e) {
                System.out.println(student + " receives 444444 points Error exemption " + e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y) {
        try {
            int result = x / y;
            System.out.println("Result: " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Exeption message: Division by zero!");
            return 4444;
        }
    }


    public static int CheckFileExtension(String fileName) {
        try {
            if (fileName == null || fileName.isEmpty()) {
                throw new Exception("File name is null or empty!");
        }
            if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 4444444;
            }
        }
    }
