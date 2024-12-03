class Solution(object):
    def isPrefixOfWord(self, sentence, searchWord):
        """
        :type sentence: str
        :type searchWord: str
        :rtype: int
        """
        word=sentence.split()
        for i in range(len(word)):
            if(word[i].startswith(searchWord)):
                return i+1
        return -1