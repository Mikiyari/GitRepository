package dxh.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dxh.notes.bean.Manager;
import dxh.notes.service.ManagerService;
import dxh.notes.service.UserService;

@Controller
public class SignController {
	
	@Autowired
	ManagerService managerService;
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/home")
	public String gohome() {
		return "index";
	}
	
	@RequestMapping("/signin")
	public String signin() {
		return "sign/login";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		return "sign/register";
	}
	
	@RequestMapping("/loginformanager")
	public String loginformanager() {
		return "sign/managerlogin";
	}
	
	@RequestMapping("/managerdologin")
	public String managerdologin(Manager manager) {
		boolean flag = managerService.ishasManager(manager.getUsername(), manager.getPassword());
		if(flag==true) {
			return "manager/managements";
		}else {
			return "登陆失败,用户名或密码错误";
		}
	}
	
}
