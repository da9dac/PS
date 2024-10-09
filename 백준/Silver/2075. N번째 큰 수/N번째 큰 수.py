import heapq
from heapq import heappop

n = int(input())
num = []

for i in range(n):
    arr = input().split(" ")
    for j in range(len(arr)):
        arr[j] = int(arr[j])
        heapq.heappush(num, arr[j])
        if(len(num) > n):
            heapq.heappop(num)

print(heappop(num))