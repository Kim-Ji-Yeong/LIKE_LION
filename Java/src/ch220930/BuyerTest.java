package ch220930;

class Product {

	int price; // ��ǰ�� ����



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
    int money = 1000; // �����ڰ� ���� ��
    int total = 0;  //�����ڰ� �� ���ǵ��� �ݾ� �հ�
    int idx = 0; // Product �迭 cart�� ���� index
    Product[] cart = new Product[3]; // TV, Computer, Audio�� ���� �� �ִ�.

    void buy(Product p) {
        if (money >= p.price) {
            money -= p.price;
            total += p.price;
            add(p);
        } else {
            System.out.println("�ܾ��� �����Ͽ� " + p.toString() + "�� �� �� �����ϴ�!");
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
        System.out.print("������ ���� : ");

        for (int i = 0; i < idx; i++) {
            System.out.print(cart[i].toString() + ", ");
        }
        System.out.println("\n����� �ݾ� : " + total);
        System.out.println("���� �ݾ� : " + money);

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



