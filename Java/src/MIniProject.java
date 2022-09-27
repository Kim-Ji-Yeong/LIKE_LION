

class Employee2 {
	private int salary;
	
	public Employee2() {
		salary = 3000000; //�⺻��
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

class Manager extends Employee2 {
	
	public Manager() {
		super.setSalary(5000000);
	}
	
	@Override
	public int getSalary() {
		return super.getSalary();
	}
}

class Programmer extends Employee2 {
	
	public Programmer() {
		super.setSalary(6000000);
	}
	
	@Override
	public int getSalary() {
		return super.getSalary();
	}
}

public class MIniProject {

	public static void main(String[] args) {
		Manager obj1 = new Manager();
		System.out.println("�������� ���� :  " + obj1.getSalary());

		Programmer obj2 = new Programmer();
		System.out.println("���α׷����� ���� : " + obj2.getSalary());
	}

}
