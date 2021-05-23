/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.tarea.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table(name = "TOR_TORNEO")
@NamedQueries({
    @NamedQuery(name = "TorTorneo.findAll", query = "SELECT t FROM TorTorneo t"),
    @NamedQuery(name = "TorTorneo.findByTtorneoId", query = "SELECT t FROM TorTorneo t WHERE t.torTorneoPK.ttorneoId = :ttorneoId"),
    @NamedQuery(name = "TorTorneo.findByTtorneoNombre", query = "SELECT t FROM TorTorneo t WHERE t.ttorneoNombre = :ttorneoNombre"),
    @NamedQuery(name = "TorTorneo.findByTequipId", query = "SELECT t FROM TorTorneo t WHERE t.torTorneoPK.tequipId = :tequipId"),
    @NamedQuery(name = "TorTorneo.findByTdeporId", query = "SELECT t FROM TorTorneo t WHERE t.torTorneoPK.tdeporId = :tdeporId")})
public class TTorneo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TorTorneoPK torTorneoPK;
    @Basic(optional = false)
    @Column(name = "TTORNEO_NOMBRE")
    private String ttorneoNombre;
    @JoinColumns({
        @JoinColumn(name = "TEQUIP_ID", referencedColumnName = "TEQUIP_ID", insertable = false, updatable = false),
        @JoinColumn(name = "TDEPOR_ID", referencedColumnName = "TDEPOR_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Torneo torneo;

    public TTorneo() {
    }

    public TTorneo(TorTorneoPK torTorneoPK) {
        this.torTorneoPK = torTorneoPK;
    }

    public TTorneo(TorTorneoPK torTorneoPK, String ttorneoNombre) {
        this.torTorneoPK = torTorneoPK;
        this.ttorneoNombre = ttorneoNombre;
    }

    public TTorneo(BigInteger ttorneoId, BigInteger tequipId, BigInteger tdeporId) {
        this.torTorneoPK = new TorTorneoPK(ttorneoId, tequipId, tdeporId);
    }

    public TorTorneoPK getTorTorneoPK() {
        return torTorneoPK;
    }

    public void setTorTorneoPK(TorTorneoPK torTorneoPK) {
        this.torTorneoPK = torTorneoPK;
    }

    public String getTtorneoNombre() {
        return ttorneoNombre;
    }

    public void setTtorneoNombre(String ttorneoNombre) {
        this.ttorneoNombre = ttorneoNombre;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (torTorneoPK != null ? torTorneoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTorneo)) {
            return false;
        }
        TTorneo other = (TTorneo) object;
        if ((this.torTorneoPK == null && other.torTorneoPK != null) || (this.torTorneoPK != null && !this.torTorneoPK.equals(other.torTorneoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.tarea.model.TorTorneo[ torTorneoPK=" + torTorneoPK + " ]";
    }
    
}
