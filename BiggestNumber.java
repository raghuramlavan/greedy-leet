import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BiggestNumber {
    public static void main(String[] args) {
        int [] nums ={0,0};
        System.out.println(test(nums));
        
    }
    public static String test(int [] nums){
        List<String> ints = new ArrayList<String>(nums.length);
        for(int i=0;i<nums.length;i++){
            ints.add(Integer.toString(nums[i]));
        }
        ints.sort((a,b)->(b+a).compareTo((a+b)));
      //List<String> s = ints.stream().map(Object::toString).sorted().collect(Collectors.toList());

      StringBuilder b = new StringBuilder();
      for (String string : ints) {
        b.append(string);
        
      }
           
      if(ints.get(0).equals("0")) {
        return "0";}
      
      return b.toString();
    }
}
    

