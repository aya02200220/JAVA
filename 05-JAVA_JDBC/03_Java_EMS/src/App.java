import java.util.List;

import dto.Employee;
import service.EmployeeService;
import service.EmployeeServiceimpl;

public class App {
    public static void main(String[] args) throws Exception {

    EmployeeService employeeService= new EmployeeServiceimpl();

    // Employee employee1= new Employee(1, "Kubilay", "WMAD Instrucor", 0, 5000);

    // System.out.println(employee1.getName());
    

    Employee employee2= new Employee(1,"Ayachan","CICCC Student",4,9000);
    // employeeService.addEmployee(employee2);
    // employeeService.addEmployee(new Employee(3, "Kubilay", "poorguy", 1, 300));
    employeeService.updateEmployee(new Employee(3, "Kubilay", "poorguy", 1, 300));




    // // employeeService.deleteEmployee(1);

    // System.out.println(employeeService.findEmployee(1));
    // List<Employee> employees = employeeService.findAllEmployees();
    // for (Employee employee : employees) {
    //     System.out.println(
    //         "Employee ID: " + employee.getId() +
    //         "| Employee Name " + employee.getName() +
    //         "| Employee Department " + employee.getDepartment()
    //     );
    // }

    }
}
