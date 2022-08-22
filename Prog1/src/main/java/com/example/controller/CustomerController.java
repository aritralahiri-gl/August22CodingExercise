package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

	@GetMapping("/")
	public String showHome() {
		return "index";

	}

	@GetMapping("/addCustomer")
	public String addCustomers(@RequestParam("custId") String custId, @RequestParam("custName") String custName,
			@RequestParam("custPhn") int custPhn, @RequestParam("custAddress") String custAddress,
			@RequestParam("custLogin") String custLogin, @RequestParam("custPass") String custPass, Model m) {

		m.addAttribute("custId", custId);
		m.addAttribute("custName", custName);
		m.addAttribute("custAddress", custAddress);
		m.addAttribute("custLogin", custLogin);
		m.addAttribute("custPass", custPass);
		m.addAttribute("custPhn", custPhn);
		return "showCustomer";

	}

}
