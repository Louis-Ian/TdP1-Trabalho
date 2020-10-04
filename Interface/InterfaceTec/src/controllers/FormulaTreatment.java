package controllers;

import java.util.ArrayList;

public class FormulaTreatment {

    public static void tratarFormula(String formula) {

        String[] values = formula.split(" ");

        System.out.println(getClauses(formula));
    }

    public static String[] getClauses(String formula) {
        String[] clauses = formula.replace("(", "").replace(")", "").replace("~", "").split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < clauses.length; i += 2) {
            if (!list.contains(clauses[i])) {
                list.add(clauses[i]);
            }
        }
        generateFormulaValues(list.size());
        String[] listaretorno = new String[list.size()];
        for(int j = 0; j<list.size();j++){
            listaretorno[j] = list.get(j);
        }
        return listaretorno;
    }

    public static String[][] generateFormulaValues(int length) {
        int linha = (int) Math.pow(2, length);
        int count, line;
        String start = "T";

        String[][] values = new String[linha][length];
        for (int i = 0; i < length; i++) {
            line = (int) Math.floor(Math.pow(2, length - 1 - i));
            count = 0;
            for (int j = 0; j < linha; j++) {
                if (count < line && start == "T") {
                    values[j][i] = "T";
                    count++;
                } else {
                    values[j][i] = "F";
                    start = "F";
                    count--;
                }
                if (count == 0) {
                    start = "T";
                }
            }
        }
        //mostrarTable(values);
        return values;
    }

    public void mostrarTable(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
