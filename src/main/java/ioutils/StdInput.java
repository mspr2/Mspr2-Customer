package ioutils;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class StdInput {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(
			System.in));
//	private DateTimeFormatter localDateFormatter = DateTimeFormatter
//			.ofLocalizedDate(FormatStyle.SHORT)
//			.withLocale(Locale.ITALY);
//DateFormat.getDateInstance(style, Locale.FRANCE);

	public String readString() {
		String line = null;
		try {
			line = reader.readLine();
		} catch (IOException e) {
		}
		return line;
	}

	public int readInt(int errorValue) {
		int option = errorValue;
		try {
			String line = readString();
			if (line != null) {
				option = Integer.parseInt(line);
			}
		} catch (NumberFormatException e) {
		}
		return option;
	}

	public String readString(String msg) {
		System.out.println("Entrer " + msg + " :");
		return readString();
	}

	public String[] readStringArray(String msg1, String msg2) {
		System.out.println("Immettere numero di " + msg1 + ":");
		int num = readInt(-1);
		if (num == -1)
			return null;
		String[] appoggio = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Immettere " + msg2 + ":");
			appoggio[i] = readString();

		}
		return appoggio;

	}

	public int readInteger(String str) {
		System.out.println("Entrer " + str + " :");
		return readInt(-1);
	}
	
	public LocalDate askUserForDate() {
		System.out.println("Entrer la date de naissance (aaaa-mm-jj): ");
		String insertedDate = readString();
		
		try {
			return LocalDate.parse(insertedDate);
		}
		catch (DateTimeParseException e) {
			System.out.println("Erreur de Format.");
			return null;
		}
	}
}

