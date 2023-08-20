public class Duplicates
{
    public static void main(String[] args)
    {
        String[] element = {"Lilly", "Lilly", "is", "is", "not", "awesome", "awesome"};
        for (int i = 0; i < element.length-1; i++)
        {
            for (int j = i + 1; j < element.length; j++)
            {
                if( (element[i].equals(element[j])) && (i != j) )
                {
                    System.out.print(element[j] + " ");
                }
            }
        }
    }
}
