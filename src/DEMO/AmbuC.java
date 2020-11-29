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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ambu_c")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AmbuC.findAll", query = "SELECT a FROM AmbuC a")
    , @NamedQuery(name = "AmbuC.findByName", query = "SELECT a FROM AmbuC a WHERE a.name = :name")
    , @NamedQuery(name = "AmbuC.findByLocation", query = "SELECT a FROM AmbuC a WHERE a.location = :location")
    , @NamedQuery(name = "AmbuC.findByTypes", query = "SELECT a FROM AmbuC a WHERE a.types = :types")
    , @NamedQuery(name = "AmbuC.findByContact", query = "SELECT a FROM AmbuC a WHERE a.contact = :contact")
    , @NamedQuery(name = "AmbuC.findByService", query = "SELECT a FROM AmbuC a WHERE a.service = :service")})
public class AmbuC implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Location")
    private String location;
    @Basic(optional = false)
    @Column(name = "Types")
    private String types;
    @Column(name = "Contact")
    private String contact;
    @Column(name = "Service")
    private String service;

    public AmbuC() {
    }

    public AmbuC(String name) {
        this.name = name;
    }

    public AmbuC(String name, String location, String types) {
        this.name = name;
        this.location = location;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        String oldTypes = this.types;
        this.types = types;
        changeSupport.firePropertyChange("types", oldTypes, types);
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
        if (!(object instanceof AmbuC)) {
            return false;
        }
        AmbuC other = (AmbuC) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DEMO.AmbuC[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
