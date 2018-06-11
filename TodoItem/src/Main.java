public class Main {


    public static void main(String[] args) {

        TodoList minhaLista = new TodoList();

        minhaLista.add(Importance.MEDIUM, 1, "Medium priority 1");
        minhaLista.add(Importance.LOW, 1, "Low priority 1");
        minhaLista.add(Importance.HIGH, 1, "Medium priority 1");
        minhaLista.add(Importance.LOW, 2, "Low priority 2");
        minhaLista.add(Importance.MEDIUM, 2, "Medium priority 2");
        minhaLista.add(Importance.HIGH, 2, "High priority 2");


        while (!minhaLista.isEmpty()) {
            System.out.println(minhaLista.remove());

        }

    }
}
