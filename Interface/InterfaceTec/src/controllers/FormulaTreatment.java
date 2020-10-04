package controllers;

import java.util.ArrayList;

public class FormulaTreatment {

    public static void tratarFormula(String formula) {

        String[] values = formula.split(" ");

        System.out.println(getClauses(formula));
    }

    private static ArrayList<String> getClauses(String formula) {
        String[] clauses = formula.replace("(", "").replace(")", "").replace("~", "").split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < clauses.length; i += 2) {
            if (!list.contains(clauses[i])) {
                list.add(clauses[i]);
            }
        }
        generateFormulaValues(list.size());
        return list;
    }

    private static void generateFormulaValues(int length) {
        int linha = (int) Math.pow(2, length);
        int count, line;
        boolean start = true;

        boolean[][] values = new boolean[linha][length];
        for (int i = 0; i < length; i++) {
            line = (int) Math.floor(Math.pow(2, length - 1 - i));
            count = 0;
            for (int j = 0; j < linha; j++) {
                if (count < line && start) {
                    values[j][i] = true;
                    count++;
                } else {
                    start = false;
                    count--;
                }
                if (count == 0) {
                    start = true;
                }
            }
        }
        mostrarTable(values);
    }

    private static void mostrarTable(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
