package com.uvg.main;
import java.util.Comparator;
public class Comparate<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		if(o1 == o2) {
			return 0;
		}else{
			return 1;
		}
	}
	
	
}
