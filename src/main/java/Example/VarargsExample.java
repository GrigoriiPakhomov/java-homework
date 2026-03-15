package main.java.Example;

public class VarargsExample {

    public static void vStolbik(String... values) {
        for (String value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        vStolbik("Нужно", "пойти", "поиграть", "в", "танки", "срочно", "и поспать", "", "чутка");
    }
}
