package security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringSecurityAppController {
	
	@RequestMapping ("/")
	public String showMainPage()
	{
		return "redirect:/home";
		
	}
	@RequestMapping ("/home")
	public String showHomePage()
	{
		return "home";
		
	}
	@RequestMapping ("/")
	
	public String showLoggedInPage()
	{
		return "redirect:/home";
		
	}

}
