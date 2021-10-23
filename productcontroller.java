package springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.dao.productDao;
import springmvc.model.product;
@Controller
public class productcontroller {
 @Autowired  
 productDao dao;	
 @RequestMapping("/index")
 public String index() 
 {
  return "index"; 
 }
    @RequestMapping("/productform")    
    public String showform(Model m){    
        m.addAttribute("command", new product());  
        return "productform";   
    }     
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("p") product p){    
        dao.save(p);    
        return "redirect:/viewproduct";   
    }       
    @RequestMapping("/viewproduct")    
    public String viewproduct(Model m){    
        List<product> list=dao.getProduct();    
        m.addAttribute("list",list);  
        return "viewproduct";    
    }     
    @RequestMapping(value="/editproduct/{pid}")    
    public String edit(@PathVariable int pid, Model m){    
        product p=dao.getproductById(pid);    
        m.addAttribute("command",p);  
        return "producteditform";    
    }    
    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("p") product p){    
        dao.update(p);    
        return "redirect:/viewproduct";    
    }    
    @RequestMapping(value="/deleteproduct/{pid}",method = RequestMethod.GET)    
    public String delete(@ModelAttribute("p") product p){    
        dao.delete(p);    
        return "redirect:/viewproduct";    
    } 
}

