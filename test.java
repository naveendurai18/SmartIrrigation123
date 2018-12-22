import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
	    String s =sc.nextLine();//welcome 123java
	    
	    String[] str = s.split(" ");
	    int count=0;
	    
	    
	    for(int i=0;i<str.length;i++){
	        
	        String[] ch = str[i].split(":");
	        
	        int hour=Integer.parseInt(ch[0]);
	        int min =Integer.parseInt(ch[1]);
	        
	        if(hour>10){
	            
	            count++;
	        }
	        else if(hour==10 && min>0){
	            count++;
	            
	        }
	    }
	    System.out.println(count);
    }
}