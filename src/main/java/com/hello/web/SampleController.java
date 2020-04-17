package com.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hello.business.Pet;

@Controller
public class SampleController {
	
	@RequestMapping("/hello") //locates where requests are going to. The rest of the url is assumed
	@ResponseBody //defining what the body is going to look like from this response
	public String hello() {
		return "Hello Java Bootcamp!";
	}
	
	@RequestMapping("/pet") //locates where requests are going to. The rest of the url is assumed
	@ResponseBody //defining what the body is going to look like from this response
	public Pet displayPet() {
		Pet p = new Pet(1, "Moose", "Cat");
		return p;
	}

}
