import java.util.*;
class Majorityelement {

    public static void main(String[] args){
        int[] nums={3,2,3,5,6,6,8,6,8,6,6};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int limit=nums.length/3;
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int i:nums){
            if(map.get(i)>limit && !list.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
