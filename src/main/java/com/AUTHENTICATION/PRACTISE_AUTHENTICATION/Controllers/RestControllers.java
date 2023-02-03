package com.AUTHENTICATION.PRACTISE_AUTHENTICATION.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@RequestMapping(method=RequestMethod.GET , path="/authentication/one")
	public String One()
	{
		return "One";
	}
	
	@RequestMapping(method=RequestMethod.GET , path="/authentication/two")
	public String Two()
	{
		return "Two";
	}
	
	@RequestMapping(method=RequestMethod.GET , path="/authentication/three")
	public String Three()
	{
		return "Three";
	}

}
