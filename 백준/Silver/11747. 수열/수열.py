import sys
input = sys.stdin.read

data = input().split()

n = int(data[0])
arr = data[1:n+1]

set_numbers = set()

for i in range(n):
    sb = []
    for j in range(i, n):
        sb.append(arr[j])
        set_numbers.add(int(''.join(sb)))

min_number = 0

for num in sorted(set_numbers):
    if num > min_number:
        print(min_number)
        break
    min_number = num + 1
else:
    print(min_number)