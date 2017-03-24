package runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import config.StartUp;

/**
 * 
 * @author pvmeira
 *
 */
public class Runner {
	public static void main(String[] args) {
		StartUp s = new StartUp();

		try {
			s.readDocument();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
