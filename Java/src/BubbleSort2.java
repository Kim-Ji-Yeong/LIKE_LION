import java.util.Arrays;

public class BubbleSort2 {

    public static void main(String[] args) {
        int[] arr = new int[]{7,4,5,1,3};

        System.out.println("정렬 전 : " + Arrays.toString(arr));

        bubbleSort(arr.length,arr);

        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }

    public static int[] bubbleSort(int n, int[] arr) {

        for (int i = 1; i < n; i++){             //  총 라운드는 (배열 크기 -1)번 진행
            for(int j = 0; j < n-i; j++) {       // 각 라운드별 비교 횟수는 (배열 크기-라운드 횟수)
                int tmp = 0;
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            System.out.printf("%d회전 정렬 결과 : ",i);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}