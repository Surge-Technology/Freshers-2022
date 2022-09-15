package Akshay;

public class Count {

	/*Write a program to count number of words in a String?

Input
=======
My name is Pankaj
I Love Java Programming
This	is  not   properly formatted		lineOutput
=======
4
4
6*/
	

public static void main(String[] args) {  
     String sentence = "my name is pankaj";  
      int wordCount = 0;  
      for(int i = 0; i < sentence.length()-1; i++) {  
            
            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }          
        wordCount++;   
        System.out.println("Total number of words in the given string: " + wordCount);
           }  
}  




















