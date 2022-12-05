package ibmtal.eticaret.business.services;

import java.util.ArrayList;

import ibmtal.eticaret.core.result.Result;
import ibmtal.eticaret.entity.Category;

public interface CategoryService {
	ArrayList<Category> getAll();
	Result<Category> addCategory(Category category);
}
