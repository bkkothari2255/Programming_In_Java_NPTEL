import java.sql.*;
import java.lang.*;
public class InsertData {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
// The statement containing SQL command to create table "players"
String CREATE_TABLE_SQL="CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
// Execute the statement containing SQL command
stmt.executeUpdate(CREATE_TABLE_SQL);
String query = " insert into PLAYERS (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";

			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);
			preparedStmt.setString (2, "Ram");
			preparedStmt.setString (3, "Gopal");
			preparedStmt.setInt(4, 26);

			preparedStmt.execute();
	  
			preparedStmt.setInt (1, 2);
			preparedStmt.setString (2, "John");
			preparedStmt.setString   (3, "Mayer");
			preparedStmt.setInt(4, 22);
			
			preparedStmt.execute();

//Evaluation Portion
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			conn.close();
			

		}catch(Exception e){ System.out.println(e);}  
	}  
}  