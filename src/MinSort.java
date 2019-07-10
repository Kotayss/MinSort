import java.util.Arrays;

public class MinSort {
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 3, 1, 9, 1, 5, 0};
        System.out.println(Arrays.toString(num));
        int n = num.length;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j] >= num[j + 1]) {
                    int a = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = a;
                } 

            }
        }
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");
    }
}





