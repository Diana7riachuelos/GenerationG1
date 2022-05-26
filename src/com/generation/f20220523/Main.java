package com.generation.f20220523;

public class Main {
	public static void main(String[] args) {
		int iva = 19;
		int dos = 2;
		int tres= 3;
		
		//variables Primitivas
		
		//Se define el tipo de dato al cual pertenecerá la variable
		//tipo de dato nombre_variable = asignación;
		String nombre = "Generation17%&$"; 
		System.out.println(nombre);
		
		//16 bit (un solo caracter, entre comillas simple)
		char letraA = 'a';
		
		//variables numericas
		//32bits
		int numeroInt = 2147483647;
		System.out.println(numeroInt + 10);
	
	//8bits
	byte numeroByte = 127;
	System.out.println(numeroByte);
	
	//16bits
	short numeroShort = 32767;
	System.out.println(numeroShort);
	
	//64bits (2^63)
	long numeroLong = 2147483647;
	System.out.println(numeroLong);
	
	//float y double (aceptan decimales)
	
	//variable booleana (true o false)
	boolean acepta = true;//false
	
	/**********************/
	
	boolean compromiso = true;
	
	if(compromiso == true) {
		System.out.println("Estoy comprometida");
	}else {
		System.out.println("Me da lo mismo");
	}
	
	String poblacion = "356 mts^2";
	String velocidad = "100 m/s";
	
	//Variables 0bjeto
	System.out.println(velocidad.charAt(4));
	
	String curso= "G1";
	
	//los strings se comparan con equals
	if(curso.equals("g1")) {
		System.out.println("iguales");
	}else {
		System.out.println("distintos");
	}
	
	if(curso.equalsIgnoreCase("g1")){
		System.out.println("iguales");
	}else {
		System.out.println("distintos");
	}
	if(curso.toLowerCase().equals("g1")){
		System.out.println("iguales");
	}
	if(curso.equals("g1".toUpperCase())) {
		System.out.println("iguales");	
	}
	
	String curso2 = "";//vacio
			
	String curso3 =null;   //null
	//comparar un string con null
	if(null == curso3 ) {}

	//Float y Double(de tipo objeto)
	//cast, es convertir un dato a otro tipo de dato
	float altura = (float)1.70;//1.70f;
	
	Float peso = 61f;
	
	Float gravedad = Float.parseFloat("9.6");
	
	//Parse: convertir un string a un tipo de numero
	Integer.parseInt("23");
	Long.parseLong("11565346");
	Float.parseFloat("85.8");
	Double.parseDouble("12354.16");

	//ejercicio
	int num1= 12;
   /*conversion de datos*/
   //automatica
 //byte>ahort>int>long>float>double
	
	int num4= 18;
	float num4f= num4;
	System.out.println(num4+" "+num4f);
	
	//manual
	//double>float>long>int>...
	Double peso2 = 75.9;
    Float peso2F = peso2.floatValue();
	
	float numPrimitivo = 123.4f;
	Float num0bjeto = 123.45f;

    //de float a int, se pierden los decimales
	//Float a integer, se pierden los decimales
	
	
	// + - * / % (operadores)
	// == !=  > >= < <= (comparacion)

	if( iva == (3 + dos) ) {
		
	}
	}
}
