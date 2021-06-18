package sTRING;

public class StringatOwnreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str="welcome to java Swapnil";
        String words[] = str.split(" ");
   
        String reversedString = "";
  
        //Reverse each word's position
         
        for (int i = 0; i < words.length; i++) 
        {   
                reversedString = " " + words[i] + reversedString; 
        } 
  
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    

	}

}
