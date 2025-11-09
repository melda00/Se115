//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(100);
        System.out.println("first random number:" + r);
        System.out.println("second random number:" + r);
        int rMinute = randomGenerator.nextInt(59);
        int rHour = randomGenerator.nextInt(23);
        System.out.println("hour:" + rHour);
        System.out.println("minute:" + rMinute);
        if (rHour > rMinute) {
            System.out.println("hour is greater than minute: " + rHour);
        } else if (rHour < rMinute) {
            System.out.println("minute is greater than hour: " + rMinute);
        } else {
            System.out.println("hour and minute are equal");
        }

        System.out.printf("%02d:%02d\n", rHour, rMinute);
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your student ID number: ");
        Long sNumber = input.nextLong();
        if (sNumber % 2L == 0L && sNumber % 3L != 0L) {
            System.out.println("Student is in ALPHA TEAM!");
        } else if (sNumber % 5L != 0L && sNumber % 7L != 0L) {
            if (sNumber % 9L > 5L) {
                System.out.println("Student is in THETA TEAM!");
            } else {
                System.out.println("Student is in SIGMA TEAM!");
            }
        } else {
            System.out.println("Student is in BETA TEAM!");
        }

        int r1 = randomGenerator.nextInt(1000);
        int r2 = randomGenerator.nextInt(1000);
        System.out.println("Select operator you want to use:\n1=sum\n2=difference\n3=product\n4=division");
        int operator = input.nextInt();
        System.out.println("number one: " + r1);
        System.out.println("number two: " + r2);
        switch (operator) {
            case 1:
                System.out.println(r1 + r2);
                break;
            case 2:
                System.out.println(r1 - r2);
                break;
            case 3:
                System.out.println(r1 * r2);
                break;
            case 4:
                if (r2 != 0) {
                    System.out.println(r1 / r2);
                    System.out.println((float)r1 / (float)r2);
                } else {
                    System.out.println("Division by zero not allowed!");
                }
                break;
            default:
                System.out.println("invalid input");
        }

        System.out.println("Please, enter three integers that represent side lengths a,b and c(between 1-500)");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("invalid length");
        }

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("equilateral");
            } else if (a != b && b != c && a != c) {
                System.out.println("scalene");
            } else {
                System.out.println("isosceles");
            }

            int perimeter = a + b + c;
            System.out.println(perimeter);
        } else {
            System.out.println("not a triangle");
        }
    }
}
