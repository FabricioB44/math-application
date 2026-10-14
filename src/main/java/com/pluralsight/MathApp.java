package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1
        int bobSalary = 100;
        int garySalary = 200;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2
        int carPrice = 4000;
        int truckPrice = 6000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        // Question 3
        double circleRadius = 7.25;
        double circleArea = circleRadius * circleRadius * Math.PI;
        circleArea = Math.round(circleArea * 100.0) / 100.0;
        System.out.println("The area of the circle is " + circleArea);

        // Question 4
        double variableToSquare = 5.0;
        variableToSquare = Math.pow(variableToSquare, 2);
        System.out.println("The square root of the variable is " + variableToSquare);

        // Question 5
        int[] firstPoints = {5, 10};
        int[] secondPoints = {85, 50};

        int firstDistance = Math.abs(firstPoints[0] - firstPoints[1]);
        int secondDistance = Math.abs(secondPoints[0] - secondPoints[1]);

        System.out.println("The distance between the first points is "
                + firstDistance + " and the one between the second points is "
                + secondDistance);

        // Question 6
        double variableToAbsolute = -3.8;
        variableToAbsolute = Math.abs(variableToAbsolute);
        System.out.println("The absolute value of the variable is " + variableToAbsolute);

        // Question 7
        double randomNumber = Math.random();
        System.out.println("The random number is " + randomNumber);

        // Question 8
        int days = 24;
        int hours = 24 * days;
        int minutes = 60 * hours;
        int seconds = 60 * minutes;
        int milliseconds = 1000 * seconds;
        System.out.println("There are " + minutes + " minutes in 24 days");
        System.out.println("There are " + milliseconds + " milliseconds in 24 days");
    }
}