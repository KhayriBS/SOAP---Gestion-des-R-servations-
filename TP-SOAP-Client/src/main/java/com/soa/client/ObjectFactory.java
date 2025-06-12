
package com.soa.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soa.client package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AjouterReservation_QNAME = new QName("http://gestionReservation.microservices.com/", "ajouterReservation");
    private static final QName _AjouterReservationResponse_QNAME = new QName("http://gestionReservation.microservices.com/", "ajouterReservationResponse");
    private static final QName _AnnulerReservation_QNAME = new QName("http://gestionReservation.microservices.com/", "annulerReservation");
    private static final QName _AnnulerReservationResponse_QNAME = new QName("http://gestionReservation.microservices.com/", "annulerReservationResponse");
    private static final QName _GetReservations_QNAME = new QName("http://gestionReservation.microservices.com/", "getReservations");
    private static final QName _GetReservationsResponse_QNAME = new QName("http://gestionReservation.microservices.com/", "getReservationsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soa.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterReservation }
     * 
     * @return
     *     the new instance of {@link AjouterReservation }
     */
    public AjouterReservation createAjouterReservation() {
        return new AjouterReservation();
    }

    /**
     * Create an instance of {@link AjouterReservationResponse }
     * 
     * @return
     *     the new instance of {@link AjouterReservationResponse }
     */
    public AjouterReservationResponse createAjouterReservationResponse() {
        return new AjouterReservationResponse();
    }

    /**
     * Create an instance of {@link AnnulerReservation }
     * 
     * @return
     *     the new instance of {@link AnnulerReservation }
     */
    public AnnulerReservation createAnnulerReservation() {
        return new AnnulerReservation();
    }

    /**
     * Create an instance of {@link AnnulerReservationResponse }
     * 
     * @return
     *     the new instance of {@link AnnulerReservationResponse }
     */
    public AnnulerReservationResponse createAnnulerReservationResponse() {
        return new AnnulerReservationResponse();
    }

    /**
     * Create an instance of {@link GetReservations }
     * 
     * @return
     *     the new instance of {@link GetReservations }
     */
    public GetReservations createGetReservations() {
        return new GetReservations();
    }

    /**
     * Create an instance of {@link GetReservationsResponse }
     * 
     * @return
     *     the new instance of {@link GetReservationsResponse }
     */
    public GetReservationsResponse createGetReservationsResponse() {
        return new GetReservationsResponse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     * @return
     *     the new instance of {@link Reservation }
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AjouterReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation.microservices.com/", name = "ajouterReservation")
    public JAXBElement<AjouterReservation> createAjouterReservation(AjouterReservation value) {
        return new JAXBElement<>(_AjouterReservation_QNAME, AjouterReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AjouterReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation.microservices.com/", name = "ajouterReservationResponse")
    public JAXBElement<AjouterReservationResponse> createAjouterReservationResponse(AjouterReservationResponse value) {
        return new JAXBElement<>(_AjouterReservationResponse_QNAME, AjouterReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnulerReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation.microservices.com/", name = "annulerReservation")
    public JAXBElement<AnnulerReservation> createAnnulerReservation(AnnulerReservation value) {
        return new JAXBElement<>(_AnnulerReservation_QNAME, AnnulerReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnulerReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation.microservices.com/", name = "annulerReservationResponse")
    public JAXBElement<AnnulerReservationResponse> createAnnulerReservationResponse(AnnulerReservationResponse value) {
        return new JAXBElement<>(_AnnulerReservationResponse_QNAME, AnnulerReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservations }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation.microservices.com/", name = "getReservations")
    public JAXBElement<GetReservations> createGetReservations(GetReservations value) {
        return new JAXBElement<>(_GetReservations_QNAME, GetReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://gestionReservation.microservices.com/", name = "getReservationsResponse")
    public JAXBElement<GetReservationsResponse> createGetReservationsResponse(GetReservationsResponse value) {
        return new JAXBElement<>(_GetReservationsResponse_QNAME, GetReservationsResponse.class, null, value);
    }

}
