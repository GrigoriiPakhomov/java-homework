package main.java.clockAngle;

public class Clock {

//Информация для расчетов https://en.wikipedia.org/wiki/Clock_angle_problem
    private final double DEGREES_HOUR = 30.0;
    private final double DEGREES_MINUTE_FOR_HOUR_HAND = 0.5;
    private final double DEGREES_MINUTE = 6.0;
    private final double FULL_CIRCLE = 360.0;

    private final int hours;
    private final int minutes;
    private final double hourAngle;
    private final double minuteAngle;
    private final double angleDifference;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.hourAngle = (hours % 12) * DEGREES_HOUR + minutes * DEGREES_MINUTE_FOR_HOUR_HAND;
        this.minuteAngle = minutes * DEGREES_MINUTE;
        this.angleDifference = Math.abs(this.hourAngle - this.minuteAngle);
    }

    public double getHourAngle() {
        return hourAngle;
    }

    public double getMinuteAngle() {
        return minuteAngle;
    }

    public double getSmallestAngle() {
        return Math.min(angleDifference, FULL_CIRCLE - angleDifference);
    }
}