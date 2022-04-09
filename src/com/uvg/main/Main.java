package com.uvg.main;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.Comparator;


public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		try {
			File diccionario = new File("src/com/uvg/main/diccionario.txt");
			Scanner fileScan = new Scanner(diccionario);
			Scanner scan = new Scanner(System.in);
			Vista vis = new Vista();
			Comparate<String> comparador = new Comparate<String>();
			BinarySearchTree<String, String> arbolIngles = new BinarySearchTree<String, String>(comparador);
			BinarySearchTree<String, String> arbolFrances = new BinarySearchTree<String, String>(comparador);
			Anexador anexador = new Anexador();
			while(fileScan.hasNextLine()) {
				String fila = fileScan.nextLine();
				arbolIngles = anexador.anexar(fila, arbolIngles, 1);
				arbolFrances = anexador.anexar(fila, arbolFrances, 1);
			}
			boolean salida = false;
			while(!salida) {
			
				vis.menu();
				int resp = scan.nextInt();
				if(resp == 1) {
					System.out.print(arbolIngles.find("dog"));

				}else if(resp == 2) {
					
				}else if(resp == 3) {
					
				}else if(resp == 4) {
					
				}else if(resp == 5) {
					
				}else if(resp == 6) {
					salida = true;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
