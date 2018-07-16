package org.academiadecodigo.bootcamp.model.model.controller;

import org.academiadecodigo.bootcamp.model.model.model.TravelsModel;
import org.academiadecodigo.bootcamp.model.model.services.TravelsService;
import org.academiadecodigo.bootcamp.model.model.services.TravelsServiceImplementation;
import org.academiadecodigo.bootcamp.model.model.view.TravelsView;
import java.util.List;

public class TravelAgencyController {


    private TravelsView view;
    private TravelsService travelsService;


    public TravelAgencyController() {
        view = new TravelsView(this);
        travelsService = new TravelsServiceImplementation();

    }

    public void init() {

        boolean exit = false;

        while (!exit) {

            int options = view.showMenu();

            switch (options) {

                case 1:
                    view.listTravels();
                    break;

                case 2:
                    view.addTravel();
                    break;

                case 3:
                    view.removeTravel();
                    break;

                case 4:
                    view.getTravel();
                    break;

                default:
                    exit = true;
                    break;

            }

        }

    }

    public void deleteTravel(String travel) {
        travelsService.remove(travel);

    }

    public List<TravelsModel> list() {
        return travelsService.list();

    }

    public void createTravel(TravelsModel travelsModel) {
        travelsService.add(travelsModel);

    }

}
