package com.soa;



import com.soa.client.Reservation;
import com.soa.client.ReservationService;
import com.soa.client.ReservationService_Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DatatypeConfigurationException {
        ReservationService_Service service = new ReservationService_Service();
        ReservationService reservationService = service.getReservationServicePort();

        Date dateReservation = new Date();
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.setTime(dateReservation);
        XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

        System.out.println("=== Ajout d'une réservation ===");
        String response = reservationService.ajouterReservation("Doe", "John", xmlDate, 4);
        System.out.println(response);

        System.out.println("\n=== Liste des réservations ===");
        List<Reservation> reservations = reservationService.getReservations();
        reservations.forEach(res -> {
            System.out.println("Nom: " + res.getNom());
            System.out.println("Prénom: " + res.getPrenom());
            System.out.println("Date: " + res.getDateReservation());
            System.out.println("Nombre de personnes: " + res.getNombrePersonnes());
            System.out.println("----");
        });

        System.out.println("\n=== Annulation de la réservation ===");
        String annulation = reservationService.annulerReservation("Doe", "John");
        System.out.println(annulation);
    }
}