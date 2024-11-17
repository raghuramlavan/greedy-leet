public class WiggleSort {
    public static void main(String[] args) {
        //int [] ar ={3,5,2,1,6,4};
        int [] ar ={6,6,5,6,3,8};
        int [] result = wiggle(ar);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
    public static int[] wiggle(int [] ar){
        for(int i=0;i<ar.length-1;i++){
            if(i%2 == 0){
                if(ar[i]>ar[i+1]){
                    int temp = ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;
                }
            }else{
                if(ar[i]<ar[i+1]){
                    int temp = ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;
                }
            }
        }
        return ar;
    }
    
}
