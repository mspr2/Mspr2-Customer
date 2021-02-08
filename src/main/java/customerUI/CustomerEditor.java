package customerUI;

import java.time.LocalDate;

import customerUser.*;

public class CustomerEditor extends UserEditor {

	public User create() {

		String firstName = getInput().readString("Prenom");
		if (firstName == null)
			return null;

		String lastName = getInput().readString("Nom");
		if (lastName == null)
			return null;
		
		String gender = getInput().readString("Sexe(H/F)");
		if (gender == null)
			return null;
		

		String refNumber = getInput().readString("Matricule");
		if (refNumber == null)
			return null;

		String birtCity = getInput().readString("Lieu de naissance");
		if (birtCity == null)
			return null;

//		String birthDay = getInput().readString("birthDay");
//		if (birthDay == null)
//			return null;

		LocalDate bd = getInput().askUserForDate();
		if (bd == null)
			return null;

		String email = getInput().readString("Email");
		if (email == null)
			return null;

		String streetAdress = getInput().readString("Rue");
		if (streetAdress == null)
			return null;

		String city = getInput().readString("Ville");
		if (city == null)
			return null;

		int zipCode = getInput().readInteger("Code Postal");
		if (zipCode == -1)
			return null;

		int streetNumber = getInput().readInteger("Numero Rue");
		if (streetNumber == -1)
			return null;

//		String regista = getInput().readString("regista");
//		if (regista == null)
//			return null;
//		int durata = getInput().readInteger("durata");
//		if (durata == -1)
//			return null;
//		String[] attori = getInput().readStringArray("attori", "nome e cognome");
//		if (attori == null)
//			return null;
//		String genere = getInput().readString("genere");
//		if (genere == null)
//			return null;

		// return new Customer(titolo, anno, regista, durata, attori, genere);

		return new Customer(firstName, lastName, gender, refNumber, birtCity, bd, email, city, zipCode, streetAdress,
				streetNumber);
		

	}

}