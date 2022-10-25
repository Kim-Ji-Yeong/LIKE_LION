package ch220930;

public class Generic2 {

	public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"hello", "world"};

        printArray(intArray);
        printArray(stringArray);
    }

    public static void printArray(Object[] abjArr) {
        for (Object o : abjArr) {
            System.out.println(o);
        }
    }
}

//static <T> void printArray(T[] arr) {
//    for(T element : arr) {
//        System.out.println(element);
//    }
//}
//public static void main(String[] args) {
//    Integer[] intArray = {1,2,3};
//    String[] strArray = {"hello","wolrd"};
//    printArray(intArray);
//    printArray(strArray);