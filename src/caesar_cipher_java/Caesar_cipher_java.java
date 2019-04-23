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

public static void main(String[] args){


  String alphabet= "zyxwvutsrqponmlkjihgfedcba";// الاحرف  مرتبة
		String text="";// النص المشفر
		Scanner sc=new Scanner(System.in);// كائن للقراءة objet 
		System.out.println("enter text");
		String textEncrypted=sc.nextLine().toLowerCase(); // قراءة النص من المستخدم
                String []word_expected={"had","ahmed"};
                   int key_encryption=1;
                  
                for(int i=0;i<textEncrypted.length();i++) {// text من اجل استخراج احرف
			for(int j=0;j<26;j++) {// alphabet من اجل استخراج احرف
                            if(textEncrypted.charAt(i)==alphabet.charAt(j))//المقارنة بين الاحرف 
                             text=text+alphabet.charAt((j+key_encryption)%26);// التشفير بالحرف 
                            if(textEncrypted.charAt(i)==' '){text=text+' ';break; 
			}
		}
                     if((testin(word_expected,text)&&text.length()==textEncrypted.length()-1)||key_encryption>26){break;}else{if(i==textEncrypted.length()-1){key_encryption++;text=""; i=0;}}
              }  
                
		System.out.println("textEncrypted : \n"+text);// اظهار النتيجة
}


public static boolean testin(String[] a,String b){
 String f[] = b.split(" ");
 for(int i=0;i<f.length;i++){
    for(int k=0;k<a.length;k++) { 
           if(f[i].equals(a[k])){  return true;}}
                             
 } return false;
};
}
