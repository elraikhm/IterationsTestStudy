package com.microsoft.java.collection.iteration;

import java.util.stream.Stream;

import static com.microsoft.java.collection.iteration.Person.getPeopleStream;
//You  only  need Java 8 (or later) (1.8.0_xxx jre) and  Java code editor of your choice ( eclipse/ IntelliJ/ VSCode) 
//Try to build and  run this file as Java Application before you start the study. 
//This file contains a list of empty functions (task1, task2..) and the main function. Each function has a header with task description and footer to record your feedback
//Start implementing empty functions one by one per defined order and record your feedback in the function footer as you are doing the task.
//Make sure to record the start time for each task before you start working on it. 
// Once done with all the tasks, please complete the footer under the main function
//Once you are done,  please save and share recorded feedback and implementation  per instructions provided with User Testing

//The tasks below use data stored in class Person (Person.java). The class holds data about 8 people (name, age,sex).
//In the tasks below we would like you to use Java Stream to access this data.

public class StreamTasks {

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Task 1: Using the 'getPeopleStream()' Stream , print the first names of the first 2 males to the console
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void task1() {
		Stream<Person> people = getPeopleStream();
		//Add your code here

		System.out.println("end of task 1-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// Copy task output from the console here:
	// How difficult was to complete: easy, ok, hard:

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Task 2: Using the 'getPeopleStream()' Stream, sort all the females from youngest to oldest and print their first name and age to the console
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void task2() {
		Stream<Person> people = getPeopleStream();
		//Add your code here

		System.out.println("end of task 2-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// Copy task output from the console here:
	// How difficult was to complete: easy, ok, hard:

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Task 3: Using the 'getPeopleStream()' Stream, print out the age and first name of the youngest person
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void task3() {
		Stream<Person> people = getPeopleStream();
		//Add your code here

		System.out.println("end of task 3-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// Copy task output from the console here:
	// How difficult was to complete: easy, ok, hard:

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Extra task 1: Using the 'getPeopleStream()' Stream, sum up the age of all people and print the result to the console
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void extraTask1() {
		Stream<Person> people = getPeopleStream();
		//Add your code here

		System.out.println("end of extra task 1-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// Copy task output from the console here:
	// How difficult was to complete: easy, ok, hard:

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Extra task 2: Using the 'getPeopleStream()' Stream, create a List containing all children under the age of 10(inclusive) 
	//                                sorted by age (youngest first) and sex (female first), and print this list to the console
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
	public void extraTask2() {
		Stream<Person> people = getPeopleStream();
		//Add your code here

		System.out.println("end of extra task 2-----------------------------------------------\n");
	}
	// Task start time:
	// Task end time:
	// How difficult was to complete: easy, ok, hard:

	public static void main(String[] args) {
		StreamTasks client = new StreamTasks();
		client.task1();
		client.task2();
		client.task3();
		client.extraTask1();
		client.extraTask2();
	}

}
