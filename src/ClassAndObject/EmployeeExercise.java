package ClassAndObject;


import ClassAndObject.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeExercise {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeInfo(1, UUID.randomUUID().toString(), "Chingchou", "CEO", 6868.68);
        Employee employee2 = new Employee();
        employee2.setEmployeeInfo(2, UUID.randomUUID().toString(), "Sam", "FO", 100.04);
      //
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        //
        for(Employee em: employees){
            System.out.println(em);
        }

    }

}
