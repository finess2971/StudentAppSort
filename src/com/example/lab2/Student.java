package com.example.lab2;

public class Student implements Comparable<Student> {
	int no;
	String name;
	int age;
	
	Student(int n, String nm, int a){
		no=n;
		name=nm;
		age=a;
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	public String toString() {
		return "Student [no="+no+", name="+name+", age="+age+"]";
	}
}
