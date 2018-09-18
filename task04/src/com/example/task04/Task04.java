package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float res = 0;
        float c = b;
        if (operation == "+") res = a+c;
        if (operation == "-") res = a-c;
        if (operation == "*") res = a*c;
        if (operation == "/") res = a/c;
        return res;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
