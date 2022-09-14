package eve;

import java.util.Arrays;



public class Anagram
{
  public static void main(String[] args)
  {
      String source="army";
      String target="mary";
      
      isAnagramUsingSort(source,target);
  }
  
  private static void isAnagramUsingSort(String source,String target)
  {
      char[] sourceChars=source.toLowerCase().toCharArray();
      char[] targetChars=target.toLowerCase().toCharArray();
      Arrays.sort(sourceChars);
      Arrays.sort(targetChars);
      boolean isAnagram=Arrays.equals(sourceChars,targetChars);
      System.out.println("find anagram using sort : "+isAnagram);
      
  }

}
