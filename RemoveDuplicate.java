import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {

        int firstPointer = 0;
        for(int i=0; i<nums.length; i++){

            if(nums[firstPointer]!= nums[i]){
                nums[++firstPointer] = nums[i];
            }

        }
        return ++firstPointer;
    }
}
