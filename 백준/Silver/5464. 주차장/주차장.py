from collections import deque
n, m = map(int, input().split())
parkFee =dict()
parkAvailable = [(i+1) for i in range(n)]
usingPark = list()
carWeight = dict()
queue = deque()
carLocation = dict()
money = 0
for i in range(n):
    parkFee[i+1] = int(input())


for j in range(m):
    carWeight[j+1] = int(input())
    carLocation[j+1] = 0
idx =1
for a in range(2*m):
    car = int(input())
    if car > 0:
        if len(usingPark) != n:
            usingPark.append(min(parkAvailable))
            carLocation[car] = min(parkAvailable)
            money += carWeight[car]*parkFee[min(parkAvailable)]
            parkAvailable.remove(min(parkAvailable))
        else:
            queue.append(car)
    else:
        parkAvailable.append(carLocation[-car])
        usingPark.remove(carLocation[-car])
        carLocation[-car] = 0
        if queue:
            a = queue.popleft()
            usingPark.append(min(parkAvailable))
            carLocation[a] = min(parkAvailable)
            money += carWeight[a] * parkFee[min(parkAvailable)]
            parkAvailable.remove(min(parkAvailable))

print(money)