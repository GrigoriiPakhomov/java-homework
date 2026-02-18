package main.java.maxMin;

import java.util.Scanner;

public class InputHelper {
    public static int readNumber(Scanner scanner){
        while (true){
            if (!scanner.hasNextInt()){
                System.out.println("Ошибка: введено не целое число. Попробуйте ещё раз:");
                scanner.next();
            }else {
                return scanner.nextInt();
            }
        }
    }
}
