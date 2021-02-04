//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListLast
{
  
	public static boolean go( List<Integer> ray)
	{
    int lastItem = ray.get(ray.size()-1);
    boolean outcome = false;
    for(int i=ray.size()-2; i>=0; i--)
    {
      if (lastItem == ray.get(i))
      {
        outcome = true;
        break;
      }

      else
      {
        outcome = false;
      }

      
    }
    System.out.println(lastItem);
		return outcome;
	}
}