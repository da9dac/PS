from collections import deque

def solution(n, stack1):
    stack2, ans = deque(), []
    round = {i: 1 for i in range(1, n + 1)}

    for i in range(n, 0, -1):
        while True:
            if (round[i] == 1 and stack1[-1] == i) or (round[i] == 2 and stack2[-1] == i):
                if round[i] == 1:
                    stack1.pop()
                    ans.append((1, 3))
                else:
                    stack2.pop()
                    ans.append((2, 3))
                break
            else:
                if round[i] == 1:
                    num = stack1.pop()
                    round[num] = 2
                    stack2.append(num)
                    ans.append((1, 2))
                else:
                    num = stack2.pop()
                    round[num] = 1
                    stack1.append(num)
                    ans.append((2, 1))

    print(len(ans))
    for line in ans:
        print(*line)


if __name__ == "__main__":
    n = int(input())
    stack1 = deque(map(int, input().split()))
    solution(n, stack1)