import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Spectre on 6/4/2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mainString = "";
        String subString = "";

        subString = br.readLine();
        mainString = br.readLine();


        System.out.println(""+countOccurence(mainString, subString));
    }

    private static int countOccurence(String mainString, String subString) {


        char mainArray[];
        char subArray[];

        mainArray = mainString.toCharArray();
        subArray = subString.toCharArray();

        int count = 0;

        if(subArray.length > mainArray.length)
            return 0;

        for(int i = 0; i < mainArray.length; i++) {

            if(mainArray[i] == subArray[0]) {

                if(check(mainArray, subArray, i)) {

                    count++;
                }
            }
        }
        return count;
    }

    private static boolean check(char[] mainArray, char[] subArray, int index) {

        for(int i = 0; i < subArray.length; i++) {

            if( mainArray[index] != subArray[i] || index > mainArray.length){


                return false;
            }

            else
                index++;
        }

        return true;
    }
}
