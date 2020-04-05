/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestingfinal;
import java.util.Scanner;
/**
 *
 * @author AbdulMoeedBhatti
 */

 public class Manager
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

