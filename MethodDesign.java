/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methoddesign;

/**
 *
 * @author cmusick2025
 */
//Driver Class Main
public class MethodDesign {
    public static void main(String[] args) {
        //Create course lists for 3 students
        String[] courseNames1 = {"Chemistry", "Calculus", "Statistics"};
        String[] courseNames2 = {"Literature", "History", "Visual Arts"};
        String[] courseNames3 = {"Biology", "Physics", "Computer Science"};
        //Create 3 student objects
        Student student1 = new Student("Connor", "Musick", courseNames1);
        Student student2 = new Student("Jayden", "Hoang", courseNames2);
        Student student3 = new Student("Jacob", "Macnab", courseNames3);
        
        //set test scores for students
        student1.setScore(0, 100);
        student1.setScore(1, 100);
        student1.setScore(2, 100);
        student2.setScore(0, 80);
        student2.setScore(1, 89);
        student2.setScore(2, 77);
        student3.setScore(0, 98);
        student3.setScore(1, 71);
        student3.setScore(2, 88);
        
        //Display student details
        System.out.println("Student 1 Details:");
        System.out.println(student1);
        System.out.println("Average score: " + student1.getAverage());
        
        System.out.println("\nStudent 2 Details:");
        System.out.println(student2);
        System.out.println("Average score: " + student2.getAverage());
        
        System.out.println("\nStudent 3 Details:");
        System.out.println(student3);
        System.out.println("Average score: " + student3.getAverage());
    }
    
    //Course class
    public static class Course {
        final private String courseName;
        private int score;
        //Constructor
        public Course(String courseName){
            this.courseName = courseName;
            this.score = 0;
        }
        //Setter
        public void setScore(int score){
            this.score = score;
        }
        //Getter
        public int getScore(){
            return this.score;
        }
        //Course toString
        @Override
        public String toString(){
            return courseName + ": " + score;
        }
    }
    //Student class
    public static class Student {
    final private String firstName;
    final private String lastName;
    final private Course[] courses;
    //Constructor
    public Student(String first, String last, String[] courseNames){
        this.firstName = first;
        this.lastName = last;
        this.courses = new Course[3];
        for (int i = 0; i < 3; i++){
            this.courses[i] = new Course(courseNames[i]);
        }
    }
    //Method for setting test score based on course index
    public void setScore(int courseIndex, int score){
        if (courseIndex >= 0 && courseIndex < courses.length){
            courses[courseIndex].setScore(score);
        }else{
            System.out.println("Course index doesn't exist.");
        }
    }
    //Method for returning test score based on course index
    public double getScore(int courseIndex){
        if (courseIndex >= 0 && courseIndex < courses.length){
            return courses[courseIndex].getScore();
        }else{
            System.out.println("Course index doesn't exist.");
            return -1;
        }
    }
    //Method for calculating and returning average test score
    public int getAverage(){
        int total = 0;
        for (int i = 0; i < courses.length; i++){
            total += courses[i].getScore();
        }
        return total / courses.length;
    }

    //Student toString
    @Override
    public String toString(){
        String result = firstName + " " + lastName + "\n";
        for (int i = 0; i < courses.length; i++){
            result += courses[i].toString() + "\n";
        }
        return result;
    }
}
}
