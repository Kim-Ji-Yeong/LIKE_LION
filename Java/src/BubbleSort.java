import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void startSort(int[] array) {
        int tmp = 0;
        for (int i = array.length; i >= 1; i--) {
            // �迭�� �ڿ������� ũ�� ����� �ٽ� ����Ѵٰ� �����ϸ�,
            // �迭���̰� n�϶�, index = 1 ���� ����ϹǷ�, n-1�� �����ؾ� �Ѵ�.
            // ex) �迭 ���̰� 4�� ��, [ o o o x] -> [o o x x] -> [o x x x] ���� o�� �˾Ƽ� �ּڰ��� ��ϵǹǷ�..
            // ���� 3�� ����
            for (int j = 1; j <= i - 1; j++) {
                // �迭�� ���� �� ���� ����� ���� ���� �� �� ���� �ִ����� �� �� �����Ƿ�
                // j <= i - 1
                if (array[j - 1] > array[j]) { // ��� ��
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            System.out.println(Arrays.toString(array));
            }
        }
        System.out.println("���� ��� : "+Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�迭ũ�⸦ �Է��ϼ���");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("�迭�� �Է��ϼ���. ���� " + N + "��");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        startSort(array);
    }
}