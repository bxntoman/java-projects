import java.util.Scanner;
/**
 * A simple program that allows the user to convert temperatures from Celsius
 * to Fahrenheit.
 * 
 * @author Benjamin Letu
 * @version September 6, 2024 
 */
public class TemperatureConverter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type (C or F) to convert to Celsius/Fahrenheit");
        int x = 0;
        while(x == 0){
            String in = input.nextLine();
            if(in.equalsIgnoreCase("c") ||in.equalsIgnoreCase("f")){
                x=1;
                if(in.equalsIgnoreCase("f")){
                    System.out.println("Enter the temperature in Celsius: ");
                    double temperature = input.nextDouble();
                    double temperatureChange = (double)9/5*temperature;
                    double temperatureFinal = temperatureChange + 32.0 ;
                    System.out.println("It is "+temperatureFinal+" degrees Fahrenheit.");
                }
                if(in.equalsIgnoreCase("c")){
                    System.out.println("Enter the temperature in Fahrenheit: ");
                    double temperature = input.nextDouble();
                    double temperatureChange = temperature - 32;
                    double temperatureFinal = (double)5/9*temperatureChange;
                    System.out.println("It is "+temperatureFinal+" Celsius.");
                }
            }else{
                System.out.println("Invalid Input: Enter either (C or F) only");
            }
        }
    }
}
