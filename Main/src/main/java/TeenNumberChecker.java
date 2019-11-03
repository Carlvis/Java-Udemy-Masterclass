/**
 * Write a method named hasTeen with 3 parameters of type int.
 *
 * The method should return boolean and it needs to return true
 * if one of the parameters is in range 13(inclusive) - 19 (inclusive).
 * Otherwise return false.
 *
 *
 * Write another method named isTeen with 1 parameter of type int.
 *
 * The method should return boolean and it needs to return true if the
 * parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 */

public class TeenNumberChecker {

    public static boolean hasTeen(int p1, int p2, int p3) {
        if (p1 >= 13 && p1 <= 19) {
            return true;
        }
        if (p2 >= 13 && p2 <= 19) {
            return true;
        }
        if (p3 >= 13 && p3 <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int p4){
        if (p4 >= 13 && p4 <= 19) {
            return true;
        }
        return false;
    }

}
