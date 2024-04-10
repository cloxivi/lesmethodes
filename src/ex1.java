public class ex1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1292;
        array[1] = 894822;
        array[2] = 294818;
        int Sum = getSum(array);
        System.out.println(Sum);
    }

    static int getSum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

}
