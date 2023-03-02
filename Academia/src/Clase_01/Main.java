package Clase_01;

public class Main {
	public static void main(String[] args) {
		// Visualización en pantalla
		System.out.println("Hola");
		System.out.println("Agur");
		
		/* Declaración de variables
		 
		 tipoDeDato identificador;
		 
		 NÚMEROS ENTEROS:
		 byte
		 short
		 int
		 long
		 
		 NÚMEROS REALES:
		 float --> pequeño en cuanto a decimales
		 double --> grande en cuanto a decimales
		 
		 CARACTERES (1 caracter):
		 char
		 
		 LÓGICO (true o false):
		 boolean
		 
		 CADENAS DE CARACTERES (palabras o frases...):
		 String
		 
		 */
		
		int num = 2;
		System.out.println("Número: "+num);
		
		double n = 2.1;
		float n2 = (float)2.4; // Conversión de tipo o casting
		
		System.out.println("Número 2: "+n);
		System.out.println("Número 3: "+n2);
		
		char letra = 'A';
		System.out.println("Letra: "+letra);
		
		String frase = "Vamos a aprobar todos!";
		System.out.println("Frase: "+frase);
		
		/* SENTENCIAS CONDICIONALES/SELECTIVAS 
		if(condición){
			código;
		}
		
		if(condición){
			códigoA;
		} else{
			códigoB;
		}
		
		if(condición1){
			codigoA;
		} else if(condición2){
			códigoB;
		} [else {
			códigoC;
		}]
		
		switch(variable){
			case valor 1:	código1;
							break;
			case valor 2:	código3;
							break;
			case valor 3:	código3;
							break;
			default: código;
		}
		Sólo se puede utilizar con variables de tipo entero o char
		*/
		
		int diaSemana=6;
		switch(diaSemana) {
			case 1: System.out.println("Lunes");
				break;
			case 2: System.out.println("Martes");
				break;
			case 3: System.out.println("Miércoles");
				break;
			case 4: System.out.println("Jueves");
				break;
			case 5: System.out.println("Viernes");
				break;
			case 6: System.out.println("Sábado");
				break;
			case 7: System.out.println("Domingo");
				break;
			default: System.out.println("Día Incorrecto");
		}
		
		/*
		 * SENTENCIAS REPETITIVAS *
		 FOR
		 ---
		 for(variable=valorInicial;condición;modificaciónvariable){
		 	código;
		 }
		 Lo usamos cuando sepamos cuántas veces tiene que ejecutarse el código.
		 
		 
		 WHILE
		 -----
		 inicializacion;
		 while(condición){
		 	código;
		 	modificación;
		 }
		 Lo usamos cuando no sepamos cuántas veces tiene que ejecutarse el código y puede que ninguna.
		 
		 DO WHILE
		 --------
		 [inicialización;]
		 do{
		 	código;
		 } while(condición);
		 Lo usamos cuando no sepamos cuantas veces tiene que ejecutarse el código pero tiene que ejecutarse al menos una vez.
		 
		 */
		// FOR
		for(int i=1;i<=100;i++) { // Sumar de 1 en 1
			System.out.println("For: " + i);
		}
		for(int i=1;i<=100;i=i+5) { // Sumar de 5 en 5 hasta llegar a 100
			System.out.println("For: " + i);
		}
		for(int i=1;i<=100;i+=5) { // Sumar de 5 en 5 hasta llegar a 100
			System.out.println("For: " + i);
		}
		for(int i=100;i>=1;i--) { // Restar de 1 en 1
			System.out.println("For: " + i);
		}
		for(int i=100;i>=1;i-=10) { // Restar de 10 en 10
			System.out.println("For: " + i);
		}
		// WHILE
		System.out.println("While");
		int x = 11;
		while(x<=10) {
			System.out.println("While: " + x);
			x++;
		}
		
		// DO WHILE
		System.out.println("Do While");
		int i=11;
		do {
			System.out.println(i);
			i*=2;
		}while(i<10);
	}
}