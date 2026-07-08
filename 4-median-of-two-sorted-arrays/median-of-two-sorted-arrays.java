class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=nums1.length-1;
        int j=nums2.length-1;
        int k=0;
        
       int r=0; 
        int [] m=new int[i+j+2];
        int idx=0;
        while(k<=i&&r<=j){
            if(nums1[k]<=nums2[r]){
                m[idx++]=nums1[k++];
            }
            else if(nums1[k]>=nums2[r]){
                m[idx++]=nums2[r++];
            }
        }
        while(k<=i){
                m[idx++]=nums1[k++];

        }
        while(r<=j){
                m[idx++]=nums2[r++];

        }
    double med;
    if(m.length%2!=0){
        med=m[m.length/2];
    }
    else{
        med=(m[m.length/2]+m[m.length/2-1])/2.0;
    }
    return med;
    }
}