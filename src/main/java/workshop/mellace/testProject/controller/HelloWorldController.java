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
	
	
}
