n = int(input())
arr = []
target = []
solve = []

for i in range(n):
    target.append(int(input()))

num = 0
for i in range(1,n+1):
    arr.append(i)
    solve.append("+")

    while arr and arr[len(arr) - 1] == target[num]:
        num += 1
        arr.pop()
        solve.append("-")

if len(arr) != 0:
    print("NO")
else:
    print("\n".join(solve))