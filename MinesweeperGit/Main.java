import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int table[][] = new int[15][15];
        int bomb = 0;
        while (bomb < 10) {
            int i = random.nextInt(table.length);
            int j = random.nextInt(table.length);

            if (table[i][j] == -1) {
                continue;
            }
            bomb++;
            table[i][j] = -1;
            for (int p = -1; p <= 1; p++) {
                for (int k = -1; k <= 1; k++) {
                    try {
                        if (table[i + p][j + k] == -1) {
                            continue;
                        }
                        table[i + p][j + k] += 1;
                    } catch (Exception e) {
                    }
                }
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}