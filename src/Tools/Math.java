package Tools;

import java.util.zip.DeflaterOutputStream;

/**
 * Created by User on 26.02.2017.
 */
public class Math {
    public static int abs(int i){
        if(i<0) return -1;
        else return i;
    }

    public static double abs(double d){
        if (d<0.0) return -d;
        else return d;
    }

    public static boolean isPrime(int N){
        if (N<2) return false;
        for (int i = 2; i*i <= N; i++){
            if (N%i==0) return false;
        }
        return true;
    }

    public static double sqrt(double d){
        if(d<0.0) return Double.NaN;
        double err = 1e-15;
        double t = d;
        while(abs(t-d/t) > err*t){
            t = (d/t + t)/2.0;
        }
        return t;
    }

    public static double H(int N){
        double H = 0.0;
        for(int i = 1; i <= N; i++)
            H += 1.0/i;
        return H;
    }
}
