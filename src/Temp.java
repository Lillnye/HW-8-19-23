public class Temp
{
    public static void main(String[] args)
    {
       int[] temps = {105, 108, 110, 98, 85, 99, 101};
       int number;
       int highest = 0;
       int lowest = 1000;
       for (int temp : temps)
       {
           number = temp;
           if (number > highest)
           {
               highest = number;
           }
           else if (number < lowest)
           {
               lowest = number;
           }
        }
        System.out.println("The highest temperature over the week was " + highest + " degrees Fahrenheit");
        System.out.println("The lowest temperature over the week was " + lowest + " degrees Fahrenheit");
    }
}
