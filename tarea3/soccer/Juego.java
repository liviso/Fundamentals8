

package tarea3.soccer;


public class Juego {
    
    private Equipo equipoLocal;
    private Equipo equipoFuera;
    private Gol[] goles;
    
    public void playGame(int maxGoals) {
        Gol[] theGoals = new Gol[maxGoals];
        this.setGoles(theGoals);      
    }
    
    public void playGame() {
       
    }
    
    

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoFuera() {
        return equipoFuera;
    }

    public void setEquipoFuera(Equipo equipoFuera) {
        this.equipoFuera = equipoFuera;
    }

    public Gol[] getGoles() {
        return goles;
    }

    public void setGoles(Gol[] goles) {
        this.goles = goles;
    }

 
      
}
