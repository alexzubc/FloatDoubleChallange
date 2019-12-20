package academy.programming;

public class Main {

    public static void main(String[] args) {
        double poundsValue;
        double kilogrammsValue;

        // my solution
        poundsValue = 200d;
        kilogrammsValue = poundsValue * 0.45359237d;
        System.out.println(poundsValue + " pounds equals to " + kilogrammsValue +  " kilogramms");

        //tim solution
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

        // example
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
