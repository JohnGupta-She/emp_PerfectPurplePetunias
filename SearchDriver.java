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
    int[] arraylengths = {10000000, 20000000, 100000000, 200000000};


    System.out.println("LinSearch Test");
    for (int x = 0; x < 100; x++){
      for(int trialCtr = 0; trialCtr < 4; trialCtr ++){
        fillTest(arraylengths[trialCtr], test);
        System.out.println("Array Length " + test[trialCtr]);
        for (int x = 0; x < 100; x++){
          LinSearch.linSearch(test, test.length-1);
        }
      }
    }
    /*
    System.out.println("BinSearch Test");
    for(int trialCtr = 0; trialCtr < 10; trialCtr ++){
      System.out.println("Trial " + trialCtr);
      System.out.println(target[trialCtr]);
      System.out.println(BinSearch.binSearchIter(test, target[trialCtr], 0, 200000000));
    }
    */
    //System.out.println(toString(test));
  }

}
