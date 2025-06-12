package com.microservices;

import com.microservices.gestionReservation.ReservationService;
import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/reservation", new ReservationService());
        System.out.println("service de réservation démarré sur http://localhost:8888/ws/reservation");
}}