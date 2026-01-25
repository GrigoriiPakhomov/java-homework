package main.java.BooleanExample;

public class BooleanExample {

    public static void main(String[] args) {
        int age = 38;
        int requiredAge = 18;

        boolean isOldEnough = (age >= requiredAge);

        if(isOldEnough) {
            System.out.println("Вход разрешен");
        }
        else  {
            System.out.println("Вход запрещен!");
        }
    }
}
