'''
    문제 : 나머지 합

    문제 설명
    수 N개 A1, A2, ..., AN이 주어진다. 
    이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
    즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.

    입력
    첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 10^6, 2 ≤ M ≤ 10^3)
    둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 10^9)

    출력
    첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.

    TEST CASE
    5 3
    1 2 3 1 2 
    -> 7
'''
import sys

input = sys.stdin.readline

n, m = map(int, input().split()) 
# n - 수열의 개수
# m - 나누어 떨어져야 하는 수

A = list(map(int, input().split())) 
# A - 원본 수열 저장 리스트
S = [0] * n
# S - 합 배열
C = [0] * m
# C - 같은 나머지의 인덱스를 카운트하는 리스트

answer = 0

S[0] = A[0]
for i in range(1, n) :
    S[i] = S[i - 1] + A[i]

for i in range(n) :
    remainder = S[i] % m

    if remainder == 0 :
        answer += 1
    
    C[remainder] += 1

for i in range(m) :
    if C[i] > 1 :
        answer += (C[i] * (C[i] - 1) // 2) # 컴비네이션 공식

print(answer)
