
package lession15.ping;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ping {
    public static final int INTENTOS = 3;
	public static final String IP = "192.168.1.73";
	
	public static void main(String args[]) {
		
		try {
			// Obtiene la dirección del equipo remoto
			InetAddress equipoRemoto = InetAddress.getByName(IP);
			
			// Realiza varias intentos
			for (int i = 0; i < INTENTOS; i++) {
				// Comprueba si el equipo respone con un timeout máximo de 3000 ms
				if (equipoRemoto.isReachable(3000))
					System.out.println("El equipo responde");
				else
					System.out.println("El equipo no responde");
			}
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
            
}
