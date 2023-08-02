package project1;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean validateMonth() {
        return month >= 1 && month <= 12;
    }

    public boolean validateDay() {
        boolean isValid = true;

        if (month == 2) { // February
            if (isLeapYear()) {
                isValid = day >= 1 && day <= 29;
            } else {
                isValid = day >= 1 && day <= 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            // April, June, September, November
            isValid = day >= 1 && day <= 30;
        } else {
            // All other months
            isValid = day >= 1 && day <= 31;
        }

        return isValid;
    }

    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public Date getNextDay() {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (month == 2) { // February
            if (isLeapYear()) {
                if (day == 29) {
                    nextDay = 1;
                    nextMonth = 3;
                } else {
                    nextDay += 1;
                }
            } else {
                if (day == 28) {
                    nextDay = 1;
                    nextMonth = 3;
                } else {
                    nextDay += 1;
                }
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            // April, June, September, November
            if (day == 30) {
                nextDay = 1;
                nextMonth += 1;
            } else {
                nextDay += 1;
            }
        } else {
            // All other months
            if (day == 31) {
                if (month == 12) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear += 1;
                } else {
                    nextDay = 1;
                    nextMonth += 1;
                }
            } else {
                nextDay += 1;
            }
        }

        return new Date(nextDay, nextMonth, nextYear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        Date date = new Date(day, month, year);

        System.out.println("Month validation: " + date.validateMonth());
        System.out.println("Day validation: " + date.validateDay());

        Date nextDay = date.getNextDay();
        System.out.println("Next day: " + nextDay.day + "/" + nextDay.month + "/" + nextDay.year);
    }
}
