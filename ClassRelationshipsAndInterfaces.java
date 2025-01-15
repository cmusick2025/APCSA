/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classrelationshipsandinterfaces;

/**
 *
 * @author cmusick2025
 */

import java.util.*;

//Driver Class
public class ClassRelationshipsAndInterfaces {
    public static void main(String[] args) {
        //Create task objects
        Task task1 = new Task("Finish homework", 8, 7);
        Task task2 = new Task("Do the dishes", 7, 5);
        Task task3 = new Task("Walk the dog", 4, 2);
        Task task4 = new Task("Clean the entire house", 2, 10);
        Task task5 = new Task("Get food for dinner", 10, 6);

        //Create array list of tasks
        Task[] tasks = {task1, task2, task3, task4, task5};
        
        //Sort the list using "sort" method
        Arrays.sort(tasks);
        
        //Print tasks based on priority and complexity
        System.out.println("Sorted tasks: ");
        for (int i = 0; i < tasks.length; i++){
            System.out.println(tasks[i]);
        }
    }
}

//Priority Interface
interface Priority{
     void setPriority(int priority);
     int getPriority();
}

//Complexity Interface
interface Complexity{
    void setComplexity(int priority);
    int getComplexity();
}

//Task implements Priority, Complexity, and Comparable
class Task implements Priority, Complexity, Comparable<Task>{
    //private variables
    private int priority;
    private int complexity;
    private String taskName;
    
    //Constructor
    public Task(String taskName, int priority, int complexity){
        this.taskName = taskName;
        this.priority = priority;
        this.complexity = complexity;
    }
    
    //Setters for Priority and Complexity
    @Override 
    public void setPriority(int priority){
        this.priority = priority;
    }
    
    @Override
    public void setComplexity(int complexity){
        this.complexity = complexity;
    }
    
    //Getters for Priority and Complexity
    @Override
    public int getPriority(){
        return this.priority;
    }
    
    @Override
    public int getComplexity(){
        return this.complexity;
    }
    
    //Comparable method
    @Override
    public int compareTo(Task t){
        //Compare priorities
        if (this.priority > t.priority){
            return -1;
        }else if (this.priority < t.priority){
            return 1;
        }else if (this.complexity > t.complexity){
            return -1;
        }else{
            return 1;
        }
    }
    
    //Create toString
    @Override
    public String toString(){
        return "Task name: " + this.taskName + "\n" + "Priority: " + this.priority + "\n" + "Complexity: " + this.complexity;
    }
}
       
