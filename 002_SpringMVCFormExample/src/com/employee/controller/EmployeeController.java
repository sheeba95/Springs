package com.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employee.bean.EmployeeBean;

@Controller
public class EmployeeController {

	@RequestMapping("/employeeForm")
	public ModelAndView showform() {
		
		return new ModelAndView("employeeform", "command", new EmployeeBean());
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") EmployeeBean employeeBean) {
		
		System.out.println(employeeBean.getEmployeeName() + " " + employeeBean.getEmployeeSalary() + " " + employeeBean.getEmployeeDesignation());

		
		return new ModelAndView("redirect:/viewEmployee.html");
	}
	
	
	@RequestMapping("/viewEmployee")  
    public ModelAndView viewemp(){  
       
        List<EmployeeBean> list= new ArrayList<EmployeeBean>();  
        list.add(new EmployeeBean(1,"rahul",35000f,"S.Engineer"));  
        list.add(new EmployeeBean(2,"aditya",25000f,"IT Manager"));  
        list.add(new EmployeeBean(3,"sachin",55000f,"Care Taker"));  
          
        return new ModelAndView("viewemployee","list",list);  
    }  
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView welcome() {
	  return new ModelAndView("index");
	 }

}