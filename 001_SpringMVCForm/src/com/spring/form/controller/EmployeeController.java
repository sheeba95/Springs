package com.spring.form.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.form.employee.EmployeeBean;

@Controller
public class EmployeeController {
	
	
	 List<EmployeeBean> list= new ArrayList<EmployeeBean>();  

	@RequestMapping("/employeeForm")
	public ModelAndView showform() {
		// command is a reserved request attribute name, now use <form> tag to show
		// object data
		return new ModelAndView("employeeForm", "command", new EmployeeBean());
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") EmployeeBean employeeBean) {
		// write code to save emp object
		// here, we are displaying emp object to prove emp has data
		System.out.println(employeeBean.getEmployeeName() + " " + employeeBean.getEmployeeSalary() + " " + employeeBean.getEmployeeDesignation());
		list.add(new EmployeeBean(1,"rahul",35000f,"S.Engineer"));  
        list.add(new EmployeeBean(2,"aditya",25000f,"IT Manager"));  
        list.add(new EmployeeBean(3,"sachin",55000f,"Care Taker"));  
		list.add(employeeBean);
		// return new ModelAndView("empform","command",emp);//will display object data
		return new ModelAndView("redirect:/viewEmployee.spring");// will redirect to viewemp request mapping
	}
	
	
	@RequestMapping("/viewEmployee")  
    public ModelAndView viewemp(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
       
        
        System.out.println(list.size()); 
        list.add(new EmployeeBean());
        return new ModelAndView("viewEmployee","employeeList",list);  
    }  
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView welcome() {
	  return new ModelAndView("index");
	 }

}