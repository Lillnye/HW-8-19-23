public class MinMax
{
    public static void main(String[] args)
    {
        int[] values = {2000, 43, 8, 60324, 4567, 123, 56};
        int number;
        int highest = 0;
        int lowest = 100000000;
        for (int v : values)
        {
            number = v;
            if (number > highest)
            {
                highest = number;
            }
            else if (number < lowest)
            {
                lowest = number;
            }
        }
        System.out.println(highest + " is the maximum in the sequence and " + lowest + " is the minimum.");
    }
}
