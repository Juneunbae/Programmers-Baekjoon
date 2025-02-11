'''
    12934 - 정수 제곱근 판별

    문제
        임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
        n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

        제한 사항
        n은 1이상, 50000000000000 이하인 양의 정수입니다.

    TEST CASE
        n = 121 -> return 144
        n = 3 -> return -1
'''

'''
    # pow(a, b) = a의 b 제곱
    # sqrt(a) = a의 제곱근
'''

import math

def solution(n):
    m = int(math.sqrt(n))

    if int(math.sqrt(n) ** 2) == pow(m, 2) :
        return pow(m+1, 2)
    
    else :
        return -1

print(solution(121))
