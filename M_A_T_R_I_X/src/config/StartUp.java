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
	private static final String PATH = "C:/Users/631510045/Desktop/matrix/M_A_T_R_I_X/src";

	public void fff() throws FileNotFoundException, IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("file01.txt"))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();
			System.out.println(everything);

		}
	}
}
