public class SecondLargest
{
    public static void main(String[] args)
    {
        int[] values = {2000, 43, 8, 60324, 4567, 123, 56};
        int number;
        int secondNumber;
        int highest = 0;
        int secondHighest = 0;
        for (int v : values)
        {
            number = v;
            if (number > highest)
            {
                highest = number;
            }
        }
        for (int j : values)
        {
            secondNumber = j;
            if (secondNumber > secondHighest && secondNumber < highest)
            {
                secondHighest = secondNumber;
            }
        }
        System.out.println("The second Highest number is " + secondHighest);
    }
}