package tecnicas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EscritaELeituraTxt {

	private final static String CAMINHO = "C:\\Users\\Breno\\eclipse-workspace\\tecnicas\\arquivos\\"; //TODO: set relative path
	private File file;
	private FileOutputStream fileOutput;
	private FileInputStream fileInput;

	public boolean salvar(String nomeArquivo, String formula, String tabela) {
		String caminho = CAMINHO + nomeArquivo + ".txt";
		try {
			file = new File(caminho);
			fileOutput = new FileOutputStream(file);
			fileOutput.write(("Proposição: " + formula + "\n").getBytes());
			fileOutput.write("Tabela:\n".getBytes());
			fileOutput.write(tabela.getBytes());
			fileOutput.close();
			return true;
		} catch (FileNotFoundException e) {
			System.err.println("Problema não encontrado" + caminho);
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public String recuperar(String nomeArquivo) {
		String caminho = CAMINHO + nomeArquivo + ".txt";
		try {
			fileInput= new FileInputStream(caminho);
			InputStreamReader reader = new InputStreamReader(fileInput);
			BufferedReader bufferReader = new BufferedReader(reader);
			
			return bufferReader.readLine().split(":")[1].strip();

		} catch (FileNotFoundException e) {
			System.err.println("Problema não encontrado" + caminho);
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "error";
	}
}
