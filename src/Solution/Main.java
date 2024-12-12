package Solution;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        System.out.println(calc(inputText));
    }



    public static String calc(String input) throws Exception {

        String result = "";
        if (input.contains("+")) {
            String[] split = input.split("[+]");
            if (split.length > 2) {
                throw new Exception("формат математической операции не удовлетворяет заданию" +
                        " - два операнда и один оператор (+, -, /, *)");
            }
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            if (a % 1 != 0) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if (b % 1 != 0) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if (a < 1 || a > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            if (b < 1 || b > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            double d = a + b;
            int c = (int) d;
            result = c + "";
        } else if (input.contains("-")) {
            String[] split = input.split("[-]");
            if (split.length > 2) {
                throw new Exception("формат математической операции не удовлетворяет заданию" +
                        " - два операнда и один оператор (+, -, /, *)");
            }
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            if (a % 1 != 0) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if (b % 1 != 0) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if (a < 1 || a > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            if (b < 1 || b > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            double d = a - b;
            int c = (int) d;
            result = c + "";
        } else if (input.contains("*")) {
            String[] split = input.split("[*]");
            if (split.length > 2) {
                throw new Exception("формат математической операции не удовлетворяет заданию" +
                        " - два операнда и один оператор (+, -, /, *)");
            }
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            if (a % 1 != 0) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if (b % 1 != 0) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if (a < 1 || a > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            if (b < 1 || b > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            double d = a * b;
            int c = (int) d;
            result = c + "";
        } else if (input.contains("/")) {
            String[] split = input.split("[/]");
            if (split.length > 2) {
                throw new Exception("формат математической операции не удовлетворяет заданию" +
                        " - два операнда и один оператор (+, -, /, *)");
            }
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            if (a % 1 != 0) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if (b % 1 != 0) {
                throw new Exception("Калькулятор работает только с целыми числами");
            }
            if (a < 1 || a > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            if (b < 1 || b > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            double d = a / b;
            int c = (int) d;
            result = c + "";
        } else throw new Exception("Строка не является математической операцией");
        return result;
    }


}

