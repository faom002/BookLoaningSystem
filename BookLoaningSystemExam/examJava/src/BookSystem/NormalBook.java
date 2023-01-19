package BookSystem;

import JdbcCoonnection.JdbcConnectionUrlPasswordUser;
import java.sql.*;
import java.util.ArrayList;


public class NormalBook implements Book {



    public void showBook2() {


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
            String numberOfHardCopies = rs.getString("numberOfHardCopies");
            String bookTitle = rs.getString("booktitle");


            books.setBookTitle(bookTitle);
            books.setAuthor(author);
            books.setYear(year);
            books.setLanguage(language);
            books.setNumberOfHardCopies(numberOfHardCopies);
            books.setId(id);


            arrayListForBooks.add(books);


            System.out.println("(A) " + books.getAuthor() + " " + books.getYear() + " " + books.getLanguage() + " " + books.getNumberOfHardCopies() + " " + books.getBookTitle());


            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());

            String sql;
            sql = "update normalbook set numberOfHardCopies = " + numberOfHardCopies + " where id = 1";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);


            myStmt.executeUpdate();
        }

        }





    @Override
    public void showBook() {

        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        Books books = new Books();
        ArrayList<Books> arrayList1 = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "SELECT * FROM normalbook WHERE id = 2;";

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
            String numberOfHardCopies = rs.getString("numberOfHardCopies");
            String bookTitle = rs.getString("booktitle");


            books.setBookTitle(bookTitle);
            books.setAuthor(author);
            books.setYear(year);
            books.setLanguage(language);
            books.setNumberOfHardCopies(numberOfHardCopies);
            books.setId(id);


            arrayListForBooks.add(books);




            System.out.println("(B) " + books.getAuthor() + " " + books.getYear() + " " + books.getLanguage() + " " + books.getNumberOfHardCopies() + " " + books.getBookTitle());



    }

}


}
