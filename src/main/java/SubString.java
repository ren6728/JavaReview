public class SubString {

    public static void SubString(String str, int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i+1; j <= n; j++)

                // Please refer below article for details
                // of substr in Java
                // https://www.geeksforgeeks.org/java-lang-string-substring-java/
               System.out.println(str.substring(i, j));
               // System.out.println(str.substring(10, j));
        //System.out.println(str.substring(26, j));

    }

    public static void main(String[] args) {
        String str = "Let this be the last year tha you doubt yourself, fear, change or quit. Never give up";
        SubString(str, str.length());
    }
}
