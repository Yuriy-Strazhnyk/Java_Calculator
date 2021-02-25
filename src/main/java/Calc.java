import java.util.Scanner;

public class Calc {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number1 = getInt();
        int number2 = getInt();
        char operation = getOperations();

        System.out.println("Результат вычесления: " + calc(number1, number2, operation));

    }

    public static int getInt(){
        System.out.println("Введите целое число");
        int number = 0;
        if(scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Не верные значения");
            System.exit(0);
        }
        return number;
    }



    public static char getOperations(){
        System.out.println("Выберете операцию (*; /; +; -)");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result = 0;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Не верные значения");
                System.exit(0);
            }
        }
        return result;

    }


}
