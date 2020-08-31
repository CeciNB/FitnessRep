public class Instructor extends Employee{

    public Instructor (String name, String cpr, int hours){
        super(name, cpr, hours);
    }

    @Override
    public int getSalary() {
        salary = hours * 456;
        return salary;
    }

    @Override
    public String toString() {
        return name + "\t\t" + cpr + "\t\t" + hours + "\t\t\t" + getSalary();
    }
}
