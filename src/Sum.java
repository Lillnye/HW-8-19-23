public class Sum
{
    public static void main(String[] args)
    {
        int[] values = {105, 108, 110, 98, 85, 99, 101};
        int sum = 0;
        for (int i : values)
        {
            sum = sum + i;
        }
        System.out.println("The sum of all stored numbers is " + sum);
    }
}
