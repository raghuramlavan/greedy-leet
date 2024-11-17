class Solution{

    public double getTotalLessThan(int [] num, int target){
        int len = num.length;
        int low = 0;
        int high = len-1;
        if(num[len-1] <= target) return len;

        while(high-low >1){
            int mid = (int) (high+low)/2;
            //System.out.println("low :"+low+" high:"+high+" mid "+mid);
            if (num[mid]>target){
                high = mid;
            }else{
                low =mid;
            }
            //System.out.println("low :"+low+" high:"+high+" mid "+mid);       
        }
        
        if (num[high]==target) {
            //System.out.println("low :"+low+" high:"+high);
            return high;}

        
        return low;

    }
    public double findMedianSortedArrays(int[] nums1,int [] nums2){
        int len1 =nums1.length;
        int len2 = nums2.length;
        int target;
        boolean ifEven;
        if ((len1+len2)%2==0){
            target = (len1+len2)/2;
            ifEven = true;
        }else{
            target = (len1+len2-1)/2;
            ifEven = false;
        }

        int maxN = Math.max(nums1[len1-1],nums2[len2-1]);
        int minN = Math.max(nums1[0],nums2[0]);
        int low = minN;
        int high = maxN;

        while(high-low>1){
            int mid = (high+low)/2;
            double l = getTotalLessThan(nums1,mid)+getTotalLessThan(nums2,mid);
            if (l>target) high =mid;
            else low = mid;
        }

        return low;

    }
    public static void main(String[] args) {
        Solution s =new Solution();
        int [] x = {1,2,3};
        int [] y = {2,3,4};
        double yy=s.findMedianSortedArrays(x,y);
        System.out.println(yy);
    }
}