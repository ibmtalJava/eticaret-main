package ibmtal.eticaret.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.eticaret.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
