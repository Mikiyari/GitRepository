package dxh.notes.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dxh.notes.bean.User;
import dxh.notes.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	/**
	 * 用户的增删改查
	 */
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		user.setCreatetime(new Date());
		userService.addUser(user);
		return "redirect:/findUsers";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(Integer id) {
		userService.deleteUser(id);
		return "redirect:/findUsers";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(User user) {
		userService.updateUser(user);
		return "redirect:/findUsers";
	}

	@RequestMapping("/findUser")
	@ResponseBody
	public User findUser(Integer id) {
		User user = userService.findUser(id);
		return user;
	}
	
	@RequestMapping("/findUsers")
	public String findUsers(Model model) {
		List<User> users = userService.findUsers();
		model.addAttribute("users", users);
		return "user/users";
	}	
	
	@RequestMapping("/deleteUsers")
	public String deleteUsers(String ids) {
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			for(String str:str_ids) {
				del_ids.add(Integer.parseInt(str));
			}
			userService.deleteUsers(del_ids);
		}else {
			Integer i = Integer.parseInt(ids);
			userService.deleteUser(i);
		}
		return "redirect:/findUsers";
	}
}
