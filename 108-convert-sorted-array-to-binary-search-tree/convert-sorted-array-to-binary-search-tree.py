# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: Optional[TreeNode]
        """
        return None if not nums else TreeNode(nums[len(nums)//2],self.sortedArrayToBST(nums[:len(nums)//2]),self.sortedArrayToBST(nums[len(nums)//2+1:]))