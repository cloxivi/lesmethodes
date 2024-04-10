import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Array = {5,7,2,5,1,2,3,1};
        int[] Array2 = new int[Array.length];
        Array2 = bubbleSort(Array);
        Print(Array2);
    }
    static void Print(int[] Array) {
        for (int i:Array) {
            System.out.print(i + " ");
        }
    }

    static int[] bubbleSort(int[] array) {
        int t = array.length;
        int temp = 0;

        for (int i=0; i < t; i++) {
            for (int ii=1; ii < (t-i); ii++) {
                if(array[ii-1] > array[ii]) {
                    temp = array[ii-1];
                    array[ii-1] = array[ii];
                    array[ii] = temp;
                }
            }
        }

        return array;
    }


}


