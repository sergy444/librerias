package com.zubiri.geometria;

public class Circulo {

//Metodo para calcular el Área
 public double area (double radio, double n){

	double result = 0;
	result = n * radio * radio;
	return result;
 }
//Metodo para calcular la circunferencia
 public double circun (double radio, double n){

	double result = 0;
	result = 2*radio*n;
	return result;
 }
}
