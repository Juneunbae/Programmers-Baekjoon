'''
    문제 : 서울에 위치한 식당 목록 출력하기

    문제 설명
    다음은 식당의 정보를 담은 REST_INFO 테이블과 식당의 리뷰 정보를 담은 REST_REVIEW 테이블입니다. 
    REST_INFO 테이블은 다음과 같으며 REST_ID, REST_NAME, FOOD_TYPE, VIEWS, FAVORITES, PARKING_LOT, ADDRESS, TEL은 식당 ID, 식당 이름, 음식 종류, 조회수, 즐겨찾기수, 주차장 유무, 주소, 전화번호를 의미합니다.

    Column name	    Type	        Nullable
    REST_ID	        VARCHAR(5)	    FALSE
    REST_NAME	    VARCHAR(50)	    FALSE
    FOOD_TYPE	    VARCHAR(20)	    TRUE
    VIEWS	        NUMBER	        TRUE
    FAVORITES	    NUMBER	        TRUE
    PARKING_LOT	    VARCHAR(1)	    TRUE
    ADDRESS	        VARCHAR(100)	TRUE
    TEL	            VARCHAR(100)	TRUE

    REST_REVIEW 테이블은 다음과 같으며 REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT,REVIEW_DATE는 각각 리뷰 ID, 식당 ID, 회원 ID, 점수, 리뷰 텍스트, 리뷰 작성일을 의미합니다.

    Column name	    Type	        Nullable
    REVIEW_ID	    VARCHAR(10)	    FALSE
    REST_ID	        VARCHAR(10)	    TRUE
    MEMBER_ID	    VARCHAR(100)	TRUE
    REVIEW_SCORE	NUMBER	        TRUE
    REVIEW_TEXT	    VARCHAR(1000)	TRUE
    REVIEW_DATE 	DATE	        TRUE

    REST_INFO와 REST_REVIEW 테이블에서 서울에 위치한 식당들의 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회하는 SQL문을 작성해주세요. 
    이때 리뷰 평균점수는 소수점 세 번째 자리에서 반올림 해주시고 결과는 평균점수를 기준으로 내림차순 정렬해주시고, 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬해주세요.

    예시
    REST_ID	REST_NAME	FOOD_TYPE    FAVORITES	 ADDRESS	                    SCORE
    00035	  삼촌식당	  일식          80	         서울특별시 강서구 가로공원로76가길	  4.50
'''
SELECT
    I.REST_ID, I.REST_NAME, I.FOOD_TYPE,
    I.FAVORITES, I.ADDRESS, ROUND(AVG(R.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO I
INNER JOIN REST_REVIEW R
    ON I.REST_ID = R.REST_ID
WHERE 
    I.ADDRESS LIKE '서울%'
GROUP BY I.REST_ID
ORDER BY
    SCORE DESC, I.FAVORITES DESC;
