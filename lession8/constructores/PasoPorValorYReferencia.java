class Perro{
	String nombre;
	int edad;
}

/**
	En el paso por valor se realiza una copia del valor y se envía, por esto si se 
	modifica ese valor al método que lo mando no le afecta en nada.
	
	En el paso por referencia se manda el mismo objeto y si se alguna hace modificación
	el objeto original también es modificado.
	
	Las variables se pasan por valor y los objetos por referencia.
**/

class PasoPorValorYReferencia{
	
	void modificarValor(Perro y){
		y.nombre="Machin !";
	}
	
	void metodo(){
		Perro p=new Perro();
		p.nombre="Fufi";
		p.edad=10;
		modificarValor(p);
		System.out.println(p.nombre);
	}
	
	public static void main(String args[]){
		new PasoPorValorYReferencia().metodo();
	}
}