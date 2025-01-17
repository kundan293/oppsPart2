 class Manager extends Employee {
   private double bonus;
   public Manager(String name , double basesalary, double bonus){
       super(name , basesalary);
       this.bonus = bonus;
   }
    @Override
    public double CalculateSalary() {
        return basesalary+bonus;

    }
    @Override
    public void DisplayInformation() {
        System.out.println(" Manager Name: "+name);
        System.out.println("manager  Salary"+basesalary );
        System.out.println("managet total salary "+basesalary+bonus);
    }
}

class Programmer extends Employee{

private int overtimeHour;
private double hourlyRate;
    public Programmer(String name, double basesalary, int overtimeHour, double hourlyRate) {
        super(name, basesalary);
        this.overtimeHour = overtimeHour;
        this.hourlyRate = hourlyRate;
    }
        @Override
    public double CalculateSalary() {
           return basesalary +(overtimeHour * hourlyRate);

    }

    @Override
    public void DisplayInformation() {
        System.out.println("programmer name"+name);
        System.out.println("Base salary : $"+ basesalary);
        System.out.println("Overtime Hours:" + overtimeHour);
        System.out.println("hour Rate salary"+hourlyRate);
        System.out.println("total salary"+CalculateSalary());

    }
}
