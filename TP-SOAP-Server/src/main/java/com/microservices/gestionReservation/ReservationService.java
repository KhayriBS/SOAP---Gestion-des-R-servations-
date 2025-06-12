package com.microservices.gestionReservation;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "ReservationService")
public class ReservationService {
    private static final List<Reservation> reservations = new ArrayList<Reservation>();
    @WebMethod
    public String ajouterReservation(@WebParam(name = "nom") String nom, @WebParam(name = "prenom")String prenom, @WebParam(name = "dateReservation") Date dateReservation, @WebParam(name = "nombrePersonnes") int nombrePersonnes) {
        Reservation reservation = new Reservation(nom, prenom, dateReservation, nombrePersonnes);
        reservations.add(reservation);
        return  "Success insert reservation";
    }
    @WebMethod
    public List<Reservation> getReservations() {
        return reservations;
    }
    @WebMethod
    public String annulerReservation(@WebParam(name = "nom") String nom , @WebParam(name = "prenom") String prenom) {
        return reservations.removeIf(r -> r.getNom().equals(nom) && r.getPrenom().equals(prenom)) ? "reservation annulée" : "Reservation non trouvée";
    }
}
