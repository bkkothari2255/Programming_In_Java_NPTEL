import java.sql.*;
import java.lang.*;
public class DeleteData {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              String query="";
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
String CREATE_TABLE_SQL="CREATE TABLE players ( UID INT, first_name VARCHAR(45), last_name VARCHAR(45), age INT);";
			stmt.executeUpdate(CREATE_TABLE_SQL);			
			query = " insert into Players (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);
			preparedStmt.setString (2, "Rama");
			preparedStmt.setString (3, "Gopala");
			preparedStmt.setInt(4, 24);
			preparedStmt.execute();
			preparedStmt.setInt (1, 2);
			preparedStmt.setString (2, "John");
			preparedStmt.setString   (3, "Mayer");
			preparedStmt.setInt(4, 22);
			preparedStmt.execute();

// Execute the command to delete a row form the table
stmt.executeUpdate("DELETE FROM Players WHERE UID = 1;");  	
ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			conn.close();
			


		}
                catch(Exception e){ System.out.println(e);}  
	}  
}  