package com.luv2code.springdemo.controller;

import java.util.List;

import com.luv2code.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// inject the customer service
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the service
		List<Customer> theCustomers = customerService.getCustomers();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}


	@GetMapping("/showFormForAdd")
	public String shoeFormForAdd(Model theModel){
		//create model attribute to bind form data
		Customer theCustomer = new Customer();

		theModel.addAttribute("customer",theCustomer);

		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
		//save the customer using our service
		customerService.saveCustomer(theCustomer);


		 return "redirect:/customer/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel){
		//get the customer from the service
		Customer theCustomer = customerService.getCustomer(theId);

		//set customer as a model attribute to pre-populated the form
		theModel.addAttribute("customer",theCustomer);

		//send over to our form
		return "customer-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int theId, Model themodel){

		//delete the customer
		customerService.deleteCustomer(theId);

		return "redirect:/customer/list";
	}
	
}


