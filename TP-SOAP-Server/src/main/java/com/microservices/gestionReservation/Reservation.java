package com.microservices.gestionReservation;

import java.util.Date;

public class Reservation {
    private String nom;
    private String prenom;
    private Date dateReservation;
    private int nombrePersonnes;

    public Reservation() {
    }

    public Reservation(String prenom, String nom, Date dateReservation, int nombrePersonnes) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateReservation = dateReservation;
        this.nombrePersonnes = nombrePersonnes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNombrePersonnes() {
        return nombrePersonnes;
    }

    public void setNombrePersonnes(int nombrePersonnes) {
        this.nombrePersonnes = nombrePersonnes;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateReservation=" + dateReservation +
                ", nombrePersonnes=" + nombrePersonnes + '}';
    }
}