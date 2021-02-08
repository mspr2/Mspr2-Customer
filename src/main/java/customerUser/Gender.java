package customerUser;

public enum Gender {
	H("Homme"), F("Femme");
	
	private Gender(String s) {
		value=s;
	}

	private String value;
	
	public String getValue() {
		return value;
	}
}
