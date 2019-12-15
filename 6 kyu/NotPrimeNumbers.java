import java.util.List;
import java.util.ArrayList;

public class NotPrimeNumbers { 
    public static List<Integer> notPrimes(int a, int b) {    
        List<Integer> arrayList = new ArrayList<>();
        for(int i = a; i < b; i++) {
            if(i < 21) {
                continue;
            }    
            String temp = "";
            temp += i;  
            for(int j = 0; j < temp.length(); j++) {   
                if(temp.charAt(j) == '2' || temp.charAt(j) == '3' || temp.charAt(j) == '5' || temp.charAt(j) == '7') {
                    if(j == temp.length()-1) {
                        check(i, arrayList);
                        break;
                    } 
                    continue;
                }
                else {
                    break;
                }
            }  
        }
        return arrayList; // Do your magic!
    }
    public static void check(int num, List<Integer> arrayList) {
        boolean flag = false;
        for(int i = 2; i < num; i++) {  
            if(num%i == 0) {
                flag = true;
                break;
            }
            else {
                continue;
            }
        }
        if(flag == true) arrayList.add(num);
    } 
}