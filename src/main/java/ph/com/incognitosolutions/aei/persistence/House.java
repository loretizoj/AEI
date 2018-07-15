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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author loretizoj
 */
@Entity(name = "HOUSE")
@Table(name = "HOUSE")
public class House extends AuditTrail implements Serializable{

        
    private static final long serialVersionUID = 4L;
    
    @Column
    private String model;
    @Column
    private String location;
    @Column
    private String floorArea;
    @Column
    private String lotArea;
    @Column
    private String bedroom;
    @Column
    private String toiletAndBath;
    @Column
    private String titleNo;
    @Column
    private String lotNo;
    @Column
    private String blkNo;
    @Column
    private double amount;
    @Column
    private double reservationFee;
    @Column
    private double downpayment;
    @Column
    private double remainingBalance;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "house", cascade = CascadeType.ALL)
    private Reservation reservation;
    
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the floorArea
     */
    public String getFloorArea() {
        return floorArea;
    }

    /**
     * @param floorArea the floorArea to set
     */
    public void setFloorArea(String floorArea) {
        this.floorArea = floorArea;
    }

    /**
     * @return the lotArea
     */
    public String getLotArea() {
        return lotArea;
    }

    /**
     * @param lotArea the lotArea to set
     */
    public void setLotArea(String lotArea) {
        this.lotArea = lotArea;
    }

    /**
     * @return the bedroom
     */
    public String getBedroom() {
        return bedroom;
    }

    /**
     * @param bedroom the bedroom to set
     */
    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    /**
     * @return the toiletAndBath
     */
    public String getToiletAndBath() {
        return toiletAndBath;
    }

    /**
     * @param toiletAndBath the toiletAndBath to set
     */
    public void setToiletAndBath(String toiletAndBath) {
        this.toiletAndBath = toiletAndBath;
    }

    /**
     * @return the titleNo
     */
    public String getTitleNo() {
        return titleNo;
    }

    /**
     * @param titleNo the titleNo to set
     */
    public void setTitleNo(String titleNo) {
        this.titleNo = titleNo;
    }

    /**
     * @return the lotNo
     */
    public String getLotNo() {
        return lotNo;
    }

    /**
     * @param lotNo the lotNo to set
     */
    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    /**
     * @return the blkNo
     */
    public String getBlkNo() {
        return blkNo;
    }

    /**
     * @param blkNo the blkNo to set
     */
    public void setBlkNo(String blkNo) {
        this.blkNo = blkNo;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

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
     * @return the remainingBalance
     */
    public double getRemainingBalance() {
        return remainingBalance;
    }

    /**
     * @param remainingBalance the remainingBalance to set
     */
    public void setRemainingBalance(double remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    /**
     * @return the reservation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
