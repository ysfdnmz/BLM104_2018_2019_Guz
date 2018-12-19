/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alinizam
 */
@Entity
@Table(name = "UNVAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unvan.findAll", query = "SELECT u FROM Unvan u")
    , @NamedQuery(name = "Unvan.findByUnvanId", query = "SELECT u FROM Unvan u WHERE u.unvanId = :unvanId")
    , @NamedQuery(name = "Unvan.findByUnvanAdi", query = "SELECT u FROM Unvan u WHERE u.unvanAdi = :unvanAdi")})
public class Unvan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UNVAN_ID")
    private Integer unvanId;
    @Column(name = "UNVAN_ADI")
    private String unvanAdi;

    public Unvan() {
    }

    public Unvan(Integer unvanId) {
        this.unvanId = unvanId;
    }

    public Integer getUnvanId() {
        return unvanId;
    }

    public void setUnvanId(Integer unvanId) {
        this.unvanId = unvanId;
    }

    public String getUnvanAdi() {
        return unvanAdi;
    }

    public void setUnvanAdi(String unvanAdi) {
        this.unvanAdi = unvanAdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unvanId != null ? unvanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unvan)) {
            return false;
        }
        Unvan other = (Unvan) object;
        if ((this.unvanId == null && other.unvanId != null) || (this.unvanId != null && !this.unvanId.equals(other.unvanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders13.Unvan[ unvanId=" + unvanId + " ]";
    }
    
}
