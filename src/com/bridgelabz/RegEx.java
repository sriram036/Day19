package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Last Name :");
        String string = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
