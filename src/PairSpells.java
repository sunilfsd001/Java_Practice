import java.util.*;
public class PairSpells {
    static void main(String[] args) {
        int[] spells={5,1,3,};
        int[] potions={1,2,3,4,5};
        int success=7;
        int[] result=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int left=0,right=potions.length-1;
            int index=potions.length;
            long spell=spells[i];
            long min = (long) (success+spell-1)/spell;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(potions[mid]>=min){
                    index=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            result[i]=potions.length-index;
        }
        System.out.println(Arrays.toString(result));
    }
}
