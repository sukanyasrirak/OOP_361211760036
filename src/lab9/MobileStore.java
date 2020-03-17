package lab9;

import java.sql.*;
import java.util.ArrayList;

public class MobileStore {

    public static void main(String[] args) {
        System.out.println("Load driver successfully.");
        //step 1: load driver
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //step 2:Create Connection
        ArrayList <Mobiletest>myMB = new ArrayList<Mobiletest>();

        String SQCONN = "jdbc:sqlite:SqliteStudio.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null) {
                System.out.println("Could not connect to database.");
            } else {
                System.out.println("Connected to database.");
            }
            //step 3: Create Statement
            Statement stmt = conn.createStatement();
            String sql = "select*from SqliteStudio";
            ResultSet rs = stmt.executeQuery(sql);

            //step 4: display data from database
            System.out.println("SqliteStudio Information");

            while (rs.next()) {

                Mobiletest mot = new Mobiletest(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5));
                myMB.add(mot);
            }
            //step 5: Close Connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Display data as object
        System.out.println("Data as object:");
        for (Mobiletest e:myMB){
            System.out.println(e.toString());
        }

    }//main
}//class
