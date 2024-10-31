/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.course;
/**
 *
 * @author cmusick2025
 */

public class Course {


public static void main(String[] args){
    //Print out courses using full object constructor and toString
    CourseClass APCS = new CourseClass("AP Computer Science A", "APCSA", 95, "Mr. Nelson");
    System.out.println(APCS + "\n");
    CourseClass Eng = new CourseClass("AP English Literature and Composition", "AP Lit", 96, "Ms. DeSantis");
    System.out.println(Eng + "\n");
    CourseClass Hist = new CourseClass("AP US Government and Politics", "AP Gov", 97, "Mr. B");
    System.out.println(Hist + "\n");
    CourseClass Calc = new CourseClass("AP Calculus BC", "AP Calc", 96, "Mr. Dahms");
    System.out.println(Calc + "\n");
    CourseClass Phys = new CourseClass("AP Physics 1", "AP Phys 1", 92, "Mrs. Rafie");
    System.out.println(Phys + "\n");
    CourseClass Stats = new CourseClass("AP Statistics", "AP Stats", 96, "Mr. Remiker");
    System.out.println(Stats + "\n");
    
    //Have one course in which only name creator is used, with remaining values set by setter
    CourseClass Rel = new CourseClass("Catholic Innovations 12");
    Rel.setCourseCode("Inno 12");
    Rel.setPointTotal(100);
    Rel.setInstructor("Mr. Frice");
    System.out.println(Rel);
}
}

class CourseClass{
    //Establish private variables
    private String course;
    private String code;
    private int points;
    private String instructor;
    
public CourseClass(){
    //Make all variables empty
    course = null;
    code = null;
    points = 0;
    instructor = null;
}

public CourseClass(String courseTitle, String courseCode, int pointsTotal, String instructorName){
    //Initialize variables
    course = courseTitle;
    code = courseCode;
    points = pointsTotal;
    instructor = instructorName;
}

public CourseClass(String courseTitle){
    //Only accept course title
    course = courseTitle;
}

public void setCourseName(String courseTitle){
    //Set the course title
    course = courseTitle;
}

public void setCourseCode(String courseCode){
    //Set the course code
    code = courseCode;
}

public void setPointTotal(int pointsTotal){
    //Set the point total
    points = pointsTotal;
}

public void setInstructor(String instructorName){
    //Set instructor name
    instructor = instructorName;
}


//Create toString to print output
public String toString(){
    String result;
    result = "Course Title: " + course + "\n" + "Course Code: " + code + "\n" + "Total Points: " + points + "\n" + "Instructor Name: " + instructor;
    return result;
}
}





