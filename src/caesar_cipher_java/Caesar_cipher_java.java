/*
 * free without licence
 * free without licence
 * free without licence
 *  code club djelfa fb/CodeClubDjelfa
 */
package caesar_cipher_java;
/***/
import java.util.Scanner;
/**/
/**
 * @author islamlarbi / code club djelfa
 */
public class Caesar_cipher_java {

public static void main(String[] args){// main function 
                String text="y jhyut huqsxydw ekj je jxu secfqdo qdt aufj husuylydw qkjecqjut huifediui";//Example of encrypted text you can change text here or use scanner 
                String []word_expected={"to","ahmed"};//word_expected You can add any number of texts , The important thing in it is at least one valid and justified in the encoded text
		System.out.println("textEncrypted : \n"+Decryption_cezar(word_expected,text));// result use one function only 

}// end main function g
public static String Decryption_cezar(String []word_expected,String textEncrypted){// function Decryption have to parameter 
      String alphabet= "zyxwvutsrqponmlkjihgfedcba";// The characters are reversed
		String text="";// text clair
		textEncrypted=textEncrypted.toLowerCase(); // characters to lower characters
                
                   int key_encryption=1; // key encryption we start with value equal 1
                  
                for(int i=0;i<textEncrypted.length();i++) {//An external loop for extracting characters in encrypted text
			for(int j=0;j<26;j++) {// An internal loop to shift the character according to the encryption key
                            if(textEncrypted.charAt(i)==alphabet.charAt(j))//Comparing encrypted text characters and alphabet characters 
                             text=text+alphabet.charAt((j+key_encryption)%26);// Decrypt the character
                            if(textEncrypted.charAt(i)==' '){text=text+' ';break;}// End of the word , The word ends when there is a space
		}
                      //  The real secret is all here, focus here , you see this condition is located at first loop 
                      // you can see the function testin before this condition 
           if((testin(word_expected,text)&&text.length()==textEncrypted.length()-1)||key_encryption>26){break;} 
           if(i==textEncrypted.length()-1){key_encryption++;text=""; i=0;}

              }  //ff
//
 return text;// return result
}
public static boolean testin(String[] expected_word,String text_clair){// we search if one of expected word existe in text after decryption
 String text_clair_array[] = text_clair.split(" ");// Convert text to array for In order to compare characters 
 for(int i=0;i<text_clair_array.length;i++){
    for(int k=0;k<expected_word.length;k++) { 
           if(text_clair_array[i].equals(expected_word[k])){  return true;}}// if one of expected word existe in text after decryption return true                            
         } 
        return false;// return false if no one of expected word existe in text for more test authre jey 
}
}
