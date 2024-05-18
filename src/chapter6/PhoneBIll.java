package chapter6;

public class PhoneBIll {
    private int id;
    private double baseCost;
    private double allocatedMinutes;
    private double minutesUsed;


    public PhoneBIll(int id){
        this.id = id;
        baseCost = 80;
        allocatedMinutes = 500;
        minutesUsed = 510;
    }


    public PhoneBIll(int id,double baseCost, double allocatedMinutes,double minutesUsed){
        setId(id);
        setBaseCost(baseCost);
        setAllocatedMinutes(allocatedMinutes);
        setMinutesUsed(minutesUsed);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAllocatedMinutes() {
        return allocatedMinutes;
    }

    public void setAllocatedMinutes(double allocatedMinutes) {
        this.allocatedMinutes = allocatedMinutes;
    }

    public double getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(){
        if(minutesUsed <= allocatedMinutes){
            return 0;
        }
        double overageRate = 0.50;
        double overageMinutes = minutesUsed - allocatedMinutes;
        double totalOverage = overageRate * overageMinutes;
        return totalOverage;
    }

    public double calculateTax(){
        double taxRate = 0.14;
        double totalOverage = calculateOverage();
        double totalTax = taxRate * (baseCost + totalOverage);
        return totalTax;
    }

    public double calculatePhoneBill(){
        double totalOverage = calculateOverage();
        double totalTax = calculateTax();
        double totalPhoneBill = baseCost + totalOverage + totalTax;
        return totalPhoneBill;
    }

    public void printItemizedBill(){
        System.out.println("Id: " + id);
        System.out.println("Base Cost: R" + baseCost);
        System.out.println("Overage Cost: R" + calculateOverage());
        System.out.println("Tax: R" + calculateTax());
        System.out.println("Bill Total: R" + calculatePhoneBill());

    }
}
