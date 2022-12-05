package ibmtal.eticaret.business.managers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.eticaret.business.services.ColorService;
import ibmtal.eticaret.database.ColorDao;
import ibmtal.eticaret.entity.Color;
@Service
public class ColorManager implements ColorService {
	private ColorDao colorDao;
	@Autowired
	public ColorManager(ColorDao colorDao) {
		super();
		this.colorDao = colorDao;
	}
	@Override
	public ArrayList<Color> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Color>(this.colorDao.findAll());
	}
	
}
