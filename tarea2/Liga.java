package lession6.Soccer;

public class Liga {

    public static void main(String[] args) {

        Equipo equipo1 = new Equipo();
        equipo1.nombreEquipo = "Los Pesado";

        Jugador jugador1 = new Jugador();
        jugador1.nombreJugador = "Jorge Mendoza";

        Jugador jugador2 = new Jugador();
        jugador2.nombreJugador = "Raul Castillo";

        Jugador jugador3 = new Jugador();
        jugador3.nombreJugador = "Maricela Noguez";

        Jugador[] jugadores = {jugador1, jugador2, jugador3};

        equipo1.arrayJug = jugadores;

        //Equipo 2
        Equipo equipo2 = new Equipo();
        equipo2.nombreEquipo = "Los Genios";
        equipo2.arrayJug = new Jugador[3];

        equipo2.arrayJug[0] = new Jugador();
        equipo2.arrayJug[0].nombreJugador = "Lalo Santos";

        equipo2.arrayJug[1] = new Jugador();
        equipo2.arrayJug[1].nombreJugador = "Mario Noguez";

        equipo2.arrayJug[2] = new Jugador();
        equipo2.arrayJug[2].nombreJugador = "Victor Martinez";

        Juego juego1 = new Juego();
        juego1.equipoLocal = equipo1;
        juego1.equipoFuera = equipo2;

        Gol gol1 = new Gol();
        //Anoto gol el jugador en la posicion [2] del equipoLocal
        gol1.elJugador = juego1.equipoLocal.arrayJug[2];
        gol1.elEquipo = juego1.equipoLocal;
        gol1.elTiempo = 55;

        Gol[] losGoles = {gol1};
        juego1.goles = losGoles;

        System.out.println("Los goles antes: " + juego1.goles[0].elTiempo + " minutos "
                + juego1.goles[0].elJugador.nombreJugador + " de "
                + juego1.goles[0].elEquipo.nombreEquipo
        );

        //Buscando el nombre de un jugador en el Equipo2, busca por cada posición del arreglo
        for (Jugador jugador : equipo2.arrayJug) {
            // if(jugadore.nombreJugador.matches(".*Martinez.*"))
            if (jugador.nombreJugador.contains("Victor Martinez")) {
                System.out.print("Lo encontro \n");
            }
//                else{
//                System.out.println("No lo encontro");
//            }
        }

    }
}
