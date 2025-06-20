package Job2;

import Job.Department;

public class Employee  {
    protected int serialNumber;
    protected int salary;
    protected Department department;


   public Employee(int serialNumber, int salary, Job.Department department){
        this.serialNumber=serialNumber;
        this.salary=salary;
        this.department=department;
    }

public int getSerialNumber(){
        return this.serialNumber;
}
public double getSalary(){
        return this.salary;
}

public Department department(){
        return this.department;
}
@Override
    public String toString(){
        return this.serialNumber +" "+this.salary+" "+this.department;
}

}

