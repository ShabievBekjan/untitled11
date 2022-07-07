public class Main {

    public static void temperatureMethod(int age, int temperature) {

        if(age > 20 && age < 45 && temperature >= -20 && temperature <= 30){
            System.out.println("You can go for a walk");
        }
        if(age < 20 && temperature >= 0 && temperature <= 28){
            System.out.println("You can go for a walk");
        }
        if(age < 45 && temperature >= -10 && temperature <= 25){
            System.out.println("You can go for a walk");
        }
        else {
            System.out.println("Stay at home");
        }
    }

    public static void main(String[] args) {

        temperatureMethod(21,20);
        temperatureMethod(19,20);
        temperatureMethod(46,20);
    }
}



