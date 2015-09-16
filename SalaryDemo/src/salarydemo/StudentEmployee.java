package salarydemo;

public class StudentEmployee extends Employee {
       private double hourlyWage;

   /**
      Constructs an student employee with a given name and weekly wage.
      @param name the name of this employee
      @param wage the hourly wage 
   */
   public StudentEmployee(String name, double wage)
   {
      setName(name);
      hourlyWage = wage;
   }
 
   public double weeklyPay(int hoursWorked)
   {
       if (hoursWorked > 20)
      {
         // Add overtime
        hoursWorked=20;
        System.out.println("Students don't get overtime!");
      }
      double pay = hoursWorked * hourlyWage;
      
      return pay;
   }
}