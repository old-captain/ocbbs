package org.oc.ocbbs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	/**
	 * test
	 */
	@RequestMapping(value = {"", "test"})
	public String home(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "test";
	}
}
