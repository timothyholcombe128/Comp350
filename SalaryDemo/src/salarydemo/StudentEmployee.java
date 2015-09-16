package salarydemo;

public class StudentEmployee extends Employee {
    
    private double studentWage;
    
    /**
      Constructs an hourly employee with a given name and weekly wage.
      @param name the name of this employee
      @param wage the hourly wage 
   */
   public StudentEmployee(String name, double wage)
   {
      setName(name);
      studentWage = wage;
   }
 
   public double weeklyPay(int hoursWorked)
   {
      double pay = hoursWorked * studentWage;
      if (hoursWorked < 4)
      {
         System.out.println("You're Fired!");
         pay = 0.0;
      }
      return pay;
   }
}