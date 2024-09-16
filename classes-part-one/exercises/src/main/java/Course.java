package org.launchcode;

import java.util.ArrayList;  // Import ArrayList


public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;  // Make sure ArrayList is imported

    // Constructor for Course
    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    // Getter for topic
    public String getTopic() {
        return topic;
    }

    // Setter for topic
    public void setTopic(String topic) {
        this.topic = topic;
    }

    // Inner Teacher class (optional to keep it as an inner class)
    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.subject = subject;
            this.yearsTeaching = yearsTeaching;
        }

        // Getter for firstName
        public String getFirstName() {
            return firstName;
        }

        // Setter for firstName
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        // Getter for lastName
        public String getLastName() {
            return lastName;
        }

        // Setter for lastName
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // Getter for subject
        public String getSubject() {
            return subject;
        }

        // Setter for subject
        public void setSubject(String subject) {
            this.subject = subject;
        }

        // Getter for yearsTeaching
        public int getYearsTeaching() {
            return yearsTeaching;
        }

        // Setter for yearsTeaching
        public void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }
    }

    // Add more methods for Course class as needed
}