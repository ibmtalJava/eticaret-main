package ibmtal.eticaret.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.eticaret.business.services.CategoryService;
import ibmtal.eticaret.entity.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	private CategoryService categoryService;
	@Autowired
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	@GetMapping("/getAll")
	public ArrayList<Category> getAll(){
		return this.categoryService.getAll();
	}
	
}
