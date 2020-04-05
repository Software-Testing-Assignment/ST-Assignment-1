/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestingfinal;
import java.util.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;

/**
 *
 * @author AbdulMoeedBhatti
 */
public class Student {
    
	public String userName;
	public String emailAddress;
	public String areaInterest;
	String password;
	//written by AbdulMoeedBhatti based off earlier code in ACP lab.
	//this will test crud.
	//setting all default values
	
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
