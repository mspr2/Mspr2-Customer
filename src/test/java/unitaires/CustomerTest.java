package unitaires;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import org.junit.Before;
import org.junit.Test;
import customerUser.*;

public class CustomerTest {
	Customer customer = null;
	DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ITALY);

	@Before
	public void setUp() throws Exception {
		customer = new Customer("Pierre", "Jimbon", "H", "1001", "Penja", LocalDate.of(1987, Month.JULY, 10),
				"pierrejimbon@gmail.com", "Noisy Le Sec", 93130, "Rue des Guillaumes", 170);

	}

	@Test
	public void testGetSetFirstName() {
		customer.setFirstName("Pierre");
		assertEquals("Pierre", customer.getFirstName());
	}

	@Test
	public void testGetSetLastName() {
		customer.setLastName("Jimbon");
		assertEquals("Jimbon", customer.getLastName());
	}

	@Test
	public void testGetSetGender() {
		customer.setGender("H");
		assertEquals("H", customer.getGender());
		customer.setGender("F");
		assertEquals("F", customer.getGender());
	}

	@Test
	public void testGetSetGenderFaill() {
		customer.setGender("H");
		assertNotEquals("F", customer.getGender());
	}

	@Test
	public void testGetSetRefNumber() {
		customer.setRefNumber("1001");
		assertEquals("1001", customer.getRefNumber());
	}

	@Test
	public void testGetSetBirtCity() {
		customer.setBirtCity("Penja");
		assertEquals("Penja", customer.getBirtCity());
	}

	@Test
	public void testGetSetBirthDay() {
		LocalDate date = LocalDate.of(1988, 07, 10);
		customer.setBirthDay(LocalDate.of(1987, 07, 10));
		assertEquals(date, customer.getBirthDay());
	}

	@Test
	public void testSetGetEmail() {
		customer.setEmail("pierrejimbon@gmail.com");
		assertEquals("pierrejimbon@gmail.com", customer.getEmail());
	}

	@Test
	public void testSetGetCity() {
		customer.setCity("Noisy Le Sec");
		assertEquals("Noisy Le Sec", customer.getCity());
	}

	@Test
	public void testGetSetZipCode() {
		customer.setZipCode(93130);
		assertEquals(93130, customer.getZipCode());
	}

	@Test
	public void testEqualsUser() {

		Customer customer1 = new Customer("Pierre", "Jimbon", "H", "1001", "Penja", LocalDate.of(1987, Month.JULY, 10),
				"pierrejimbon@gmail.com", "Noisy Le Sec", 93130, "Rue des Guillaumes", 170);

		Customer customer2 = new Customer("Pierre", "Jimbon", "H", "1001", "Penja", LocalDate.of(1987, Month.JULY, 10),
				"pierrejimbon@gmail.com", "Noisy Le Sec", 93130, "Rue des Guillaumes", 170);
		assertTrue(customer1.equals(customer2));

	}

	@AfterMethod
	public void quit(ITestResult.FAILURE) {

		driver.quit();
		if (result.getStatus() == ITestResult.FAILURE) {
			BasicCredentials creds = new BasicCredentials("admin", "admin");
			JiraClient jira = new JiraClient("http://localhost:8081", creds);
			Issue issueName = jira.createIssue("AUT", "Bug".field(Field.SUMMARY, result.getMethod().getMethod().getMethodName + "échoue en raison de : " + result.getThrowable().toString()).field(Field.DESCRIPTION, "Obtenir la description").execute();
			System.out.println("Le ticket est crée dans JIRA avec la clé du ticket" + issueName.getKey());

		}

}
