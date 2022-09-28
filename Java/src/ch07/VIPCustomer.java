package ch07;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		//컴파일러가 super(); 를 넣어줌  (디폴트 생성자)
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCustomer() call");
		//customer쪽의 생성자가 먼저생성이 된다음에 VIP가 생성됨 그래서 이름과 아이디를 만들수가있는거임
		//인스턴스 변수는 인스턴스가 생성될 때 생성됩니다. 그렇기 때문에 인스턴스 변수의 값을 읽어오거나 저장하려면 인스턴스를 먼저 생성해야합니다.
		//인스턴스 변수는 객체가 생성될 때니까 부모생성자가 생성될때(객체가 생성될때)니까 제일 위에 말이 나오는거임
	}
	
	public String getAgentID() {
		return agentID;
	}
}
