package com.uvg.main;

public class Association <K, V>{

	private K ext;
	private V esp;
	
	public Association(K externo, V espanol) {
		setExt(externo);
		setEsp(espanol);
	}

	public K getExt() {
		return ext;
	}

	public void setExt(K ext) {
		this.ext = ext;
	}

	public V getEsp() {
		return esp;
	}

	public void setEsp(V esp) {
		this.esp = esp;
	}
}
