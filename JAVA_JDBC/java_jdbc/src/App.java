import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
        // jdbc:mysql://127.0.0.1:3306/?user=root
        String user = "root";
        String password="19880220Aya";

    try{
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet=statement.executeQuery("SELCT * FROM employee_table");


        System.out.println("Succsecc to connect!");

        int rawAffected=0;

        while(resultSet.next()){
            System.out.println(
                "Name: "+
                resultSet.getString("id")+
                "~Name: "+
                resultSet.getString("name")+
                "Department: "+
                resultSet.getString("department")+
                "~Saraly: "+
                resultSet.getString("salary")

            );
        }




    }catch(SQLException e){
        System.out.println("Unable to connect to the database!");
        e.printStackTrace();

    }

    }
}
