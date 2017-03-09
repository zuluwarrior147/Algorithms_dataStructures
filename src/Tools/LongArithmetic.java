package Tools;

import java.io.*;

/**
 * Created by User on 22.02.2017.
 */
public class LongArithmetic{


    public static void main(String args[])throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();

        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();

        System.out.println(LongSum(s1, s2));

    }

    public static String LongSum(String s1, String s2){
        int pointer1 =0;
        int pointer2 =0;

        StringBuilder sum = new StringBuilder();
        int buffer = 0;

        while (pointer1 < s1.length() && pointer2 < s2.length()) {
            int a = Character.getNumericValue(s1.charAt(pointer1++));
            int b = Character.getNumericValue(s2.charAt(pointer2++));

            if (a + b + buffer >= 10) {
                sum.append((a + b + buffer) % 10);
                buffer=(a+b+buffer)/10;
            } else {
                if (buffer > 0) {
                    sum.append(a + b + buffer);
                    buffer--;
                } else
                    sum.append(a + b);

            }
        }
        while (pointer1<s1.length()){
            int a = Character.getNumericValue(s1.charAt(pointer1++));
            if(a+buffer>=10){
                sum.append((a+buffer)%10);
                buffer=(a+buffer)/10;
            } else {
                if (buffer > 0) {
                   sum.append(a + buffer);
                }
                else
                    sum.append(a);
            }
        }
        while (pointer2<s2.length()){
            int b = Character.getNumericValue(s2.charAt(pointer2++));
            if(b+buffer>=10){
                sum.append((b+buffer)%10);
                buffer=(b+buffer)/10;
            } else {
                if (buffer > 0) {
                    sum.append(b + buffer);
                }
                else
                    sum.append(b);
            }
        }
        if(buffer>0){
            sum.append(buffer);
        }

        return sum.reverse().toString();
    }


}
