package customerUser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Customer extends User {

	private String firstName = null;
	private String lastName = null;
	private String refNumber = null;
	private String birtCity;
	private LocalDate birthDay;

	private String email = null;
	private String city = null;
	private int zipCode = -1;
	private String streetAdress = null;
	private int streetNumber = -1;
	private String gender = null;

	public Customer(String firstName, String lastName, String gender, String refNumber, String birtCity,
			LocalDate birthDay, String email, String city, int zipCode, String streetAdress, int streetNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.refNumber = refNumber;
		this.birtCity = birtCity;
		this.birthDay = birthDay;
		this.email = email;
		this.city = city;
		this.zipCode = zipCode;
		this.streetAdress = streetAdress;
		this.streetNumber = streetNumber;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public String getBirtCity() {
		return birtCity;
	}

	public void setBirtCity(String birtCity) {
		this.birtCity = birtCity;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreetAdress() {
		return streetAdress;
	}

	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	@Override
	public boolean equals(User u) {

		if (u instanceof Customer) {
			Customer c = (Customer) u;
			
			  return super.equals(u) && firstName.equals(c.getFirstName()) &&
			  lastName.equals(c.getLastName()) && refNumber.equals(c.getRefNumber()) &&
			  gender.equals(c.getGender()) && birtCity.equals(c.getBirtCity()) &&
			  birthDay.equals(c.getBirthDay()) && email.equals(c.getEmail()) &&
			  city.equals(c.getCity()) && zipCode == c.getZipCode() &&
			  streetAdress.equals(c.getStreetAdress()) && streetNumber == c.getStreetNumber();
			 

		}
		return false;

	}

	@Override
	public String getType() {
		return "Customer";
	}

	@Override
	public String toString() {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
				.withLocale(Locale.FRANCE);
		String civil = gender.equals("H") ? "Mr" : "Mme";

//		return "Client: [Pr�nom=" + firstName + ", Nom=" + lastName + ", Genre=" + gender + ", Matricule=" + refNumber
//				+ ", Lieu de Naissance=" + birtCity + ", Date de Naissance=" + dateFormatter.format(birthDay) + ", Email=" + email
//				+ ", Ville=" + city + ", Code Postale=" + zipCode + ", Adresse rue=" + streetAdress + ", numero de la rue="
//				+ streetNumber + "]";
//		
		return refNumber + " - " + civil + " " + firstName + " " + lastName.toUpperCase() + " " + zipCode + " " + city;

	}

	public String toStringFull() {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
				.withLocale(Locale.FRANCE);
		String civil = gender.equals("H") ? "Mr" : "Mme";

//		return "Client: [Pr�nom=" + firstName + ", Nom=" + lastName + ", Genre=" + gender + ", Matricule=" + refNumber
//				+ ", Lieu de Naissance=" + birtCity + ", Date de Naissance=" + dateFormatter.format(birthDay) + ", Email=" + email
//				+ ", Ville=" + city + ", Code Postale=" + zipCode + ", Adresse rue=" + streetAdress + ", numero de la rue="
//				+ streetNumber + "]";

		return refNumber + " - " + civil + " " + firstName + " " + lastName.toUpperCase() + " " + streetNumber + " "
				+ streetAdress + " " + zipCode + " " + city;

	}

//	public String toString() {
//	String str = null;

//		String str = "Film: " + super.toString() + " - Regista: "
//				+ getDirector() + " - Durata: minuti " + getDuration()
//				+ " - Attori: ";
//		for (int i = 0; i < this.actors.length; i++) {
//			str += actors[i];
//			if (i < this.actors.length - 1) {
//				str += ", ";
//			}
//		}
//		str += " - Genere: " + getGenre() + "\n";

	// return str;
//	}

}