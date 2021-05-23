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
public abstract class TorneoDto 
{
 public SimpleStringProperty id;
 public SimpleStringProperty nombre;
 
 
 public TorneoDto()
{
    this.id = new SimpleStringProperty();
    this.nombre = new SimpleStringProperty();

}

    public Long getId()
    {
        
        if(id.get()!= null && !id.get().isEmpty())
        {
            return Long.valueOf(id.get());
        }
        else
        {
            return null;
        }   
        
    }

    public void setId(SimpleStringProperty id)
    {
        this.id.setValue(id.toString());
    }

    public String getNombre() 
    {
        return nombre.get();
    }

    public void setNombre(SimpleStringProperty nombre)
    {
        this.nombre.setValue(nombre.toString());
    }
 
 
 
 @Override
 public abstract String toString();
 
 
 
    
}


