public class DecreaseWithoutOperators {
    static int subtractOne(int x)
    {
        return ((x << 1) + (~x));
    }
    static long increment(long i) {
        // Invert bits and
        // apply negative sign
        i = -(~i);

        return i;
    }

    /* Driver code*/
    public static void main(String[] args)
    {
        System.out.printf("%d", subtractOne(13));

        long n = 13;
        System.out.print( ";"+ increment(n));
    }
    }

