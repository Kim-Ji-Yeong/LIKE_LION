
class Employee {
	String name;
	int age;
	String add;
	String department;
	int salary;
	
	Employee(String name,int age,String add,String department){
		this.name = name;
		this.age = age;
		this.add = add;
		this.department  =department;
	}
	
	public void printInfo() {
		System.out.println("�̸� : " + name + " ���� : " + age + " �ּ� : " + add + " �μ� : " +  department);
	}
	
}
  class Regular extends Employee{

	public Regular(String name, int age, String add, String department) {
		super(name, age, add, department);
	}
	  
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printIfo() {
		System.out.println("������");
		System.out.println(salary);
	}
	
  }
  
  class Temporary extends Employee{
	  
	  int hour;
	  int pay= 10000;

	public Temporary(String name, int age, String add, String department) {
		super(name, age, add, department);
		
	}
	  public void setWorkHours(int hour) {
		  this.hour = hour;
		  this.salary = hour*pay;
	  }
	
	public void printInfo() {
		System.out.println("��������");
		System.out.println("���ѽð� : " + hour + "�޿� : " + salary);
	}
  }
  
  public class EmployeeTest {

		public static void main(String arg[]) {

			
			Regular r = new Regular("�̼���", 35, "����", "�λ��");
			Temporary t = new Temporary("�庸��", 25, "��õ", "�渮��");
			
			r.setSalary(5000000);
			r.printInfo();
			
			t.setWorkHours(120);
			t.printInfo();
  
		}
  }
  
  
  
  
  
  