import java.lang.System;
public class SearchDriver {

  private static String toString(int[] input){
    String output = "";
    for (int x: input){
      output += x + ",";
    }
    return output;
  }

  private static Comparable[] fillTest(int x){
    Comparable[] test = new Comparable[x];
    for(int i = 0; i < x; i++){
      test[i] = i;
    }
    return test;
  }

  public static void main(String[] args){
    Comparable[] test;
    /*
    10,000,000
    20,000,000
    100,000,000
    200,000,000
    1,000,000,000
    2,000,000,000
    */
    int[] arraylengths = {100000, 500000, 5000000};
    long[] timesLin = new long[3];
    long[] timesBin = new long[3];
    int x;

    System.out.println("LinSearch Test");
    for(int trialCtr = 0; trialCtr < 3; trialCtr ++){
      test = fillTest(arraylengths[trialCtr]);
      System.out.println("Array Length " + arraylengths[trialCtr]);
      long timestart = System.currentTimeMillis();
      for (int y = 0; y < 100; y++){
        LinSearch.linSearch(test, test.length-1);
      }
      System.out.println("Test " + trialCtr + " complete");
      long timeend = System.currentTimeMillis();
      timesLin[trialCtr] = timeend - timestart;
    }
    System.out.println("LinSearch Complete");

    System.out.println("BinSearch Test");
    for(int trialCtr = 0; trialCtr < 3; trialCtr ++){
      test = fillTest(arraylengths[trialCtr]);
      System.out.println("Array Length " + arraylengths[trialCtr]);
      long timestart = System.currentTimeMillis();
      for (int y = 0; y < 100; y++){
        BinSearch.binSearchIter( test, test.length-1, 0, test.length-1);
      }
      System.out.println("Test " + trialCtr + " complete");
      long timeend = System.currentTimeMillis();
      timesBin[trialCtr] = timeend - timestart;
    }
    System.out.println("BinSearch Complete");

    System.out.println("LinSearch Results:");
    for(int trialCtr = 0; trialCtr < 3; trialCtr++){
      System.out.println("Test " + arraylengths[trialCtr] + ": " + timesLin[trialCtr]);
    }
    System.out.println("BinSearch Results:");
    for(int trialCtr = 0; trialCtr < 3; trialCtr++){
      System.out.println("Test " + arraylengths[trialCtr] + ": " + timesBin[trialCtr]);
    }
    System.out.println("Comparison:");
    for(int trialCtr = 0; trialCtr < 3; trialCtr++){
      System.out.println("Test " + arraylengths[trialCtr] + ": " + (timesLin[trialCtr] - timesBin[trialCtr]));
    }
  }
    //System.out.println(toString(test));
}
