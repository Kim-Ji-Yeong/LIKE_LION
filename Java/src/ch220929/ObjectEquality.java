package ch220929;

class INum{
	
	private int num;
	
	public INum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof INum) {
			INum num = (INum)obj;
			
			if(this.num == num.getNum())
				return true;
		}
		return false;
	}
	
}

public class ObjectEquality {

	public static void main(String[] args) {
		INum num1 = new INum(10);
        INum num2 = new INum(12);
        INum num3 = new INum(10);

        if(num1.equals(num2))
            System.out.println("num1, num2 ���� �����ϴ�.");
        else
            System.out.println("num1, num2 ���� �ٸ���.");

        if(num1.equals(num3))
            System.out.println("num1, num3 ���� �����ϴ�.");
        else
            System.out.println("num1, num3 ���� �ٸ���.");
	}

}
