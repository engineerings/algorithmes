package com.michal.algorithmes.recursion;


public class Recursion {

    public static void main(String[] args) {

        System.out.println("Triangular Number = " + getTriangularNumber(3));

        System.out.println("Recursive Triangular = " + getRecursiveTriangularNumber(6));

        System.out.println("Factorial = " + getFactorial(6));


    }

    public static int getTriangularNumber(int num) {

        int triangularNumber = 0;

        // 3 + 2 + 1 = 6

        while (num > 0) {

            triangularNumber = triangularNumber + num;
            num--;
        }
        return triangularNumber;
    }

    /**
     * @return Triangular number from num
     */
    public static int getRecursiveTriangularNumber(int num) {

        System.out.println("Method " + num);

        if(num == 1) {

            System.out.println("Returned 1 ");

            return 1;

        } else {

            int result = num + getRecursiveTriangularNumber(num - 1);
            System.out.print("Returned " + result);
            System.out.println(" : " + num + " + getTriangularNumber(" + num + " - 1)");

            return result;
        }
    }

    public static int getFactorial(int num) {

        System.out.println("Method " + num);

        if(num == 1) {

            System.out.println("Returned 1");

            return 1;

        } else {

            int result = num * getFactorial(num - 1);

            System.out.print("Returned " + result);
            System.out.println(" : " + num + " * getFactorial(" + num + " - 1)");

            return result;
        }
    }

}