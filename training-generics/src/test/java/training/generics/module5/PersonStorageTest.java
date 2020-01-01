package training.generics.module5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import training.generics.module5.wildcards.bounded.Employee;
import training.generics.module5.wildcards.bounded.Partner;
import training.generics.module5.wildcards.bounded.Person;
import training.generics.module5.wildcards.bounded.PersonLoader;
import training.generics.module5.wildcards.bounded.PersonSaver;

public class PersonStorageTest {
	private Partner donDraper = new Partner("Don Draper", 89);
	private Partner bertCooper = new Partner("Bert Cooper", 100);
	private Employee peggyOlson = new Employee("Peggy Olson", 65);

	private File file;
	private PersonSaver saver;
	private PersonLoader loader;

	@Test
	public void cannotLoadFromEmptyFile() throws Exception {
		PersonLoader loader = new PersonLoader(file);

		assertNull(loader.load());
	}

	@Test
	public void savesAndLoadsPerson() throws Exception {
		PersonSaver saver = new PersonSaver(file);
		PersonLoader loader = new PersonLoader(file);
		saver.save(donDraper);

		Person loadedPerson = loader.load();
		assertEquals(donDraper, loadedPerson);
	}

	@Test
	public void savesAndLoadsTwoPeople() throws Exception {
		saver.save(donDraper);
		saver.save(peggyOlson);

		assertEquals(donDraper, loader.load());
		assertEquals(peggyOlson, loader.load());
	}

	@Test
	public void savesArraysOfPeople() throws Exception {
		/*
		 * Employee[] employees = new Employee[2]; Person[] people = employees;
		 */
		Partner[] people = new Partner[2];
		people[0] = donDraper;
		people[1] = bertCooper;

		saver.saveAll(people);

		assertEquals(donDraper, loader.load());
		assertEquals(bertCooper, loader.load());
	}

	@Test
	public void savesListsOfPeople() throws Exception {
		List<Partner> people = new ArrayList<>();
		people.add(donDraper);
		people.add(bertCooper);

		saver.saveAll(people);

		assertEquals(donDraper, loader.load());
		assertEquals(bertCooper, loader.load());
	}
	
	@Test
	public void loadsListOfPeople() throws IOException, ClassNotFoundException {
		saver.save(donDraper);
		saver.save(bertCooper);
		
		List<Person> people = new ArrayList<>();
		
		loader.loadAll(people);
		assertEquals(Arrays.asList(donDraper, bertCooper), people);
	}

	@Before
	public void setUp() throws Exception {
		file = File.createTempFile("tmp", "people");
		saver = new PersonSaver(file);
		loader = new PersonLoader(file);
	}

	@After
	public void tearDown() {
		if (file.exists()) {
			file.delete();
		}
	}
}
