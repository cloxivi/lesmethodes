public class secondaire
{
 public int afficher3(int []a)
 {
     int max=0;
     for (int i = 0; i< a.length; i++)
    {
        if (a[i]>a[max])
        {
            max=i;
        }
    }
     return max;
 }
}
