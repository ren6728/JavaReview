public class SwapNumbers {
    public static void main(String[] args) {

        float num1 = 5f, num2 = 4f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

    // Value of first is assigned to temporary
    float temporary = num1;

    // Value of second is assigned to first
    num1 = num2;

    // Value of temporary (which contains the initial value of first) is assigned to second
    num2 = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
        int positiveVal = 100;
        int negativeVal = (~(positiveVal - 1));
        System.out.println("Result: Positive value converted to Negative = "+negativeVal);
        positiveVal = ~(negativeVal - 1);
        System.out.println("Actual Positive Value = "+positiveVal);
        negativeVal = -200;
        System.out.println("Actual Negative Value = "+negativeVal);
        positiveVal = ~(negativeVal - 1);
        System.out.println("Result: Negative value converted to Positive = "+positiveVal);
}
}