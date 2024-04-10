import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        int sum = getSum(list);
        float average = getAverage(list);
        list = removeEven(list);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println(list);

    }
    static int getSum(ArrayList<Integer> list) {
        int total = 0;
        for (int i:list) {
            total += i;
        }
        return total;
    }

    static float getAverage(ArrayList<Integer> list) {
        float total = 0;
        for (int i:list) {
            total += i;
        }
        return total/list.size();
    }
    static ArrayList<Integer> removeEven(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i:list) {
            if(i % 2 != 0) {
                list2.add(i);
            }
        }
        return list2;
    }

}



