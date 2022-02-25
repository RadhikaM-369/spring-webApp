package com.xworkz.webApplication.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class WebBean {
	
	public WebBean() {
	System.out.println("Invoked WebBean constructor");	
	}
	@RequestMapping("click.do")
	public String onClick(@RequestParam String name, @RequestParam String email,
			@RequestParam long mobile,@RequestParam int age) {
	System.out.println("Invoked Onclick ");	
	System.out.println(name);
	System.out.println(email);
	System.out.println(mobile);
	System.out.println(age);
	return "/Welcome.html";
	}
	
	@RequestMapping("govt.do")
	public String onGovt(@RequestParam("stateName") String stateName, @RequestParam("partyName") String partyName, 
			@RequestParam String cmName, @RequestParam String governorName, @RequestParam String dyCmName) {
		System.out.println("invoked on govt");
		System.out.println(stateName);
		System.out.println(partyName);
		System.out.println(cmName);
		System.out.println(governorName);
		System.out.println(dyCmName);
		
		return "/Govt.html";
	}
}

//taxim
