package main.java.multiplicationTableTrainer;

public class MultiplicationTable {

    public static void showTable() {

        for (int j = 2; j <= 9; j++) {
            for (int i = 2; i <= 9; i++) {

                String table = String.format("%dx%d=%-3d", i, j, i * j);
                System.out.print(table + "   ");

            }
            System.out.println();
        }
    }
}