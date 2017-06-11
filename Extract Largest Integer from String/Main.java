import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        List <String> list = new ArrayList<>();

        int T;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        while(T != 0) {

            list.add(br.readLine());
            T--;
        }


        for(int i = 0; i < list.size(); i++)
            System.out.println(""+findMax(list.get(i)));
    }

    private static int findMax(String str) {

        char strArray[] = str.toCharArray();
        int num = 0;
        int max = 0;

        for(int i = 0; i < strArray.length; i++) {

            if(Character.isDigit(strArray[i])) {

                while(i < strArray.length && Character.isDigit(strArray[i])){

                    num = (num * 10) + Character.getNumericValue(strArray[i]);
                    i++;
                }

                if(num > max) {
                    max = num;
                }

                num = 0;
            }
        }

        return max;
    }
}