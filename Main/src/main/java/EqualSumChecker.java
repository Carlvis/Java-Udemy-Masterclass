/**
 * Write a method hasEqualSum with 3 parameters of type int.
 *
 * The method should return boolean and it needs to return
 * true if the sum of the first and second parameter is equal to the third parameter.
 * Otherwise, return false.
 */

public class EqualSumChecker {

    public static boolean hasEqualSum(int param1, int param2, int param3){

        if(param1 + param2 == param3){
            return true;
        }
        return false;
    }

}
