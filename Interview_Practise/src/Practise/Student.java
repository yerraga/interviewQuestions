package Practise;

public class Student {
	
	int id;
	String name;
	int [] marks;
	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getTotalMarks() {
		int total = 0;
		
		for (int mark : marks) {
			total = total + mark;
		}
		return total;
	}
}
