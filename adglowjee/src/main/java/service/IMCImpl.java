package service;

import org.springframework.stereotype.Service;

import dto.IMCResultado;
import dto.Persona;
import dto.TipoIMC;
import service.interfaces.IMCService;

@Service
public class IMCImpl implements IMCService {
	
	
	public IMCResultado calcula (Persona persona)
	{
		IMCResultado imcResultado = null;
		
			float imc_num = persona.getPeso()/(persona.getAltura()*persona.getAltura());
			TipoIMC imc_nom = TipoIMC.traduceIMC(imc_num);
			imcResultado = new IMCResultado(4, persona.getPeso(), persona.getAltura(), imc_num, imc_nom, persona.getNombre());
	
		return imcResultado;
	}

}
