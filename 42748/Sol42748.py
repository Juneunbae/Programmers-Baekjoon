'''
    문제 - K번째 수

    배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하라.

    제한 조건
    - array의 길이는 1 이상 100 이하
    - array의 각 원소는 1 이상 100 이하
    - commands의 길이는 1 이상 50 이하
    - commands의 각 원소는 길이가 3
    - [i, j, k] 형태
        - i는 1 이상 j 이하
        - j는 i 이상 array의 길이 이하
        - k는 1 이상 j - i + 1 이하

    입출력 예
    array = [1, 5, 2, 6, 3, 7, 4]
    commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
    return = [5, 6, 3]
'''

def solution(array, commands):
    answer = []
    for command in commands:
        newArray = array[command[0] - 1:command[1]]
        newArray.sort()
        answer.append(newArray[command[2] - 1])

    return answer


print(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))  # [5, 6, 3]
