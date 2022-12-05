package ibmtal.eticaret.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.eticaret.entity.Color;

public interface ColorDao extends JpaRepository<Color, Integer> {

}
