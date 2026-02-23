package main.java.timeToSeconds;

public class TimeToSeconds {

    public int toSeconds(String inputTime) {

        if (inputTime == null || inputTime.isBlank()) {
            throw new IllegalArgumentException("Строка не должна быть пустой.");
        }

        int colonIndex = inputTime.indexOf(":");

        if (colonIndex == -1) {
            throw new ArrayIndexOutOfBoundsException("Неверный формат. Используйте mm:ss.");
        }

        String minutesPart = inputTime.substring(0, colonIndex);
        String secondsPart = inputTime.substring(colonIndex + 1);

        int minutes = Integer.parseInt(minutesPart.trim());
        int seconds = Integer.parseInt(secondsPart.trim());

        if (minutes < 0 || seconds < 0) {
            throw new IllegalArgumentException("Минуты и секунды не могут быть отрицательными.");
        }

        if (seconds > 59) {
            throw new IllegalArgumentException("Количество секунд не может быть больше 59.");
        }

        return minutes * 60 + seconds;
    }
}