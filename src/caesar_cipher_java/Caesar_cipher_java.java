/*
 * free without licence
 * free without licence
 * free without licence
 */
package caesar_cipher_java;

import java.util.Scanner;

/**
 *
 * @author islamlarbi
 */
public class Caesar_cipher_java {

public static void main(String[] args){// main function 
                String text="y jhyut huqsxydw ekj je jxu secfqdo qdt aufj husuylydw qkjecqjut huifediui";//Example of encrypted text you can change text here or use scanner 
                String []word_expected={"to","ahmed"};//word_expected You can add any number of texts The important thing in it is at least one valid and justified in the encoded text
		System.out.println("textEncrypted : \n"+Decryption_cezar(word_expected,text));// result use one function only 

}// end main function 
public static String Decryption_cezar(String []word_expected,String textEncrypted){// function Decryption have to parameter 
      String alphabet= "zyxwvutsrqponmlkjihgfedcba";// The characters are reversed
		String text="";// text clair
		textEncrypted=textEncrypted.toLowerCase(); // characters to lower characters
                
                   int key_encryption=1; // key encryption we start with value equal 1 
                  
                for(int i=0;i<textEncrypted.length();i++) {// text من اجل استخراج احرف
			for(int j=0;j<26;j++) {// alphabet من اجل استخراج احرف
                            if(textEncrypted.charAt(i)==alphabet.charAt(j))//المقارنة بين الاحرف 
                             text=text+alphabet.charAt((j+key_encryption)%26);// التشفير بالحرف 
                            if(textEncrypted.charAt(i)==' '){text=text+' ';break; 
			}
		}
           if((testin(word_expected,text)&&text.length()==textEncrypted.length()-1)||key_encryption>26){break;}
           else{if(i==textEncrypted.length()-1){key_encryption++;text=""; i=0;}}

              }  

 return text;
}
public static boolean testin(String[] a,String b){
 String f[] = b.split(" ");
 for(int i=0;i<f.length;i++){
    for(int k=0;k<a.length;k++) { 
           if(f[i].equals(a[k])){  return true;}}
                             
 } return false;
}
}
