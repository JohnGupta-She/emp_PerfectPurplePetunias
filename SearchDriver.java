public class SearchDriver {
  ArrayList <Integers> test = new ArrayList <Integers>();
  test.add(0);
  for(int i = 1; i < 350000000000; i++){
    test.add( test.get(i-1) + (int)(10 * Math.random));
  }

  
}
