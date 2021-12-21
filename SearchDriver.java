import java.lang.System;
public class SearchDriver {

  private static String toString(int[] input){
    String output = "";
    for (int x: input){
      output += x + ",";
    }
    return output;
  }

  private static void fillTest(int x, int[] test){
    test = new int[x];
    for(int i = 0; i < x; i++){
      test[i] = i;
    }
  }

  public static void main(String[] args){
    int[] test = {};
    /*
    10,000,000
    20,000,000
    100,000,000
    200,000,000
    1,000,000,000
    2,000,000,000
    */
    int[] arraylengths = {10000000, 50000000, 500000000, 1000000000};
    long[] timesLin = new long[4];
    long[] timesBin = new long[4];
    int x;

    System.out.println("LinSearch Test");
    for(int trialCtr = 0; trialCtr < 4; trialCtr ++){
      fillTest(arraylengths[trialCtr], test);
      System.out.println("Array Length " + arraylengths[trialCtr]);
      long timestart = System.currentTimeMillis();
      for (int y = 0; y < 1000000000; y++){
        LinSearch.linSearch(test, test.length-1);
      }
      System.out.println("Test " + trialCtr + " complete");
      long timeend = System.currentTimeMillis();
      timesLin[trialCtr] = timeend - timestart;
    }
    System.out.println("LinSearch Complete");

    System.out.println("BinSearch Test");
    for(int trialCtr = 0; trialCtr < 4; trialCtr ++){
      fillTest(arraylengths[trialCtr], test);
      System.out.println("Array Length " + arraylengths[trialCtr]);
      long timestart = System.currentTimeMillis();
      for (int y = 0; y < 1000000000; y++){
        BinSearch.binSearchRec( test, test.length-1, 0, test.length-1);
      }
      System.out.println("Test " + trialCtr + " complete");
      long timeend = System.currentTimeMillis();
      timesBin[trialCtr] = timeend - timestart;
    }
    System.out.println("BinSearch Complete");

    System.out.println("LinSearch Results:");
    for(int trialCtr = 0; trialCtr < 4; trialCtr++){
      System.out.println("Test " + arraylengths[trialCtr] + ": " + timesLin[trialCtr]);
    }
    System.out.println("BinSearch Results:");
    for(int trialCtr = 0; trialCtr < 4; trialCtr++){
      System.out.println("Test " + arraylengths[trialCtr] + ": " + timesBin[trialCtr]);
    }
    System.out.println("Comparison:");
    for(int trialCtr = 0; trialCtr < 4; trialCtr++){
      System.out.println("Test " + arraylengths[trialCtr] + ": " + (timesLin[trialCtr] - timesBin[trialCtr]));
    }
  }
    //System.out.println(toString(test));
}
