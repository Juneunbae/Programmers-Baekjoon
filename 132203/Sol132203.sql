'''
    문제 : 흉부외과 또는 일반외과 의사 목록 출력하기

    문제 설명
    다음은 종합병원에 속한 의사 정보를 담은DOCTOR 테이블입니다. 
    DOCTOR 테이블은 다음과 같으며 DR_NAME, DR_ID, LCNS_NO, HIRE_YMD, MCDP_CD, TLNO는 각각 의사이름, 의사ID, 면허번호, 고용일자, 진료과코드, 전화번호를 나타냅니다.
    Column name     Type	          Nullable
    DR_NAME	        VARCHAR(20)	    FALSE
    DR_ID	          VARCHAR(10)	    FALSE
    LCNS_NO	        VARCHAR(30)	    FALSE
    HIRE_YMD	      DATE	          FALSE
    MCDP_CD	        VARCHAR(6)	    TRUE    
    TLNO	          VARCHAR(50)	    TRUE
    
    DOCTOR 테이블에서 진료과가 흉부외과(CS)이거나 일반외과(GS)인 의사의 이름, 의사ID, 진료과, 고용일자를 조회하는 SQL문을 작성해주세요. 
    이때 결과는 고용일자를 기준으로 내림차순 정렬하고, 고용일자가 같다면 이름을 기준으로 오름차순 정렬해주세요.

    주의사항
    날짜 포맷은 예시와 동일하게 나와야합니다.
'''
SELECT
    DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE
    MCDP_CD IN ('GS', 'CS')
ORDER BY
    HIRE_YMD DESC, DR_NAME ASC;
