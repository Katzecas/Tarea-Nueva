/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.tarea.model;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Administrador
 */
public class EquipoDto extends TorneoDto 
{
    //private boolean participacion=false;//para saber si el equipo participo
    
    public SimpleStringProperty rank;           //ranking global para los equipos
    public SimpleStringProperty puesto;         //puesto obtenido en el torneo
    public SimpleStringProperty wins;           //almacena los ganes 
    public SimpleStringProperty loses;          //almacena las perdidas
    public SimpleStringProperty puntos;         //puntos obtenidos durante el torneo para el ranking
    public SimpleStringProperty anotRea;        //goles anotados;
    public SimpleStringProperty anotRec;        //Goles recividos;
   // public SimpleStringProperty anotacionT1;    //anotaciones durante el partido equipo 1
    //public SimpleStringProperty anotacionT2;    //anotaciones durante el partido equipo 2

    
    
    
public EquipoDto()
{
    
    this.rank = new SimpleStringProperty();
    this.puesto = new SimpleStringProperty();
    this.wins  =new SimpleStringProperty();
    this.loses = new SimpleStringProperty();
    this.puntos = new SimpleStringProperty();
    this.anotRea= new SimpleStringProperty();
    this.anotRec =new SimpleStringProperty();
   // this.anotacionT1 =new SimpleStringProperty();
    //this.anotacionT2 =new SimpleStringProperty();

    
}

public EquipoDto(SimpleStringProperty rank, SimpleStringProperty puesto, SimpleStringProperty wins, 
                 SimpleStringProperty loses, SimpleStringProperty puntos,SimpleStringProperty anotRea,
                 SimpleStringProperty anotRec, SimpleStringProperty id, SimpleStringProperty nombre)
{
    super(id, nombre);
    
    this.rank = rank;
    this.puesto = puesto; 
    this.wins= wins;
    this.loses = loses;
    this.puntos = puntos;
    this.anotRea= anotRea;
    this.anotRec = anotRec;
    
    
}

    public String getRank() {
        return rank.get();
    }

    public void setRank(String rank) {
        this.rank.setValue(rank.toString());
    }

    public String getPuesto() {
        return puesto.get();
    }

    public void setPuesto(SimpleStringProperty puesto) {
        this.puesto.setValue(puesto.toString());
    }

    public String getWins() {
        return wins.get();
    }

    public void setWins(SimpleStringProperty wins) {
        this.wins.setValue(wins.toString());
    }

    public String getLoses() {
        return loses.get();
    }

    public void setLoses(SimpleStringProperty loses) {
        this.loses.setValue(loses.toString());
    }

    public String getPuntos() {
        return puntos.get();
    }

    public void setPuntos(SimpleStringProperty puntos) {
        this.puntos.setValue(puntos.toString());
    }

    public String getAnotRea() {
        return anotRea.get();
    }

    public void setAnotRea(SimpleStringProperty anotRea) {
        this.anotRea.setValue(anotRea.toString());
    }

    public String getAnotRec() {
        return anotRec.get();
    }

    public void setAnotRec(SimpleStringProperty anotRec) {
        this.anotRec.setValue(anotRec.toString());
    }

    
    
    
    
    
    
    
    
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("ID equipo{id=").append(id.get());
        sb.append(", Nombre Equipo=").append(nombre.get());
        sb.append(", Partidos Ganados=").append(wins.get());
        sb.append(", Partidos Perdidos=").append(loses.get());
        sb.append(", Puntos =").append(puntos.get());
        sb.append(", Anotaciones Realizados=").append(anotRea.get());
        sb.append(", Anotaciones Recibidos=").append(anotRec.get());
        sb.append('}');
        return sb.toString();
    }
    
}