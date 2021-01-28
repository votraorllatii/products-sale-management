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

@Entity
@Table(name = "Stoku", catalog = "BPDS", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stoku.findAll", query = "SELECT s FROM Stoku s"),
    @NamedQuery(name = "Stoku.findByStokuID", query = "SELECT s FROM Stoku s WHERE s.stokuID = :stokuID"),
    @NamedQuery(name = "Stoku.findByCope", query = "SELECT s FROM Stoku s WHERE s.cope = :cope"),
    @NamedQuery(name = "Stoku.findByDataSkadencesProd", query = "SELECT s FROM Stoku s WHERE s.dataSkadencesProd = :dataSkadencesProd")})
public class Stoku implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Stoku_ID", nullable = false)
    private Integer stokuID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Cope", nullable = false, precision = 12, scale = 1)
    private BigDecimal cope;
    @Column(name = "DataSkadencesProd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSkadencesProd;
    @JoinColumn(name = "Produkti_ID", referencedColumnName = "Produkti_ID", nullable = false)
    @ManyToOne(optional = false)
    private Produkti produktiID;

    public Stoku() {
    }

    public Stoku(Integer stokuID) {
        this.stokuID = stokuID;
    }

    public Stoku(Integer stokuID, BigDecimal cope) {
        this.stokuID = stokuID;
        this.cope = cope;
    }

    public Integer getStokuID() {
        return stokuID;
    }

    public void setStokuID(Integer stokuID) {
        this.stokuID = stokuID;
    }

    public BigDecimal getCope() {
        return cope;
    }

    public void setCope(BigDecimal cope) {
        this.cope = cope;
    }

    public Date getDataSkadencesProd() {
        return dataSkadencesProd;
    }

    public void setDataSkadencesProd(Date dataSkadencesProd) {
        this.dataSkadencesProd = dataSkadencesProd;
    }

    public Produkti getProduktiID() {
        return produktiID;
    }

    public void setProduktiID(Produkti produktiID) {
        this.produktiID = produktiID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stokuID != null ? stokuID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stoku)) {
            return false;
        }
        Stoku other = (Stoku) object;
        if ((this.stokuID == null && other.stokuID != null) || (this.stokuID != null && !this.stokuID.equals(other.stokuID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StokuID: " + stokuID ;
    }
    
}
