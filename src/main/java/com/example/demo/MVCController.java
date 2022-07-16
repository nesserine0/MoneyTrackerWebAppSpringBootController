package com.example.demo;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.ImgRepository;
import com.example.demo.service.ICategorieService;
import com.example.demo.service.IExpensesService;
import com.example.demo.service.IUserService;
import com.example.demo.service.IimageService;



@Controller
public class MVCController implements ErrorController {

	private static final String Error_PATH="/error";
	

	
	@Autowired
	IimageService iimageService;
	
	@Autowired
	IExpensesService iExpensesService;
	
	
	@Autowired
	IUserService iUserService;
	
	@Autowired
	ICategorieService icategorieService;
	
	
	//go to pages
	
	   @RequestMapping(value = "/",method = RequestMethod.GET)
	public String home(Model model) {

		   
		model.addAttribute("liste",  iimageService.getAllImages());	
		return "Home"; 
		
	}
	   
	   @RequestMapping(value = "/aboutUs",method = RequestMethod.GET)
		public String aboutUs(Model model) {

			return "aboutus"; 
			
		}
	   
	   @RequestMapping(value = "/Transactions",method = RequestMethod.GET)
		public String Transactions(Model model) {

			   
			model.addAttribute("tran", iExpensesService.getAllExpense());	
			return "Transactions"; 
			
		}
	   
	   @RequestMapping(value = "/Categories",method = RequestMethod.GET)
		public String Categories(Model model) {

			   
			model.addAttribute("Cat", icategorieService.getAllCategories());	
			return "Categories"; 
			
		}
	

	

	
	

	

	   
	
	
	
}
