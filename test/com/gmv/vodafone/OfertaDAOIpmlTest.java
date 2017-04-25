package com.gmv.vodafone;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class OfertaDAOIpmlTest {

	private  OfertaDAO dao;
	
	@Before
	public void setUp() throws Exception {
		dao = new OfertaDAOIpml();
	}

	@Test
	public void test() {
		List<Oferta> ofertas = dao.getOfertas();
		assertTrue(ofertas.size() ==3);
	}
	
	@Test
	public void test2() {
		Oferta ofertas = dao.getOferta(1);
		assertTrue(ofertas != null);
	}

	@Test(expected=IllegalArgumentException.class)
	public void test3() {
		dao.getOferta(5);
	}
}
