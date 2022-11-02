import java.sql.*;

public class Test {
  public static void main(String[] args) throws Exception {
      //credentials
      // String url = "jdbc:mysql://127.0.0.1:3306/employee_table";
      // String user = "root";
      // String passward = "rootAya0220";
      // try {
      //     Connection connection = DriverManager.getConnection(url, user, passward);
      //     System.out.println("Success to connect!");
      // } catch (SQLException e) {
      //     System.out.println("Unable to connect the database!");
      //     e.printStackTrace();
      // }
      try{
        getConnection();
    }catch(SQLException e){
        System.out.println("Unable to connect!");
      }
  }
  public static void getConnection() throws SQLException{
      //credentials
      String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
      String user = "root";
      String password = "Ayaishimura0220";

      Connection connection = DriverManager.getConnection(url, user, password);
      Statement statement = connection.createStatement();
      ResultSet resultSet = null;
      
      int rowAffected = 0;
      System.out.println("Connection Successful");
      resultSet = statement.executeQuery("SELECT * FROM employee_table");
      while(resultSet.next()){
          System.out.println(
              resultSet.getInt("id") + "~Name: " +
              resultSet.getString("name") + " | Department: " +
              resultSet.getString("department") + "| Salary: " +
              resultSet.getInt("salary")
          );
      }
      rowAffected = statement.executeUpdate("UPDATE employee_table SET salary = 10000 WHERE id = 2");

      System.out.println(rowAffected + "row(s) affected!");
      resultSet = statement.executeQuery("SELECT * FROM employee_table");

      while(resultSet.next()){
          System.out.println(
              resultSet.getInt("id") + "~Name: " +
              resultSet.getString("name") + " | Department: " +
              resultSet.getString("department") + "| Salary: " +
              resultSet.getInt("salary")
          );
      }
      //resultSet.close();
  }
}