class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        mp=float('inf')
        mp1=0
        for price in prices:
            mp=min(mp,price)
            mp1=max(mp1,price-mp)
        return mp1
        