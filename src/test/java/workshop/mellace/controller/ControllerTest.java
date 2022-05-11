package workshop.mellace.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import workshop.mellace.testProject.controller.HelloWorldController;

public class ControllerTest {

	@Test
	public void testHello() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> Ciao Colleghi di NTT! </h2>",controller.hello());
	}
	
	@Test
	public void testErrore() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> ERRORE </h2>",controller.errore());
	}
	
	@Test
	public void testTest() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test </h2>",controller.test());
	}
}
