package org.academiadecodigo.bootcamp.model.model.services;

import org.academiadecodigo.bootcamp.model.model.model.TravelsModel;

import java.util.LinkedList;
import java.util.List;

public class TravelsServiceImplementation implements TravelsService {

    private List<TravelsModel> travels = new LinkedList<>();

    @Override
    public List<TravelsModel> list() {
        return travels;

    }

    @Override
    public TravelsModel get(TravelsModel destination) {

        for (TravelsModel travel : travels) {
            if (destination.equals(travel.getDestination())) {
                return travel;

            }
        }
        return null;

    }

    @Override
    public void remove(String destination) {
        for (TravelsModel travel : travels) {
            if (destination.equals(travel.getDestination())) {
                travels.remove(travel);
            }
        }
    }


    @Override
    public void add(TravelsModel travelsModel) {
        travels.add(travelsModel);
    }

}