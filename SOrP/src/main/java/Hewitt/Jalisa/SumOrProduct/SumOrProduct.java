package Hewitt.Jalisa.SumOrProduct;

        import java.util.Scanner;

        import java.util.Scanner;
        import java.lang.String;

/**
 * Created by jalisahewitt on 9/9/16.
 */
public class SumOrProduct {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner number = new Scanner(System.in);
        int num= number.nextInt();
        System.out.println("A) Sum of number, B) Product of number-Choose A or B");
        Scanner sp = new Scanner(System.in);
        char choice;
        choice=sp.next().charAt(0);
        int sum = 0;
        int prod = 1;



        switch(choice){
            case 'a':
            case 'A':
                for(int i=1; i<=num; i++){
                    sum+=i;
                }
                System.out.println("You choose sum. The sum = "+ sum);
                break;

            case 'b':
            case 'B':
                for(int i=1; i<=num; i++) {
                    prod *= i;
                }
                System.out.println("You choose product. The product = " + prod);
                break;
            default: System.out.println("Invalid input");
                break;


        }




    }
}