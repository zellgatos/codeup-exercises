package com.codeup;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumeric = StringUtils.isNumeric("123456789");
        System.out.println("Enter something... ANYTHING");
        String line = scanner.nextLine();
        System.out.println("you entered: " + line);

        if (StringUtils.isNumeric(line) || StringUtils.isNumericSpace(line)){
            System.out.println(line + " is a number");
        } else {
            System.out.println(line + " is Not a number");
            System.out.println("Swapped case: " + StringUtils.swapCase(line));
            System.out.println("Reversed: " + StringUtils.reverse(line));
        }
    }
}
