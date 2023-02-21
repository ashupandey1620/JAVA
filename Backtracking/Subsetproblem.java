package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Subsetproblem {
    public static void main(String [] args)
    {
      Scanner sc =new Scanner(System.in);
      int arr[]={1,2,3,4};
      List<List<Integer>> ans = new ArrayList<>();
      ans = Subsetproblem.subsets(arr);
      System.out.println(ans);
       sc.close();
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
         List<Integer> subSet = new ArrayList<>();
         solve(nums,0,subSet,powerSet);
         return powerSet;
    }
    public static void solve(int[] nums,int i,List<Integer> subSet,List<List<Integer>> powerSet)
    {
        if(i==nums.length)
        {
        powerSet.add(new ArrayList<>(subSet));
        return;
        }
        else{
            subSet.add(nums[i]);
            solve(nums,i+1,subSet,powerSet);
            subSet.remove(subSet.size()-1);
            solve(nums,i+1,subSet,powerSet);    
        }
    }
}