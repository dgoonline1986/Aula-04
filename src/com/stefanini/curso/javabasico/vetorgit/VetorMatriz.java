package com.stefanini.curso.javabasico.vetorgit;

public class VetorMatriz {

	public static void main(String[] args) {
		int i,j;
		int mat[][]=new int[2][2];
		
		mat[1][1]=5;
	
		
		System.out.println(mat[1][1]);
		
		mat[0][1]=7;
	
		System.out.println(mat[0][1]);
		
		
		for(int num:mat[1]) {
			System.out.println(num);
		}

	}

}
