package com.hanains.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class MainController {

	public MainController() {
		System.out.println(this.getClass());
	}
	
	@ResponseBody
	@RequestMapping("/index")
	public String index(){
		return "index!";
	}
	
	@RequestMapping("test")
	public String test(Model model){
		model.addAttribute("test", "test!!!!");
		return "test";
	}
	
}
