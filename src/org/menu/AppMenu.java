package org.menu;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMenu {
	
	public static void main(String[] args) {


		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean bandera = true;
        int opcion; 							//Guardaremos la opcion del usuario
        Scanner in= new Scanner(System.in);
        
        while (!salir) {
 
            System.out.println("1. Numero par o impar");
            System.out.println("2. numero primo limite superior ");
            System.out.println("3. numero primo limite superior e inferior ");
            System.out.println("4. numero primo con palindromos ");
            System.out.println("5. Fibonacci");
            System.out.println("6. series  ");
            System.out.println("7. palindromo ");
            System.out.println("8. numeros aleatorios ");
            System.out.println("9. suma de numeros aleatorios ");
            System.out.println("10");
            

            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	Par_impar num = new Par_impar();		// declaramos un objeto con el nombre de num a partir de nuestra clase Par_impar			
                		
                		System.out.println("Dame un numero: ");	// solicitamos al usuario ingresar un numero 
                		int numero = in.nextInt();				// guardamos la variable 
                		System.out.println("el numero ingresado es par ?: "+num.Par(numero)); // y mandamos el resultado mandando llamar el metodo de nuestro objeto
                		System.out.println("el numero ingresado es impar ?\n: "+num.imPar(numero));
  
                        break;
                    case 2:
                    	Primos num2= new Primos();
                		System.out.println("Ingrese el numero ");	// solicitamos al usuario ingresar un numero 
                    	int numero2 =in.nextInt();		// escaneamos la entrada creando una variable tipo scanner 
                		
                    	System.out.println("el numero es primo ? "+num2.esPrimo(numero2));
                        break;
                        
                    case 3:
                    	Primos num3 = new Primos();
                        System.out.println("3. numero primo limite superior e inferior ");
                        System.out.println("ingrese el limite superior");
                        int lim_sup = in.nextInt();
                        System.out.println("ingrese limite inferior");
                        int lim_inf = in.nextInt();
                        
                        System.out.println(" "+num3.Primo_limites(lim_inf, lim_sup));
                        break;
                        
                    case 4:
                    	System.out.println("4. numero primo con palindromos");
                    	System.out.println("ingrese una cadena ");
                        
                    	
                    	
                    	
                        break;
                        
                    case 5: 
                    	salir = true;
                    
                    case 6: 
                    	salir = true;
                    	
                    case 7: 
                    	salir = true;
                    	
                    case 8: 
                    	salir = true;
                    	
                    case 9:
                    	int limite_elementos = 20;  // por que se me ocurrio el 20 y YOLO  
                    	int [] vector1 = new int[limite_elementos];
                    	int [] vector2 =new int [limite_elementos];
                    	int [] vector3 = new int [limite_elementos];
                    	int [] vectorSuma = new int[limite_elementos];
                    	
                    	
                    	Vectores objVectores = new Vectores();
                    	
                    	vector1 = objVectores.AleatoriosVector(limite_elementos);
                    	vector2 = objVectores.AleatoriosVector(limite_elementos);
                    	vector3 = objVectores.AleatoriosVector(limite_elementos);
                    	
                    	vectorSuma = objVectores.sumaTresVectores(vector1, vector2, vector3);
                    	
                    	for(int cont =0;cont < vectorSuma.length; cont++)
                    	{
                    		System.out.println("vector 1: "+vector1[cont]+" vector2: "+vector2[cont]+" vector 3: "+vector3[cont]+" = "+vectorSuma[cont]);
                    		
                    	}
                    	
                    case 10: 
                    	salir = true;
                    	
                    default:
                        System.out.println("Solo n�meros entre 1 y 10");
                }
           } catch (InputMismatchException e) {
                System.out.println("Debes insertar un n�mero");
                sn.next();
            	}
            while(bandera)
            {
            	System.out.println("deseas ingresar otra opcion? s/n: ");
            	char opcion2 ;
            	opcion2 = in.next().charAt(0);
            	
            	
            	if(opcion2 == 's' ||opcion2 == 'S')
            	{
            		
              	}
            }
       	}
	}
}

//
//		String contenidoArchivos="";
//		
//		ManejoArchivos archivos = new ManejoArchivos();
//    	contenidoArchivos = archivos.leerArchivo("c:\\a\\testo3.txt");
//    	System.out.println(contenidoArchivos);
//    	
//    	archivos.escribirArchivo("c:\\a\\testo3.txt", "este es un testo");
//    	
//    	
//		tablaMultiplicar();
//	}
//	
//	public static void tablaMultiplicar()
//	{
//		FileWriter archivo;
//		PrintWriter writer;
//		
//		try
//		{
//			archivo = new FileWriter("c:\\a\\testo4.txt", false);
//			writer = new PrintWriter(archivo);
//			
//			Scanner entrada = new Scanner(System.in);
//			
//			System.out.println("que tabla de multiplicar deseas mostrar ?");
//			int numero = entrada.nextInt();
//			for(int cont =1; cont<= 20; cont ++)
//			{
//				System.out.println(numero+"x"+cont+" = "+numero*cont);
//				writer.println(numero+"x"+cont+" = "+numero*cont);
//			}
//			entrada.close();
//			
//			archivo.close();
//			writer.close();
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("error de entrada/salida");
//		}
//		
//		
//	}



/////////////////////////////////////////////////////////////////////// Par e
/////////////////////////////////////////////////////////////////////// impar
/////////////////////////////////////////////////////////////////////// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Par_impar num = new Par_impar(); // declaramos un objeto con el nombre de num
// a partir de nuestra clase Par_impar
//
// System.out.println("Dame un numero: "); // solicitamos al usuario ingresar un
// numero
// Scanner in=new Scanner(System.in); // escaneamos la entrada creando una
// variable tipo scanner
// int numero = in.nextInt(); // guardamos la variable
// System.out.println("el numero ingresado es par ?: "+num.Par(numero)); // y
// mandamos el resultado mandando llamar el metodo de nuestro objeto
// System.out.println("el numero ingresado es impar ?: "+num.imPar(numero));

/////////////////////////////////////////////////////////////////////////// Primos///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Primos num2= new Primos();
// System.out.println("Dame un numero: "); // solicitamos al usuario ingresar un
// numero
// Scanner in2=new Scanner(System.in); // escaneamos la entrada creando una
// variable tipo scanner
// int numero2 = in.nextInt();
// System.out.println("el numero que ingreso es primo ?:
// "+num2.esPrimo(numero2));
//
