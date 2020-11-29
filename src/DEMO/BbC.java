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
@Table(name = "bb_c")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BbC.findAll", query = "SELECT b FROM BbC b")
    , @NamedQuery(name = "BbC.findByName", query = "SELECT b FROM BbC b WHERE b.name = :name")
    , @NamedQuery(name = "BbC.findByBloodgroup", query = "SELECT b FROM BbC b WHERE b.bloodgroup = :bloodgroup")
    , @NamedQuery(name = "BbC.findByContact", query = "SELECT b FROM BbC b WHERE b.contact = :contact")
    , @NamedQuery(name = "BbC.findByService", query = "SELECT b FROM BbC b WHERE b.service = :service")})
public class BbC implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Column(name = "Blood_group")
    private String bloodgroup;
    @Column(name = "Contact")
    private String contact;
    @Column(name = "Service")
    private String service;

    public BbC() {
    }

    public BbC(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        String oldBloodgroup = this.bloodgroup;
        this.bloodgroup = bloodgroup;
        changeSupport.firePropertyChange("bloodgroup", oldBloodgroup, bloodgroup);
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
        if (!(object instanceof BbC)) {
            return false;
        }
        BbC other = (BbC) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DEMO.BbC[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
