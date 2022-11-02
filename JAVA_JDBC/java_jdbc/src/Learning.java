import java.sql.*;

public class Learning {
  public static void main(String[] args) {
    
    try {
      System.out.println("Connect successfully.");
      getConnection();
    } catch (SQLException e) {
      System.out.println("Unable to connect!");
      
    }
////////////////////
  }
  private static void getConnection() {
    // Credentials
    String url="jdbc:mysql://127.0.0.1:3306/employee_database";
    String user="root";
    String password="Ayaishimura0220";
    

  }
/////////////////////
}
