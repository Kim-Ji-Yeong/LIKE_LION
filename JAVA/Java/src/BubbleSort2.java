import java.util.Arrays;

public class BubbleSort2 {

    public static void main(String[] args) {
        int[] arr = new int[]{7,4,5,1,3};

        System.out.println("���� �� : " + Arrays.toString(arr));

        bubbleSort(arr.length,arr);

        System.out.println("���� �� : " + Arrays.toString(arr));
    }

    public static int[] bubbleSort(int n, int[] arr) {

        for (int i = 1; i < n; i++){             //  �� ����� (�迭 ũ�� -1)�� ����
            for(int j = 0; j < n-i; j++) {       // �� ���庰 �� Ƚ���� (�迭 ũ��-���� Ƚ��)
                int tmp = 0;
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            System.out.printf("%dȸ�� ���� ��� : ",i);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}