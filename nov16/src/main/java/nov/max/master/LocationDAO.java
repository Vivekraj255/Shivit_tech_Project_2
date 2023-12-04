package nov.max.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import nov.max.reg.RegDTO;
import nov.max.reg.RegInterface;

@Repository
public class LocationDAO {
   @Autowired
   RegInterface regInterface;


	
public int saveee(RegDTO regDTO)
{
	    RegDTO i = regInterface.save(regDTO);
	      if(i.getRid()>0)
	    	  return 1;
	          return 0;
	
}

public List<RegDTO> getView()
{
	List<RegDTO> b = regInterface.findAll();
	return b;
}










}
