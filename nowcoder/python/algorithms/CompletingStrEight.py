# HJ4 字符串分隔
"""
描述
•连续输入字符串，请按长度为8拆分每个输入字符串并进行输出；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

输入描述：
连续输入字符串(输入多次,每个字符串长度小于等于100)

输出描述：
依次输出所有分割后的长度为8的新字符串

示例1
输入：
abc
123456789
复制
输出：
abc00000
12345678
90000000

"""
# while True:
#     try:
#         s = input().strip()
#         while len(s) > 8:
#             print(s[:8])
#             s = s[8:]
#         print(s.ljust(8, '0'))
#     except:
#         break


class Solution:
    def completingStrEight(self, s):
        res = []
        while len(s) > 8:
            res.append(s[:8])
            s = s[8:]
        res.append(s.ljust(8, '0'))

        return res

if __name__ == '__main__':
    s = input().strip()
    print(Solution().completingStrEight(s))