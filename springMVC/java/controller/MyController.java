package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@ModelAttribute
	public void firstMiddleWare()
	{
		System.out.println("middleWare");
	}
	
	@RequestMapping("/home")
	public String gethome(Model model) {
		model.addAttribute("name","rahee");
		return "home";
	}
	
	@RequestMapping("/about")
	public ModelAndView getabout() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("age",21);
		mv.setViewName("about");
		return mv;
	}
	
//	@RequestMapping("/register")
//	public String getRegister()
//	{
//		return "register";
//	}
	
//	@RequestMapping("/addData")
//	public String addData(@RequestParam("email") String email,@RequestParam("pwd") String pwd,Model model)
//	{
//		model.addAttribute("email",email);
//		model.addAttribute("pwd",pwd);
//		return "home";
//	}
	
//	@RequestMapping("/addData")
//	public String addData(@ModelAttribute User user)
//	{
//		return "redirect:/about";
//	}
	
//	path variable annotation: binding url(path) para to method para
	

}
