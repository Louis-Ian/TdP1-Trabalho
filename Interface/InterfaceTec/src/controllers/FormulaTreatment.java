package controllers;

import java.util.ArrayList;

public class FormulaTreatment {

    private boolean[][] values;
    private String formula;
    private int length;
    private int totalLines;
    private ArrayList<String> list;

    public FormulaTreatment(String formula) {
        this.formula = formula;
        
        getClauses();
        this.length = getTotalClauses();
        this.totalLines = (int) Math.pow(2, length);
        generateFormulaValues();
    }

    public String[] getTableHead() {
        String[] Clauses = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            Clauses[j] = list.get(j);
        }
        
        //Clauses + Formulas Header
        //ISSO TA ERRADO POR ENQUANTO, SEGUNDO ARGUMENTO É PRA SER UMA LISTA COM AS FÓRMULAS
        String [] tableHeader = TableTreatment.tableHeaderConstructor(Clauses,Clauses);
        
        return tableHeader;
    }

    public String[][] getTableBody() {
        String stringValues[][] = new String[totalLines][length];
        for (int i = 0; i < stringValues.length; i++) {
            for (int j = 0; j < stringValues[i].length; j++) {
                if (values[i][j]) {
                    stringValues[i][j] = "T";
                } else {
                    stringValues[i][j] = "F";
                }
            }
        }
        
        //Clauses + Formulas Rows
        String [][] tableRows = TableTreatment.tableRowConstructor(stringValues,TableTreatment.tableGenerator(totalLines,length));
        return tableRows;
    }

    private int getTotalClauses() {
        return list.size();
    }

    private void getClauses() {
        String[] clauses = formula.replace("(", "").replace(")", "").replace("¬", "").split(" ");
        list = new ArrayList<>();
        for (int i = 0; i < clauses.length; i += 2) {
            if (!list.contains(clauses[i])) {
                list.add(clauses[i]);
            }
        }
    }

    private boolean[][] generateFormulaValues() {
        int count, line;
        boolean start = true;
        values = new boolean[totalLines][length];
        for (int i = 0; i < length; i++) {
            line = (int) Math.floor(Math.pow(2, length - 1 - i));
            count = 0;
            for (int j = 0; j < totalLines; j++) {
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
