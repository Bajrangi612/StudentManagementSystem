package com.sms.main;

import com.sms.model.Student;
import com.sms.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        StudentService studentService =  new StudentService();
        int option;
        do{
            System.out.println("Please select option..");
            System.out.println("1. Add New Student. " +
                    "\n2. Print All Student. " +
                    "\n3. Search By Roll. \n4. Exit");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Age:");
                    int age = sc.nextInt();
                   int total =  studentService.count;
                    int roll = total+1;
                    sc.nextLine();
                    System.out.println("Enter Course: ");
                    String course = sc.nextLine();
                    Student student =  new Student(name,age,roll,course);
                    studentService.addStudent(student);
                    break;
                case 2:
                   Student students[] =  studentService.getAllStudent();
                  int count =  studentService.count;
                  for( int i = 0; i<count; i++){
                      System.out.println("Name: "+students[i].getName()+
                              ", Age: "+ students[i].getAge()+
                              ", Roll: "+ students[i].getRoll()+
                              ", Course: "+ students[i].getCourse());
                  }
                  break;
                case 3:
                    System.out.println("Enter Roll:");
                     int rollNo = sc.nextInt();
                    Student student1 =  studentService.searchByRoll(rollNo);
                    if( student1 != null) {
                        System.out.println("Name: " + student1.getName() +
                                ", Age: " + student1.getAge() +
                                ", Roll: " + student1.getRoll() +
                                ", Course: " + student1.getCourse());
                    }
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid input...");
            }


        }while (option !=4);

    }
}
