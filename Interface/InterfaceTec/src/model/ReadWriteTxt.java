package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteTxt {

	private final static String PATH = "C:\\Users\\Breno\\eclipse-workspace\\tecnicas\\arquivos\\";
	private File file;
	private FileOutputStream fileOutput;
	private FileInputStream fileInput;

	public boolean toSave(String path, String name, String formula,String[] tableHeader ,String[][] tableRows) {
		String pathFull = path + "\\" + name + ".txt";
                //System.out.println(pathFull);
                
		try {
			file = new File(pathFull);
			fileOutput = new FileOutputStream(file);
			fileOutput.write(("Proposition: " + formula + "\n").getBytes());
			fileOutput.write("Table:\n".getBytes());
                        for (String item: tableHeader) {
                                fileOutput.write(("|_" + item + "_").getBytes());
                            }
                            fileOutput.write("|\n".getBytes());
                        for(String[] row: tableRows){
                            for (String item: row) {
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

	public String toRecover(String path) {;
		try {
			fileInput= new FileInputStream(path);
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
