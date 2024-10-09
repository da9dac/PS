import heapq

card = []
sum = 0

n,m = input().split(" ")

n = int(n)
m = int(m)

num = list(map(int,input().split(" ")))
heapq.heapify(num)

for i in range(m):
    minx = heapq.heappop(num)
    min2 = heapq.heappop(num)
    min3 = minx + min2
    heapq.heappush(num,min3)
    heapq.heappush(num,min3)

for i in range(n):
    sum += num[i]

print(sum)