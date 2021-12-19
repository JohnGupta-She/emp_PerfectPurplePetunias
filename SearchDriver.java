public class SearchDriver {


  private static String toString(int[] input){
    String output = "";
    for (int x: input){
      output += x + ",";
    }
    return output;
  }

  public static void main(String[] args){
    int[] test;
    test = new int[200000000];
    for(int i = 0; i < 200000000; i++){
      test[i] = i;
      //System.out.println(test[i]);
    }

    int[] target = new int[10];
    for(int x = 0; x < 10; x++){
      target[x] = (int)(Math.random() * 200000000);
    }

    System.out.println("LinSearch Test");
    for(int trialCtr = 0; trialCtr < 10; trialCtr ++){
      System.out.println("Trial " + trialCtr);
      System.out.println(target[trialCtr]);
      System.out.println(LinSearch.linSearch(test, target[trialCtr]));
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
