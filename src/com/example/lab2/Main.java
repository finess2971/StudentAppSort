package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<Student>();
		System.out.println("Student List (odered by name)");
		Student s1 = new Student(1, "Park", 21);
		st.add(s1);
		Student s2 = new Student(2, "Kim", 22);
		st.add(s2);
		Student s3 = new Student(3, "Lee", 21);
		st.add(s3);
		Student s4 = new Student(4, "Choi", 20);
		st.add(s4);
		Student s5 = new Student(5, "Ryu", 23);
		st.add(s5);
		Student s6 = new Student(6, "Son", 21);
		st.add(s6);
		Student s7 = new Student(7, "Ban", 24);
		st.add(s7);
		Student s8 = new Student(8, "Yang", 25);
		st.add(s8);
		Student s9 = new Student(9, "Jang", 22);
		st.add(s9);
		Student s10 = new Student(10, "Ki", 23);
		st.add(s10);
		
		Collections.sort(st);
		
		for(Student s:st) {
			System.out.println(s.toString());
		}
	}
}
