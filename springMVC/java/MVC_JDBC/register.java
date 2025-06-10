package MVC_JDBC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class register {
	
	 @Autowired
	 private UserDaoImpl daoImpl;
	@RequestMapping("/register")
	public String getRegister()
	{
		return "register";
	}
	
	 @RequestMapping("/addData")
	   public String addData(@ModelAttribute MVC_JDBC.User user,Model model) {
		 System.out.println(user);
		
//	       if (daoImpl.addStudent(user)) {
//	            return "home";
//	       }
//		 if (daoImpl.updateStudent(user)) {
//	            return "home";
//	       }
//		 if(daoImpl.deleteStudent(user)){
//	       return "home";
//	 	}
		 List<User> ls=daoImpl.viewStudent(user);
		 model.addAttribute("data", ls);
		return "home";
	    }
	 

}
