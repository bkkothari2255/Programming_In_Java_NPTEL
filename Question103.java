import java.sql.*;  // All sql classes are imported
import java.lang.*; // Semicolon is added
import java.util.Scanner;
public class Question103 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              // Connection object is created
              conn = DriverManager.getConnection(DB_URL);
              conn.close();
              System.out.print(conn.isClosed());
       }
       catch(Exception e){ System.out.println(e);}  
    }
}