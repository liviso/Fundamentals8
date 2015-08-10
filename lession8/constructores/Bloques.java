class Bloques{
/**
	Los bloques estáticos son bloques que se ejecutan al momento en que se carga 
	una clase dentro de la máquina virtual de java
	**/
	
	static{
		System.out.println("Hola Mundo");
	}

	static{
		System.out.println("Adios Mundo");
	}
/**
	Los blóques anónimos son bloques de código que se ejecutan en el momento
	en el que se crea un objeto de la clase, no importa que constructor se ejecute 
	los bloques anónimos se ejecutarán después de la llamada a super
**/
	
	{
		System.out.println("Soy un bloque anonimo como ves !");
	}
	{
		System.out.println("Yo también como ves !");
	}

	public static void main(String args[]){
			new Bloques();
	}

}