
package lession8.statics;

class Bloques{

	static{
		System.out.println("Hola Mundo");
	}

	static{
		System.out.println("Adios Mundo");
	}
        
	{
		System.out.println("Soy un bloque anonimo!");
	}
	{
		System.out.println("Yo también!");
	}

	public static void main(String args[]){
			new Bloques();
	}

}