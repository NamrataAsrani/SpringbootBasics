package com.sum.demo;

import org.springframework.stereotype.Repository;

@Repository
public class Sum implements CalculateAddition{
	
	
	public static int Sumoftwonumbers(int a, int b) {
		return a+b;
	}
	

}
