package Recursion;

public class MinCostClimbingStairs {
    
public static int solve(int n,int[] cost)
{

    if(n<=1)
    return 0;

    int oneStep = cost[n-1]+solve(n-1,cost);
    int twoStep = cost[n-2]+solve(n-2,cost);
    return Math.min(oneStep,twoStep);
}

public static int MinCost(int[] cost){
    return MinCostClimbingStairs.solve(cost.length,cost);

}

public static void main()
{
    
}


}
