-- 코드를 입력하세요
SELECT U.USER_ID, U.NICKNAME, SUM(PRICE) TOTAL_SALES
FROM USED_GOODS_USER U
JOIN USED_GOODS_BOARD B
ON U.USER_ID = B.WRITER_ID
WHERE B.STATUS = 'DONE'
GROUP BY 1
HAVING TOTAL_SALES >= 700000
ORDER BY 3;