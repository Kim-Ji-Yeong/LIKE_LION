package ch220930;

//class Apple {
//
//	@Override
//	public String toString() {
//		return "나는 사과입니다.";
//	}
//}
//
//class Orange {
//	@Override
//	public String toString() {
//		return "나는 오렌지입니다,";
//	}
//
//}
//
//class Box {
//	private Object obj;
//
//	public void set(Object obj) {
//		this.obj = obj;
//	}
//
//	public Object get() {
//		return obj;
//	}
//}

class DBox<L,R>{
	private L left;
	private  R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}



public class Generic {

	public static void main(String[] args) {
		
		DBox<String, Integer> box = new DBox<>();
		box.set("Apple", 25);
		System.out.println(box);
	
		
		
		
		
		

//		Box aBox = new Box();
//		Box oBox = new Box();
//
//		aBox.set(new Apple());
//		oBox.set(new Orange());
////		aBox.set("apple");
////		aBox.set("Orange");
//
//		Apple ap = (Apple) aBox.get(); //형변환 과정이 반드시 필요함
//		Orange og = (Orange) oBox.get(); //형변환 과정이 반드시 필요함
//
//		System.out.println(ap);
//		System.out.println(og);

	}

}
