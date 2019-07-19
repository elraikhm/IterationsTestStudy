package com.microsoft.java.collection.iteration;

import static com.microsoft.java.collection.iteration.Person.getPeopleIterable;

//  You  only  need Java 8 (or later) (1.8.0_xxx jre) and  Java code editor of your choice ( eclipse/ IntelliJ/ VSCode) 
//	Try to build and  run this file as Java Application  once and see if it runs. 
//  This file contains a list of empty functions (task1, task2..) and the main function. Each function has a header with task description and footer to record your feedback
//  Start implementing empty functions one by one per defined order and record your feedback in the function footer as you are doing the task.
//  Make sure to record the start time for each task before you start working on it. 
//  Once you are done,  please save and share recorded feedback and implementation  per instructions provided with User Testing

//  The tasks below use data stored in class Person (Person.java). The class holds data about 8 people (name, age,sex).
//  In the tasks below we would like you to use Java Iterable to access this data.

public class IterableTasks {

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Task 1: Using the 'getPeopleIterable()' Iterable , print the first names of the first 2 males to the console
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void task1() {
		Iterable<Person> people = getPeopleIterable();
		//Add your code here
		
		System.out.println("end of task 1-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// Copy task output from the console here:
	// How difficult was to complete: easy, ok, hard:
	// Additional feedback:

	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Task 2: Using the 'getPeopleIterable()' Iterable, sort all the females from youngest to oldest
	// and print their first name and age to the console
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void task2() {
		Iterable<Person> people = getPeopleIterable();
		//Add your code here
		
		System.out.println("end of task 2-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// Copy task output from the console here (partial is OK):
	// How difficult was to complete: easy, ok, hard:
	// Additional feedback:

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Task 3: Using the 'getPeopleIterable()' Iterable, print out the age and first of the youngest person
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void task3() {
		Iterable<Person> people = getPeopleIterable();
		//Add your code here
		
		System.out.println("end of task 3-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// Copy task output here:
	// How difficult was to complete: easy, ok, hard:
	// Additional feedback:

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Extra task 1: Using the 'getPeopleIterable()' Iterable, sum up the age of all people, print the result to the console
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void extraTask1() {
		Iterable<Person> people = getPeopleIterable();
		//Add your code here
		
		System.out.println("end of extraTask1-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// Copy task output here:
	// How difficult was to complete: easy, ok, hard:
	// Additional feedback:

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Extra task 2: Using the 'getPeopleIterable()' iterable,  create a List containing all children under the age of 10(inclusive) 
	//                                sorted by age (youngest first) and sex (female first), and print this list to the console
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void extraTask2() {
		Iterable<Person> people = getPeopleIterable();
		//Add your code here
		
		System.out.println("end of extraTask2 -----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// How difficult was to complete: easy, ok, hard:
	// Additional feedback:

	public static void main(String[] args) {
		IterableTasks client = new IterableTasks();

		client.task1();
		client.task2();
		client.task3();

		client.extraTask1();
		client.extraTask2();
	}

}
