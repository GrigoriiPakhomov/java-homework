package main.java.timeToSeconds;

public class TimeToSeconds {

    public static int toSeconds(String inputTime) {

        if (inputTime == null || inputTime.isBlank()) {
            throw new IllegalArgumentException("Строка не должна быть пустой.");
        }

        String [] parts = inputTime.split(":", 2);

        if (parts.length != 2) {
            throw new ArrayIndexOutOfBoundsException("Неверный формат. Используйте mm:ss.");
        }

        int minutes = Integer.parseInt(parts[0].trim());
        int seconds = Integer.parseInt(parts[1].trim());

        if (minutes < 0 || seconds < 0) {
            throw new IllegalArgumentException("Минуты и секунды не могут быть отрицательными.");
        }

        if (seconds > 59) {
            throw new IllegalArgumentException("Количество секунд не может быть больше 59.");
        }

        return minutes * 60 + seconds;
    }
}