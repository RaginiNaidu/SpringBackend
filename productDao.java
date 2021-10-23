package springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.product;

@Transactional
@Repository
public class productDao {

HibernateTemplate template;  
    
	public void setTemplate(HibernateTemplate template) {    
	    this.template = template;    
	} 

	public void save(product p){    
	    template.save(p);    
	}    
	public void update(product p){    
	   template.update(p);    
	}    
	public void delete(product p){    
	   template.delete(p);    
	}    

	public product getproductById(int pid){    
	  product p = (product)this.template.get(product.class, pid);
	    return p;  
	}    
	
	public List<product> getProduct(){    
		List<product> list=new ArrayList<product>();  
	    list=template.loadAll(product.class);  
	    return list;     
	}  
}
