def solution(A,B):
    answer = 0

    li_a = sorted(A)
    li_b = list(reversed(sorted(B)))
    for i in range(len(li_a)):
        answer += (li_a[i] * li_b[i])

    return answer