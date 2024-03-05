public class secondaire2 {
    public static int smallest(int[] b) {
        int smallest = b[0]; // indice --> 0
        for (int i = 0; i < b.length; i++)
        {
            if (b[i] < smallest)
            {
                smallest = b[i]; //if want to affiche indice --> i
            }
        }
        return smallest;
    }
}
