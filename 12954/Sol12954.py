'''
    문제 - x만큼 간격이 있는 n개의 숫자

    함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 가지는 리스트를 리턴합니다.
    다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

    제한 조건
    x는 -10000000 이상, 10000000 이하인 정수입니다.

    n은 1000 이하인 자연수입니다.

    입력 x = 2, n = 5
    출력 [2,4,6,8,10]

    입력 x = 4, n = 3
    출력 [4,8,12]

    입력 x = -4, n = 2
    출력 [-4, -8]
'''
def solution(x, n) :
    return [x * i for i in range(1, n + 1)]

print(solution(2, 5))
print(solution(4, 3))
print(solution(-4, 2))
