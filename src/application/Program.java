package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> totalStudents = new HashSet<>();
		System.out.print("How many students for course A? ");
		int studentsForCourseA = sc.nextInt();
		
		for(int i=0; i<studentsForCourseA; i++) {
			String cod = sc.next();
			totalStudents.add(cod);
		}
		
		System.out.print("How many students for course B? ");
		int studentsForCourseB = sc.nextInt();
		
		for(int i=0; i<studentsForCourseB; i++) {
			String cod = sc.next();
			totalStudents.add(cod);
		}
		
		System.out.print("How many students for course C? ");
		int studentsForCourseC = sc.nextInt();
		
		for(int i=0; i<studentsForCourseC; i++) {
			String cod = sc.next();
			totalStudents.add(cod);
		}
		
		System.out.println("Total students: " + totalStudents.size());
		
		sc.close();

	}

}
