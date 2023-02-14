package Recursion;

public class stoneGame
{
    public static void main(String[] args) {
        int stones[] =new int[]{3,2,7,3};
        System.out.println(stoneGame.StoneGame(stones));
    }
    public static boolean StoneGame(int stones[])
    {
        
        int val = stoneGame.solve(stones,0,-1,true);

        if(val>0)
        return true;
        else
        return false;
    }
    public static int solve(int stones[],int left,int right,boolean alice)
    {
        if(left>right)
        return 1;

        if(alice)
        {
            int left_ans = stones[left] + solve(stones, left+1, right, !alice);
            int right_ans = stones[left] + solve(stones, left, right-1, !alice);
            return Math.max(left_ans,right_ans);
        }
        else{
            int left_ans = -stones[left] + solve(stones, left+1, right, !alice);
            int right_ans = -stones[left] + solve(stones, left, right-1, !alice);
            return Math.min(left_ans,right_ans);
        }
        

   
    }
}
