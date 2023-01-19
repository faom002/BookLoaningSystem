package Menu;

import BookSystem.AcousticBook;
import BookSystem.LoaningSystem;
import BookSystem.NormalBook;
import BookSystem.UserLoan;

import java.util.Scanner;

public class Menu {
    public void menu() {
        System.out.println("(1) loan a book" + '\n' +
                "(2). loan a acoustic book" + '\n' +
                "(3). Return a normal book"+ '\n' +
                "(4). Return an acoustic book"+ '\n' +
                "(5). check loan records" + '\n' +
                "(6). end the game");

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);


        NormalBook normalBook = new NormalBook();
        LoaningSystem loaningSystem = new LoaningSystem();
        AcousticBook acousticBook = new AcousticBook();
        UserLoan userLoan = new UserLoan();
        int choices = input1.nextInt();

        switch (choices) {
            case 1 -> {
                System.out.println("type in your username");


                String username = input3.nextLine();
                System.out.println("username is " + username);
                userLoan.setUsers(username);
                normalBook.showBook();
                normalBook.showBook2();


                String answers = input2.nextLine();

                if (answers.equals("A")) {

                    loaningSystem.addAloaningOnBook(userLoan);
                    System.out.println("registering in loanRecord... ");
                    menu();
                } else if (answers.equals("B")) {

                    loaningSystem.addAloaningBook2(userLoan);
                    System.out.println("registering in loanRecord... ");
                    menu();
                }
            }
            case 2 -> {
                System.out.println("type in username");
                String username = input3.nextLine();
                System.out.println("username is " + username);
                userLoan.setUsers(username);
                acousticBook.showBook();

                String answers = input2.nextLine();
                if (answers.equals("A")) {

                    loaningSystem.addAloaningForAcousticBook(userLoan);
                    System.out.println("registering in loanRecord... ");
                    menu();
                } else if (answers.equals("B")) {
                    loaningSystem.addAloaningForAcousticBook2(userLoan);
                    System.out.println("registering in loanRecord...");
                    menu();
                }

            }case 3 -> {
                System.out.println("type username to find the book to return");
                loaningSystem.checkLoanRecord();
                System.out.println("(A) to return book");
                String answer = input2.nextLine();

                if (answer.equals("A")){

                    loaningSystem.returningBackBooks();
                }
            menu();
            }

            case 4 -> {
                System.out.println("type username to find the book to return");
                loaningSystem.checkLoanRecord();
                System.out.println("(A) to return book");
                String answer = input2.nextLine();

                if (answer.equals("A")){

                    loaningSystem.returningBackBooks2();
                }
                menu();
            }
            case 5 -> {
                System.out.println("type username to find record");
                loaningSystem.checkLoanRecord();
                menu();
            }case 6 -> {
                break;
            }
        }
    }
}
