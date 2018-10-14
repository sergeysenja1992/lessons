package ua.com.jbs;

import java.util.Random;

public class ControlFlow {

    private static Random random = new Random();

    // Точка входу в программу!!!
    public static void main(String[] args) {

        boolean booleanVarable = random.nextBoolean();

        if (booleanVarable) {
            System.out.println("Boolean variable is true");
        }


        if (booleanVarable)
            System.out.println("Boolean expression is false");
        System.out.println("Always write");


        if (booleanVarable) {
            System.out.println("True block");
        } else {
            System.out.println("False block");
        }


        if (booleanVarable)
            System.out.println("True block");
        else
            System.out.println("False block");
        System.out.println("Always write");

        int testscore = random.nextInt(100);
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);


        int value1 = random.nextInt();
        int value2 = random.nextInt();
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");

        if (value1 > value2 || value2 < 30) {
            System.out.println("value1 > value2 || value2 < 30");
        }


        int monthNumber1 = random.nextInt(11) + 1;
        String monthString;
        switch (monthNumber1) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid monthNumber1";
                break;
        }
        System.out.println(monthString);




        int monthNumber2 =  random.nextInt(11) + 1;

        switch (monthNumber2) {
            case 1:  System.out.println("January");
            case 2:  System.out.println("February");
            case 3:  System.out.println("March");
            case 4:  System.out.println("April");
            case 5:  System.out.println("May");
            case 6:  System.out.println("June");
            case 7:  System.out.println("July");
            case 8:  System.out.println("August");
            case 9:  System.out.println("September");
            case 10: System.out.println("October");
            case 11: System.out.println("November");
            case 12: System.out.println("December");
                break;
            default: break;
        }


        int monthNumber3 = random.nextInt(11) + 1;
        int year = 2000;
        int numDays = 0;

        switch (monthNumber3) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid monthNumber3.");
                break;
        }
        System.out.println("Number of Days = "
                + numDays);

        int monthNumber = 0;
        String monthName = "april";

        switch (monthName.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        System.out.println(monthNumber);


        String title = booleanVarable ? "true title" : "false title";
        System.out.println(title);

        boolean subvariable = false;

        String titleWithSubtitle = booleanVarable ? subvariable ? "true true" : "true false" : "else else";
        System.out.println(titleWithSubtitle);

        System.out.println(booleanVarable ? "true true" : subvariable ? "false true" : "false false");

    }

}
