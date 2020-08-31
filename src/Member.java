public class Member extends Person{

    boolean isBasic;

    public Member(String name, String cpr, boolean isBasic){
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType(){
        if (isBasic){
            return "Basic";
        }else{
            return "Full";
        }
    }

    public int getMonthlyFee(){
        if (isBasic){
            return 119;
        }else{
            return 299;
        }
    }

    @Override
    public String toString() {
        return name + "\t\t" + cpr + "\t\t" + getMemberType() + "\t\t\t" + getMonthlyFee();
    }
}
