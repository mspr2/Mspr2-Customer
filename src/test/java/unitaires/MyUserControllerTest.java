package unitaires;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

import customerUser.*;


public class MyUserControllerTest {
	MyUserController myUserController = null;


	@Before
	public void setUp() throws Exception {
		myUserController = new MyUserController();
	}

	@Test
	public void testAjouterUser() {
		Customer customer = new Customer(
				"Pierre",
				"Jimbon",
				"H",
				"1001",
				"Penja",
				LocalDate.of(1987,Month.JULY,10),
				"pierrejimbon@gmail.com",
				"Noisy Le Sec",
				93130,
				"Rue des Guillaumes",
				170);
		assertTrue(myUserController.add(customer));
	}

	@Test
	public void testSupprimerUser() {
		Customer customer = new Customer(
				"Pierre",
				"Jimbon",
				"H",
				"1001",
				"Penja",
				LocalDate.of(1987,Month.JULY,10),
				"pierrejimbon@gmail.com",
				"Noisy Le Sec",
				93130,
				"Rue des Guillaumes",
				170);	
		myUserController.add(customer);
				
		Customer customer2 = new Customer(
				"Pierre",
				"Jimbon",
				"H",
				"1001",
				"Penja",
				LocalDate.of(1987,Month.JULY,10),
				"pierrejimbon@gmail.com",
				"Noisy Le Sec",
				93130,
				"Rue des Guillaumes",
				170);
		myUserController.add(customer2);
		
		assertTrue(myUserController.remove(customer));
		assertEquals(1, myUserController.getAll().size());
		
		Customer customer3 = new Customer(
				"Pierre",
				"Jimbon",
				"H",
				"1001",
				"Penja",
				LocalDate.of(1987,Month.JULY,10),
				"pierrejimbon@gmail.com",
				"Noisy Le Sec",
				93130,
				"Rue des Guillaumes",
				170);
		assertFalse(myUserController.remove(customer3));
	}

	@Test
	public void testSupprimerUserInt() {
		Customer customer = new Customer(
				"Pierre",
				"Jimbon",
				"H",
				"1001",
				"Penja",
				LocalDate.of(1987,Month.JULY,10),
				"pierrejimbon@gmail.com",
				"Noisy Le Sec",
				93130,
				"Rue des Guillaumes",
				170);	
		myUserController.add(customer);
		myUserController.add(customer);
		myUserController.add(customer);
		assertEquals(3, myUserController.getAll().size());
		myUserController.remove(0);
		assertEquals(2, myUserController.getAll().size());
	}

	@Test
	public void testListUser() {
		Customer customer = new Customer(
				"Pierre",
				"Jimbon",
				"H",
				"1001",
				"Penja",
				LocalDate.of(1987,Month.JULY,10),
				"pierrejimbon@gmail.com",
				"Noisy Le Sec",
				93130,
				"Rue des Guillaumes",
				170);	
		myUserController.add(customer);
		myUserController.add(customer);
		
		Customer customer2 = new Customer(
				"Pierre",
				"Jimbon",
				"H",
				"1001",
				"Penja",
				LocalDate.of(1987,Month.JULY,10),
				"pierrejimbon@gmail.com",
				"Noisy Le Sec",
				93130,
				"Rue des Guillaumes",
				170);
		myUserController.add(customer2);
		myUserController.add(customer2);
		myUserController.add(customer2);
		
		Customer customer3 = new Customer(
				"Pierre",
				"Jimbon",
				"H",
				"1001",
				"Penja",
				LocalDate.of(1987,Month.JULY,10),
				"pierrejimbon@gmail.com",
				"Noisy Le Sec",
				93130,
				"Rue des Guillaumes",
				170);
		myUserController.add(customer3);
		
		assertEquals(6, myUserController.getAll().size());
	}

}
