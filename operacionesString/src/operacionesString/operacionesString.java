package operacionesString;

public class operacionesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidadDeCaracteres = "Juan Galvez Ortega".length();
		System.out.println("La cantidad de caracteres es " + cantidadDeCaracteres);
		
		//Extraer una porción de texto
		
		String lF ="El primer lenguaje que voy a aprender es JAVA";
		String extraccion = lF.substring(14,25);
		System.out.println("Las letras extraidas son" + extraccion);
		System.out.println("Estoy cursando mis estudios en Cesur");
		
		//Determinar si dos cadenas son iguales
		String saludo1 = "Hola mundo";
		String saludo2 = "Adios Mundo";
		boolean esIgual = saludo1.equals(saludo2);
		System.out.println("Son iguales la cadenas? " + esIgual);
	
		//Determinar si dos cadenas son iguales ignorando mayusculas
				String saludo3 = "Hola mundo";
				String saludo4 = "Hola Mundo";
				boolean esIgualIgnoraMayusculas = saludo3.equalsIgnoreCase(saludo4);
				System.out.println("Son iguales la cadenas? " + esIgualIgnoraMayusculas);
	    //devolver el indice de una letra
				
				int indice = "Londres".indexOf("o");
				System.out.println("Le letra 'o' esta en la posicion " + indice);
		//Extraer letra
				
				char letraExtraida = "Africa".charAt(3);
				System.out.println(letraExtraida);
				
		//Determinar si una palabra está en una frase;
				String mensaje2 = "Pepe es más alto que Juan";
				boolean contienePalabra = mensaje2.contains("Juan");
				boolean comienzaCon = mensaje2.startsWith("Pepe");
				boolean terminaCon = mensaje2.endsWith("Juan");
				System.out.println("Esta la palabra incluida? " + contienePalabra);
				System.out.println("La frase comienza con la palabra 'Pepe' " + comienzaCon);
				System.out.println("La frase termina con la palabra 'Juan' " + terminaCon);
				System.out.println("HOLA MUNDO!".toLowerCase());
	
	}
	

}
