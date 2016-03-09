package com.Natalman;

import java.util.ArrayList;

/**
 * Created by TheKingNat on 3/3/16.
 */
public class ITECCourse {
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String ClassName;
    private int count;

    public String getCourseName(){
        return this.name;
    }

    public void setCourseName(String newName) {
        this.name = newName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //Constructor
    ITECCourse(String courseName, int courseCode, int courseMaxStudents,String courseClass, int num) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.ClassName = courseClass;
        this.count = num;
    }

    void addStudent(String studentName) {

        if (students.size() == maxStudents) {
            System.out.println("Course is full – can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }
    void coung(){

        if (getNumberOfStudents()<=maxStudents){
            count = maxStudents-getNumberOfStudents();
        }
    }


    void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Meeting room: " + this.ClassName);
        System.out.println("Students enrolled:");

        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
        System.out.println("The free space in this class is: " + count);
    }

    int getNumberOfStudents() {
        return this.students.size();
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }
}
