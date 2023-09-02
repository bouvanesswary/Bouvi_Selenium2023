package week3.w3d1assignment2;

public class Student extends Department{
	
	public void studentName() {
		System.out.println(" Student name is Bouvi");
	}
	public void studentDept() {
		System.out.println(" Student Department : CSE");
	}
	public void studentId() {
		System.out.println(" Student ID is 566");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu= new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();

	}

}
