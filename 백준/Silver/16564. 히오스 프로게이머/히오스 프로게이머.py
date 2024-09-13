N, K = map(int, input().split())
levels = [int(input()) for _ in range(N)]
levels.sort()
idx = 0

while K > 0 and idx < N:
    if idx == N-1 : # 마지막 인덱스까지 도달한 경우
        levels[idx] += K // N
        break
    
    gap = (levels[idx+1] - levels[idx]) * (idx+1)
    if gap >= K :
        levels[idx] += K // (idx+1)
        K = 0
    else :
        idx += 1
        K -= gap

print(levels[idx])