import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers and operation:");
        String inputNum1 = input.nextLine().toLowerCase();
        char opera = input.nextLine().charAt(0);
        String inputNum2 = input.nextLine().toLowerCase();
        input.close();

        BigDecimal pi = BigDecimal.valueOf(Math.PI);
        BigDecimal num1, num2;

        if (inputNum1.equals("pi")){
            num1 = pi;
        } else {
            num1 = BigDecimal.valueOf(Double.parseDouble(inputNum1));
        }

        if (inputNum2.equals("pi")){
            num2 = pi;
        } else {
            num2 = BigDecimal.valueOf(Double.parseDouble(inputNum2));
        }


        if (opera == '+') {
            System.out.println(num1.add(num2));

        } else if (opera == '-') {
            System.out.println(num1.subtract(num2));

        } else if (opera == '/') {
            System.out.println(num1.divide(num2));

        } else if (opera == '*') {
            System.out.println(num1.multiply(num2));

        } else {
            System.out.println("Invalid Input, please try again.");
        }
    }
}
