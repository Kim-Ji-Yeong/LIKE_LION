package ch220929;

class Circle {

		private int radius;
        
        public Circle(int radius){
        	this.radius = radius;
        }
        
        public int getRadius() {
        	return radius;
        }
        
        @Override
        public boolean equals(Object obj) {

            if( obj instanceof Circle) {
                Circle c1 = (Circle) obj;

                if( this.radius == c1.getRadius()) 
                    return true;
            }

            return false;
        }
        

	
    public static void main(String[] args){
    	Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(10);
        
        System.out.println(circle1);
        System.out.println(circle2);
        
        if(circle1 == circle2)
        	System.out.println("2개의 원은 같습니다.");
        else {
        	System.out.println("2개의 원은 같지 않습니다.");
        }
        
        if(circle1.equals(circle2))
        	System.out.println("2개의 원은 같습니다.");
        else {
        	System.out.println("2개의 원은 같지 않습니다.");
        }
    }
}
