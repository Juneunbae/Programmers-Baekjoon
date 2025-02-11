/**
    12934 - 정수 제곱근 판별

    문제
        임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
        n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

        제한 사항
        n은 1이상, 50000000000000 이하인 양의 정수입니다.

    TEST CASE
        n = 121 -> return 144
        n = 3 -> return -1
**/

class Sol12934 {
    public static Long solution(int n) {
        long sqrt = (long) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
            
        } else {
            return -1L;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Sol12934.solution(3));
    }
}

/**
 *  파이썬의 숫자형과 달리 자바의 숫자형 조건을 고려하지 않고 int 형으로 작성해서 틀렸다.
 *  Long 형으로 변경 후 성공
 **/
