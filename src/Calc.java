public class Calc
{
    public static void main(String[] args)
    {
        int[][] values = {{105, 108, 110, 98, 85, 99, 101}, {105, 108, 110, 98, 85, 99, 101}};
        int sumE = 0;
        int sumO = 0;
        for (int[] i : values)
        {
            for (int c : i)
            {
                if (c % 2 == 0)
                {
                    sumE = sumE + c;
                }
                else if (c % 2 != 0)
                {
                    sumO = sumO + c;
                }
            }
        }
        System.out.println(sumE + " Even");
        System.out.print(sumO + " Odd");
    }
}
