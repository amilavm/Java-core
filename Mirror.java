import java.util.*;
import java.lang.*;

public class Mirror{

public static void main(String[] args){

System.out.println("input stream:");
Scanner s = new Scanner(System.in);

String str = s.next();

System.out.println("Entered: "+s);

//begins
for(int k=0; k<str.length();k++){
for(int i=k; i<str.length()-6; i++){
//String strChk = str.substring(k,i+6);
String strChk = getSubString(str, k , i+6);
checkPal(strChk); 
}
}

}

public static String getSubString(String str, int l, int h){
String subStr="";
for(int i=l;i<h;i++){
subStr = subStr+str.charAt(i);
}

return subStr;
}

public static void checkPal(String str){

String palString = "";

Stack<Character> stack = new Stack<Character>();

for(int i=0; i<str.length(); i++){
stack.push(str.charAt(i)); 
}

while (!stack.isEmpty()){
palString = palString + stack.pop();
}


if(str.equals(palString)){
System.out.println("Candidate mirror checked:"+ getSubString(str, 0, str.length()/2));
}


}


}
