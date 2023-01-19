package Main;

import BookSystem.NormalBook;
import BookSystem.PopulateDatabaseWithBooks;
import Menu.Menu;

public class Main {
    public static void main(String[] args) {
        PopulateDatabaseWithBooks populateDatabaseWithBooks = new PopulateDatabaseWithBooks();
        Menu menu = new Menu();
        populateDatabaseWithBooks.populateDatabaseWithQuestionsForAcousticBook();
        populateDatabaseWithBooks.populateDatabaseWithQuestionsForNormalBooks2();
        populateDatabaseWithBooks.populateDatabaseWithQuestionsForNormalBooks();
        populateDatabaseWithBooks.populateDatabaseWithQuestionsForAcousticBook2();



        menu.menu();

    }
}
