package ch220929;

class Student {

	private String name;
	private String gender;
	
	Student(String name,String gender){
		this.name = name;
		this.gender = gender;
	}
	
	public String toString() {
		return "�̸��� " + name + "�̰� ������ " + gender + "�Դϴ�.";
	}
	
	
}
public class  StudentTest{
	public static void main(String[] args) {
		
		Student s= new Student("ȫ�浿","����");
	    System.out.println(s);

	}
}


