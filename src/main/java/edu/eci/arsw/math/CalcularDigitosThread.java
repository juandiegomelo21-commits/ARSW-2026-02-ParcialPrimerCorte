package edu.eci.arsw.math;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

import static edu.eci.arsw.math.Main.bytesToHex;


public class CalcularDigitosThread extends Thread {

    private final int start;
    private final int count;

    private byte [] numero;
    private String bytesToHex;


    public CalcularDigitosThread(int start, int count){
        this.start=start;
        this.count=count;
    }


    @Override
    public void run(){
        numero = PiDigits.getDigits(start, count);
        /**
        "System.out.println(Arrays.toString(numero));"
         */
        bytesToHex=bytesToHex(numero);
        System.out.println(bytesToHex);

    }

}
