package ch07;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		//�����Ϸ��� super(); �� �־���  (����Ʈ ������)
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCustomer() call");
		//customer���� �����ڰ� ���������� �ȴ����� VIP�� ������ �׷��� �̸��� ���̵� ��������ִ°���
		//�ν��Ͻ� ������ �ν��Ͻ��� ������ �� �����˴ϴ�. �׷��� ������ �ν��Ͻ� ������ ���� �о���ų� �����Ϸ��� �ν��Ͻ��� ���� �����ؾ��մϴ�.
		//�ν��Ͻ� ������ ��ü�� ������ ���ϱ� �θ�����ڰ� �����ɶ�(��ü�� �����ɶ�)�ϱ� ���� ���� ���� �����°���
	}
	
	public String getAgentID() {
		return agentID;
	}
}
