'''
    문제 : 택배 상자 꺼내기

    문제 설명
    1 ~ n의 번호가 있는 택배 상자가 창고에 있습니다. 
    당신은 택배 상자들을 다음과 같이 정리했습니다.
    왼쪽에서 오른쪽으로 가면서 1번 상자부터 번호 순서대로 택배 상자를 한 개씩 놓습니다. 
    가로로 택배 상자를 w개 놓았다면 이번에는 오른쪽에서 왼쪽으로 가면서 그 위층에 택배 상자를 한 개씩 놓습니다. 
    그 층에 상자를 w개 놓아 가장 왼쪽으로 돌아왔다면 또다시 왼쪽에서 오른쪽으로 가면서 그 위층에 상자를 놓습니다. 
    이러한 방식으로 n개의 택배 상자를 모두 놓을 때까지 한 층에 w개씩 상자를 쌓습니다.

    다음 날 손님은 자신의 택배를 찾으러 창고에 왔습니다. 
    당신은 손님이 자신의 택배 상자 번호를 말하면 해당 택배 상자를 꺼내줍니다. 
    택배 상자 A를 꺼내려면 먼저 A 위에 있는 다른 모든 상자를 꺼내야 A를 꺼낼 수 있습니다.
    예를 들어, 위 그림에서 8번 상자를 꺼내려면 먼저 20번, 17번 상자를 꺼내야 합니다.

    당신은 꺼내려는 상자 번호가 주어졌을 때, 꺼내려는 상자를 포함해 총 몇 개의 택배 상자를 꺼내야 하는지 알고 싶습니다.

    창고에 있는 택배 상자의 개수를 나타내는 정수 n, 가로로 놓는 상자의 개수를 나타내는 정수 w와 꺼내려는 택배 상자의 번호를 나타내는 정수 num이 매개변수로 주어집니다. 
    이때, 꺼내야 하는 상자의 총개수를 return 하도록 solution 함수를 완성해 주세요.

    제한사항
    2 ≤ n ≤ 100
    1 ≤ w ≤ 10
    1 ≤ num ≤ n
'''
def solution(n, w, num):
    answer = 0

    numbers = list(range(1, n + 1))
    result = []

    for i in range(0, n, w):
        temp = numbers[i:i+w]

        while len(temp) < w:
            temp.append(0)

        if (len(result) % 2 == 0) :
            result.append(temp)
        
        else :
            temp.reverse()
            result.append(temp)

    for i in range(len(result)) :
        for j in range(len(result[0])) :

            if (result[i][j] == num) :
                for z in range(i, len(result)) :
                    if result[z][j] != 0 :
                        answer += 1
            
                return answer
                
    return 0

print(solution(22, 6, 8)) # 3
print(solution(13, 3, 6)) # 4
