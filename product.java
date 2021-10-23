package springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class product {

	@Id
	private int pid;
	@Column(length = 50)
	private String productname;
	@Column(length = 50)
	private String company;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString()
	{
		return "product [pid=" +pid+ ", productname=" +productname+",company=" +company +"]";	
	}
}
