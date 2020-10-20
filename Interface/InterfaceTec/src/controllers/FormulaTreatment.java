package controllers;

import java.util.ArrayList;
import model.*;

public class FormulaTreatment {

    private boolean[][] values;
    private String[][] formulaValues;
    private String formula;
    private String solvedFormula;
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

    // Get the all clauses and the formula in string format
    public String[] getTableHead() {
        String[] Clauses = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            Clauses[j] = list.get(j);
        }

        String[] Formula = new String[1];
        Formula[0] = this.formula;

        // Clauses + Formulas Header
        String[] tableHeader = TableTreatment.tableHeaderConstructor(Clauses, Formula);

        return tableHeader;
    }

    // Get the truth table in string format
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
        String[][] tableRows = TableTreatment.tableRowConstructor(stringValues, formulaValues);
        return tableRows;
    }

    private int getTotalClauses() {
        return list.size();
    }

    // Get all the clauses present in the formula
    private void getClauses() {
        String[] clauses = formula.replace("(", "").replace(")", "")
                .replace("¬", "").replace("OR ", "").replace("AND ", "")
                .split(" ");
        list = new ArrayList<>();
        for (int i = 0; i < clauses.length; i++) {
            if (!list.contains(clauses[i])) {
                list.add(clauses[i]);
            }
        }
    }

    // Gets the boolean value of clause X on an specific line N
    private boolean getClauseBool(int line, char clause) {
        switch (clause) {
            case 'A':
                return values[line][this.list.indexOf("A")];
            case 'B':
                return values[line][this.list.indexOf("B")];
            case 'C':
                return values[line][this.list.indexOf("C")];
            case 'D':
                return values[line][this.list.indexOf("D")];
            case 'E':
                return values[line][this.list.indexOf("E")];
            case 'T':
                return true;
            case 'F':
                return false;
            default:
                return true;
        }
    }

    // Converts boolean to the String used on the tables
    public String BoolToStr(boolean b) {
        if (b) {
            return "T";
        } else {
            return "F";
        }
    }

    // Converts the String on the table to it's boolean value
    public boolean StrToBool(String s) {
        if (s.equals("T")) {
            return true;
        } else {
            return false;
        }
    }

    // Generates all the combinations of true and false for the amount of clauses
    private boolean[][] generateFormulaValues() {
        int count, line;
        boolean start = true;
        values = new boolean[totalLines][length + 1];
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

    // Calls the methods that solve for the different operations, according to logic precedence
    private void solveFormula() {   //TODO: refactor
        formulaValues = new String[totalLines][1];
        for (int i = 0; i < totalLines; i++) {
            solvedFormula = formula;

            while (solvedFormula.length() > 1) {
                while (seekParentheses()[0] != -1 && (seekParentheses()[1] - seekParentheses()[0]) > 2) {
                    while (seekNOTOperator() != -1) {

                        solveNOTOperation(i);

                        while (seekANDOperator() != -1) {
                            solveANDOperation(i);
                        }
                    }
                    while (seekANDOperator() != -1) {
                        solveANDOperation(i);
                    }
                }

                if (seekParentheses()[0] == 0) {
                    solvedFormula = solvedFormula.charAt(seekParentheses()[0] + 1) + solvedFormula.substring(seekParentheses()[1] + 1);
                } else if (seekParentheses()[0] > 0 && seekParentheses()[1] == solvedFormula.length() - 1) {
                    solvedFormula = solvedFormula.substring(0, seekParentheses()[0]) + solvedFormula.charAt(seekParentheses()[0] + 1);
                } else if (seekParentheses()[0] > 0) {
                    solvedFormula = solvedFormula.substring(0, seekParentheses()[0] - 1) + solvedFormula.charAt(seekParentheses()[0] + 1) + solvedFormula.substring(seekParentheses()[1] + 1);
                }

                while (seekNOTOperator() != -1) {

                    solveNOTOperation(i);

                    while (seekANDOperator() != -1) {
                        solveANDOperation(i);
                    }
                }
                while (seekANDOperator() != -1) {
                    solveANDOperation(i);
                }
            }
            
            formulaValues[i][0] = solvedFormula;
        }
    }

    // Returns an array with the opening and closing parentheses indexes, according to logic precedence
    // Returns {-1, -1} when there are no parentheses
    private int[] seekParentheses() {
        int[] parenthesesIndex = {-1, -1};
        
        parenthesesIndex[1] = solvedFormula.indexOf(")");
        if(parenthesesIndex[1] > 0){
            parenthesesIndex[0] = solvedFormula.substring(0, parenthesesIndex[1]).lastIndexOf("(");
        }
        
        if(parenthesesIndex[0] >= 0 && parenthesesIndex[1] >= 0){
            return parenthesesIndex;
        }
            
        int[] r = {-1, -1};
        return r;
    }

    // Returns the index of the ¬ (NOT) operator, according to logic precedence
    private int seekNOTOperator() {
        int indexNOT;

        if (seekParentheses()[0] == -1) {
            indexNOT = solvedFormula.indexOf("¬");
        } else {
            indexNOT = solvedFormula.indexOf("¬", seekParentheses()[0]);
        }

        if (indexNOT == -1 || (indexNOT > seekParentheses()[1] && seekParentheses()[1] > 0)) {
            return -1;
        } else {
            return indexNOT;
        }
    }

    // Changes the "¬X" substring to it's boolean value, according to logic precedence
    // and according to the current value of X in an specific line of the table
    private void solveNOTOperation(int line) {
        int operatorIndex = seekNOTOperator();
        
        char clause = solvedFormula.charAt(operatorIndex + 1);
        Not clauseOp = new Not(new Proposition(getClauseBool(line, clause)));
        String value = BoolToStr(clauseOp.value());

        solvedFormula = solvedFormula.substring(0, operatorIndex) + value + solvedFormula.substring(operatorIndex + 2);
    }
    
    // Returns the index of the AND operator, according to logic precedence
    private int seekANDOperator() {
        int[] parentheses = seekParentheses();
        int indexAND = solvedFormula.indexOf(" AND ", parentheses[0]);
        
        if (indexAND > 0) {
            if (parentheses[1] > 0 && parentheses[0] < indexAND && indexAND < parentheses[1]) {
                return indexAND;
            } else if (parentheses[1] > 0 && indexAND > parentheses[1]) {
                return -1;
            } else {
                return indexAND;
            }
        }

        return -1;
    }
    
    // Changes the "X and Y"  substring to it's boolean value, according to logic precedence
    // and to the current values of X and Y in an specific line of the table
    private void solveANDOperation(int line) {
        int operationIndex = seekANDOperator();
        String op = solvedFormula.substring(operationIndex, operationIndex + 5);

        IOperation clauseV;

        if (" AND ".equals(op)) {
            char leftClause = solvedFormula.charAt(operationIndex - 1);
            char rightClause = solvedFormula.charAt(operationIndex + 5);

            clauseV = new And(
                    new Proposition(getClauseBool(line, leftClause)),
                    new Proposition(getClauseBool(line, rightClause))
            );

            String value = BoolToStr(clauseV.value());
            solvedFormula = solvedFormula.substring(0, operationIndex - 1) + value + solvedFormula.substring(operationIndex + 6);
        }
    }
    
    // Returns the index of the OR operator, according to logic precedence
    private int seekOROperator() {
        int[] parentheses = seekParentheses();
        int indexOR = solvedFormula.indexOf(" OR ", parentheses[0]);
        
        if (indexOR > 0) {
            if (parentheses[1] > 0 && parentheses[0] < indexOR && indexOR < parentheses[1]) {
                return indexOR;
            } else if (parentheses[1] > 0 && indexOR > parentheses[1]) {
                return -1;
            } else {
                return indexOR;
            }
        }

        return -1;
    }
    
    // Changes the "X or Y" substring to it's boolean value, according to logic precedence
    // and to the current values of X and Y in an specific line of the table
    private void solveOROperation(int line) {
        int operationIndex = seekOROperator();
        String op = solvedFormula.substring(operationIndex, operationIndex + 4);

        IOperation clauseV;

        if (" OR ".equals(op)) {
            char leftClause = solvedFormula.charAt(operationIndex - 1);
            char rightClause = solvedFormula.charAt(operationIndex + 5);

            clauseV = new Or(
                    new Proposition(getClauseBool(line, leftClause)),
                    new Proposition(getClauseBool(line, rightClause))
            );

            String value = BoolToStr(clauseV.value());
            solvedFormula = solvedFormula.substring(0, operationIndex - 1) + value + solvedFormula.substring(operationIndex + 5);
        }
    }
    
    // Changes the "X and Y" or the "X or Y" substring to it's boolean value, according to logic precedence
    // and to the current values of X and Y in an specific line of the table
    private void solveTier3Operation(int line) {
        int operationIndex = seekANDOperator();
        String op = solvedFormula.substring(operationIndex, operationIndex + 4);

        IOperation clauseV;

        if (" AND".equals(op)) {
            char leftClause = solvedFormula.charAt(operationIndex - 1);
            char rightClause = solvedFormula.charAt(operationIndex + 5);

            clauseV = new And(
                    new Proposition(getClauseBool(line, leftClause)),
                    new Proposition(getClauseBool(line, rightClause))
            );

            String value = BoolToStr(clauseV.value());
            solvedFormula = solvedFormula.substring(0, operationIndex - 1) + value + solvedFormula.substring(operationIndex + 6);
        } else {
            char leftClause = solvedFormula.charAt(operationIndex - 1);
            char rightClause = solvedFormula.charAt(operationIndex + 4);

            clauseV = new Or(
                    new Proposition(getClauseBool(line, leftClause)),
                    new Proposition(getClauseBool(line, rightClause))
            );

            String value = BoolToStr(clauseV.value());
            solvedFormula = solvedFormula.substring(0, operationIndex - 1) + value + solvedFormula.substring(operationIndex + 5);
        }

    }

//    // Changes the "X -> Y" or the "X <-> Y" substring to it's boolean value, according to logic precedence
//    // and to the current values of X and Y in an specific line of the table
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
    
    // Prints the table on the console
    public void showTable(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
