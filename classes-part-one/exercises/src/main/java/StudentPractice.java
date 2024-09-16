package org.launchcode;

public class StudentPractice {
    public static void main(String[] args){
        Student student = new Student("Your Name", 12345, 1, 4.0);
        student.printStudentDetails();
        student.setGpa(3.9);
        student.updateCredits(2);
        System.out.println("\nUpdated Student Details:");
        student.printStudentDetails();

    }
}
