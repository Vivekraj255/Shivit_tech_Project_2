package nov.max;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nov.max.master.LocationDAO;

import nov.max.reg.RegBean;

@Controller
public class LoginController {
	@Autowired
	LoginBean loginBean;
	@Autowired
	LocationDAO locationDAO;
	@Autowired
	RegBean regBean;
@RequestMapping(value = "open", method = RequestMethod.GET)
	public ModelAndView open()
	{
		return new ModelAndView("A","ok",loginBean);
	}

@RequestMapping(value = "login", method = RequestMethod.POST)
public String logn(@ModelAttribute("ok")LoginBean loginBean,ModelMap m)
{
	if(!loginBean.getUid().equalsIgnoreCase(loginBean.getPass()))
	{
		
		m.addAttribute("ok", regBean);
		
	return "reg";
	}
	else
	{
		return "F";
	}
}
	
	
}
