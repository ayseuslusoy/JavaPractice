package day39_EncapsulationAndInheritance.cydeoTask;
public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    @Override
    public void work() {
        System.out.println(getName()+" is teaching some lessons to students");
    }
}
