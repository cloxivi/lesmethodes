public class ex2 {
    public static void main(String[] args) {
        String[] array = new String[5];
        String searchName = "fkdsanflka";
        array[0] = "CHloe lAm";
        array[1] = "Lam de cHoLe";
        array[2] = "fkdsanflka";
        Object Index = ex2.class;
        System.out.println(Index);
    }

    static int getIndex(String[] array, String name) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(name)) {
                return array.length + 1;
            }
        }
        return -1;
    }
}
