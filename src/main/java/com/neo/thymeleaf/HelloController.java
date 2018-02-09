package com.neo.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.neo.pojo.User;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	//单个属性
    	model.addAttribute("name", name);
    	model.addAttribute("yes", "yes");
    	//对象
    	User user=new User("linqin","22");
    	model.addAttribute(user);
    	//list
    	User user1=new User("linqin1", "22");
    	List<User> list=new ArrayList<>();
    	list.add(user);
    	list.add(user1);
    	model.addAttribute("list",list);
        return "hello";
    }
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
