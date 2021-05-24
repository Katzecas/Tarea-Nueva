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
import javax.persistence.Embeddable;

/**
 *
 * @author David
 */
@Embeddable
public class TorneoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TEQUIP_ID")
    private BigInteger tequipId;
    @Basic(optional = false)
    @Column(name = "TDEPOR_ID")
    private BigInteger tdeporId;

    public TorneoPK() {
    }

    public TorneoPK(BigInteger tequipId, BigInteger tdeporId) {
        this.tequipId = tequipId;
        this.tdeporId = tdeporId;
    }

    public BigInteger getTequipId() {
        return tequipId;
    }

    public void setTequipId(BigInteger tequipId) {
        this.tequipId = tequipId;
    }

    public BigInteger getTdeporId() {
        return tdeporId;
    }

    public void setTdeporId(BigInteger tdeporId) {
        this.tdeporId = tdeporId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tequipId != null ? tequipId.hashCode() : 0);
        hash += (tdeporId != null ? tdeporId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TorneoPK)) {
            return false;
        }
        TorneoPK other = (TorneoPK) object;
        if ((this.tequipId == null && other.tequipId != null) || (this.tequipId != null && !this.tequipId.equals(other.tequipId))) {
            return false;
        }
        if ((this.tdeporId == null && other.tdeporId != null) || (this.tdeporId != null && !this.tdeporId.equals(other.tdeporId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.tarea.model.TorneoPK[ tequipId=" + tequipId + ", tdeporId=" + tdeporId + " ]";
    }
    
}
