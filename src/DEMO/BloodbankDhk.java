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
@Table(name = "bloodbank_dhk", catalog = "dhaka", schema = "")
@NamedQueries({
    @NamedQuery(name = "BloodbankDhk.findAll", query = "SELECT b FROM BloodbankDhk b")
    , @NamedQuery(name = "BloodbankDhk.findByName", query = "SELECT b FROM BloodbankDhk b WHERE b.name = :name")
    , @NamedQuery(name = "BloodbankDhk.findByAddress", query = "SELECT b FROM BloodbankDhk b WHERE b.address = :address")
    , @NamedQuery(name = "BloodbankDhk.findByType", query = "SELECT b FROM BloodbankDhk b WHERE b.type = :type")
    , @NamedQuery(name = "BloodbankDhk.findByContact", query = "SELECT b FROM BloodbankDhk b WHERE b.contact = :contact")})
public class BloodbankDhk implements Serializable {

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

    public BloodbankDhk() {
    }

    public BloodbankDhk(String name) {
        this.name = name;
    }

    public BloodbankDhk(String name, String address, String type, String contact) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.contact = contact;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BloodbankDhk)) {
            return false;
        }
        BloodbankDhk other = (BloodbankDhk) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DEMO.BloodbankDhk[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
