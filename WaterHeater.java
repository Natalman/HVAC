import java.util.Date;

/**
 * Created by TheKingNat on 3/23/16.
 */
public class WaterHeater extends ServiceCall {

    private String age;
    private static double charge = 20;

    //Constructor
    public WaterHeater(String serviceAddress, String problemDescription, Date date, String Age) {
        super(serviceAddress, problemDescription, date);
        this.age = Age;


    }
    //creating a setter and a getter
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    //Calculating the total charge

    public double getTotalCharge(){
        double totalCharge = fee + charge;
        return totalCharge;
    }

    @Override
    public String toString() {


        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);


        return "Central AC Unit Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString + "\n" +
                "Charge = " + charge + "\n" +
                "Total Charge = " + getTotalCharge();

    }
}
