package ibmtal.eticaret.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.eticaret.business.services.ColorService;
import ibmtal.eticaret.entity.Color;

@RestController
@RequestMapping("api/colors")
public class ColorController {
	private ColorService colorService;
	@Autowired
	public ColorController(ColorService colorService) {
		super();
		this.colorService = colorService;
	}
	@GetMapping("getAll")
	public ArrayList<Color> getAll(){
		return this.colorService.getAll();
	}
	
}
