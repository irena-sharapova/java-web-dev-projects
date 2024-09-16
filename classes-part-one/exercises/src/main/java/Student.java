package org.launchcode;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;


        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Drop your getters and setters below for the Student class.
        public void setName(String name) {
                this.name = name;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        public void updateCredits(int numberOfCredits) {
                this.numberOfCredits += numberOfCredits;
        }

        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;

        }

        public void printStudentDetails() {
                System.out.println("Name: " + getName());
                System.out.println("Student ID: " + getStudentId());
                System.out.println("Credits: " + getNumberOfCredits());
                System.out.println("GPA: " + getGpa());
        }
}

//        Student student = new Student("Your Name", 12345, 1, 4.0);
//        }
//       ?
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

