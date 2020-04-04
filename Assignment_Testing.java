/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;
import java.util.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;



/**
 *
 * @author AbdulMoeedBhatti
 */
public class  Assignment_Testing{

    /**
     * @param args the command line arguments
     */
public static class Student {
    
	public String userName;
	public String emailAddress;
	public String areaInterest;
	String password;
	//written by AbdulMoeedBhatti based off earlier code in ACP lab.
	//this will test file readibility.
	//setting all default values
	//also dont contact me if you can't understand the code i dont care
	//test display 
	public void display()
	{
		System.out.print(userName);
		System.out.print(emailAddress);
		System.out.print(areaInterest);
		System.out.print(password);
	}
        
	/* 
	the following can be the main test function
	it verifies the password on its contrainsts
	must be between 8 & 20 characters
	must contain 1 digit
	must have one lower and one uppercase letter
	must have one special character
	 */
        public void input()
	{
        Scanner input= new Scanner(System.in);
		System.out.println("Enter username:");
		userName=input.next();
		System.out.println("Enter Email:");
		emailAddress=input.next();
		System.out.println("Enter passowrd:");
		password=input.next();
		while(checkPassword()==false)
		{
			System.out.println("Password constraints not followed reenter password");
			password=input.next();
		}
		System.out.println("Enter Area of Interest");
		areaInterest=input.next();
	}
	public boolean checkPassword()
	{
		Pattern testPattern;
		Matcher testMatcher;
		String passPattern="((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,20})";
		testPattern=Pattern.compile(passPattern);
		testMatcher=testPattern.matcher(this.password);
		return testMatcher.matches();	
	}
	/*takes individual input of a single entity*/
	
}
public static class Manager
{	public int size;
	public int current;
 
	public Student students[];
	public Manager()
	{
		size=50; //max section size
		students=new Student[size];
		current=0;
	}
	/*add new student*/
	public void add()
	{
		Student newStudent=new Student();
		newStudent.input();
		students[current]=newStudent;
		current++;
		
    }
	/*search by username*/
	public void search()
	{
                Scanner input= new Scanner(System.in);
		String search;
		System.out.println("Enter username to search");
		search=input.next();
		boolean chk=true;
		for (int i=0;i<current;i++)
		{
			if (students[i].userName.equals(search))
			{	
				System.out.println("Student Found!");
				students[i].display();
			}
			else
				chk=false;
		}
		if(chk==false)
			System.out.println("Student not found!");
	}
	/*display all*/
	public void displayAll()
	{
		for (int i=0;i<current;i++)
			students[i].display();
	}
	/*update the values of a single student*/
	public void update()
	{
                Scanner input= new Scanner(System.in);
		String uName;
		System.out.println("Enter username to update");
		uName=input.next();
		boolean chk=true;
		for (int i=0;i<current;i++)
		{
			if (students[i].userName.equals(uName))
				students[i].input();
			else
				chk=false;
		}
		if (chk==false)
			System.out.println("username not found!");
				
	}
	/*remove any student from the array*/
	public void remove()
	{
                Scanner input= new Scanner(System.in);
		String delName;
		System.out.println("Enter username");
		delName=input.next();
		boolean chk=true;
		int delIndex=0;
		for (int i=0;i<current;i++)
		{
			if (students[i].userName.equals(delName))
			{
				students[i].userName=" ";
				students[i].password=" ";
				students[i].emailAddress=" ";
				students[i].areaInterest=" ";
				delIndex=i;
			}
			else
				chk=false;
		}
		if (chk) //this will delete the user and fill the last user in the empty index
		{
			System.out.println("user found and deleted");
			students[delIndex]=students[current-1];
			current--;
		}
	}
	public void choice()
	{       
                Scanner input =new Scanner(System.in);
		int reRun=0,choice;
		do{
		System.out.println("Enter 1 to add new user");
		System.out.println("Enter 2 to remove user");
		System.out.println("Enter 3 to search a user");
		System.out.println("Enter 4 to update a user");
		System.out.println("Enter 5 to dispaly all users");
		choice=input.nextInt();
		switch(choice)
		{
			case 1:
			add();
			break;
			case 2:
			remove();
			break;
			case 3:
			search();
			break;
			case 4:
			update();
			break;
			case 5:
			displayAll();
			break;
			default:
			System.out.println("Wrong entry");
		}
		System.out.println("Enter 1 to rerun");
		reRun=input.nextInt();
		}while(reRun==1);
	}
}
    
    public static void main(String[] args) throws NullPointerException
    {
        // TODO code application logic here
      Manager manager;
    manager = new Manager();
    manager.choice();
    }
    
}
