/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fiewexample;

/**
 *
 * @author Lenovo
 */
enum Gender{Male,Female};
enum Course{CyberSecurity,AI,IT,CS};
enum Semester{Winter,Summer,Fall,Spring};
public class RegisterForm implements Second_Interface{    
    private String stdName;
    private Semester sem;
    private Gender stdGender;
    private Course CourseName;
    
    public RegisterForm(){
        stdName="Moemen";
        sem=Semester.Winter;
        stdGender=Gender.Male;
        CourseName=Course.IT;
    }

    @Override
    public void display() {
        System.out.println("Student Name: "+stdName +"\n"+ "Semester: "+sem +"\n"
                +"Student Gender: "+stdGender+"\n"+"Course Name:"+CourseName);
    }
    
}
