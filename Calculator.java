
import java.util.Scanner;
public class Calculator {
    static int calculate(int num1, char operation, int num2) {
        int ans = 0;
        switch (operation) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 *num2;
                break;
            case '/':
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Error: division by zero");
                    return 0;
                }
                break;
            case '%':
                ans = num1 % num2;

                break;
            default:
                System.out.println("invlid input: ");
                ;

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Do calculation----");
        System.out.println("Enter first number: ");
        int op1 = sc.nextInt();
        System.out.println("Enter any operation (+ , - , * , / ,% )");
        char op = sc.next().charAt(0);
        System.out.println("Enter second number: ");
        int op2 = sc.nextInt();
        System.out.println("Ans is: " + calculate(op1, op, op2));


    }
}
