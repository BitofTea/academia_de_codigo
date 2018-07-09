public class BookModel {

    //Esta é uma Classe anémica: só getters e setters
    //A lógica do negócio = model.

    private String title;
    private String author;
    private int year;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author){
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

