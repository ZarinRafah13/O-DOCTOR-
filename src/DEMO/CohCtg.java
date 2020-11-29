/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DEMO;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "coh_ctg", catalog = "chittagong", schema = "")
@NamedQueries({
    @NamedQuery(name = "CohCtg.findAll", query = "SELECT c FROM CohCtg c")
    , @NamedQuery(name = "CohCtg.findByName", query = "SELECT c FROM CohCtg c WHERE c.name = :name")
    , @NamedQuery(name = "CohCtg.findByAddress", query = "SELECT c FROM CohCtg c WHERE c.address = :address")
    , @NamedQuery(name = "CohCtg.findByContact", query = "SELECT c FROM CohCtg c WHERE c.contact = :contact")
    , @NamedQuery(name = "CohCtg.findByBed", query = "SELECT c FROM CohCtg c WHERE c.bed = :bed")
    , @NamedQuery(name = "CohCtg.findByService", query = "SELECT c FROM CohCtg c WHERE c.service = :service")})
public class CohCtg implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Contact")
    private String contact;
    @Basic(optional = false)
    @Column(name = "Bed")
    private String bed;
    @Basic(optional = false)
    @Column(name = "Service")
    private String service;

    public CohCtg() {
    }

    public CohCtg(String name) {
        this.name = name;
    }

    public CohCtg(String name, String address, String contact, String bed, String service) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.bed = bed;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        String oldBed = this.bed;
        this.bed = bed;
        changeSupport.firePropertyChange("bed", oldBed, bed);
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        String oldService = this.service;
        this.service = service;
        changeSupport.firePropertyChange("service", oldService, service);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CohCtg)) {
            return false;
        }
        CohCtg other = (CohCtg) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DEMO.CohCtg[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}