package collections_42;

import java.util.Comparator;

public class MyComparator1 implements Comparator {

	public int compare(Object obj1, Object obj2) {
      Integer i1=(Integer)obj1;
      Integer i2=(Integer)obj2;
      
      if(i1<i2)
    	  return +1;
      else if (i1>i2)
          return -1;
      else
    	  return 0;
	}

}
