package session3;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 12, 13};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                continue;
            }


            System.out.println("index=" + i);
        }
    }
}
