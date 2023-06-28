package project1;

import java.util.Scanner;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isAM;

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        isAM = true;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            System.out.println("Invalid hours. Setting to default (0).");
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Invalid minutes. Setting to default (0).");
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("Invalid seconds. Setting to default (0).");
            this.seconds = 0;
        }
    }

    public void setTimeMode(boolean isAM) {
        this.isAM = isAM;
    }

    public void displayTime() {
        String timeMode = isAM ? "AM" : "PM";
        System.out.println("Time: " + String.format("%02d", hours) + ":" +
                String.format("%02d", minutes) + ":" + String.format("%02d", seconds) +
                " " + timeMode);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds (0-59): ");
        int seconds = scanner.nextInt();

        Clock clock = new Clock(hours, minutes, seconds);
        clock.displayTime();

        System.out.print("Set time mode (AM/PM): ");
        String timeModeInput = scanner.next();
        boolean isAM = timeModeInput.equalsIgnoreCase("AM");
        clock.setTimeMode(isAM);

        clock.displayTime();
    }
}
