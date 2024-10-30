package Safronov.EVG.Spring_demo;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {

    @Override
    public String start() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String summa(String num1, String num2) {
        if (num1.trim().isEmpty() || num2.trim().isEmpty()) {
            return "Вы ввели не все значения";
        }
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + (a + b);
    }

    @Override
    public String minus(String num1, String num2) {
        if (num1.trim().isEmpty() || num2.trim().isEmpty()) {
            return "Вы ввели не все значения";
        }
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + (a - b);
    }

    @Override
    public String multiply(String num1, String num2) {
        if (num1.trim().isEmpty() || num2.trim().isEmpty()) {
            return "Вы ввели не все значения";
        }
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + (a * b);
    }

    @Override
    public String divide(String num1, String num2) {
        if (num1.trim().isEmpty() || num2.trim().isEmpty()) {
            return "Вы ввели не все значения";
        }
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        if (b == 0) {
            return "На ноль делить нельзя!";
        }
        return num1 + " / " + num2 + " = " + (a / b);
    }

    public static int check(String s, String string) {
        int a = Integer.parseInt(s);
        return a;
    }
}
