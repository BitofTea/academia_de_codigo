package org.academiadecodigo.bootcamp.model.model.model;

public class TravelsModel {


    private String destination;
    private String tourismOperator;
    private int price;


    public void SetDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;

    }

    public void setTourismOperator(String tourismOperator) {
        this.tourismOperator = tourismOperator;
    }


    public String getTourismOperator() {
        return tourismOperator;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}