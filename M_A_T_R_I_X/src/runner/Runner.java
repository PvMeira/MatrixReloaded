package runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import config.StartUp;
import errorControl.ErrorMessenger;

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
			System.out.println(ErrorMessenger.ERROR_MESSAGE + e.getMessage().toUpperCase().toString());
		} catch (IOException e) {
			System.out.println(ErrorMessenger.ERROR_MESSAGE + e.getMessage().toUpperCase().toString());
		}
	}
}
