abstract class Employee {
    //public Double Salary;
    protected String name;
    protected double basesalary;
    Employee(String name, double basesalary){
        this.name = name;
        this.basesalary = basesalary;

    }
   public  abstract double CalculateSalary ();
   public  abstract void DisplayInformation();

}
