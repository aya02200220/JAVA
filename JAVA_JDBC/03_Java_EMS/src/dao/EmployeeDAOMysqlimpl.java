package dao;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.Attributes.Name;

import dto.Employee;
import exception.EmployeeNotFoundException;

public class EmployeeDAOMysqlimpl implements EmployeeDAO {

  private Connection connection;
  private PreparedStatement preparedStatement;
  private ResultSet resultSet;
  // CREATE, READ, UPDATE, DELETE = CRUD

  // ? is placeholder for dynamic data
  private static final String INSERT_EMPLOYEE =
    "INSERT INTO employee_table(id, name,department,dayAbsent,salary)"+
    "VALUES(?,?,?,?,?)";

  private static final String DELETE_EMPLOYEE=
    "DELETE FROM employee_table WHERE id = ?";

  private static final String FIND_EMPLOYEE=
    "Select * from employee_table WHERE id = ?";

  private static final String FIND_ALL=
    "Select * from employee_table";

  private static final String UPDATE_EMPLOYEE=
  "UPDATE employee_table SET name = ?,department = ?,dayAbsent = ?,salary = ? WHERE id = ?";


  // private static final String UPDATE_EMPLOYEE_ID=
  // "UPDATE employee_table SET name = ?,department = ?,dayAbsent = ?,salary = ? WHERE id = ?";



  public EmployeeDAOMysqlimpl(){
    try {
      connection=DriverManager.getConnection(EmployeeDAO.URL,EmployeeDAO.USER,EmployeeDAO.PASSWORD);
      System.out.println("Successfully connected!!");
    } catch (SQLException e) {
      System.out.println("Unable to connect!");
      e.printStackTrace();
    }
  }

  @Override
  public void addEmployee(Employee e) {
    int rowAffected=0;

    try {
      preparedStatement=connection.prepareStatement(INSERT_EMPLOYEE);
      preparedStatement.setInt(1,e.getId());
      preparedStatement.setString(2,e.getName());
      preparedStatement.setString(3,e.getDepartment());
      preparedStatement.setInt(4,e.getDayAbsent());
      preparedStatement.setInt(5,e.getSalary());

      // ExecuteUpdate for adding, deleting, and  updating some records on
      // ExecuteQuery will return you a ResultSet type value
      rowAffected=preparedStatement.executeUpdate();
      System.out.println(rowAffected+" row(s) affected!");


    } catch (SQLException sqlE) {
      System.out.println("Unable to connect!");
      sqlE.printStackTrace();
    }finally{
      try {
        preparedStatement.close();
      } catch (SQLException sqlE2) {
        System.out.println("Unable to close the statement");
        sqlE2.printStackTrace();
      }
    }

    // When successfully added a data
    if(rowAffected>0){
      System.out.println("Employee added successfully!");
    }
    
  }

  @Override
  public void deleteEmployee(int id) {
    int rowAffected=0;
    try {
      preparedStatement=connection.prepareStatement(DELETE_EMPLOYEE);
      preparedStatement.setInt(1,id);

      rowAffected = preparedStatement.executeUpdate();

      System.out.println("Successfully deleted!");

    } catch (SQLException e) {
      System.out.println("Unable to delete this employee!");
      e.printStackTrace();
    }finally{
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to close the statement!");
        e.printStackTrace();
      }
    }
    if(rowAffected>0){
      System.out.println("Employee added successfully!");
    }

  }

  @Override
  public Employee findEmployee(int id) throws EmployeeNotFoundException {
    Employee employee = null;

    try {
      preparedStatement=connection.prepareStatement(FIND_EMPLOYEE);
      preparedStatement.setInt(1,id);

      resultSet=preparedStatement.executeQuery();

      if(!resultSet.next()){
        throw new EmployeeNotFoundException(id);
      }
      employee= new Employee();
      employee.setId(resultSet.getInt("id"));
      employee.setName(resultSet.getString("name"));
      employee.setDepartment(resultSet.getString("department"));
      employee.setDayAbsent(resultSet.getInt("dayAbsent"));
      employee.setSalary(resultSet.getInt("salary"));


    } catch (SQLException e) {
      System.out.println("Unable to find the employee with ID: "+ id);
      e.printStackTrace();
    }finally{
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to find the employee!");
        e.printStackTrace();
      }
    }
    return null;
  }

  @Override
  public List<Employee> findAllEmployees() throws EmployeeNotFoundException {
    Employee employee=null;
    List<Employee> employees=new LinkedList<>();

    try {
      preparedStatement=connection.prepareStatement(FIND_ALL);
      resultSet=preparedStatement.executeQuery();

      while(resultSet.next()){
        employee= new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setName(resultSet.getString("name"));
        employee.setDepartment(resultSet.getString("department"));
        employee.setDayAbsent(resultSet.getInt("dayAbsent"));
        employee.setSalary(resultSet.getInt("salary"));
        employees.add(employee);
      }

    } catch (SQLException e) {
      System.out.println("Unable to fins all employees!");
      e.printStackTrace();
    }finally{
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to find the employee!");
        e.printStackTrace();
      }
    }
    return null;
  }

  ///////////////////////////////
  ///////////////////////////////

  @Override
  public void updateEmployee(Employee e) {
    int rowAffected=0;

    try {
      preparedStatement=connection.prepareStatement(UPDATE_EMPLOYEE);
      
      preparedStatement.setString(1,e.getName());
      preparedStatement.setString(2,e.getDepartment());
      preparedStatement.setInt(3,e.getDayAbsent());
      preparedStatement.setInt(4,e.getSalary());
      preparedStatement.setInt(5,e.getId());

      // ExecuteUpdate for adding, deleting, and  updating some records on
      // ExecuteQuery will return you a ResultSet type value
      rowAffected=preparedStatement.executeUpdate();
      System.out.println(rowAffected+" row(s) affected!");


    } catch (SQLException sqlE) {
      System.out.println("Unable to connect!");
      sqlE.printStackTrace();
    }finally{
      try {
        preparedStatement.close();
      } catch (SQLException sqlE2) {
        System.out.println("Unable to close the statement");
        sqlE2.printStackTrace();
      }
    }

    // When successfully added a data
    if(rowAffected>0){
      System.out.println("Employee updated successfully!");
    }

  }
/////////////////////////////////
  // @Override
  // public void updateEmployeeById(int id) {
  //   int rowAffected=0;

  //   try {
  //     preparedStatement=connection.prepareStatement(UPDATE_EMPLOYEE_ID);

  //     preparedStatement.setString(1,Name);
  //     preparedStatement.setString(2,getDepartment());
  //     preparedStatement.setInt(3,e.getDayAbsent());
  //     preparedStatement.setInt(4,e.getSalary());
  //     preparedStatement.setInt(5,e.getId());
  //     preparedStatement.setInt(1,id);
      
  //     // ExecuteUpdate for adding, deleting, and  updating some records on
  //     // ExecuteQuery will return you a ResultSet type value
  //     rowAffected=preparedStatement.executeUpdate();
  //     System.out.println(rowAffected+" row(s) affected!");


  //   } catch (SQLException e) {
  //     System.out.println("Unable to find the employee with ID: "+ id);
  //     e.printStackTrace();
  //   }finally{
  //     try {
  //       preparedStatement.close();
  //     } catch (SQLException e) {
  //       System.out.println("Unable to find the employee!");
  //       e.printStackTrace();
  //     }
  //   }
    
  // }

////////////////
}
