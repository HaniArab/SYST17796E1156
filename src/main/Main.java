package main;

/**
 * @author $ Hani Arab
 */
public class Main {

      public static void main(String[] args) {
        double[] temps = new double[] {-60, -50, -40, -30, -20, -10, 0, 10, 20, 30, 40, 45, 50, 60};
            
        System.out.println("Average of the Weather Temperatures Java Program");    
        System.out.println("Average: " + calcAvg(temps));
        
    }
    
    public static double calcAvg(double[] temps) {
        int count = 0;
        double sum = 0;
        for(int i = 0; i < temps.length; i++) {
            double current = temps[i];
            if(current > 50 || current < -50) {
                continue;
            }
            count++;
            sum += temps[i]; 

        }
        return sum / count;
    }

}
