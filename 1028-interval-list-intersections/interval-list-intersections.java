class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0,j=0;
        List<int[]> list=new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            int[] l1=firstList[i];
            int[] l2=secondList[j];
            if(l1[1]>=l2[0] && l1[0]<=l2[1]){
                int left=Math.max(l1[0],l2[0]);
                int right=Math.min(l1[1],l2[1]);

                int []arr={left,right};
                list.add(arr);
            }
            if(l1[1]<l2[1]){
                i++;
            }
            else if(l1[1]>l2[1]){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        int[][]ans=new int[list.size()][2];
        for(int k=0; k<list.size(); k++){
            ans[k]=list.get(k);
        }
        return ans;
    }
}