package ibmtal.eticaret.business.managers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.eticaret.business.services.CategoryService;
import ibmtal.eticaret.database.CategoryDao;
import ibmtal.eticaret.entity.Category;
@Service
public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;
	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}
	@Override
	public ArrayList<Category> getAll(){
		return new ArrayList<Category>(this.categoryDao.findAll());
	}
}
