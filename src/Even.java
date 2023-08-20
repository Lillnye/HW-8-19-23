public class Even
{
    public static void main(String[] args)
    {
        int[] values = {105, 108, 110, 98, 85, 99, 101};
        System.out.print("All even stored numbers are ");
        for (int i : values)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
