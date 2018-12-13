package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Common.PasswordGenerator;
import com.example.demo.form.Hello3Form;
import com.example.demo.form.User;


@Controller
@EnableAutoConfiguration
public class HelloContoller {

	    @RequestMapping("/")
	    public String home(Hello3Form form, Model model) {
	    	model.addAttribute("hello3Form", form);
	        return "hello3";
	    }

	    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
	    public String index(Hello3Form form, Model model) {
	         model.addAttribute("hello3Form", form);
	         return "hello3";
	    }

	    @RequestMapping(value = "/outpg01", method = RequestMethod.POST)
	    public String confirm(@Validated @ModelAttribute("hello3Form") Hello3Form form, BindingResult result, Model model) {
	    	PasswordGenerator pg = new PasswordGenerator();
	    	form.setDefaultPassword(pg.password());
	    	model.addAttribute("hello3Form", form);
	    	List<User> list = new ArrayList<>();
	    	User user1 = new User();
	    	user1.setName("test1");
	    	User user2 = new User();
	    	user2.setName("test2");
	    	User user3 = new User();
	    	user3.setName("test3");
	    	User user4 = new User();
	    	user4.setName("test4");
	    	User user5 = new User();
	    	user5.setName("test5");
	    	User user6 = new User();
	    	user6.setName("test6");
	    	User user7 = new User();
	    	user7.setName("test7");
	    	User user8 = new User();
	    	user8.setName("test8");
	    	User user9 = new User();
	    	user9.setName("test9");
	    	User user10 = new User();
	    	user10.setName("test10");
	    	User user11 = new User();
	    	user11.setName("test11");
	    	
	    	list.add(user1);
	    	list.add(user2);
	    	list.add(user3);
	    	list.add(user4);
	    	list.add(user5);
	    	list.add(user6);
	    	list.add(user7);
	    	list.add(user8);
	    	list.add(user9);
	    	list.add(user10);
	    	list.add(user11);
	    	
//	    	List<String> list = new ArrayList<>();
//	    	list.add("user1");
//	    	list.add("user2");
//	    	list.add("user3");
//	    	list.add("user4");
//	    	list.add("user5");
//	    	list.add("user6");
//	    	list.add("user7");
//	    	list.add("user8");
//	    	list.add("user9");
//	    	list.add("user10");
//	    	list.add("user11");
	    	
	    	model.addAttribute("list", list);
	    	System.out.println();
	        System.out.println("name"+form.getName());
	        System.out.println("password"+form.getDefaultPassword());
	         return "outpg01";
	    } 
}
