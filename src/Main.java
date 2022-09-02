import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        try (FileWriter fileWriter = new FileWriter("cars.txt")){
            fileWriter.write(car.close());
            fileWriter.write(drive());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static String drive(){
        return "Car running!";
    }
}