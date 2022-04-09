package com.uvg.main;
import com.uvg.main.BinarySearchTree;
public class Anexador {

	public Anexador() {
		
		
	}
	
	public BinarySearchTree anexar(String frase, BinarySearchTree<String, String> arbol, int indicador) {
		
		String[] lista = frase.split(",");
		String ing = lista[0];
		String esp = lista[1];
		String fra = lista[2];
		if(indicador == 1) {
			arbol.insert(ing, esp);
		}else {
			arbol.insert(fra, esp);
		}
		
		return arbol;
	}
	
	
}
