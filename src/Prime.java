public class Prime
{
    public static void main(String[] args)
    {
        int[] sequence = {0, 5, 9, 20, 11, 125, 700, 650, 222, 1, 4, 77};
        for (int i = 0; i < sequence.length; i++)
        {
            boolean isPrime = true;
            if (sequence[i] == 1)
            {
                isPrime = false;
            }
            else
            {
                for (int j = 2; j <= sequence[i] / 2; j++)
                {
                    if (sequence[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime)
            {
                if (sequence[i] == 0)
                {
                    System.out.print("0 is not a prime number, but");
                }
                else
                {
                    System.out.print(" " + sequence[i] + " ");
                }
            }
        }
        System.out.println(" are prime numbers");
    }
}