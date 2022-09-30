package ch220930;

class Product {

	int price; // 제품의 가격



	Product(int price) {

		this.price = price;

	}

}



class Tv extends Product {

	Tv() {

		super(100);

	}



	public String toString() {

		return "Tv";

	}

}



class Computer extends Product {

	Computer() {

		super(200);

	}



	public String toString() {

		return "Computer";

	}

}



class Audio extends Product {

	Audio() {

		super(50);

	}



	public String toString() {

		return "Audio";

	}

}
class Buyer {
    int money = 1000; // 구매자가 가진 돈
    int total = 0;  //구매자가 산 물건들의 금액 합계
    int idx = 0; // Product 배열 cart에 사용될 index
    Product[] cart = new Product[3]; // TV, Computer, Audio를 담을 수 있다.

    void buy(Product p) {
        if (money >= p.price) {
            money -= p.price;
            total += p.price;
            add(p);
        } else {
            System.out.println("잔액이 부족하여 " + p.toString() + "를 살 수 없습니다!");
            return;
        }

    }

    void add(Product p) {
        Product[] biggerCart;

        if (idx >= cart.length) {
            biggerCart = new Product[cart.length * 2];

            for (int i = 0; i < cart.length; i++) {
                biggerCart[i] = cart[i];
            }
            cart = biggerCart;
        }
        cart[idx++] = p;

    }

    void summary() {
        System.out.println("<Summary>");
        System.out.print("구입한 물건 : ");

        for (int i = 0; i < idx; i++) {
            System.out.print(cart[i].toString() + ", ");
        }
        System.out.println("\n사용한 금액 : " + total);
        System.out.println("남은 금액 : " + money);

    }
}

public class BuyerTest {

    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Tv());
        buyer.buy(new Audio());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.summary();
    }

}



