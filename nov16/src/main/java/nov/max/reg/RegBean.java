package nov.max.reg;

import org.springframework.stereotype.Component;

@Component
public class RegBean {

	String field_name;
	String module_id;
	  String custom_field_id;
	  String iname;
	public String getField_name() {
		return field_name;
	}
	public void setField_name(String field_name) {
		this.field_name = field_name;
	}
	public String getModule_id() {
		return module_id;
	}
	public void setModule_id(String module_id) {
		this.module_id = module_id;
	}
	public String getCustom_field_id() {
		return custom_field_id;
	}
	public void setCustom_field_id(String custom_field_id) {
		this.custom_field_id = custom_field_id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
  
	  
}
