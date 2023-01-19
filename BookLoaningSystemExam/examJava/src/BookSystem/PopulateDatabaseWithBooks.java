package BookSystem;

import JdbcCoonnection.JdbcConnectionUrlPasswordUser;

import javax.swing.*;
import java.sql.*;

public class PopulateDatabaseWithBooks {
        public void populateDatabaseWithQuestionsForNormalBooks(){
            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            try {
                Connection con = DriverManager.getConnection(jdbcConnection.getUrl(),jdbcConnection.getUser(),jdbcConnection.getPassword());
                String sql;
                sql = "INSERT IGNORE INTO normalbook (id, author, year, language, numberOfHardCopies, booktitle) VALUES (?,?,?,?,?,?)";


                PreparedStatement myStmt
                        = con.prepareStatement(sql);

                myStmt.setString(1, "1");
                myStmt.setString(2, "jo nesbo");
                myStmt.setString(3, "1993");
                myStmt.setString(4, "norwegian");
                myStmt.setString(5, "5");
                myStmt.setString(6, "snowman");
                myStmt.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();

            }
}

        public void populateDatabaseWithQuestionsForAcousticBook(){
            JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
            try {
                Connection con = DriverManager.getConnection(jdbcConnection.getUrl(),jdbcConnection.getUser(),jdbcConnection.getPassword());
                String sql;
                sql = "INSERT IGNORE INTO acousticbook (id,author, language, freeTrialPeriod, bookTitle) VALUES (?,?,?,?,?)";


                PreparedStatement myStmt
                        = con.prepareStatement(sql);

                myStmt.setString(1, "1");
                myStmt.setString(2, "Agnes Lovise Matre");
                myStmt.setString(3, "norwegian");
                myStmt.setString(4, "40 days");
                myStmt.setString(5, "Til døden : du skal ikke bryte ekteskapet");
                myStmt.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();

            }
}

    public void populateDatabaseWithQuestionsForNormalBooks2(){
        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        try {
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(),jdbcConnection.getUser(),jdbcConnection.getPassword());
            String sql;
            sql = "INSERT IGNORE INTO normalbook (id, author, year, language, numberOfHardCopies, booktitle) VALUES (?,?,?,?,?,?)";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);

            myStmt.setString(1, "2");
            myStmt.setString(2, "jennifer");
            myStmt.setString(3, "1923");
            myStmt.setString(4, "france");
            myStmt.setString(5, "4");
            myStmt.setString(6, "help yourself");
            myStmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();

        }
}
    public void populateDatabaseWithQuestionsForAcousticBook2(){
        JdbcConnectionUrlPasswordUser jdbcConnection = new JdbcConnectionUrlPasswordUser();
        try {
            Connection con = DriverManager.getConnection(jdbcConnection.getUrl(),jdbcConnection.getUser(),jdbcConnection.getPassword());
            String sql;
            sql = "INSERT IGNORE INTO   acousticbook (id,author, language, freeTrialPeriod, bookTitle) VALUES (?,?,?,?,?)";


            PreparedStatement myStmt
                    = con.prepareStatement(sql);

            myStmt.setString(1, "2");
            myStmt.setString(2, "hjalmar jensen");
            myStmt.setString(3, "swedish");
            myStmt.setString(4, "20 days");
            myStmt.setString(5, "skjønnheten : blomstrer");
            myStmt.executeUpdate();




        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
