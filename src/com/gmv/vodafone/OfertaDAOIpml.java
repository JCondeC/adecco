package com.gmv.vodafone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OfertaDAOIpml implements OfertaDAO {

	private static List<Oferta> ofertas = new ArrayList<>();
	
	static {
		Oferta of1 = new Oferta();
		of1.setCodigoOfeta(1);
		of1.setReferencia("LIJA553");
		of1.setFechaInicio(LocalDate.of(2017, 5, 1));
		ofertas.add(of1);
		
		Oferta of2 = new Oferta();
		of2.setCodigoOfeta(2);
		of2.setReferencia("FIB300");
		of2.setFechaInicio(LocalDate.of(2017, 5, 16));
		ofertas.add(of2);
		
		Oferta of3 = new Oferta();
		of3.setCodigoOfeta(3);
		of3.setReferencia("LII53");
		of3.setFechaInicio(LocalDate.of(2017, 4, 30));
		ofertas.add(of3);
		}
	
	@Override
	public List<Oferta> getOfertas() throws OfertaException {
		
		return ofertas;
	}

	@Override
	public Oferta getOferta(int codigo) throws OfertaException {
		for(Oferta oferta : ofertas){
			if(oferta.getCodigoOfeta() == codigo){
				return oferta;
			}
		}
		throw new IllegalArgumentException();
	}

	@Override
	public LocalDate getFechaInicio(int codigo) {
		for(Oferta oferta : ofertas){
			if(oferta.getCodigoOfeta() == codigo){
				return oferta.getFechaInicio();
			}
		}
		throw new IllegalArgumentException();
	}

}
