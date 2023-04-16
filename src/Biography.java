import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
        This will be our actual program that we define author and his books
        In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

        Full name = Stefan Zweig
        County = Austria
        Is still alive: No (28 November 1881 – 22 February 1942)
        Some of his books as listed below:

        BookName                            Genre           TotalPage
        Amok                                tale            189
        The Royal Game                      novella         53
        24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE

        Scanner input = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>(); // CREATE AN EMPTY LIST TO STORE THE BOOKS

        System.out.println("What is your authors first name?");
        String fName = input.nextLine();

        System.out.println("What is your authors last name?");
        String lName = input.nextLine();

        System.out.println("Where is your author from?");
        String country = input.nextLine();

        System.out.println("Is the author still alive? (Y/N)");
        boolean isAlive = input.nextLine().toLowerCase().equalsIgnoreCase("Y");
        int age = 0;
        if(isAlive){
            System.out.println("Is your favorite author still alive? (Y/N)");
            age = input.nextInt();
            input.nextLine();
        }

        Author author = new Author(fName, lName, country, isAlive, age, books);
        System.out.println("Would you like to enter book information? (Y/N)");
        String addBook = input.nextLine();
        while(addBook.toLowerCase().startsWith("y")){

            System.out.println("What is the book name? ");
            String title = input.nextLine();

            System.out.println("What is the genre of the book ");
            String genre = input.nextLine();

            System.out.println("How many pages does the book have? ");
            int pages = input.nextInt();
            input.nextLine();

            Book book = new Book(title, genre, pages);
            books.add(book);

            // Ask user if they want to add another book

            System.out.print("Would you like to enter another book? (Y/N) ");
            addBook = input.nextLine();
            
            

        }

        System.out.println("======= END RESULT ======");

        System.out.println("Author's information = " + author);

        System.out.println("Author's books are as listed below:");

        for (Book book : books) {
            System.out.println(book);
        }


    }
}
