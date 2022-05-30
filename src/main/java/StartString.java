public class StartString {
    public static void main(String[] args) {

    String str1 = "Java is my favorite programming Lang";
    String str2 = "Python is my favorite programming language";

    // The String to check the above two Strings to see
    // if they start with this value (Red).
    String startStr = "Java";

    // Do either of the first two Strings start with startStr?
    boolean starts1 = str1.startsWith(startStr);
    boolean starts2 = str2.startsWith(startStr);

    // Display the results of the startsWith calls.
        System.out.println( str1 + " starts with " +
    startStr + "? " + starts1);
        System.out.println(str2 + " starts with " +
    startStr + "? " + starts2);

        String ab = "Automation";

        StringBuilder newString = new StringBuilder(ab);

        newString.setCharAt(9, 'm');

        System.out.println(newString);

        String s="C#"+" Java";
        System.out.println(s);//Sachin Tendulkar

        String s1="automation";
        String s2="Automation";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        String str_Sample1 = "Software";
        String str_Sample2 = "Hardware";
        //Check if ends with a particular sequence
        System.out.println("EndsWith character 'ware': " + str_Sample1.endsWith("ware"));
        System.out.println("EndsWith character 'ware': " + str_Sample2.endsWith("ware"));
}
}
