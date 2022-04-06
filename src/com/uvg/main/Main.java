package com.uvg.main;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		try {
			File diccionario = new File("src/com/uvg/main/diccionario.txt");
			Scanner fileScan = new Scanner(diccionario);
			Scanner scan = new Scanner(System.in);
			Vista vis = new Vista();
			
			while(fileScan.hasNextLine()) {
				String fila = fileScan.nextLine();
				
			}
			
			vis.menu();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
