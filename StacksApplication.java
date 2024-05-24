import java.util.*;

class StacksApplication{
public static void main (String args[]){

    //reverse a sentence 
    Scanner scan= new Scanner(System.in);
    System.out.println("enter a sentence: ");
    String input= scan.nextLine();

    String words[]=input.split(" "); //split sentences wherever needed
    Stack<String> s=new Stack<String>();

    for(int i=0; i<words.length; i++){
        s.push(words[i]);
    }

    for(int i=0; i<words.length; i++){
        System.out.println(s.pop()+" ");
    }

    
     //reverse a word 
     Scanner scan1= new Scanner(System.in);
     System.out.println("enter a word: ");
     String input1= scan1.nextLine();
    
     char letters[] = input1.toCharArray(); //array to split word

     Stack<Character> s2=new Stack<Character>();
    
     for(int i=0; i<letters.length; i++){
         s2.push(letters[i]);
    }
    
     for(int i=0; i<letters.length; i++){
        System.out.println(s2.pop()+" "); //letters on diff line 
        //System.out.print(s2.pop()+" "); letters on same line 
    }
}
}