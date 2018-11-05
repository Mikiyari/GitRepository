package dxh.notes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dxh.notes.bean.Manager;
import dxh.notes.bean.User;
import dxh.notes.service.ManagerService;
import dxh.notes.service.UserService;

@Controller
public class LogInController {
	
	@Autowired
	ManagerService managerService;
	
	@Autowired
	UserService userService;
	
	//这是主页
	@RequestMapping("/home")
	public String gohome() {
		return "index";
	}
	
	/**
	 * 用户的相关处理
	 * @return
	 */
	//点击后进入登陆界面
	@RequestMapping("/signin")
	public String signin() {
		return "sign/login";
	}
	
	//点击后进入注册界面
	@RequestMapping("/signup")
	public String signup() {
		return "sign/register";
	}
	
	//进行登陆匹配 然后转到用户界面
	@RequestMapping("doLogin")
	public String doLogin(User user,HttpServletRequest request) {
		if(userService.isHasUser(user)!=null) {
			User u = userService.isHasUser(user);
			HttpSession session = request.getSession();
			session.setAttribute("user", u);
		}else {
			return "errors";
		}
		return "user/home";
	}
	
	//用户登出
	@RequestMapping("userLogOut")
	public String userLogOut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "redirect:/signin";
	}
	
	/**
	 * 管理员的相关处理
	 * @return
	 */
	//执行管理员的登陆
	@RequestMapping("/loginformanager")
	public String loginformanager() {
		return "sign/managerlogin";
	}
	
	//执行管理员的登陆信息匹配
	@RequestMapping("/managerdologin")
	public String managerdologin(Manager manager,HttpServletRequest request) {
		Manager man = managerService.ishasManager(manager.getUsername(), manager.getPassword());
		System.out.println(man);
		if(man!=null) {
			HttpSession session = request.getSession();  
			session.setAttribute("manager", man);
			return "manager/managements";
		}else {
			return "登陆失败,用户名或密码错误";
		}
	}
	
	//增加管理员注销登陆功能
	@RequestMapping("/managerLogOut")
	public String managerLogOut(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		httpSession.removeAttribute("manager");
		return "sign/login";
	}
}
