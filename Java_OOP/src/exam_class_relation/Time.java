package exam_class_relation;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {}

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = isValidHour(hour) ? hour : 0;
        this.minute = isValidMinuteOrSecond(minute) ? minute : 0;
        this.second = isValidMinuteOrSecond(second) ? second : 0;
    }

    private boolean isValidHour(int hour) {
        return hour >= 0 && hour < 24;
    }

    private boolean isValidMinuteOrSecond(int value) {
        return value >= 0 && value < 60;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

