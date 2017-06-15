package bootsample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//MVC Controller to handle views

@Controller
public class MainController {
	

	
	@GetMapping("/")
	public String home(){
		
		
		return "index";
	}

}
