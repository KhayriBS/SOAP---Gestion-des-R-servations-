# 🧼 SOAP – Gestion des Réservations

Ce projet met en œuvre un **Web Service SOAP** en Java pour gérer les réservations dans un restaurant. Il comprend deux modules :

- **TP-SOAP-Server** : expose un service SOAP avec JAX-WS
- **TP-SOAP-Client** : consomme ce service depuis un client Java

---

## 📌 Fonctionnalités

- ➕ Ajouter une réservation
- 📋 Lister toutes les réservations
- 🔍 Rechercher une réservation par nom et prénom
- ❌ Annuler une réservation

---

## 🛠️ Technologies utilisées

- Java 17
- JAX-WS (Jakarta EE)
- Maven
- IntelliJ IDEA
- SoapUI (pour les tests)

---

## 📁 Structure du projet
```bash
TP-SOAP/
├── TP-SOAP-Server/ # Service SOAP (serveur)
│ └── src/main/java/com/restau/soap/
│ ├── Reservation.java
│ └── ReservationService.java
│ └── pom.xml
├── TP-SOAP-Client/ # Client Java SOAP
│ └── src/main/java/org/example/
│ └── ClientTest.java
│ └── pom.xml
└── README.md
```

---

## 🚀 Lancer le service SOAP

1. Ouvrir le projet `TP-SOAP-Server` dans IntelliJ
2. Lancer la méthode `main()` de `ReservationService.java`
3. Le service sera disponible à l'adresse :

http://localhost:8888/ws/reservation?wsdl


---

## 🧪 Tester avec SoapUI

1. Ouvrir SoapUI
2. Créer un nouveau projet SOAP
3. Utiliser l'URL WSDL : `http://localhost:8888/ws/reservation?wsdl`
4. Tester les opérations suivantes :
   - `ajouterReservation`
   - `listerReservations`
   - `annulerReservation`

---

## 👨‍💻 Générer les classes du client (TP-SOAP-Client)

Assure-toi d’avoir ce plugin dans le `pom.xml` du client :

```xml
        <dependency>
            <groupId>com.sun.xml.ws</groupId>
            <artifactId>jaxws-ri</artifactId>
            <version>4.0.2</version>
            <type>pom</type>
        </dependency>




