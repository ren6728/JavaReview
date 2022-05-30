public class ArrayIndex {
    public static void main(String[] args) {
        String name = "automation";
        System.out.println(name.indexOf("a", 5));
        int length = name.length();
        int length2 = name.lastIndexOf("n");
        length2 = length2 + 1;

        // Printing the Length using length() method
        System.out.println("Length using length() method = " + length);

        // Printing the Length using lastIndexOf() method
        System.out.println("Length using lastIndexOf() method = " + length2);
        String txt = "YourName";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        String input = "Java is my favorite";

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.println(try1[i]);

        }
    }



