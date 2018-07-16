package org.academiadecodigo.bootcamp.model.model.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.model.model.controller.TravelAgencyController;
import org.academiadecodigo.bootcamp.model.model.model.TravelsModel;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.List;


public class TravelsView {


    private Prompt prompt;
    private TravelAgencyController travelAgencyController;


    public TravelsView(TravelAgencyController travelAgencyController) {
        this.prompt = new Prompt(System.in, System.out);
        this.travelAgencyController = travelAgencyController;

    }

    public int showMenu() {

        String[] options = {" List travel destinations", " Add travel destination", " Remove travel destination", " Get travel", " Exit"};
        // String[] options1 = {"VISA", "Travel Card"...}

        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Choose your option:");

        int answerIndex = prompt.getUserInput(scanner);

        System.out.println("client choose" + options[answerIndex - 1]);

        return answerIndex;

    }

    public void listTravels() {

        List<TravelsModel> travels = travelAgencyController.list();

        if (travels.isEmpty()) {
            System.out.println("No travels available");
            return;
        }

        for (TravelsModel i : travels) {
            System.out.println(i.getDestination() + " | ");

        }
    }

    public void addTravel() {

        StringInputScanner destinationScanner = new StringInputScanner();
        destinationScanner.setMessage("What is your travel destination?");

        StringInputScanner tourismOperatorScanner = new StringInputScanner();
        tourismOperatorScanner.setMessage("What is the tourism operator or your preference?");

        String destination = prompt.getUserInput(destinationScanner);
        String tourismOperator = prompt.getUserInput(tourismOperatorScanner);

        TravelsModel travel = new TravelsModel();

        travel.SetDestination(destination);
        travel.setTourismOperator(tourismOperator);

        travelAgencyController.createTravel(travel);

    }

    public void removeTravel() {

        StringInputScanner travel = new StringInputScanner();
        travel.setMessage("what is the travel you want to remove? Please enter destination.");

        String travelDestination = prompt.getUserInput(travel);
        travelAgencyController.deleteTravel(travelDestination);

        System.out.println("This travel " + travelDestination + " have been removed from the list.");

    }

    public void getTravel() {


        StringInputScanner travel = new StringInputScanner();
        travel.setMessage("What is the travel?");

        String travelDestination = prompt.getUserInput(travel);

        System.out.println("This travel " +  travelDestination + " have been added to your list.");

    }

}