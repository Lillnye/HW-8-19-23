public class Swap
{
    public static void main(String[] args)
    {
        int i = 5765;
        int v = 243;
        i = i + v;
        v = i - v;
        i = i - v;
        System.out.println("After swapping" + " i = " + i + ", v = " + v);
    }
}
