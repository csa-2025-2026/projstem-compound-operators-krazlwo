public class Problem2
    
    public static void main(String[] args)
    {
        int x = 143;
        int lastdig = (x % mod);
        System.out.println(lastdig);

        int y = (x / 10);
        y = (y % 10);
        System.out.println(y);

        int g = (x / 100);
        g = (g % 10);
        System.out.println(g);
    }
