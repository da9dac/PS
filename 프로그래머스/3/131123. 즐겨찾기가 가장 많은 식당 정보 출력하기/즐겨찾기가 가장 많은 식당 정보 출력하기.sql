-- 코드를 입력하세요
WITH MAX_FAVORITES AS (
    SELECT FOOD_TYPE, MAX(FAVORITES) FAVORITES
    FROM REST_INFO
    GROUP BY FOOD_TYPE
)

SELECT R.FOOD_TYPE, R.REST_ID, R.REST_NAME, R.FAVORITES
FROM REST_INFO R
JOIN MAX_FAVORITES F
ON R.FOOD_TYPE = F.FOOD_TYPE AND R.FAVORITES = F.FAVORITES
ORDER BY 1 DESC;
