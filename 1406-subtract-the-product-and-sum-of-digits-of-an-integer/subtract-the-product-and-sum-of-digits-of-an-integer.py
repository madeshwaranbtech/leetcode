class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        product = 1
        summ = 0
        while n != 0 :
            x = n % 10
            product *= x
            summ += x
            n = n // 10
        return product - summ 