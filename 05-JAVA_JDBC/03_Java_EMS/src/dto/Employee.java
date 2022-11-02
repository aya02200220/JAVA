package dto;

public class Employee {

    private int id;
    private String name;
    private String department;
    private int dayAbsent;
    private int salary;

    public Employee(int id, String name, String department, int dayAbsent, int salary) {
      this.id = id;
      this.name = name;
      this.department = department;
      this.dayAbsent = dayAbsent;
      this.salary = salary;
    }
    public Employee(){};

    public int getId() {
      return this.id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDepartment() {
      return this.department;
    }

    public void setDepartment(String department) {
      this.department = department;
    }

    public int getDayAbsent() {
      return this.dayAbsent;
    }

    public void setDayAbsent(int dayAbsent) {
      this.dayAbsent = dayAbsent;
    }

    public int getSalary() {
      return this.salary;
    }

    public void setSalary(int salary) {
      this.salary = salary;
    }

    @Override
    public String toString() {
      return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dayAbsent=" + dayAbsent
          + ", salary=" + salary + "]";
    }



///////////////////
}
