package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.IMCResultado;
import dto.Persona;
import service.interfaces.IMCService;

@Controller
public class IMCController {

	@Autowired
	IMCService imcservice;

	@RequestMapping("/inicio")
	public String testController() {

		return "inicio";
	}

	@RequestMapping(path = "/imc", method = RequestMethod.POST)
	public String imc(@RequestBody Persona p, Model m) {

		IMCResultado imc_res = this.imcservice.calcula(p);
		m.addAttribute("resultado", imc_res);
		return "resultado_imc";
	}

}
