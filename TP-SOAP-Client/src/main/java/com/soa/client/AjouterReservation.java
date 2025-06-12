
package com.soa.client;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ajouterReservation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ajouterReservation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateReservation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="nombrePersonnes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ajouterReservation", propOrder = {
    "nom",
    "prenom",
    "dateReservation",
    "nombrePersonnes"
})
public class AjouterReservation {

    protected String nom;
    protected String prenom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReservation;
    protected int nombrePersonnes;

    /**
     * Gets the value of the nom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the prenom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets the value of the prenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Gets the value of the dateReservation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReservation() {
        return dateReservation;
    }

    /**
     * Sets the value of the dateReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReservation(XMLGregorianCalendar value) {
        this.dateReservation = value;
    }

    /**
     * Gets the value of the nombrePersonnes property.
     * 
     */
    public int getNombrePersonnes() {
        return nombrePersonnes;
    }

    /**
     * Sets the value of the nombrePersonnes property.
     * 
     */
    public void setNombrePersonnes(int value) {
        this.nombrePersonnes = value;
    }

}
