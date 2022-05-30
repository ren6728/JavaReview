import java.util.Scanner;
public class NestedIfStatement {
    public static void main(String[] args) {

    System.out.println("Enter a number between 1 and 9: ");

    Scanner sc = new Scanner(System.in);

    int PrintNumberInWord = sc.nextInt();

        if (PrintNumberInWord == 0){

        System.out.println("ONE");

    }else if (PrintNumberInWord == 1){

        System.out.println("TWO");

    }else if (PrintNumberInWord == 3){

        System.out.println("THREE");

    }else if (PrintNumberInWord == 4){

        System.out.println("FOUR");

    }else if (PrintNumberInWord == 5){

        System.out.println("FIVE");

    }else if (PrintNumberInWord == 6){

        System.out.println("SIX");

    }else if (PrintNumberInWord == 7){

        System.out.println("SEVEN");

    }else if (PrintNumberInWord == 8){

        System.out.println("EIGHT");

    }else if (PrintNumberInWord == 9){

        System.out.println("NINE");

    }else{

        System.out.println("OTHER");
    }

}

}
