/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.tarea.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table(name = "TORNEO")
@NamedQueries({
    @NamedQuery(name = "Torneo.findAll", query = "SELECT t FROM Torneo t"),
    @NamedQuery(name = "Torneo.findByTequipId", query = "SELECT t FROM Torneo t WHERE t.torneoPK.tequipId = :tequipId"),
    @NamedQuery(name = "Torneo.findByTdeporId", query = "SELECT t FROM Torneo t WHERE t.torneoPK.tdeporId = :tdeporId")})
public class Torneo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TorneoPK torneoPK;
    @JoinColumn(name = "TDEPOR_ID", referencedColumnName = "TDEPOR_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Deportes torDeportes;
    @JoinColumn(name = "TEQUIP_ID", referencedColumnName = "TEQUIP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Equipos torEquipos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "torneo", fetch = FetchType.LAZY)
    private List<TTorneo> torTorneoList;

    public Torneo() {
    }

    public Torneo(TorneoPK torneoPK) {
        this.torneoPK = torneoPK;
    }

    public Torneo(BigInteger tequipId, BigInteger tdeporId) {
        this.torneoPK = new TorneoPK(tequipId, tdeporId);
    }

    public TorneoPK getTorneoPK() {
        return torneoPK;
    }

    public void setTorneoPK(TorneoPK torneoPK) {
        this.torneoPK = torneoPK;
    }

    public Deportes getTorDeportes() {
        return torDeportes;
    }

    public void setTorDeportes(Deportes torDeportes) {
        this.torDeportes = torDeportes;
    }

    public Equipos getTorEquipos() {
        return torEquipos;
    }

    public void setTorEquipos(Equipos torEquipos) {
        this.torEquipos = torEquipos;
    }

    public List<TTorneo> getTorTorneoList() {
        return torTorneoList;
    }

    public void setTorTorneoList(List<TTorneo> torTorneoList) {
        this.torTorneoList = torTorneoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (torneoPK != null ? torneoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Torneo)) {
            return false;
        }
        Torneo other = (Torneo) object;
        if ((this.torneoPK == null && other.torneoPK != null) || (this.torneoPK != null && !this.torneoPK.equals(other.torneoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.tarea.model.Torneo[ torneoPK=" + torneoPK + " ]";
    }
    
}
