
/*
 * This file is part of the Soapbox Race World core source code.
 * If you use any of this code for third-party purposes, please provide attribution.
 * Copyright (c) 2020.
 */

package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PursuitArbitrationPacket complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PursuitArbitrationPacket">
 *   &lt;complexContent>
 *     &lt;extension base="{}ArbitrationPacket">
 *       &lt;sequence>
 *         &lt;element name="CopsDeployed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CopsDisabled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CopsRammed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CostToState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Heat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Infractions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LongestJumpDurationInMilliseconds" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="RoadBlocksDodged" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpikeStripsDodged" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SumOfJumpsDurationInMilliseconds" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="TopSpeed" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PursuitArbitrationPacket", propOrder = {
        "copsDeployed",
        "copsDisabled",
        "copsRammed",
        "costToState",
        "heat",
        "infractions",
        "longestJumpDurationInMilliseconds",
        "roadBlocksDodged",
        "spikeStripsDodged",
        "sumOfJumpsDurationInMilliseconds",
        "topSpeed"
})
public class PursuitArbitrationPacket
        extends ArbitrationPacket {

    @XmlElement(name = "CopsDeployed")
    protected int copsDeployed;
    @XmlElement(name = "CopsDisabled")
    protected int copsDisabled;
    @XmlElement(name = "CopsRammed")
    protected int copsRammed;
    @XmlElement(name = "CostToState")
    protected int costToState;
    @XmlElement(name = "Heat")
    protected float heat;
    @XmlElement(name = "Infractions")
    protected int infractions;
    @XmlElement(name = "LongestJumpDurationInMilliseconds")
    @XmlSchemaType(name = "unsignedInt")
    protected long longestJumpDurationInMilliseconds;
    @XmlElement(name = "RoadBlocksDodged")
    protected int roadBlocksDodged;
    @XmlElement(name = "SpikeStripsDodged")
    protected int spikeStripsDodged;
    @XmlElement(name = "SumOfJumpsDurationInMilliseconds")
    @XmlSchemaType(name = "unsignedInt")
    protected long sumOfJumpsDurationInMilliseconds;
    @XmlElement(name = "TopSpeed")
    protected float topSpeed;

    /**
     * Gets the value of the copsDeployed property.
     */
    public int getCopsDeployed() {
        return copsDeployed;
    }

    /**
     * Sets the value of the copsDeployed property.
     */
    public void setCopsDeployed(int value) {
        this.copsDeployed = value;
    }

    /**
     * Gets the value of the copsDisabled property.
     */
    public int getCopsDisabled() {
        return copsDisabled;
    }

    /**
     * Sets the value of the copsDisabled property.
     */
    public void setCopsDisabled(int value) {
        this.copsDisabled = value;
    }

    /**
     * Gets the value of the copsRammed property.
     */
    public int getCopsRammed() {
        return copsRammed;
    }

    /**
     * Sets the value of the copsRammed property.
     */
    public void setCopsRammed(int value) {
        this.copsRammed = value;
    }

    /**
     * Gets the value of the costToState property.
     */
    public int getCostToState() {
        return costToState;
    }

    /**
     * Sets the value of the costToState property.
     */
    public void setCostToState(int value) {
        this.costToState = value;
    }

    /**
     * Gets the value of the heat property.
     */
    public float getHeat() {
        return heat;
    }

    /**
     * Sets the value of the heat property.
     */
    public void setHeat(float value) {
        this.heat = value;
    }

    /**
     * Gets the value of the infractions property.
     */
    public int getInfractions() {
        return infractions;
    }

    /**
     * Sets the value of the infractions property.
     */
    public void setInfractions(int value) {
        this.infractions = value;
    }

    /**
     * Gets the value of the longestJumpDurationInMilliseconds property.
     */
    public long getLongestJumpDurationInMilliseconds() {
        return longestJumpDurationInMilliseconds;
    }

    /**
     * Sets the value of the longestJumpDurationInMilliseconds property.
     */
    public void setLongestJumpDurationInMilliseconds(long value) {
        this.longestJumpDurationInMilliseconds = value;
    }

    /**
     * Gets the value of the roadBlocksDodged property.
     */
    public int getRoadBlocksDodged() {
        return roadBlocksDodged;
    }

    /**
     * Sets the value of the roadBlocksDodged property.
     */
    public void setRoadBlocksDodged(int value) {
        this.roadBlocksDodged = value;
    }

    /**
     * Gets the value of the spikeStripsDodged property.
     */
    public int getSpikeStripsDodged() {
        return spikeStripsDodged;
    }

    /**
     * Sets the value of the spikeStripsDodged property.
     */
    public void setSpikeStripsDodged(int value) {
        this.spikeStripsDodged = value;
    }

    /**
     * Gets the value of the sumOfJumpsDurationInMilliseconds property.
     */
    public long getSumOfJumpsDurationInMilliseconds() {
        return sumOfJumpsDurationInMilliseconds;
    }

    /**
     * Sets the value of the sumOfJumpsDurationInMilliseconds property.
     */
    public void setSumOfJumpsDurationInMilliseconds(long value) {
        this.sumOfJumpsDurationInMilliseconds = value;
    }

    /**
     * Gets the value of the topSpeed property.
     */
    public float getTopSpeed() {
        return topSpeed;
    }

    /**
     * Sets the value of the topSpeed property.
     */
    public void setTopSpeed(float value) {
        this.topSpeed = value;
    }

}
