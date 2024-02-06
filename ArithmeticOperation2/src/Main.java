import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println(name + ',' + " давайте проверим ваше знание математики");

        // Сложение
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int number1 = random.nextInt(10 + 1);
        int number2 = random.nextInt(10 + 1);
        System.out.println("Сколько будет " + number1 + '+' + number2 + '?');
        int resultOfSum = scanner.nextInt();
        int validSum = (arithmeticOperation.sum(number1, number2));
        if (resultOfSum == validSum) {
        System.out.println("Поздравляю! Вы правильно ответили на вопрос");
        }
        else if (resultOfSum > validSum) {
        System.out.println("Увы, " + name + " правильный ответ " + validSum);
    }
        else {
        System.out.println("Увы, " + name + " правильный ответ " + validSum);
}

        // Вычитание
        System.out.println("Сколько будет " + number1 + '-' + number2 + '?');
        int resultOfSubstraction = scanner.nextInt();
        int validSubstraction = (arithmeticOperation.substraction(number1, number2));
        if (resultOfSubstraction == validSubstraction) {
        System.out.println("Поздравляю! Вы правильно ответили на вопрос");
        }
        else if (resultOfSubstraction > validSubstraction) {
        System.out.println("Увы, " + name + " правильный ответ " + validSubstraction);
        }
        else {
        System.out.println("Увы, " + name + " правильный ответ " + validSubstraction);
        }

        //Деление
        System.out.println("Сколько будет " + number1 + '/' + number2 + '?');
        int resultOfDivision = scanner.nextInt();
        int validDivision = (arithmeticOperation.division(number1, number2));
        if (resultOfDivision == validDivision) {
        System.out.println("Поздравляю! Вы правильно ответили на вопрос");
        }
        else if (resultOfDivision > validDivision) {
        System.out.println("Увы, " + name + " правильный ответ " + validDivision);
        }
        else {
        System.out.println("Увы, " + name + " правильный ответ " + validDivision);
        }

        //Умножение
        System.out.println("Сколько будет " + number1 + '*' + number2 + '?');
        int resultOfMultiplication = scanner.nextInt();
        int validMultiplication = (arithmeticOperation.multiplication(number1, number2));
        if (resultOfMultiplication == validMultiplication) {
        System.out.println("Поздравляю! Вы правильно ответили на вопрос");
        }
        else if (resultOfMultiplication > validMultiplication) {
        System.out.println("Увы, " + name + " правильный ответ " + validMultiplication);
        }
        else {
        System.out.println("Увы, " + name + " правильный ответ " + validMultiplication);
        }
        System.out.println("Поздравляю! Опросник завершен.");
    }
}









