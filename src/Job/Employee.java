package Job;

public class Employee {
    private final int serialNumber;
    private final double salary;
    private final Department department;


    Employee (int serialNumber, double salary, Department department){
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

public  Department department(){
        return this.department;
}
@Override
    public String toString(){
        return this.serialNumber +" "+this.salary+" "+this.department;
}

}

