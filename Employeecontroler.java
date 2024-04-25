package com.sathya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Employeecontroler {

	
	@RequestMapping("/")
	public String employeeform(ModelMap model) {
		Employee employee =new Employee();
		model.put("employee", employee);
		return "employe";
		
	}
	@RequestMapping("/req1")
    public  String emp(@RequestAttribute Employee employee, ModelMap model) {
		model.put("employee", employee);
	    double ta = 0,da = 0,hra = 0,pf = 0,salary=0;
	    if (salary>=50000) {
			ta=salary*0.17;
			da=salary*0.19;
			hra=salary*0.21;
			pf=salary*0.25;
		}
	    else if (salary<50000 & salary>=30000 ) {
	    	ta=salary*0.12;
			da=salary*0.13;
			hra=salary*0.17;
			pf=salary*0.22;
		} 
	    else if (salary<30000) {
	    	ta=salary*0.07;
			da=salary*0.09;
			hra=salary*0.11;
			pf=salary*0.15;
		}
		
		
		double grosssalary =salary+ta+da+hra+pf;
		
		double netsalary= grosssalary -pf;
	    model.put("netsalary", netsalary);
	    
		return "result";
		
	}
	
}

















