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

	@Test
	public void testTest9() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test9 </h2>",controller.test9());
	}
	
	@Test
	public void testTest10() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test10 </h2>",controller.test10());
	}
	
	@Test
	public void testTest11() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test11 </h2>",controller.test11());
	}
	
	@Test
	public void testTest12() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test12 </h2>",controller.test12());
	}
	
	@Test
	public void testTest13() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test13 </h2>",controller.test13());
	}
	
	@Test
	public void testTest14() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test14 </h2>",controller.test14());
	}
	
	@Test
	public void testTest15() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test15 </h2>",controller.test15());
	}
	
	@Test
	public void testTest16() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test16 </h2>",controller.test16());
	}
	
	@Test
	public void testTest17() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test17 </h2>",controller.test17());
	}
	
	@Test
	public void testTest18() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test18 </h2>",controller.test18());
	}
	
	@Test
	public void testTest19() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test19 </h2>",controller.test19());
	}
	
	@Test
	public void testTest20() {
		HelloWorldController controller = new HelloWorldController();
		assertEquals("<h2> test20 </h2>",controller.test20());
	}
}
