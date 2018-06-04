public class Player {

    //Player tém uma propriedade nome:
    private String name;

    //Declarar o meu constructor para criar o objecto Player, para o inicializar:

    public Player(String name) {
        this.name = name;
    }

    //Declaro meu método para adivinhar um número aliatório entre um
    //conjunto de números(min - max) e devolver esse número:

    public int guess(int min, int max) {
        return Randomizer.getInt(min, max);
    }

    //Declaro o meu método para retornar o nome do player:

    public String getName() {
        return name;
    }
}
