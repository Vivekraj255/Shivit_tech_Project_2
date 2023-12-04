package nov.max.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nov.max.master.LocationDAO;
import nov.max.reg.RegDTO;

@Controller
public class ViewController {
	@Autowired
	LocationDAO locationDAO;
	@RequestMapping(value = "view" , method = RequestMethod.GET)
	public ModelAndView viewJsp()
	{
		List<RegDTO> l=new ArrayList<RegDTO>();
		List<RegDTO> list = locationDAO.getView();
		for (RegDTO p:list)
		{
			RegDTO r=new RegDTO();
			r.setRid(p.getRid());

			//r.setDistCode(p.getDistCode());
			//r.setStCode(p.getStCode());
			r.setIname(p.getIname().toUpperCase());
			r.setCustom_field_id("0"+p.getCustom_field_id());
			l.add(r);
		}
		
		
		
		return new ModelAndView("view","b",l);
	}

}
