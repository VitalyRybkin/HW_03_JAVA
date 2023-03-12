import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TASK_03 {
    public static void main(String[] args) {

        // Сортировка слиянием

        Scanner read_line = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arr_size = read_line.nextInt();

        Random rnd = new Random();
        int[] arr_to_sort = new int[arr_size];
        for (int i = 0; i < arr_size; i ++ ) arr_to_sort[i] = rnd.nextInt(1,10);

        System.out.println(Arrays.toString(arr_to_sort));
        int[] sorted_arr = split_arr(arr_to_sort);
        System.out.println(Arrays.toString(sorted_arr));
    }

    public static int[] split_arr(int[] arr){
        if (arr.length > 1){
            int div = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, div);
            int[] right = Arrays.copyOfRange(arr, div, arr.length);
            split_arr(left);
            split_arr(right);

            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length){
                if (left[i] < right[j]){
                    arr[k] = left[i];
                    i ++;
                }
                else {
                    arr[k] = right[j];
                    j ++;
                }
                k ++;
            }
            while (i < left.length) {
                arr[k] = left[i];
                i += 1;
                k += 1;
            }

            while (j < right.length) {
                arr[k] = right[j];
                j += 1;
                k += 1;
            }

        }
        return arr;
    }
}
