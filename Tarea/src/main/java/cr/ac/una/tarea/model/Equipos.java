/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.tarea.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table(name = "TOR_EQUIPOS")
@NamedQueries({
    @NamedQuery(name = "TorEquipos.findAll", query = "SELECT t FROM TorEquipos t"),
    @NamedQuery(name = "TorEquipos.findByTequipId", query = "SELECT t FROM TorEquipos t WHERE t.tequipId = :tequipId"),
    @NamedQuery(name = "TorEquipos.findByTequipNombre", query = "SELECT t FROM TorEquipos t WHERE t.tequipNombre = :tequipNombre"),
    @NamedQuery(name = "TorEquipos.findByTequipGolafavor", query = "SELECT t FROM TorEquipos t WHERE t.tequipGolafavor = :tequipGolafavor"),
    @NamedQuery(name = "TorEquipos.findByTequipGolencontra", query = "SELECT t FROM TorEquipos t WHERE t.tequipGolencontra = :tequipGolencontra"),
    @NamedQuery(name = "TorEquipos.findByTequipWins", query = "SELECT t FROM TorEquipos t WHERE t.tequipWins = :tequipWins"),
    @NamedQuery(name = "TorEquipos.findByTequipLoses", query = "SELECT t FROM TorEquipos t WHERE t.tequipLoses = :tequipLoses")})
public class Equipos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TEQUIP_ID")
    private BigDecimal tequipId;
    @Basic(optional = false)
    @Column(name = "TEQUIP_NOMBRE")
    private String tequipNombre;
    @Lob
    @Column(name = "TEQUIP_IMG")
    private String tequipImg;
    @Column(name = "TEQUIP_GOLAFAVOR")
    private BigInteger tequipGolafavor;
    @Column(name = "TEQUIP_GOLENCONTRA")
    private BigInteger tequipGolencontra;
    @Column(name = "TEQUIP_WINS")
    private BigInteger tequipWins;
    @Column(name = "TEQUIP_LOSES")
    private BigInteger tequipLoses;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "torEquipos", fetch = FetchType.LAZY)
    private List<Torneo> torneoList;

    public Equipos() {
    }

    public Equipos(BigDecimal tequipId) {
        this.tequipId = tequipId;
    }

    public Equipos(BigDecimal tequipId, String tequipNombre) {
        this.tequipId = tequipId;
        this.tequipNombre = tequipNombre;
    }

    public BigDecimal getTequipId() {
        return tequipId;
    }

    public void setTequipId(BigDecimal tequipId) {
        this.tequipId = tequipId;
    }

    public String getTequipNombre() {
        return tequipNombre;
    }

    public void setTequipNombre(String tequipNombre) {
        this.tequipNombre = tequipNombre;
    }

    public String getTequipImg() {
        return tequipImg;
    }

    public void setTequipImg(String tequipImg) {
        this.tequipImg = tequipImg;
    }

    public BigInteger getTequipGolafavor() {
        return tequipGolafavor;
    }

    public void setTequipGolafavor(BigInteger tequipGolafavor) {
        this.tequipGolafavor = tequipGolafavor;
    }

    public BigInteger getTequipGolencontra() {
        return tequipGolencontra;
    }

    public void setTequipGolencontra(BigInteger tequipGolencontra) {
        this.tequipGolencontra = tequipGolencontra;
    }

    public BigInteger getTequipWins() {
        return tequipWins;
    }

    public void setTequipWins(BigInteger tequipWins) {
        this.tequipWins = tequipWins;
    }

    public BigInteger getTequipLoses() {
        return tequipLoses;
    }

    public void setTequipLoses(BigInteger tequipLoses) {
        this.tequipLoses = tequipLoses;
    }

    public List<Torneo> getTorneoList() {
        return torneoList;
    }

    public void setTorneoList(List<Torneo> torneoList) {
        this.torneoList = torneoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tequipId != null ? tequipId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipos)) {
            return false;
        }
        Equipos other = (Equipos) object;
        if ((this.tequipId == null && other.tequipId != null) || (this.tequipId != null && !this.tequipId.equals(other.tequipId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.tarea.model.TorEquipos[ tequipId=" + tequipId + " ]";
    }
    
}
