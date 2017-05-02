package com.bv.model;

import java.util.ArrayList;
import java.util.List;

public class ArtigoDao
{
	private List<Artigo> artigos;
	
	public List<Artigo> listar()
	{
		artigos = new ArrayList<>();
    	
    	Artigo artigo1 = new Artigo(1, "Caneta", "10 reais");
    	Artigo artigo2 = new Artigo(2, "Abajur", "15 reais");
    	
    	artigos.add(artigo1);
    	artigos.add(artigo2);
    	
    	return artigos;
	}

}
