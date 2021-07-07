package JavaEssential.HomeWork006.Task3;

public class Distance {

    public double distance;

    public void print(){
        System.out.println("Method print from class Distance");
    }

    static class Converter{

        public double convertMilesToKilometers(double miles) {
            return miles * 1.6;
        }

        public double convertKilometersToMeters(double kilometers){
            return kilometers * 1000;
        }

        public double convertMetersToCentimeters(double meters){
            return meters * 100;
        }

        public double convertCentimetersToMillimeters(double centimeters){
            return centimeters * 100;
        }

    }

}
