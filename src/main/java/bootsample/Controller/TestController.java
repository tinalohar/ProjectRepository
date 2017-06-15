package bootsample.Controller;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import bootsample.bean.Employee;

@Controller
public class TestController {
	@RequestMapping("/AddEmployee")
	public ModelAndView addEmployeeForm(){
		ModelAndView model=new ModelAndView("AddEmployee");
		return model;
		
	}
	
	
	@RequestMapping(value="/submitform",method=RequestMethod.POST)
	public ModelAndView submitAddEmployee(@ModelAttribute("employee1") Employee employee1){
		
		ModelAndView model=new ModelAndView("addEmployeeSuccess");
		
		return model;
		
	
	}
}
