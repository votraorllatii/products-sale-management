/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "Porosite", catalog = "BPDS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Porosite.findAll", query = "SELECT p FROM Porosite p"),
    @NamedQuery(name = "Porosite.findByPorositeId", query = "SELECT p FROM Porosite p WHERE p.porositeId = :porositeId"),
    @NamedQuery(name = "Porosite.findByData", query = "SELECT p FROM Porosite p WHERE p.data = :data"),
    @NamedQuery(name = "Porosite.findBySasia", query = "SELECT p FROM Porosite p WHERE p.sasia = :sasia"),
    @NamedQuery(name = "Porosite.findByTotali", query = "SELECT p FROM Porosite p WHERE p.totali = :totali")})
public class Porosite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PorositeId", nullable = false)
    private Integer porositeId;
    @Basic(optional = false)
    @Column(name = "Data", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Basic(optional = false)
    @Column(name = "Sasia", nullable = false)
    private int sasia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Totali", nullable = false, precision = 12, scale = 1)
    private BigDecimal totali;
    @JoinColumn(name = "Biznesi_ID", referencedColumnName = "Biznesi_ID", nullable = false)
    @ManyToOne(optional = false)
    private Biznesi biznesiID;

    public Porosite() {
    }

    public Porosite(Integer porositeId) {
        this.porositeId = porositeId;
    }

    public Porosite(Integer porositeId, Date data, int sasia, BigDecimal totali) {
        this.porositeId = porositeId;
        this.data = data;
        this.sasia = sasia;
        this.totali = totali;
    }

    public Integer getPorositeId() {
        return porositeId;
    }

    public void setPorositeId(Integer porositeId) {
        this.porositeId = porositeId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getSasia() {
        return sasia;
    }

    public void setSasia(int sasia) {
        this.sasia = sasia;
    }

    public BigDecimal getTotali() {
        return totali;
    }

    public void setTotali(BigDecimal totali) {
        this.totali = totali;
    }

    public Biznesi getBiznesiID() {
        return biznesiID;
    }

    public void setBiznesiID(Biznesi biznesiID) {
        this.biznesiID = biznesiID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (porositeId != null ? porositeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Porosite)) {
            return false;
        }
        Porosite other = (Porosite) object;
        if ((this.porositeId == null && other.porositeId != null) || (this.porositeId != null && !this.porositeId.equals(other.porositeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PorositeId: " + porositeId ;
    }
    
}
