package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long int_input = Long.parseLong(input);
        if ((Byte.MIN_VALUE <= int_input) && (Byte.MAX_VALUE >= int_input)) return "byte";
        else
            if ((Short.MIN_VALUE <= int_input) && (Short.MAX_VALUE >= int_input)) return "short";
            else
                if ((Integer.MIN_VALUE <= int_input) && (Integer.MAX_VALUE >= int_input)) return "int";
                else return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
