package Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentImpl {
	public static void main(String[] args) {
		
		List <Student> students = Arrays.asList(new Student(1, "Alice", new int[]{90, 85, 95}),
        (new Student(2,"Bob",  new int[]{80, 75, 85})),
        (new Student( 3,"Charlie", new int[]{70, 80, 75})),
        (new Student(4,"David",  new int[]{85, 90, 95})));

		Collections.sort(students, new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				return (s2.getTotalMarks() - s1.getTotalMarks());
			}
		});
		System.out.println("id \t Name \t Total Marks");
		System.out.println("-------------------------------------------");
		for (Student student : students) {
			System.out.printf("%d\t %-10s \t%d \n",student.id, student.name,   student.getTotalMarks());
		}
	}

}
