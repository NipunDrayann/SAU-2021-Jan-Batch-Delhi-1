//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.24 at 09:15:39 PM IST 
//


package com.assignment.resultgenrator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalMarksObtained" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalMarks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentName",
    "totalMarksObtained",
    "totalMarks"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    @XmlElement(required = true)
    protected String studentName;
    @XmlElement(name = "TotalMarksObtained")
    protected int totalMarksObtained;
    @XmlElement(name = "TotalMarks")
    protected int totalMarks;

    /**
     * Gets the value of the studentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets the value of the studentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Gets the value of the totalMarksObtained property.
     * 
     */
    public int getTotalMarksObtained() {
        return totalMarksObtained;
    }

    /**
     * Sets the value of the totalMarksObtained property.
     * 
     */
    public void setTotalMarksObtained(int value) {
        this.totalMarksObtained = value;
    }

    /**
     * Gets the value of the totalMarks property.
     * 
     */
    public int getTotalMarks() {
        return totalMarks;
    }

    /**
     * Sets the value of the totalMarks property.
     * 
     */
    public void setTotalMarks(int value) {
        this.totalMarks = value;
    }

}
