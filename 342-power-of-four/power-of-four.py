class Solution(object):
    def isPowerOfFour(self, n):
        """
        :type n: int
        :rtype: bool
        """
        for i in range(16):
            p=4**i
            if p==n:
                return True
            if p>n:
                return False
        return False
        