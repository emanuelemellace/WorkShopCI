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
	
	@Test
	public void testTest1() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test1 </h2>",controller.test1());
	}
	
	@Test
	public void testTest2() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test2 </h2>",controller.test2());
	}
	
	@Test
	public void testTest3() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test3 </h2>",controller.test3());
	}
	
	@Test
	public void testTest4() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test4 </h2>",controller.test4());
	}
	
	@Test
	public void testTest6() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test6 </h2>",controller.test6());
	}
	
	@Test
	public void testTest7() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test7 </h2>",controller.test7());
	}
	
	@Test
	public void testTest8() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test8 </h2>",controller.test8());
	}

	
}
