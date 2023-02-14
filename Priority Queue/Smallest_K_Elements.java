import java.util.*;
class Smallest_K_Elements{

    public static List<Integer> findKSmallestNumber(int[] nums,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);
        for(int i=0;i<k;i++)
        {
            maxHeap.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++)
        {
            if(nums[i]<maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(nums[i]);
            }
        }
        return new ArrayList<>(maxHeap);


    } 

    public static void main(String[] args){
        List<Integer> result = Smallest_K_Elements.findKSmallestNumber(new int[] {3,5,8,4,2,1,7}, 3);
        System.out.println(result);
    }
}
