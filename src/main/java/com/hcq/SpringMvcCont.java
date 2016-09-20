package com.hcq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class SpringMvcCont{

	@RequestMapping("/springmvc")
	public String HelloMVC(){
		return "HelloSpringMVC";
	}
}
