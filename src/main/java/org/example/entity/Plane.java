//package org.example.entity;
//
//import org.springframework.data.annotation.Transient;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "Planes")
//public class Plane {
//    @Id
//    long id_planes;
//    String model;
//    String fulltitle;
//    int numberofseats;
////    @Transient
////    @OneToOne(mappedBy = "plane")
////    Flight flight;
//    public Plane(){}
//
//    public long getId_planes() {
//        return id_planes;
//    }
//    public String getModel() {
//        return model;
//    }
//    public String getFulltitle() {
//        return fulltitle;
//    }
//    public int getNumberofseats() {
//        return numberofseats;
//    }
//    public Flight getFlight() {
//        return flight;
//    }
//
//    public void setId_planes(long id_planes) {
//        this.id_planes = id_planes;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
//    public void setFulltitle(String fulltitle) {
//        this.fulltitle = fulltitle;
//    }
//    public void setNumberofseats(int numberofseats) {
//        this.numberofseats = numberofseats;
//    }
//    public void setFlight(Flight flight) {
//        this.flight = flight;
//    }
//}
//
