class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy_price=prices[0]
        mprofit=0

        for i in range(1,len(prices)):
            if prices[i]<buy_price:
                buy_price=prices[i]
            else:
                profit=prices[i]-buy_price
                mprofit=max(mprofit,profit)
        return mprofit

        