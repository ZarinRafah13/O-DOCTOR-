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
@Table(name = "coh_c", catalog = "ctg_hos", schema = "")
@NamedQueries({
    @NamedQuery(name = "CohC.findAll", query = "SELECT c FROM CohC c")
    , @NamedQuery(name = "CohC.findByName", query = "SELECT c FROM CohC c WHERE c.name = :name")
    , @NamedQuery(name = "CohC.findByAddress", query = "SELECT c FROM CohC c WHERE c.address = :address")
    , @NamedQuery(name = "CohC.findByContact", query = "SELECT c FROM CohC c WHERE c.contact = :contact")
    , @NamedQuery(name = "CohC.findByService", query = "SELECT c FROM CohC c WHERE c.service = :service")})
public class CohC implements Serializable {

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
    @Column(name = "Service")
    private String service;

    public CohC() {
    }

    public CohC(String name) {
        this.name = name;
    }

    public CohC(String name, String address, String contact, String service) {
        this.name = name;
        this.address = address;
        this.contact = contact;
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
        if (!(object instanceof CohC)) {
            return false;
        }
        CohC other = (CohC) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DEMO.CohC[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
