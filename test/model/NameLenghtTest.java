package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameLenghtTest {

	@Test
	public void poneyContientCinqLettres() {
		NameLenght nl = new NameLenght();
		assertEquals(5, nl.countChararcter("poney"));
	}

}
