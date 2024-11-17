
class MedianTwoArray{
    public double findMedianSortedArrays(int [] nums1,int [] nums2){
        System.out.println("nums length "+nums1.length+" "+nums2.length);
        int len1= nums1.length;
        int len2 = nums2.length;
        int minE = Math.min(nums1[0],nums2[0]);
        int maxE = Math.max(nums1[len1-1],nums2[len2-1]);
        int low = minE;
        int high =maxE;
        
        
        
        
        
        
        return 0;

    }
    public static void main(String[] args) {
        MedianTwoArray m = new MedianTwoArray();
        int [] x={1,2,3};
        int [] y={1,2,3};
        m.findMedianSortedArrays(x,y);
    }
    
}