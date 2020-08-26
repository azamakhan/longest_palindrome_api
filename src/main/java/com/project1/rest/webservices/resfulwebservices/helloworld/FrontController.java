package com.project1.rest.webservices.resfulwebservices.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

	@RequestMapping(method=RequestMethod.GET, path="/hello-world-bean")
	public HelloWorldBean helloWorld() {
		return new HelloWorldBean("Hello world from Bnan");
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/hello-world-bean-input-str")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String str) {
		return new HelloWorldBean(String.format("Input path variable, %s", str));
	}
	
	
}
