package model;

import java.io.*;

/** Read, write and overwrite truth table in .txt files to save values */
public class ReadWriteTxt {

    private File file;
    private FileOutputStream fileOutput;
    private FileInputStream fileInput;

    /** Save truth table in .txt file */
    public boolean toSave(String path, String name, String formula, String[] tableHeader, String[][] tableRows) {
        String pathFull = path + "\\" + name + ".txt";
        try {
            file = new File(pathFull);
            fileOutput = new FileOutputStream(file);
            fileOutput.write(("Proposition: " + formula + "\n").getBytes());
            fileOutput.write("Table:\n".getBytes());
            for (String item : tableHeader) {
                fileOutput.write(("|_" + item + "_").getBytes());
            }
            fileOutput.write("|\n".getBytes());
            for (String[] row : tableRows) {
                for (String item : row) {
                    fileOutput.write(("| " + item + " ").getBytes());
                }
                fileOutput.write("|\n".getBytes());
            }
            fileOutput.close();
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("Problema não encontrado" + pathFull);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /** Retrieve formula from .txt file */
    public String toRecover(String path) {
        try {
            fileInput = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(fileInput);
            BufferedReader bufferReader = new BufferedReader(reader);

            return bufferReader.readLine().split(": ")[1];

        } catch (FileNotFoundException e) {
            System.err.println("Problema não encontrado" + path);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
