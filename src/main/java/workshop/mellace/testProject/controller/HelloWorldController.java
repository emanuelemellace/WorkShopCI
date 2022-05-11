package workshop.mellace.testProject.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController
public class HelloWorldController {

	@RequestMapping("/")  
	public String hello()   
	{  
		return "<h2> Ciao Colleghi di NTT! </h2>";
	}
	
	@RequestMapping("/errore")  
	public String errore()   
	{  
		return "<h2> ERRORE </h2>";
	}
	
	@RequestMapping("/test")  
	public String test()   
	{  
		return "<h2> test </h2>";
	}
	
	@RequestMapping("/test1")  
	public String test1()   
	{  
		return "<h2> test1 </h2>";
	}
	
	@RequestMapping("/test2")  
	public String test2()   
	{  
		return "<h2> test2 </h2>";
	}
	
	@RequestMapping("/test3")  
	public String test3()   
	{  
		return "<h2> test3 </h2>";
	}
	
	@RequestMapping("/test4")  
	public String test4()   
	{  
		return "<h2> test4 </h2>";
	}
	
	@RequestMapping("/test5")  
	public String test5()   
	{  
		return "<h2> test5 </h2>";
	}
	
	@RequestMapping("/test6")  
	public String test6()   
	{  
		return "<h2> test6 </h2>";
	}
	
	@RequestMapping("/test7")  
	public String test7()   
	{  
		return "<h2> test7 </h2>";
	}
	
	@RequestMapping("/test8")  
	public String test8()   
	{  
		return "<h2> test8 </h2>";
	}
	
}
