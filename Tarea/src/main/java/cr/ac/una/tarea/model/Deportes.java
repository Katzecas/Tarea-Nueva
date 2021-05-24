/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.tarea.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TOR_DEPORTES")
@NamedQueries({
    @NamedQuery(name = "TorDeportes.findAll", query = "SELECT t FROM TorDeportes t"),
    @NamedQuery(name = "TorDeportes.findByTdeporId", query = "SELECT t FROM TorDeportes t WHERE t.tdeporId = :tdeporId"),
    @NamedQuery(name = "TorDeportes.findByTdeporNombre", query = "SELECT t FROM TorDeportes t WHERE t.tdeporNombre = :tdeporNombre")})
public class Deportes implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TDEPOR_ID")
    private BigDecimal tdeporId;
    @Basic(optional = false)
    @Column(name = "TDEPOR_NOMBRE")
    private String tdeporNombre;
    @Lob
    @Column(name = "TDEPOR_IMGD")
    private String tdeporImgd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "torDeportes", fetch = FetchType.LAZY)
    private List<Torneo> torneoList;

    public Deportes() {
    }

    public Deportes(BigDecimal tdeporId) {
        this.tdeporId = tdeporId;
    }

    public Deportes(BigDecimal tdeporId, String tdeporNombre) {
        this.tdeporId = tdeporId;
        this.tdeporNombre = tdeporNombre;
    }

    public BigDecimal getTdeporId() {
        return tdeporId;
    }

    public void setTdeporId(BigDecimal tdeporId) {
        this.tdeporId = tdeporId;
    }

    public String getTdeporNombre() {
        return tdeporNombre;
    }

    public void setTdeporNombre(String tdeporNombre) {
        this.tdeporNombre = tdeporNombre;
    }

    public String getTdeporImgd() {
        return tdeporImgd;
    }

    public void setTdeporImgd(String tdeporImgd) {
        this.tdeporImgd = tdeporImgd;
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
        hash += (tdeporId != null ? tdeporId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deportes)) {
            return false;
        }
        Deportes other = (Deportes) object;
        if ((this.tdeporId == null && other.tdeporId != null) || (this.tdeporId != null && !this.tdeporId.equals(other.tdeporId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.tarea.model.TorDeportes[ tdeporId=" + tdeporId + " ]";
    }
    
}
