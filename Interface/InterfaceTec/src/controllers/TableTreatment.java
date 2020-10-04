/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author babyp
 */
public class TableTreatment {

    public static String[][] tableRowConstructor(String[][] A, String[][] B) {
        //A.length == B.length
        
        String[][] values = new String[A.length][A[0].length+B[0].length];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if(j<A[0].length){
                    values[i][j] = A[i][j];
                }
                else {
                    values[i][j] = B[i][j-A[0].length];
                }
            }
                
        }
        mostrarTable(values);
        return values;
    }
    
    public static String[] tableHeaderConstructor(String[] A, String[] B) {
        //A.length == B.length
        
        String[] values = new String[A.length+B.length];
        for (int j = 0; j < values.length; j++) {        
            if(j<A.length){
                values[j] = A[j];
            }
            else {
                values[j] = B[j-A.length];
            }       
        }
        return values;
    }
    
    
    public static void mostrarTable(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
