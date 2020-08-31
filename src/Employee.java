public class Employee extends Person{
    int hours;
    int salary;

    public Employee(){}

    public Employee(String name, String cpr){
        super(name, cpr);
    }

    public Employee(String name, String cpr, int hours){
        super(name, cpr);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
