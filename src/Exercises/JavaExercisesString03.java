package Exercises;

/**
 * FirstProject
 * 5/24/20 11: 48
 */
public class JavaExercisesString03 {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day jhjhjh"));// → 2
        System.out.println(countYZ("day fez"));// → 2
        System.out.println(countYZ("day fyyyz"));// → 2

//        System.out.println(gHappy("xxggxx"));// → true
//        System.out.println(gHappy("xxgxx"));// → false
//        System.out.println(gHappy("xxggyygxx"));//→ false
    }

    //19.01(String -03) Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
    // count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word
    // if there is not an alphabetic letter immediately following it.
    // (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
    public static int countYZ(String first) {
        first = first.toLowerCase();
        char prevLetter = ' '; // the last letter or previous from space;
        int result = 0;
        for (int i = 0; i <first.length() ; i++) {
            if (Character.toString(first.charAt(i)).equals(" ") & Character.isLetter(prevLetter) &
                    (Character.toString(prevLetter).equals("z") || Character.toString(prevLetter).equals("y"))) {
                result ++;
            }
            prevLetter = first.charAt(i);
        }
        return result;
    }

    // 19.02(String -03) We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately
    // to its left or right. Return true if all the g's in the given string are happy.
    public static boolean gHappy(String a) {
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == 'g'){
                if((i-1 < 0 || a.charAt(i-1) != 'g')){
                    if((i+1 >= a.length() || a.charAt(i+1) != 'g'))
                        return false;
                }
            }
        }
        return true;
    }
}
