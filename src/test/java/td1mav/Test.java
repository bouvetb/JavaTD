package td1mav;

import static org.junit.jupiter.api.Assertions.*;

import Communication.Menu;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Menu m = new Menu();
		m.questions();
		assertEquals("bonjour",m.a.getNom());
		assertEquals("Teddy", m.a.getEspece());
	}

}
