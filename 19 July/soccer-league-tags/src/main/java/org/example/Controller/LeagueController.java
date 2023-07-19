package org.example.Controller;

import org.exmple.model.League;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/league")
public class LeagueController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) 
	{
		League theLeague = new League();
		theModel.addAttribute("league",theLeague);
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("league") League theLeague)
	{
		return "success";
	}
}
