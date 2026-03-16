package main.java.multiplicationTableTrainer;

public class MultiplicationTable {

    public static void showTable() {

        for (int j = 2; j <= 9; j++) {
            for (int i = 2; i <= 9; i++) {

                System.out.print(String.format("%2d x%2d = %-3d", i, j, i * j) + "   ");

            }
            System.out.println();
        }
    }
}