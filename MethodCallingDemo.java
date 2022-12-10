package com.project.methodcallong;

public class MethodCallingDemo {
	public static void main(String[] args) {
		int i = 2;
		i = changevalue(i);
		int result = changevalue(i);
		System.out.println(result + i);

		Student student = new Student("John", 12, "13, allen avenue");
		changename(student);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getAddress());
	}

	public static int changevalue(int i) {
		i = i + 1;
		return i;
	}

	static void changename(Student student) {
		student.setName("jane");
//			student.setAge(31);
//			student.setAddress("41, allen ave");
	}
}
