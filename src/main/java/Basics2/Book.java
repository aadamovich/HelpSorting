package Basics2;

public class Book {
    public static void main(String[] args) {

        // Creating book class object
        Book book1 = new Book();

        // Set values
        book1.setAuthor("J.K.Rouling");
        book1.setTitle("Harry Potter");
        book1.setYear(2000);
        book1.setNumberOfPages(165);

        // Get values
        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getYear());
        System.out.println(book1.getNumberOfPages());

    }

    // Fields
    private String author;
    private String title;
    private int year;
    private int numberOfPages;

    // Setter methods
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {

        if (isNumberOfPagesCorrect(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The provided number of pages is incorrect: " + numberOfPages);
    }

}

    public void setYear(int year) {this.year = year;}

    // Getter methods

    public String getAuthor() {return author;}
    public String getTitle() {return title; }// can write as well: return this.author;
    public int getYear() {return year;}
    public int getNumberOfPages() {return numberOfPages;}

    private boolean isNumberOfPagesCorrect(int numberOfPages){
        return numberOfPages >= 10;
    }
}
