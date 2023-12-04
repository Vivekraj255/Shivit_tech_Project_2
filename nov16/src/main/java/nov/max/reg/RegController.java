package nov.max.reg;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import nov.max.master.LocationDAO;

@Controller
public class RegController {
	@Autowired
	RegBean regBean;
	@Autowired
	LocationDAO locationDAO;
	@Autowired
	RegDTO regDTO;
	
	@RequestMapping(value = "RegSave", method = RequestMethod.GET)
public String getRegDetail(@ModelAttribute("ok") RegBean regBean)
{
		
		BeanUtils.copyProperties(regBean, regDTO);
		if(locationDAO.saveee(regDTO)>0)
		{
			return "S";
		}
		else
		{
			return "F";
		}
		
	
	
}
	
}
