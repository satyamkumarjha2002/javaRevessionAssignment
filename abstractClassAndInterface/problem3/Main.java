public class Main {
    
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.setNoOfPages(10);
        book1.setPublisherName("java");
        book1.setPublishers("xy");

        Book book2 = new Book();

        book1.setNoOfPages(20);
        book1.setPublisherName("c++");
        book1.setPublishers("xy");

        Journal journal1 = new Journal();
        Journal journal2 = new Journal();
     
        Library library = new Library();
           
        library.getPublications().add(book1);
        library.getPublications().add(book2);
        library.getPublications().add(journal1);
        library.getPublications().add(journal2);

        System.out.println(library.getPublications());
    }
}
