
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
		System.out.println("이름 : " + name + " 나이 : " + age + " 주소 : " + add + " 부서 : " +  department);
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
		System.out.println("정규직");
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
		System.out.println("비정규직");
		System.out.println("일한시간 : " + hour + "급여 : " + salary);
	}
  }
  
  public class EmployeeTest {

		public static void main(String arg[]) {

			
			Regular r = new Regular("이순신", 35, "서울", "인사부");
			Temporary t = new Temporary("장보고", 25, "인천", "경리부");
			
			r.setSalary(5000000);
			r.printInfo();
			
			t.setWorkHours(120);
			t.printInfo();
  
		}
  }
  
  
  
  
  
  