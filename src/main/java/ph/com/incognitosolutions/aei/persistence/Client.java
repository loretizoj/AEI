/*
 * INCOGNITO CONFIDENTIAL 
 * 
 * [2018] Incognito Solutions 
 * All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of Incognito Solutions and its client.
 * The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated
 * and its client and may be covered by U.S. and Foreign Patents
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Incognito Solutions.
 */
package ph.com.incognitosolutions.aei.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author loretizoj
 */
@Entity(name = "CLIENT")
@Table(name = "CLIENT")
public class Client extends AuditTrail implements Serializable{

    private static final long serialVersionUID = 2L;
    
    @Column
    private String idNumber;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthdate;
    @Column
    private String address;
    @Column
    private String governmentId;
    @Column
    private String idType;
    @Column
    private String contactNumber;
    @Column
    private String civilStatus;
    @Column
    private String spouseName;
    @Column
    private String spouseGovernmentId;
    @Column
    private String spouseIdType;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();
    
    /**
     * @return the idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the governmentId
     */
    public String getGovernmentId() {
        return governmentId;
    }

    /**
     * @param governmentId the governmentId to set
     */
    public void setGovernmentId(String governmentId) {
        this.governmentId = governmentId;
    }

    /**
     * @return the idType
     */
    public String getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the civilStatus
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * @param civilStatus the civilStatus to set
     */
    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    /**
     * @return the spouseName
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * @param spouseName the spouseName to set
     */
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    /**
     * @return the spouseGovernmentId
     */
    public String getSpouseGovernmentId() {
        return spouseGovernmentId;
    }

    /**
     * @param spouseGovernmentId the spouseGovernmentId to set
     */
    public void setSpouseGovernmentId(String spouseGovernmentId) {
        this.spouseGovernmentId = spouseGovernmentId;
    }

    /**
     * @return the spouseIdType
     */
    public String getSpouseIdType() {
        return spouseIdType;
    }

    /**
     * @param spouseIdType the spouseIdType to set
     */
    public void setSpouseIdType(String spouseIdType) {
        this.spouseIdType = spouseIdType;
    }
    
    /**
     * @return the reservations
     */
    public List<Reservation> getReservations() {
        return reservations;
    }

    /**
     * @param reservations the reservations to set
     */
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
        reservation.setClient(this);
    }
 
    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
        reservation.setClient(null);
    }
}
