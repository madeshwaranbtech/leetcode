class Solution(object):
    def toHex(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num < 0:
            num += 2**32
        a=str(hex(num))
        b=""
        for i in range(2,len(a)):
            b=b+a[i]
        return b
        