class MergeIntervals{
    public static void main(String[] args){

        int[][] intervals={{1,3},{2,6},{8,10},{15,18}}
        merge(intervals);
        
    }
    static int[][] merge(int[][] intervals) {

        if (intervals.length <= 1)
			return intervals;

		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
		result.add(newInterval);
		for (int[] interval : intervals) {
			if (interval[0] <= newInterval[1]) 
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			else {                    
				newInterval = interval;
				result.add(newInterval);
			}
		}

		return result.toArray(new int[result.size()][]);




        // List<Integer> numList = new ArrayList<>();
        // for(int[] numarr:intervals){
        //     for(int n:numarr){
        //         numList.add(n);
        //     }
        // }
        // Collections.sort(numList);
        // ArrayList<Integer> numFinal=new ArrayList<>();
        // numFinal.add(numList.get(0));
        // for(int i=1;i<numList.size()-1;i++){
        //     if(numList.get(i) == numList.get(i+1)){
        //         // i++;
        //         continue;
        //     }
        //     if((numList.get(i)-numList.get(i-1))>1){
        //         numFinal.add(numList.get(i));
        //     }
        // }
        // numFinal.add(numList.get(numList.size()-1));
        // int row=numFinal.size()/2;
        // int[][] ans=new int[row][2];
        // int idx=0;
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<2;j++){
        //         ans[i][j]=numFinal.get(idx++);
        //     }
        // }
        // return ans;
    }
}