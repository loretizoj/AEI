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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author loretizoj
 */
@Entity(name = "RESERVATION")
@Table(name = "RESERVATION")
public class Reservation extends AuditTrail implements Serializable{

    private static final long serialVersionUID = 6L;
    
    @Column
    private double reservationFee;
    @Column
    private double downpayment;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "house_id")
    private House house;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "broker_id")
    private Broker broker;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    
    /**
     * @return the reservationFee
     */
    public double getReservationFee() {
        return reservationFee;
    }

    /**
     * @param reservationFee the reservationFee to set
     */
    public void setReservationFee(double reservationFee) {
        this.reservationFee = reservationFee;
    }

    /**
     * @return the downpayment
     */
    public double getDownpayment() {
        return downpayment;
    }

    /**
     * @param downpayment the downpayment to set
     */
    public void setDownpayment(double downpayment) {
        this.downpayment = downpayment;
    }

    /**
     * @return the house
     */
    public House getHouse() {
        return house;
    }

    /**
     * @param house the house to set
     */
    public void setHouse(House house) {
        this.house = house;
    }

    /**
     * @return the broker
     */
    public Broker getBroker() {
        return broker;
    }

    /**
     * @param broker the broker to set
     */
    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }
}
