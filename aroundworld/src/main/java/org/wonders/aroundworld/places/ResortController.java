package org.wonders.aroundworld.places;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResortController 
{
		@RequestMapping(value = "/enterresort", method = RequestMethod.GET)
		public String viewResort(Map<String, Object> Model)
		{
			
			Resort rt = new Resort();
			Model.put("rt", rt);
			
			
			return "resortregsitration";
		}
		public String processResort(@ModelAttribute( "rt" ) Resort rt, Map <String, Object> Model)
		{
			
			
			return "showResortRegistered";
			
			
		}
		







}
