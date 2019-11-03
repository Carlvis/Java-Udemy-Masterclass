public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);  //convert from double to long for 7.0 to 7.
        System.out.println("miles = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        BarkingDog.shouldWakeUp(true, 10);
        BarkingDog.shouldWakeUp(false, 6);
        LeapYear.isLeapYear(1924);
        LeapYear.isLeapYear(2000);
        int newScore = calculateScore("Carlvis", 500);
        System.out.println("new score " + newScore);

        calculateScore();
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(156);
    }

    /**
     * Method Overloading   - using same method signature with different parameters
     * @param playerName
     * @param score
     * @return
     */
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points  method 1 ");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("unnamedPlayer scored " + score + " points  method 2 ");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("unnamedPlayer scored, no points  method 3");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //1 inch = 2.54cm  1 foot = 12 inches
        if ((feet < 0 || inches < 0) || (inches > 12)) {
            System.out.println("Invalid");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println("Method 1: " + feet + " feet " + inches + " inches equals " + centimeters + " centimeters.");
        return centimeters;
        }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches < 0){
            return -1;
        }
        //calculate how many feet are in inches.

        double feet = (int) inches / 12; //getting number of feet from inches.
        double remainingInches = (int) inches % 12; //getting remaining number of inches after feet calculation
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);//returning and calling method1 with method2 arguments.


           // double feetCalc = calcFeetAndInchesToCentimeters();

        }



    }


//jeremy@kffc.org    send email    send detailed   availability
