import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TASK_01 {
    public static void main(String[] args) {

        //Пусть дан произвольный список целых чисел, удалить из него чётные числа

        Scanner read_line = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int list_size = read_line.nextInt();

        Random rnd = new Random();
        ArrayList<Integer> int_list = new ArrayList<>();
        for (int i = 0; i < list_size; i ++ ) int_list.add(rnd.nextInt(1,10));

        System.out.println("Исходный список: " + int_list);

        int idx = 0;
        int len = int_list.size();
        while (idx < len){
            if (int_list.get(idx) % 2 == 0) {
                int_list.remove(idx);
                len--;
            }
            else idx ++;
        }

        System.out.println("Cписок без четных числе: " + int_list);
    }

}
