import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class LibraryController {


    String getUserInput;
    private int optNumber;

    public LibraryController() {


        switch (optNumber) {

            case 1:
                getUserInput.equals("title");
                break;

            case 2:
                getUserInput.equals("author");
                break;

            case 3:
                getUserInput.equals("year");
                break;
            default:
                System.out.println("Invalid option number");


        }









       /* if(optionsNumber == 1){
            System.out.println("title");
        }else if(optionsNumber == 2){
            System.out.println("author");
        }else(optionsNumber == 3){
            System.out.println();
        }


        if(optionsNumber != options) {
            System.out.println("Invalid option number.");
        }   */


    }


}

//No controlador é que vai haver um switch (...) com os casos que foram definidos na meu String[] de opções no view.