public class BinSearch
{

  public static int binSearchRec( Comparable[] a, Comparable target,
                                    int lo, int hi )
    {
      int tPos = -1; //init return var to flag value -1

      int m = (lo + hi) / 2; //init mid pos var

      //exit case. If lo & hi have crossed, target not present
      if (lo > hi)
        return tPos; //-1

      // target found
      if ( a[m].compareTo(target) == 0 )
        tPos = m;
      // value at mid index higher than target
      else if ( a[m].compareTo(target) > 0 )
        tPos = binSearchRec( a, target, lo, m-1 );
      // value at mid index lower than target
      else if ( a[m].compareTo(target) < 0 )
        tPos = binSearchRec( a, target, m+1, hi );

      return tPos;
    }//end binSearchRec


    public static int binSearchIter( Comparable[] a, Comparable target,
                                     int lo, int hi )
    {
      int tPos = -1; //init return var to flag value -1
      int m = (lo + hi) / 2; //init mid pos var

      while( lo <= hi ) { // run until lo & hi cross

        m = (lo + hi) / 2; //update mid pos var

        // target found
        if ( a[m].compareTo(target) == 0 )
          return m;

        // value at mid index higher than target
        else if ( a[m].compareTo(target) > 0 )
          hi = m - 1; //move hi to index to left of mid

        // value at mid index lower than target
        else if ( a[m].compareTo(target) < 0 )
          lo = m + 1; //move lo to index to right of mid
      }
      return tPos;
    }//end binSearchIter

}
