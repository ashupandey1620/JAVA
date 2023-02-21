package Backtracking;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubsetIIproblem 
{
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    int arr[]={1,2,3,4};
      List<List<Integer>> ans = new ArrayList<>();
      ans = Subsetproblem.subsets(arr);
      System.out.println(ans);
       sc.close();

    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> powerSet = new ArrayList<>();
         List<Integer> subSet = new ArrayList<>();
         solve(nums,0,subSet,powerSet);
         return powerSet;
    }

    public static void solve(int[] nums,int i,List<Integer> subSet,List<List<Integer>> powerSet)
    {
        if(powerSet.contains(subSet))
        return;

        if(i==nums.length)
        {
        powerSet.add(new ArrayList(subSet));
        return;
        }
     
            subSet.add(nums[i]);
             for (int j = i + 1; j <= nums.length; j++){
            solve(nums,i+1,subSet,powerSet);}
            subSet.remove(subSet.size()-1);
            solve(nums,i+1,subSet,powerSet);
            
             
        
    }
}