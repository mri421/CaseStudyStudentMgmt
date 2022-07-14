package com.lti.user;

import java.time.LocalDate;
import java.util.Scanner;

import com.lti.entity.Student;
import com.lti.service.AdminMenu;
import com.lti.service.AdminMenuImpl;

public class UserApp {
public static void main(String[] args) {
	
	AdminMenu service=new AdminMenuImpl();
	
	
	
	
	
	System.out.println("hello");

System.out.println("select \n 1.add new student 2.display  student");

Scanner sc = new Scanner(System.in);
int choice = sc.nextInt();

switch(choice) {
case 1:System.out.println("enter stu data");
		Student s1 = new Student(101,"Jay",LocalDate.of(2001,1,10));
		Student s2 = new Student(102,"viJay",LocalDate.of(2002,2,11));
		Student s3 = new Student(103,"sanjy",LocalDate.of(2003,3,13));
		service.register(s1);
		service.register(s2);
		service.register(s3);


	break;
case 2:System.out.println("display studernt");
	break;
case 3:System.out.println("select proper option");
}
}
}
