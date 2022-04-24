package day39_EncapsulationAndInheritance.cydeoTask;
public class Employee extends Person{
    private int employeeId;//If I use private data, I can decide who can access the data, so it is more secure
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender,int employeeId,String jobTitle,double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0) {
            return;
        }
        this.salary = salary;
    }
    public void work(){
        System.out.println(getName()+" is working");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                "name='" + getName() + '\'' +//to String de otomatik olusturdugumda name yazar ama name private oldugundan
                //getName() donustur yoksa hata alirsin
                ", age=" + getAge() +//toString de otomatik olusturdugumda age yazar ama age private oldugundan
        //getAge() donustur yoksa hata alirsin
                ", gender=" + getGender() +
                '}';
    }
}

