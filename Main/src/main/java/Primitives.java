public class Primitives {

    public static void main(String[] args) {

        /**
         * byte - 8 bits
         * short - 16 bits
         * int - 32 bits
         */
        /*
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);


        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
        System.out.println(myTotal);
        */

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("integer minimum value " + myMinIntValue);
        System.out.println("integer maximum value " + myMaxIntValue);
        //Integer is a wrapper class, the has methods to perform on int primitive type. There are 8 primitive types.
        System.out.println("Busted Max value " + (myMaxIntValue + 1));   //created an overflow
        System.out.println("Busted Min value " + (myMinIntValue - 1));  //created underflow
        //the compiler just skips back to the min or max number instead of giving what you want.

        int myMaxIntTest = 2147_4836_47; //underscore is still same number.

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value " + myMinByteValue);
        System.out.println("Byte max value " + myMaxByteValue);
        // System.out.println((myMaxByteValue + 1));


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value " + myMinShortValue);
        System.out.println(myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long min value " + myMinLongValue);
        System.out.println("Long Max value " + myMaxLongValue);
        long BigLongLiteralValue = 2147_4836_47_234L;  //initially treated as integer.
        System.out.println(BigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        /**
         * CASTING SHOWN HERE
         */

        byte myNewByteValue = (byte) (myMinByteValue / 2);// its treated as an int so CASTING is needed. (byte)

        short myNewShortValue = (short) (myMinShortValue / 2);


        /**
         * PRIMITIVE TYPE CHALLENGE
         */

        byte byte1 = 10;
        short short2 = 20;
        int int3 = 30;
        long long4 = 50000L + (10 * (byte1 + short2 + int3));  //this was incorrect
        long longTotal = 50000L + 10L * (byte1 + short2 + int3);
        System.out.println(longTotal);

        /**
         * Single (float 32bit 4bytes) and Double (double 64bits  8bytes ) Precision
         * Double has larger range and precision than float.
         *
         */

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);


        double pounds = 1;
        double kilograms = 0.45359237;
        double conversion = pounds * kilograms;

        //correct result
        double numPounds = 200;
        double kiloConversion = numPounds * kilograms;
        System.out.println(kiloConversion);

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("high score");
        }

        /**
         * AND OPERATOR requires both cases to be true
         */

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore <= 100)) {  //both cases had to be true to code execution
            System.out.println("greater than second top score and less than 100");
        }

        /**
         * OR OPERATOR requires only 1 of the conditions to be true
         * == for testing conditions
         * != for conditionals
         * = for assignments
         */

        boolean isCar = false;
        if (isCar) {
            System.out.println("incorrect");
        }

        /**
         * TERNARY
         * its a shortcut to assigning one of two values to a variables depending on
         * a given condition.   shortcut for if-then-else
         */

        //isCar = true;
        boolean wasCar = isCar ? true : false;   //wasCar is false so the sout doesn't print
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        /**
         * INSTANCEOF will be covered later in CLASSES
         */

        /**
         * JAVA OPERATOR PRECEDENCE rules found on oracle site
         * multiplication occurrs before + or - .
         */

        double var1 = 20.00d;
        double var2 = 80.00d;
        double result = ((var1 + var2) * 100.00d);
        double remainder = result % 40.00d;
        boolean bool = false;
        if (remainder == 0) {
            bool = true;
            System.out.println(bool);
        }

        if (bool != true) {
            System.out.println("Got some remainder");
        }


//        if(score < 5000 && score > 1000) {
//            System.out.println("your score was 5000");
//            System.out.println("this was executed");
//
//        } else if(score < 1000){
//            System.out.println("your score was less than 1000");
//        }
//        else {
//            System.out.println("got here");
//        }

        /**
         * CHALLENGE
         * print out a second score on the screen with the following
         * score set to 10000
         * levelCompleted set to 8
         * bonus set to 200
         * But make sure the first printout above still displays as well
         */

        //my attempt is here
//        if (gameOver) {  //same as gameOver == true
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score was " + finalScore);
//            score = 10000;
//            levelCompleted = 8;
//            bonus = 200;
//            System.out.println("new score is " + score);
//        }
//
//        //correct approach is to reuse variables which i put but instead use
//        // the variables at global level instead of block level and the another if condition.
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score was " + finalScore);
//        }

        /**
         * Methods will allow removal of duplication
         * create code once and resuse multiple times
         * cannot put a method within another method
         */


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" line 233: your final score was " + highScore);

        //here we are calling a method prior to declaration. this is possible
        //here we are passing the required arguments for the method.
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        calculateScore(false, 1000, 8, 200);

//        public static void calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) { //added parameters
//
//            if(gameOver){
//                int finalScore = score + (levelCompleted * bonus);
//                finalScore += 1000;
//                System.out.println("your final score was " + finalScore + " method ran.");
//            }
//
//        }

        //the above original if else code was commented out now that method is completed.
        //you can also hard code variables separately before a method call.


        /**
         * METHOD RETURNING A VALUE   NON-VOID
         * return the void and added int
         */

        //int highScore = calculateScore(game)  MY APPROACH
//        displayHighScorePosition("name", 30);
//        calculateHighScorePosition(1500);
//        calculateHighScorePosition(900);
//        calculateHighScorePosition(400);
//        calculateHighScorePosition(50);

        //correct approach
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("ron", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("sue", 50);
    }
        public static int calculateScore ( boolean gameOver, int score, int levelCompleted, int bonus)
        { //added parameters

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("your final score was " + finalScore + " method ran.");
                return finalScore;
            } else {  //option 1
                return -1;
            }
            // return -1;  option 2
        }



        public static void displayHighScorePosition(String name, int position){
            System.out.println(name + " managed to get in position of: " + position + " on the high score table.");

        }

        public static int calculateHighScorePosition(int score) {

            /**
             * 1st approach
             */
//        if(score >= 1000){
//            return 1;
//        } else if(score >= 500){
//            return 2;
//        } else if (score >= 100){
//            return 3;
//        }
//        return 4;
//        }
            /**
             * 2nd more efficient approach
             */
            int position = 4;

            if(score >= 1000){
                position = 1;
            }else if (score >= 500){
                position = 2;
            }else if(score >= 100){
                position = 3;
            }
            return position;
        }


        public static double toMilesPerHour (double kilometersPerHour){

        return kilometersPerHour;
        }
    }



