import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TASK_02 {
    public static void main(String[] args) {

        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

        Scanner read_line = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int list_size = read_line.nextInt();

        Random rnd = new Random();
        ArrayList<Integer> int_list = new ArrayList<>();
        for (int i = 0; i < list_size; i ++ ) int_list.add(rnd.nextInt(1,100));

        System.out.println(int_list);

        int min_value = int_list.get(0);
        int max_value = int_list.get(0);
        double summum = 0.0;
        for (int item : int_list){
            if (item > max_value) max_value = item;
            if (item < min_value) min_value = item;
            summum += item;
        }

        System.out.printf("Max: %s, Min: %s, Mean: %.2f", max_value, min_value, summum / int_list.size());

    }
}
