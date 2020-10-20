package controllers;

import java.util.Arrays;

public class TableTreatment {

    // Get 2d array of strings inside truth table
    public static String[][] tableRowConstructor(String[][] A, String[][] B) {
        String[][] values = new String[A.length][A[0].length + B[0].length];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (j < A[0].length) {
                    values[i][j] = A[i][j];
                } else {
                    values[i][j] = B[i][j - A[0].length];
                }
            }
        }
        return values;
    }

    // Get list with all headers inside truth table
    public static String[] tableHeaderConstructor(String[] A, String[] B) {

        String[] values = new String[A.length + B.length];
        for (int j = 0; j < values.length; j++) {
            if (j < A.length) {
                values[j] = A[j];
            } else {
                values[j] = B[j - A.length];
            }
        }
        return values;
    }

    // Get table with union of header and rows of table
    public static String[][] tableConstructor(String[] Header, String[][] Rows) {

        String[][] values = new String[Rows.length + 1][Header.length];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (i == 0) {
                    values[i][j] = Header[j];
                } else {
                    values[i][j] = Rows[i - 1][j];
                }
            }
        }
        mostrarTable(values);
        return values;
    }

    // Create table with all values set to '0'
    public static String[][] tableGenerator(int linha, int coluna) {
        String[][] values = new String[linha][coluna];
        for (String[] value : values) {
            Arrays.fill(value, "0");
        }
        return values;
    }

    // Print table in 2d array format
    public static void mostrarTable(String[][] matriz) {
        for (String[] strings : matriz) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
