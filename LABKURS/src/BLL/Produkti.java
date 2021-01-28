/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "Produkti", catalog = "BPDS", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Produkti_ID"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produkti.findAll", query = "SELECT p FROM Produkti p"),
    @NamedQuery(name = "Produkti.findByProduktiID", query = "SELECT p FROM Produkti p WHERE p.produktiID = :produktiID"),
    @NamedQuery(name = "Produkti.findByEmri", query = "SELECT p FROM Produkti p WHERE p.emri = :emri"),
    @NamedQuery(name = "Produkti.findByCmimi", query = "SELECT p FROM Produkti p WHERE p.cmimi = :cmimi"),
    @NamedQuery(name = "Produkti.findByBarkodi", query = "SELECT p FROM Produkti p WHERE p.barkodi = :barkodi"),
    @NamedQuery(name = "Produkti.findByCope", query = "SELECT p FROM Produkti p WHERE p.cope = :cope")})
public class Produkti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Produkti_ID", nullable = false)
    private Integer produktiID;
    @Basic(optional = false)
    @Column(name = "Emri", nullable = false, length = 70)
    private String emri;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Cmimi", nullable = false, precision = 5, scale = 2)
    private BigDecimal cmimi;
    @Basic(optional = false)
    @Column(name = "Barkodi", nullable = false)
    private int barkodi;
    @Basic(optional = false)
    @Column(name = "Cope", nullable = false, precision = 5, scale = 1)
    private BigDecimal cope;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produktiID")
    private Collection<FaturaHyrese> faturaHyreseCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produktiID")
    private Collection<Stoku> stokuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produktiID")
    private Collection<Faktura> fakturaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produktiID")
    private Collection<Porosia> porosiaCollection;

    public Produkti() {
    }

    public Produkti(Integer produktiID) {
        this.produktiID = produktiID;
    }

    public Produkti(Integer produktiID, String emri, BigDecimal cmimi, int barkodi, BigDecimal cope) {
        this.produktiID = produktiID;
        this.emri = emri;
        this.cmimi = cmimi;
        this.barkodi = barkodi;
        this.cope = cope;
    }

    public Integer getProduktiID() {
        return produktiID;
    }

    public void setProduktiID(Integer produktiID) {
        this.produktiID = produktiID;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public BigDecimal getCmimi() {
        return cmimi;
    }

    public void setCmimi(BigDecimal cmimi) {
        this.cmimi = cmimi;
    }

    public int getBarkodi() {
        return barkodi;
    }

    public void setBarkodi(int barkodi) {
        this.barkodi = barkodi;
    }

    public BigDecimal getCope() {
        return cope;
    }

    public void setCope(BigDecimal cope) {
        this.cope = cope;
    }

    @XmlTransient
    public Collection<FaturaHyrese> getFaturaHyreseCollection() {
        return faturaHyreseCollection;
    }

    public void setFaturaHyreseCollection(Collection<FaturaHyrese> faturaHyreseCollection) {
        this.faturaHyreseCollection = faturaHyreseCollection;
    }

    @XmlTransient
    public Collection<Stoku> getStokuCollection() {
        return stokuCollection;
    }

    public void setStokuCollection(Collection<Stoku> stokuCollection) {
        this.stokuCollection = stokuCollection;
    }

    @XmlTransient
    public Collection<Faktura> getFakturaCollection() {
        return fakturaCollection;
    }

    public void setFakturaCollection(Collection<Faktura> fakturaCollection) {
        this.fakturaCollection = fakturaCollection;
    }

    @XmlTransient
    public Collection<Porosia> getPorosiaCollection() {
        return porosiaCollection;
    }

    public void setPorosiaCollection(Collection<Porosia> porosiaCollection) {
        this.porosiaCollection = porosiaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produktiID != null ? produktiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produkti)) {
            return false;
        }
        Produkti other = (Produkti) object;
        if ((this.produktiID == null && other.produktiID != null) || (this.produktiID != null && !this.produktiID.equals(other.produktiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produkti: " + emri ;
    }
    
}
