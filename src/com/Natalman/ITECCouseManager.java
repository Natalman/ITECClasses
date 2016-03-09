package com.Natalman;

import java.util.ArrayList;

public class ITECCouseManager {

    public static void main(String[] args) {
	// write your code here
        ArrayList<ITECCourse> ITECCourses = new ArrayList<ITECCourse>();
        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "T200",0);


        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.coung();

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 30,"T200",0);

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.coung();

        datacomCourse.writeCourseInfo();

        ITECCourse JavaProgramming = new ITECCourse("Java Programming", 2545,24,"T400",0);

        // Add some students
        JavaProgramming.addStudent("Gus");
        JavaProgramming.addStudent("Harry");
        JavaProgramming.addStudent("Izzy");
        JavaProgramming.coung();

        JavaProgramming.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Small Course", 1111, 3,"T5500",0);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Marigold");
        smallCourse.coung();

        ITECCourse InfoTechConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050",0);

        InfoTechConcepts.addStudent("Max");
        InfoTechConcepts.addStudent("Nancy");
        InfoTechConcepts.addStudent("Orson");
        InfoTechConcepts.coung();

        InfoTechConcepts.writeCourseInfo();

        //Try to fetch smallCourse's name

        String smallCourseName = smallCourse.getCourseName();  //no error

        System.out.println(smallCourseName);

        //Can also use the setCourseName method to change
        //this ITECCourse's name

        smallCourse.setCourseName("Very Small Course");

        //Just checking...
        smallCourse.writeCourseInfo();

        String niu = JavaProgramming.getClassName() + InfoTechConcepts.getClassName();
        System.out.println(niu);

        for (int i = 0; i<ITECCourses.size();i++){
            System.out.println(ITECCourses.get(i));
        }




    }
}
