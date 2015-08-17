
package tarea3.soccer;

public class Liga {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo();
        equipo1.setNombreEquipo("Los Pesados");
        
        Jugador jugador1 = new Jugador();
        jugador1.setNombreJugador("Jorge Mendoza");
        Jugador jugador2 = new Jugador();
        jugador2.setNombreJugador("Raul Castillo");
        Jugador jugador3 = new Jugador();
        jugador3.setNombreJugador("Maricela Noguez");
        Jugador[] jugadores = {jugador1, jugador2, jugador3};
        equipo1.setArrayJug(jugadores);
        

        Equipo equipo2 = new Equipo();
        equipo2.setNombreEquipo("Los Genios");
        equipo2.setArrayJug(new Jugador[3]);
        equipo2.getArrayJug()[0] = new Jugador();
        equipo2.getArrayJug()[0].setNombreJugador("Lalo Santos");
        equipo2.getArrayJug()[1] = new Jugador();
        equipo2.getArrayJug()[1].setNombreJugador("Mario Noguez");
        equipo2.getArrayJug()[2] = new Jugador();
        equipo2.getArrayJug()[2].setNombreJugador("Victor Martinez");

        Equipo equipo []={equipo1,equipo2};
        Juego juego1 = new Juego();
        juego1.setEquipoLocal(equipo[0]);
        juego1.setEquipoFuera(equipo[1]);
        
        Gol gol1= new Gol();
        
        gol1.setElJugador(juego1.getEquipoLocal().getArrayJug()[2]);
        gol1.setElEquipo(juego1.getEquipoLocal());
        gol1.setElTiempo(55);
        
        Gol[] losGoles = {gol1};
        juego1.setGoles(losGoles);
        
        
        System.out.println("Los goles antes de los "+gol1.getElTiempo()+ " minutos fueron de "
               +juego1.getGoles()[0].getElJugador().getNombreJugador()+" del equipo "+
                juego1.getGoles()[0].getElEquipo().getNombreEquipo()
                );
       

    }

}
