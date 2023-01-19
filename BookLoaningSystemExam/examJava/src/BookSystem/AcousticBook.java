package BookSystem;

import JdbcCoonnection.JdbcConnectionUrlPasswordUser;

import java.sql.*;
import java.util.ArrayList;

public class AcousticBook implements Book{
    @Override
    public void showBook() {
        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        Books books = new Books();
        ArrayList<Books> arrayList1 = new ArrayList<>();
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(), jdbcConnection.getUser(), jdbcConnection.getPassword());
            String sql;
            sql = "SELECT * FROM acousticbook WHERE id;";

            Statement statement = con.createStatement();
            rs = statement.executeQuery(sql);

            retrievingAcousticBookFromDatabase(books, arrayList1, rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



    private void retrievingAcousticBookFromDatabase(Books books, ArrayList<Books> arrayListForBooks, ResultSet rs) throws SQLException {

        while (rs.next()) {
            int id = rs.getInt("id");
            String author = rs.getString("author");
            String language = rs.getString("language");
            String freeTrialPeriod = rs.getString("freeTrialPeriod");
            String bookTitle = rs.getString("booktitle");


            books.setBookTitle(bookTitle);
            books.setAuthor(author);
            books.setFreeTrialPeriod(freeTrialPeriod);
            books.setLanguage(language);
            books.setId(id);


            arrayListForBooks.add(books);


            for (int i = 0; i <arrayListForBooks.size() ; i++) {
                Books books1 = arrayListForBooks.get(i);
                if (books1.getBookTitle().equals("Til døden : du skal ikke bryte ekteskapet")){
                    System.out.println("(A) " + books1 );
                }else  if (books1.getAuthor().equals("hjalmar jensen")){
                    System.out.println("(B) " + books1.getAuthor());
                }
            }





        }

    }


    }






