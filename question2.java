import java.util.Scanner;

public class SimpleInterest {
    private double principal;
    private double time;
    private double rate;


    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    
    public double getPrincipal() {
        return principal;
    }

    public double getTime() {
        return time;
    }

    public double getRate() {
        return rate;
    }
}

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleInterest SI = new SimpleInterest();

        
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();

        
        SI.setPrincipal(principal);
        SI.setTime(time);
        SI.setRate(rate);

        
        System.out.println("Principal: " + SI.getPrincipal());
        System.out.println("Time: " + SI.getTime());
        System.out.println("Rate: " + SI.getRate());
        
        sc.close();
    }
}
