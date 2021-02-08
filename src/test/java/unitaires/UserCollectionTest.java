package unitaires;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

import customerUser.*;
//import fondt2.media.MediaCollection;
//import fondt2.media.Song;
//import fondt2.media.Media;

public class UserCollectionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		UserCollection collection = new UserCollection();
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
		
		assertFalse(collection.add(customer) == false);
		assertFalse(collection.add(customer) == false);
		assertFalse(collection.add(customer) == false);
		assertEquals(3, collection.size());
		
		assertTrue(collection.add(customer) == true);
		assertTrue(collection.add(customer) == true);
		assertTrue(collection.add(customer) == true);
		assertEquals(6, collection.size());
	}

	@Test
	public void testIndexOf() {
		UserCollection collection = new UserCollection();
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
		collection.add(customer);
		
		Customer customer2 = new Customer(
				"Fatou Ndeye",
				"Ndiaye",
				"F",
				"1002",
				"Senegal",
				LocalDate.of(1995,Month.JANUARY,01),
				"ndeyefatou.ndiaye@epsi.fr",
				"Paris",
				75010,
				"Rue des Guillaumes",
				170);
		collection.add(customer2);
		
		assertEquals(0, collection.indexOf(customer));
		assertEquals(1, collection.indexOf(customer2));
	}

	@Test
	public void testRemoveUser() {
		UserCollection collection = new UserCollection();
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
		
		assertFalse(collection.add(customer) == false);
		assertFalse(collection.add(customer) == false);
		assertFalse(collection.add(customer) == false);
		assertEquals(3, collection.size());
		collection.remove(customer);
		assertEquals(2, collection.size());
	}

	@Test
	public void testRemoveInt() {
		UserCollection collection = new UserCollection();
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
		
		assertFalse(collection.add(customer) == false);
		assertFalse(collection.add(customer) == false);
		assertFalse(collection.add(customer) == false);
		assertEquals(3, collection.size());
		collection.remove(0);
		assertEquals(2, collection.size());
	}

	@Test
	public void testSize() {
		UserCollection collection = new UserCollection();
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
		
		collection.add(customer);
		assertEquals(1, collection.size());
		collection.remove(0);
		assertEquals(0, collection.size());
		collection.add(customer);
		collection.add(customer);
		collection.add(customer);
		collection.add(customer);
		collection.add(customer);
		assertEquals(5, collection.size());
		collection.remove(0);
		collection.remove(2);
		assertEquals(3, collection.size());
	}

	@Test
	public void testGet() {
		UserCollection collection = new UserCollection();
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
		collection.add(customer);
		User u = collection.get(0);
		assertNotNull(u);
	}

}