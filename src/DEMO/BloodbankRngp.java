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
@Table(name = "bloodbank_rngp", catalog = "rngpur", schema = "")
@NamedQueries({
    @NamedQuery(name = "BloodbankRngp.findAll", query = "SELECT b FROM BloodbankRngp b")
    , @NamedQuery(name = "BloodbankRngp.findByName", query = "SELECT b FROM BloodbankRngp b WHERE b.name = :name")
    , @NamedQuery(name = "BloodbankRngp.findByAddress", query = "SELECT b FROM BloodbankRngp b WHERE b.address = :address")
    , @NamedQuery(name = "BloodbankRngp.findByType", query = "SELECT b FROM BloodbankRngp b WHERE b.type = :type")
    , @NamedQuery(name = "BloodbankRngp.findByContact", query = "SELECT b FROM BloodbankRngp b WHERE b.contact = :contact")
    , @NamedQuery(name = "BloodbankRngp.findByService", query = "SELECT b FROM BloodbankRngp b WHERE b.service = :service")})
public class BloodbankRngp implements Serializable {

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
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @Column(name = "Contact")
    private String contact;
    @Basic(optional = false)
    @Column(name = "Service")
    private String service;

    public BloodbankRngp() {
    }

    public BloodbankRngp(String name) {
        this.name = name;
    }

    public BloodbankRngp(String name, String address, String type, String contact, String service) {
        this.name = name;
        this.address = address;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
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
        if (!(object instanceof BloodbankRngp)) {
            return false;
        }
        BloodbankRngp other = (BloodbankRngp) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DEMO.BloodbankRngp[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}