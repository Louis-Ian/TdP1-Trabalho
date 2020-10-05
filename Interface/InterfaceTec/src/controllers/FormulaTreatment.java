package controllers;

import java.util.ArrayList;
import model.*;

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
        solveFormula();
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
        String[] clauses = formula.replace("(", "").replace(")", "").replace("¬", "").replace(" OR ", "").replace(" AND ", "").split(" ");
        list = new ArrayList<>();
        for(int i = 0; i < clauses.length; i++) {
            if (!list.contains(clauses[i])) {
                list.add(clauses[i]);
            }
        }
    }
    
    private boolean getClauseBool(int line, char clause){
        switch(clause){
            case 'A':
                return values[line][0];
            case 'B':
                return values[line][1];
            case 'C':
                return values[line][2];
            case 'D':
                return values[line][3];
            case 'E':
                return values[line][4];
            default:
                return true;
        }
    }

    public String BoolToStr(boolean b){
        if(b){
            return "V";
        } else {
            return "F";
        }
    }
    
    public boolean StrToBool(String s){
        if(s.equals("V")){
            return true;
        } else{
            return false;
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
    
    private String solvedFormula = formula;
    private void solveFormula(){
        
        for(int i = 0; i < length; i++){
            solvedFormula = formula;
            
            while(solvedFormula.length() > 1){
                while(seekTier1Operator()[0] != -1){
                    while(seekTier2Operator() != -1){

                        solveTier2Operation(i);

                        while(seekTier3Operator() != -1){
                            solveTier3Operation(i);
                        }
                    }
                }
            }
            
            values[length-1][i] = StrToBool(solvedFormula);
        }
        
    }
    
    // Seeks for opening and closing brackets ( )
    // Procura por abertura e fechamento de parenteses ( )
    private int[] seekTier1Operator(){
        int[] bracketsIndex = {-1, -1};
        bracketsIndex[0] = formula.lastIndexOf("(");
        bracketsIndex[1] = formula.indexOf(")", bracketsIndex[0]);
        return bracketsIndex;
    }
    
    private int seekTier2Operator(){
        int indexNOT = formula.indexOf("¬", seekTier1Operator()[0]);
        
        if(indexNOT == -1 || indexNOT > seekTier1Operator()[1]){
            return -1;
        } else {
            return indexNOT;
        }
    }
    
    private void solveTier2Operation(int line){
        int operationIndex = seekTier2Operator();
        char clause = solvedFormula.charAt(operationIndex+1);
        Not clauseV = new Not(new Proposition(getClauseBool(line, clause)));
        String value = BoolToStr(clauseV.value());
        
        solvedFormula = solvedFormula.substring(0, operationIndex) + value + solvedFormula.substring(operationIndex+2);
    }
    
    
    private int seekTier3Operator(){
        int indexAND = formula.indexOf(" AND ", seekTier1Operator()[0]);
        int indexOR = formula.indexOf(" OR ", seekTier1Operator()[0]);
        
        if(indexOR < indexAND && indexOR < seekTier1Operator()[1]){
            return indexOR;
        } else if(indexAND < indexOR && indexAND < seekTier1Operator()[1]) {
            return indexAND;
        } else {
            return -1;
        }
    }
    
    private boolean solveTier3Operation(int line){
        int operationIndex = seekTier3Operator();
        String op = solvedFormula.substring(operationIndex, operationIndex+4);
        
        char leftClause = solvedFormula.charAt(operationIndex-1);
        char rightClause = solvedFormula.charAt(operationIndex+5);
        
        IOperation clauseV;
        
        if(" AND ".equals(op)){
            clauseV = new And(
                new Proposition(getClauseBool(line, leftClause)),
                new Proposition(getClauseBool(line, rightClause))
                );
        } else {
            clauseV = new Or(
                new Proposition(getClauseBool(line, leftClause)),
                new Proposition(getClauseBool(line, rightClause))
                );
        }
            
        String value = BoolToStr(clauseV.value());
        solvedFormula = solvedFormula.substring(0, operationIndex) + value + solvedFormula.substring(operationIndex+2);
        
        return false;
    }    
    
// Future methods, for -> and <->
//    private int seekTier4Operator(){
//        int indexAND = formula.indexOf(" AND ", seekTier1Operator()[0]);
//        int indexOR = formula.indexOf(" OR ", seekTier1Operator()[0]);
//        
//        if(indexOR < indexAND && indexOR < seekTier1Operator()[1]){
//            return indexOR;
//        } else if(indexAND < indexOR && indexAND < seekTier1Operator()[1]) {
//            return indexAND;
//        } else {
//            return indexAND;
//        }
//    }
//    
//    private boolean solveTier4Operation(){
//        int operationIndex = seekTier2Operator();
//        
//        return false;
//    }

    public void showTable(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
