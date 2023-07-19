package org.example.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.example.model.Employee;
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

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestParam(name = "t1") String name, @RequestParam(name = "t2") String age,
			Model theModel) {
		double tempAge = 0;
		List<String> list = new ArrayList<>();
		try {
			tempAge = Double.parseDouble(age);
		} catch (Exception e) {
			list.add("Age field cannot be non numeric...");
			//theModel.addAttribute("error", "Age field must be numeric");
		}
		
		if(name.isEmpty()) {
			list.add("Name field is blank...");
		}
		
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into employee(name,age) values(?,?)");
			pst.setString(1, name);
			pst.setDouble(2, tempAge);
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(!list.isEmpty())
		{
			theModel.addAttribute("error",list);
			return "showForm";
		}
		else
		{
			theModel.addAttribute("emp", new Employee(name, tempAge));
			return "success";
		}
	}
}