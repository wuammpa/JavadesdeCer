package com.java;

public class FuncionesParteDs {
	
	public static void main(String[] args) {
		  
		
        
        
        
        //opcion uno funcion sin parametros y sin tipo de rtorno
        //showMenu();
       // showMenu();
        
        
        
        //opcion dos funcion sin paraetros y con tipo de retorno
      String menu =  getMenu();
      System.out.println(menu);
      System.out.println(getMenu());
      
      double  precio =getPrice();
      System.out.println(precio);
		
      // opcion tres funcion con parametros y sin tipo de retorno
      imprimirSaludos("OpneBootcamp");
      
      
      // opcion 4 funcion con  parametro y con tipo de retorno
       String name ="Gounter";
       String apell ="Salazar";
      String saludo = obtenerSaludos(name,apell);
      System.out.println(saludo);
      
      
	}
	
	  static String obtenerSaludos(String nombre, String apellido) {
		  return "Buenas tardes " + nombre +" "+apellido;
		  
	
		
	}

	static double getPrice() {
		 return 10.888;
		
	}

	static void showMenu(){
	  
		  System.out.println("Bienvenidos al e comerc de zapatillas");
			System.out.println("1 _ para ver zapatillas");
			 System.out.println("2_comprar zapatillas");
	        System.out.println("3_salir");
		  	
	}
   
	    static  String getMenu(){
	    	return " Bienvenidos al el commer de zapatiilas \n 1 -marque este o el otro";
	    	
	    	
	    	
	    	
	    	
	    }
	   
	    static void imprimirSaludos(String nombre) {
	    	
	    	System.out.println("Buenos dia " + nombre);
	    	
	    	
	    }
	 
}
