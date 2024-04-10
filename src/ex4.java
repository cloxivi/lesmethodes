import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Array = {1,2,3,4,5,6,7,8,9};
        Print(Array);
        int Sum = getSum(Array);
        System.out.println("");
        System.out.println("Sum: " + Sum);
        int largestNumber = findLargestNumber(Array);
        System.out.println("Largest Number: " + largestNumber);

    }
    static void Print(int[] Array) {
        for (int i:Array) {
            System.out.print(i + " ");
        }
    }

    static int getSum(int[] Array) {
        int total = 0;
        for (int i:Array) {
            total += i;
        }
        return total;
    }

    static int findLargestNumber(int[] Array) {
        int largest = Integer.MIN_VALUE;
        for (int i:Array) {
            if(i > largest) {
                largest = i;
            }
        }
        return largest;
    }


}


