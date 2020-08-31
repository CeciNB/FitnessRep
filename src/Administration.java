public class Administration extends Employee{
    int vacation;

    public Administration (String name, String cpr){
        super(name, cpr);
        hours = 37;
        salary = 23000;
        vacation = 5;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    @Override
    public String toString() {
        return name + "\t\t" + cpr + "\t\t" + hours + "\t\t\t" + salary + "\t\t" + getVacation();
    }
}
