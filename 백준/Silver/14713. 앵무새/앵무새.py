from collections import deque

N = int(input())
arr = list()

for i in range(N):
    arr.append(deque(map(str, input().split())))


def possible(sentence, arr):
    misscnt = 0
    j = 0
    while sentence:
        if arr[j] and sentence[0] == arr[j][0]:
            arr[j].popleft()
            sentence.popleft()
            misscnt = 0
        else:
            if misscnt == N:
                return False
            misscnt += 1

        j = (j + 1) % N
    empty = 0
    for a in range(N):
        if len(arr[a]) == 0:
            empty += 1

    if not sentence and empty == N:
        return True
    else:
        return False


sentence = deque(map(str, input().split()))

if possible(sentence, arr):
    print("Possible")
else:
    print("Impossible")