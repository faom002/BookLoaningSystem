package BookSystem;

import JdbcCoonnection.JdbcConnectionUrlPasswordUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LoaningSystem {
    public void addAloaningOnBook(UserLoan userLoan) {



        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        try {

            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "INSERT INTO loanrecord ( user, bookType) VALUES (?,?)";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);

            myStmt.setString(2, "snowman");


            myStmt.setString(1, "" + userLoan + "");


            myStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        updateBook();

    }

    public void addAloaningForAcousticBook(UserLoan userLoan) {



        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        try {

            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "INSERT INTO loanrecord ( user, bookType) VALUES (?,?)";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);

            myStmt.setString(2, "Til døden : du skal ikke bryte ekteskapet");


            myStmt.setString(1, "" + userLoan + "");


            myStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        updateBook();

    }

    public void addAloaningForAcousticBook2(UserLoan userLoan) {



        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        try {

            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "INSERT INTO loanrecord ( user, bookType) VALUES (?,?)";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);

            myStmt.setString(2, "skjønnheten : blomstrer");


            myStmt.setString(1, "" + userLoan + "");


            myStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        updateBook();


    }

    public void addAloaningBook2(UserLoan userLoan) {

        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        try {

            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "INSERT INTO loanrecord ( user, bookType) VALUES (?,?)";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);

            myStmt.setString(2, "help yourself");


            myStmt.setString(1, "" + userLoan.getUsers() + "");


            myStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       updateBook2();


    }

    public void checkLoanRecord() {


            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            LoanRecord loanRecord = new LoanRecord();
            ArrayList<LoanRecord> arrayList1 = new ArrayList<>();
            ResultSet rs = null;
            try {
                Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
                String sql;
                sql = "SELECT * FROM loanrecord WHERE Id";

                Statement statement = con.createStatement();
                rs = statement.executeQuery(sql);

                retrievingNormalBookFromDatabase(loanRecord, arrayList1, rs);

            } catch (SQLException e) {
                e.printStackTrace();

            }


        }

        private void retrievingNormalBookFromDatabase(LoanRecord loanRecord, ArrayList<LoanRecord> arrayListForBooks, ResultSet rs) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String user = rs.getString("user");
                String bookType = rs.getString("bookType");
                int bookId = rs.getInt("BookId");
                loanRecord.setUser(user);
                loanRecord.setBookType(bookType);
                loanRecord.setBookId(bookId);
                loanRecord.setId(id);




                arrayListForBooks.add(loanRecord);
                for (int i = 0; i <arrayListForBooks.size() ; i++) {
                    LoanRecord loanRecord1 = arrayListForBooks.get(i);
                   if (loanRecord1.getUser().equals(input)){
                       System.out.println(loanRecord1);
                   }
                }

            }


        }



        public void updateBook(){
            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            Books books = new Books();
            ArrayList<Books> arrayList1 = new ArrayList<>();
            ResultSet rs = null;
            try {
                Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
                String sql;
                sql = "SELECT * FROM normalbook WHERE id =1;";

                Statement statement = con.createStatement();
                rs = statement.executeQuery(sql);

                retrievingNormalBookFromDatabase(books, arrayList1, rs);

            } catch (SQLException e) {
                e.printStackTrace();

            }


        }

    private void retrievingNormalBookFromDatabase(Books books, ArrayList<Books> arrayListForBooks, ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("id");
            String author = rs.getString("author");
            int year = rs.getInt("year");
            String language = rs.getString("language");
            int numberOfHardCopies = rs.getInt("numberOfHardCopies");
            String bookTitle = rs.getString("booktitle");


            books.setBookTitle(bookTitle);
            books.setAuthor(author);
            books.setYear(year);
            books.setLanguage(language);
            books.setNumberOfHardCopies(String.valueOf(numberOfHardCopies));
            books.setId(id);


            arrayListForBooks.add(books);





            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            numberOfHardCopies--;
            String sql;
            sql = "update normalbook set numberOfHardCopies = " + numberOfHardCopies + " where id = 1";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);


            myStmt.executeUpdate();
        }
        }


    public void updateBook2(){
        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        Books books = new Books();
        ArrayList<Books> arrayList1 = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "SELECT * FROM normalbook WHERE id =2;";

            Statement statement = con.createStatement();
            rs = statement.executeQuery(sql);

            retrievingNormalBook2FromDatabase(books, arrayList1, rs);

        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    private void retrievingNormalBook2FromDatabase(Books books, ArrayList<Books> arrayListForBooks, ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("id");
            String author = rs.getString("author");
            int year = rs.getInt("year");
            String language = rs.getString("language");
            int numberOfHardCopies = rs.getInt("numberOfHardCopies");
            String bookTitle = rs.getString("booktitle");


            books.setBookTitle(bookTitle);
            books.setAuthor(author);
            books.setYear(year);
            books.setLanguage(language);
            books.setNumberOfHardCopies(String.valueOf(numberOfHardCopies));
            books.setId(id);


            arrayListForBooks.add(books);





            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            numberOfHardCopies--;
            String sql;
            sql = "update normalbook set numberOfHardCopies = " + numberOfHardCopies + " where id = 2";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);


            myStmt.executeUpdate();
        }
    }

    public void returningBackBooks(){
        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        Books books = new Books();
        ArrayList<Books> arrayList1 = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "SELECT * FROM normalbook WHERE id =1;";

            Statement statement = con.createStatement();
            rs = statement.executeQuery(sql);

            NormalBookFromDatabase(books, arrayList1, rs);

        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    private void NormalBookFromDatabase(Books books, ArrayList<Books> arrayListForBooks, ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("id");
            String author = rs.getString("author");
            int year = rs.getInt("year");
            String language = rs.getString("language");
            int numberOfHardCopies = rs.getInt("numberOfHardCopies");
            String bookTitle = rs.getString("booktitle");


            books.setBookTitle(bookTitle);
            books.setAuthor(author);
            books.setYear(year);
            books.setLanguage(language);
            books.setNumberOfHardCopies(String.valueOf(numberOfHardCopies));
            books.setId(id);


            arrayListForBooks.add(books);





            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            numberOfHardCopies++;
            String sql;
            sql = "update normalbook set numberOfHardCopies = " + numberOfHardCopies + " where id = 1";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);


            myStmt.executeUpdate();
        }
    }

    public void returningBackBooks2(){
        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        Books books = new Books();
        ArrayList<Books> arrayList1 = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "SELECT * FROM normalbook WHERE id =2;";

            Statement statement = con.createStatement();
            rs = statement.executeQuery(sql);

            NormalBookFromDatabase2(books, arrayList1, rs);

        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    private void NormalBookFromDatabase2(Books books, ArrayList<Books> arrayListForBooks, ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("id");
            String author = rs.getString("author");
            int year = rs.getInt("year");
            String language = rs.getString("language");
            int numberOfHardCopies = rs.getInt("numberOfHardCopies");
            String bookTitle = rs.getString("booktitle");


            books.setBookTitle(bookTitle);
            books.setAuthor(author);
            books.setYear(year);
            books.setLanguage(language);
            books.setNumberOfHardCopies(String.valueOf(numberOfHardCopies));
            books.setId(id);


            arrayListForBooks.add(books);





            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            numberOfHardCopies++;
            String sql;
            sql = "update normalbook set numberOfHardCopies = " + numberOfHardCopies + " where id = 2";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);


            myStmt.executeUpdate();
        }
    }


}

