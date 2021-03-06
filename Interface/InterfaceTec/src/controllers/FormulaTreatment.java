package controllers;

import model.*;

import java.util.ArrayList;

public class FormulaTreatment {

    private boolean[][] values;
    private String[][] formulaValues;
    private String formula;
    private String solvedFormula;
    private int length;
    private int totalLines;
    private ArrayList<String> list;

    // General function that calls auxiliary functions, cleaning and outputting table with right format
    public FormulaTreatment(String formula) {
        this.formula = formula;
        getClauses();
        this.length = getTotalClauses();
        this.totalLines = (int) Math.pow(2, length);
        boolean[][] val = generateFormulaValues();
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
        return TableTreatment.tableHeaderConstructor(Clauses, Formula);
    }

    // Get the truth table in string format
    public String[][] getTableBody() {
        String[][] stringValues = new String[totalLines][length];
        for (int i = 0; i < stringValues.length; i++) {
            for (int j = 0; j < stringValues[i].length; j++) {
                if (values[i][j]) {
                    stringValues[i][j] = "T";
                } else {
                    stringValues[i][j] = "F";
                }
            }
        }
        return TableTreatment.tableRowConstructor(stringValues, formulaValues);
    }

    private int getTotalClauses() {
        return list.size();
    }

    // Get all the clauses used in the formula
    private void getClauses() {
        String[] clauses = formula.replace("(", "").replace(")", "")
                .replace("¬", "").replace("OR ", "").replace("AND ", "")
                .split(" ");
        list = new ArrayList<>();
        for (String clause : clauses) {
            if (!list.contains(clause)) {
                list.add(clause);
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
        return s.equals("T");
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

    // Calls the methods that solve for the different operators, according to logic precedence
    private void solveFormula() {
        formulaValues = new String[totalLines][1];
        for (int i = 0; i < totalLines; i++) {
            solvedFormula = formula;

            while (solvedFormula.length() > 1) {
                while (seekTier1Operator()[0] != -1 && (seekTier1Operator()[1] - seekTier1Operator()[0]) > 2) {
                    while (seekTier2Operator() != -1) {

                        solveTier2Operation(i);

                        while (seekTier3Operator() != -1) {
                            solveTier3Operation(i);
                        }
                    }
                    while (seekTier3Operator() != -1) {
                        solveTier3Operation(i);
                    }
                }

                if (seekTier1Operator()[0] == 0) {
                    solvedFormula = solvedFormula.charAt(seekTier1Operator()[0] + 1) + solvedFormula.substring(seekTier1Operator()[1] + 1);
                } else if (seekTier1Operator()[0] > 0 && seekTier1Operator()[1] == solvedFormula.length() - 1) {
                    solvedFormula = solvedFormula.substring(0, seekTier1Operator()[0]) + solvedFormula.charAt(seekTier1Operator()[0] + 1);
                } else if (seekTier1Operator()[0] > 0) {
                    solvedFormula = solvedFormula.substring(0, seekTier1Operator()[0] - 1) + solvedFormula.charAt(seekTier1Operator()[0] + 1) + solvedFormula.substring(seekTier1Operator()[1] + 1);
                }

                while (seekTier2Operator() != -1) {

                    solveTier2Operation(i);

                    while (seekTier3Operator() != -1) {
                        solveTier3Operation(i);
                    }
                }
                while (seekTier3Operator() != -1) {
                    solveTier3Operation(i);
                }
            }
            formulaValues[i][0] = solvedFormula;
            //values[i][length] = StrToBool(solvedFormula);
        }
    }

    // Returns an array with the opening and closing brackets indexes, according to the logic precedence
    // Returns {-1, -1} when there are no brackets
    private int[] seekTier1Operator() {
        int[] bracketsIndex = {-1, -1};
        bracketsIndex[0] = solvedFormula.lastIndexOf("(");
        bracketsIndex[1] = solvedFormula.indexOf(")", bracketsIndex[0]);
        return bracketsIndex;
    }

    // Returns the index of the ¬ (NOT) operator, according to the logic precedence
    private int seekTier2Operator() {
        int indexNOT;

        if (seekTier1Operator()[0] == -1) {
            indexNOT = solvedFormula.indexOf("¬");
        } else {
            indexNOT = solvedFormula.indexOf("¬", seekTier1Operator()[0]);
        }

        if (indexNOT == -1 || (indexNOT > seekTier1Operator()[1] && seekTier1Operator()[1] > 0)) {
            return -1;
        } else {
            return indexNOT;
        }
    }

    // Changes the "¬X" substring to it's boolean value, according to the logic precedence
    // and to the current value of X in an specific line of the table
    private void solveTier2Operation(int line) {
        int operationIndex = seekTier2Operator();
        char clause = solvedFormula.charAt(operationIndex + 1);
        Not clauseV = new Not(new Proposition(getClauseBool(line, clause)));
        String value = BoolToStr(clauseV.value());

        solvedFormula = solvedFormula.substring(0, operationIndex) + value + solvedFormula.substring(operationIndex + 2);
    }

    // Returns the index of the AND or OR operator, according to the logic precedence
    private int seekTier3Operator() {
        int indexAND = solvedFormula.indexOf(" AND ", seekTier1Operator()[0]);
        int indexOR = solvedFormula.indexOf(" OR ", seekTier1Operator()[0]);

        if (indexOR > 0 && indexAND > 0) {
            if (indexOR < indexAND) {
                if (seekTier1Operator()[1] > 0 && indexOR < seekTier1Operator()[1]) {
                    return indexOR;
                } else if (seekTier1Operator()[1] > 0 && indexOR > seekTier1Operator()[1]) {
                    return -1;
                } else {
                    return indexOR;
                }
            } else if (indexAND < indexOR) {
                if (seekTier1Operator()[1] > 0 && indexAND < seekTier1Operator()[1]) {
                    return indexAND;
                } else if (seekTier1Operator()[1] > 0 && indexAND > seekTier1Operator()[1]) {
                    return -1;
                } else {
                    return indexAND;
                }
            }
        } else if (indexOR > 0) {
            if (seekTier1Operator()[1] > 0 && indexOR < seekTier1Operator()[1]) {
                return indexOR;
            } else if (seekTier1Operator()[1] > 0 && indexOR > seekTier1Operator()[1]) {
                return -1;
            } else {
                return indexOR;
            }
        } else if (indexAND > 0) {
            if (seekTier1Operator()[1] > 0 && indexAND < seekTier1Operator()[1]) {
                return indexAND;
            } else if (seekTier1Operator()[1] > 0 && indexAND > seekTier1Operator()[1]) {
                return -1;
            } else {
                return indexAND;
            }
        }

        return -1;
    }

    // Changes the "X and Y" or the "X or Y" substring to it's boolean value, according to the logic precedence
    // and to the current values of X and Y in an specific line of the table
    private void solveTier3Operation(int line) {
        int operationIndex = seekTier3Operator();
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

    // Prints the table on the console
    public void showTable(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

}
