/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import College.Course;
import College.Module;
import College.Student;
import org.joda.time.DateTime;

/**
 *
 * @author Padraig
 */
public class App {
    
    public static void main(String[] args) {
           
        //Creating the Course 
        Course BCT2 = new Course("Computer Science 2nd Year",new DateTime(2017, 9, 4,0,0), new DateTime(2018,5,11,0, 0));
        //Creating each module and then adding them to the course
        Module SoftEng = new Module("Software Engineering 1", "CT202");
        BCT2.addModule(SoftEng);
                
        Module Programming = new Module("Object Orientated Programming", "CT201");
        BCT2.addModule(Programming);
         
        Module Networks = new Module("Networks", "CT250");
        BCT2.addModule(Networks);
        
        //Creating each Student and adding them the each module
        Student student1 = new Student(19, "Joe Crowe", "Joe Crowe19", 123456, "10/04/1998");
        SoftEng.addStudent(student1);
        Programming.addStudent(student1);
        Networks.addStudent(student1);
        
        Student student2 = new Student(20, "Rachel Ruane", "Rachel Ruane20", 1234567, "12/05/1997");
        SoftEng.addStudent(student2);
        Programming.addStudent(student2);
        Networks.addStudent(student2);
        
        Student student3 = new Student(21, "Tom Cruize", "Tom Cruize21", 12345678, "20/08/1996");
        SoftEng.addStudent(student3);
        Programming.addStudent(student3);
        Networks.addStudent(student3);
        
        //Printing out the details on what modules the course has
        System.out.println(BCT2.getCourseName() + " which starts on: " +BCT2.getStartDate()+ " and ends on: "+BCT2.getEndDate()+"has the following modules:");
        BCT2.printModules();
        
        //Printing out the details on what students are in each module
        System.out.println(SoftEng.getModuleName() + " has the following students:");
        SoftEng.printStudents();
        
        System.out.println(Programming.getModuleName() + " has the following students:");
        Programming.printStudents();
        
        System.out.println(Networks.getModuleName() + " has the following students:");
        Networks.printStudents();
    }
    
    
    
    
}
