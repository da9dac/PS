SELECT C.CAR_ID, C.CAR_TYPE, ROUND((1 - (0.01 * P.DISCOUNT_RATE)) * C.DAILY_FEE * 30) AS FEE
FROM CAR_RENTAL_COMPANY_CAR C
LEFT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H
USING(CAR_ID)
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
ON C.CAR_TYPE = P.CAR_TYPE AND C.CAR_TYPE IN('SUV', '세단') AND DURATION_TYPE = '30일 이상'
GROUP BY C.CAR_ID
HAVING MAX(H.END_DATE) < '2022-11-01' AND FEE >= 500000 AND FEE < 2000000
ORDER BY 3 DESC, 2, 1 DESC;