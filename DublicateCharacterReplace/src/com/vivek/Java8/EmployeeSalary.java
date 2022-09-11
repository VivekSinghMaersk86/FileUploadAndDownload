package com.vivek.Java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> EmployeesList = new ArrayList<Employee>();  
        //Adding Employees  
        EmployeesList.add(new Employee(106,"swati",25000.24));  
        EmployeesList.add(new Employee(102,"Honey",30000.00));  
        EmployeesList.add(new Employee(103,"Aishwarya",28000.76));  
        EmployeesList.add(new Employee(104,"Akhila",28000.89));  
        EmployeesList.add(new Employee(105,"Banu",90000.00)); 
        
        // This is more compact approach for filtering data
        //By using only Filter and ForEach
        
        EmployeesList.stream()  
                             .filter(Employee -> Employee.Salary > 28000.00)  
                             .forEach(Employee -> System.out.println(Employee.Salary +"  "+Employee.name+" ,"));
        
        //By Using Filter and Map and ForEach
        
        EmployeesList.stream()  
        .filter(Employee ->Employee.Salary > 28000.00)   // filtering price  
        .map(e ->e.Salary)                               // fetching price  
        .forEach(System.out::println);                   // iterating price 
        
        
        //By Using only Map
        
        List SalaryList =  EmployeesList.stream() 
                .map(emp ->emp.Salary > 30000)     // filtering price      
                .collect(Collectors.toList());     // fetching price  
         System.out.println(SalaryList); 
         
      
	}

}
class Employee{  
    int eid;  
    String name;  
    double Salary;  
    public Employee(int eid, String name, double Salary) {  
        this.eid = eid;  
        this.name = name;  
        this.Salary = Salary;  
    }  
}  