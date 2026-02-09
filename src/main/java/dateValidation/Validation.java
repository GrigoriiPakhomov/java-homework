package main.java.dateValidation;

public class Validation {

    public static String validate(int day, int month, int year) {

        if (month < 1 || month > 12) {
            return "Месяц должен быть от 1 до 12.";
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int maxDays;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = isLeapYear ? 29 : 28;
                break;
            default:
                maxDays = 31;
        }

        if (day < 1 || day > maxDays) {
            return "День должен быть от 1 до " + maxDays + " для данного месяца.";
        }

        return "Дата " + day + "." + month + "." + year + " является валидной.";
    }
}
