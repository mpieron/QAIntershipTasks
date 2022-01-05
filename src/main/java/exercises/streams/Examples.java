package main.java.exercises.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Examples {

  public static void main(String[] args) {

    List<Employee> employeeList = getEmployeesList();

    List<Employee> employeesNamedAnna = employeeList.stream()
        .filter(employee -> employee.getFirstName().equals("Anna"))
        .collect(Collectors.toList());

    System.out.println(employeesNamedAnna);

    List<String> lastNames = employeeList.stream()
        .map(Employee::getLastName)
        .filter(lastName -> lastName.startsWith("F"))
        .collect(Collectors.toList());

    System.out.println(lastNames);

    List<Employee> sortedBySalaries = employeeList.stream()
        .sorted(Comparator.comparing(Employee::getSalary))
        .collect(Collectors.toList());

    System.out.println(sortedBySalaries);

    employeeList.stream()
        .min(Comparator.comparing(employee -> employee.getSalary()))
        .ifPresent(employee -> System.out.println(employee));

    boolean isHannaHere = employeeList.stream()
        .anyMatch(employee -> employee.getFirstName().equals("Hanna"));
    System.out.println(isHannaHere);

    Integer idSum = employeeList.stream()
        .reduce(0, (partialSum, employee) -> partialSum + employee.getId(), Integer::sum);

    System.out.println(idSum);

    List<Employee> newEmployeeList = IntStream.rangeClosed(0, 100)
        .boxed()
        .map(i -> new Employee("firstname", "lastname", i, 1000))
        .collect(Collectors.toList());

    System.out.println(newEmployeeList);

  }

  static List<Employee> getEmployeesList() {
    String[] firstNames = {"Jim", "John", "Anna", "Mark", "Suzanne", "Stacy", "Edward", "Jocelyn"};
    String[] lastNames = {"Kowalsky", "Smith", "Gerrard", "Goldberg", "Culkin", "Ford", "Pitt",
        "Cox"};

    return IntStream.rangeClosed(0, 50)
        .boxed()
        .map(count -> new Employee(firstNames[new Random().nextInt(firstNames.length)],
            lastNames[new Random().nextInt(lastNames.length)], count,
            (new Random().nextInt(1000)) + 5000))
        .collect(Collectors.toList());
  }

}

class Employee {

  private final String firstName;
  private final String lastName;
  private final int id;
  private final int salary;

  public Employee(String firstName, String lastName, int id, int salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.salary = salary;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getId() {
    return this.id;
  }

  public int getSalary() {
    return this.salary;
  }

  @Override
  public String toString() {
    return this.firstName + " " + this.lastName
        + ": " + "id=" + this.id + " " + "salary="
        + this.salary;
  }
}
