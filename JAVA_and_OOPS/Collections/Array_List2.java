import java.util.ArrayList;
import java.util.List;

public class Array_List2 {
    public static void main(String[] args) {
        int[] nums=new int[3];
        nums[0]=4;nums[1]=8;nums[2]=9;
        List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<(1<<n);i++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))>0)
                {
                    temp.add(nums[j]);

                }
            }
            arr.add(new ArrayList<>(temp));
        }

    }
}
