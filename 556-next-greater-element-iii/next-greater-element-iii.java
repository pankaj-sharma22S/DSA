class Solution {
    public int nextGreaterElement(int n) {
        
        Stack<Integer> st=new Stack<>();
        char[]arr=String.valueOf(n).toCharArray();
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i<0){
            return -1;
        }
        int j=arr.length-1;
        while(arr[i]>=arr[j]){
            j--;
        }
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      int l = i + 1;
        int r = arr.length - 1;

        while (l < r) {
            char temp1 = arr[l];
            arr[l] = arr[r];
            arr[r] = temp1;

            l++;
            r--;
}
        long ans=Long.parseLong(new String(arr));
        if(ans>Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;
    }
}