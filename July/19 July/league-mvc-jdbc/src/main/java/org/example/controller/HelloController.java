package org.example.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

import org.example.model.League;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	private final DataSource dataSource;
	
	@Autowired
	public HelloController(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@GetMapping
	public String goHome() {
		return "home";
	}

	@GetMapping("/showForm")
	public String showForm() {
		return "showForm";
	}
	
	@PostMapping("/addLeague")
	public String addLeague(@RequestParam(name="year") String year, @RequestParam(name="season") String season, @RequestParam(name="title") String title, Model theModel) {
		
		int tempYear = 0;
		Random random = new Random();
		int id = random.nextInt(1000);
		List<String> list = new ArrayList<>();
		
		if(year.isEmpty())
		{
			list.add("Year cannot be blank");
		}
		else {
			try 
			{
				tempYear = Integer.parseInt(year);
			}
			catch (Exception e)
			{
				list.add("Year must be numeric.");
			}
		}
		
		if(season.equals("UNKNOWN"))
		{
			list.add("Season cannot be blank.");
		}
		if(title.isEmpty())
		{
			list.add("Title cannot be blank.");
		}
		
		try
		{
			Connection connection = dataSource.getConnection();
			
			PreparedStatement pStatement = connection.prepareStatement("insert into league_table(leagueid,season,title,year) values(?,?,?,?)");
			
			pStatement.setInt(1, id);
			pStatement.setString(2, season);
			pStatement.setString(3, title);
			pStatement.setString(4, year);
			
			pStatement.executeUpdate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if(!list.isEmpty()) 
		{
			theModel.addAttribute("error",list);
			return "showForm";
		}
		else
		{
			theModel.addAttribute("league", new League(tempYear,season,title));
			return "success";
		}
	}
}
