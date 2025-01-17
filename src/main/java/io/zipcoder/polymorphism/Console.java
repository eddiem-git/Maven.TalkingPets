package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Console {
    public static void print(String val, Object... args) {
//        output.format(val, args);
        System.out.print(String.format(val, args));
//        slowPrint(val, args);
    }

    public static void println(String val, Object... vals) {
        print(val + "\n", vals);
    }


    public  static String getStringInput(String prompt, Object... args) {
        Scanner scanner = new Scanner(System.in);
        println(prompt, args);
        return scanner.nextLine();
//        return input.nextLine();
    }

    public  static Double getDoubleInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Double doubleInput = Double.parseDouble(stringInput);
            return doubleInput;
        } catch (NumberFormatException nfe) { // TODO - Eliminate recursive nature
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting a numeric value!");
            return getDoubleInput(prompt, args);
        }
    }


    public static Long getLongInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Long longInput = Long.parseLong(stringInput);
            return longInput;
        } catch (NumberFormatException nfe) { // TODO - Eliminate recursive nature
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting an integer value!");
            return getLongInput(prompt, args);

        }
    }

    public static Integer getIntegerInput(String prompt, Object... args) {
        return getLongInput(prompt, args).intValue();
    }
}
