package nov.max.reg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "field_indexing")
@Component
public class RegDTO {
	@Id
	@GeneratedValue
  int rid;
	  String custom_field_id;
	  String iname;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
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
