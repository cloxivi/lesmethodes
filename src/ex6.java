import java.util.ArrayList;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        int sum = getSum(list);
        System.out.println("Sum: " + sum);
        int Max = getMax(list);
        System.out.println("Max: " + Max);


    }
    static int getSum(ArrayList<Integer> list) {
        int total = 0;
        for (int i:list) {
            total += i;
        }
        return total;
    }

    static int getMax(ArrayList<Integer> list) {
        int Largest = Integer.MIN_VALUE;
        for (int i:list) {
            if(i> Largest) {
                Largest = i;
            }
        }
        return Largest;
    }

}






