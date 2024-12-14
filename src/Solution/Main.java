package Solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        System.out.println(calc(inputText));

    }

    static char action;
    public static String calc(String input) throws Exception {
        String result = "";
        if (input.contains("/") || input.contains("+") || input.contains("*") || input.contains("-")) {
            if (input.contains("+")) {
                action = '+';
            } else if (input.contains("-")) {
                action = '-';
            } else if (input.contains("/")) {
                action = '/';
            } else {
                action = '*';
            }
            String[] split = input.split("[+/*-]");

            if (split.length > 2) {
                throw new Exception("формат математической операции не удовлетворяет заданию" +
                        " - два операнда и один оператор (+, -, /, *)");
            }
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            if ((a % 1 != 0) || (b % 1 != 0)) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if ((a < 1 || a > 10) || (b < 1 || b > 10)) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            switch (action) {
                case '+':
                    int sum = a + b;
                    result = sum + "";
                    break;
                case '-':
                    int s = a - b;
                    result = s + "";
                    break;
                case '/':
                    int h = a / b;
                    result = h + "";
                    break;
                case '*':
                    int multi = a * b;
                    result = multi + "";
                    break;
                default:
                    System.out.println("Нет такой операции!");

            }

        } else throw new Exception("Строка не является математической операцией");
        return result;
    }
}
