class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        p1,p2 = 0, 0
        for i in range(2, len(cost)+1):
            p1,p2 =p2, min(p2 + cost[i-1], p1 + cost[i-2])
        return p2