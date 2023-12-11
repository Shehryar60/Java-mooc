
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> n=new  ArrayList<>();
        n.add(2);
        n.add(-1);
        n.add(3);
        n.add(10);
        
      int s=sum(n);
              
        System.out.println(s);
              
              

        
    }

    
    
    
    
    
    
    
    
    
   public static int sum(ArrayList<Integer> numbers){
       int sum=0;
       
      for(int num:numbers){
          sum=sum+num;
          
      }
          
       return sum;
   
   }
   
}
