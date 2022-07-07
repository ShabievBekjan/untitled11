import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(temperatureMethod(generteRandomAe(), 20));
        System.out.println(temperatureMethod(19, 20));
        System.out.println(temperatureMethod(46, 15));
        System.out.println(temperatureMethod(21, 43));
        System.out.println(temperatureMethod(15, 28));
    }

    public static String temperatureMethod(int age, int temperature) {
        if (age > 20 && age < 45 && temperature >= -20 && temperature <= 30) {
          return "You can go for a walk";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "You can go for a walk";
        } else if (age < 45 && temperature >= -10 && temperature <= 25) {
            return "You can go for a walk";
        }else {
            return "Stay at home";
        }
    }
    public static int generteRandomAe(){
        Random random = new Random();
        return random.nextInt(45);
    }
}



