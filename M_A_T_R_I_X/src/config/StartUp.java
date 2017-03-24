package config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author pvmeira
 *
 */
public class StartUp {
	private static final String PATH = "file01";
	private static final String EXT = ".txt";
	private int[][] matrixFinal;

	/**
	 * Method that Read the Docuemnto base on the PATH and EXT values
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void readDocument() throws FileNotFoundException, IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(PATH + EXT))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			this.createTheMatrixFromADocument(line);
			while (line != null) {
				this.populateTheMatrix(line);
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();
			System.out.println(everything);

		}
	}

	/**
	 * Method that populate the matrix
	 */
	private void populateTheMatrix(String line) {
		char[] index = line.toCharArray();
		System.out.println(index.toString());
	}

	/**
	 * Get the value from a position into the given array
	 * 
	 * @param index
	 * @param position
	 * @return
	 */
	private int getValueFromAChar(char[] index, int position) {
		int result = 0;
		result = Character.getNumericValue(index[position]);
		return result;
	}

	/**
	 * get the values from the given lines and than send to the methos that
	 * create the array[][]
	 * 
	 * @param line
	 */
	private void createTheMatrixFromADocument(String line) {
		char[] index = line.toCharArray();
		int colum = this.getValueFromAChar(index, 0);
		int lines = this.getValueFromAChar(index, 2);

		this.matrixFinal = this.instantiateTheMatrix(colum, lines);
	}

	/**
	 * Initiate the Array
	 * 
	 * @return
	 */
	private int[][] instantiateTheMatrix(int line, int colum) {
		int[][] result = new int[line][colum];
		return result;
	}

	/**
	 * 
	 * @return
	 */
	public int[][] getMatrixFinal() {
		return matrixFinal;
	}

	/**
	 * 
	 * @param matrixFinal
	 */
	public void setMatrixFinal(int[][] matrixFinal) {
		this.matrixFinal = matrixFinal;
	}

}
