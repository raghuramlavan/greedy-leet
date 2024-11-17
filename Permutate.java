public class Permutate {
    int count =0;
    public void printAllPermutation(String s, String prefix){
        if (s.length()==0) {
            System.out.println(prefix+" "+count);
            count++;
        }
        //System.out.println(s);
        for (int i=0;i<s.length();i++){
        printAllPermutation(s.substring(0,i)+s.substring(i+1,s.length()),s.charAt(i)+prefix);
        }


    }
    public static void main(String[] args) {
        Permutate p = new Permutate();
        p.printAllPermutation("lavan","");
    }
}
