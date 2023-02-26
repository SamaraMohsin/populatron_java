import java.text.NumberFormat;
import java.util.Locale;

public class PopulationCounter {
    public static void main(String[] args) throws Exception {
        Driver driver = new Driver(args[0]);
        long sum = driver.GetPopulation();
        String num = NumberFormat.getInstance(Locale.getDefault()).format(sum);
        System.out.printf("World population is: %s\n", num);
    }
}
