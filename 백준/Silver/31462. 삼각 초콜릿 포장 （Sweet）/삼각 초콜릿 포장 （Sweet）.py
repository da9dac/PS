import sys
input = sys.stdin.readline

def solve():
    N = int(input())
    G = [list(input().rstrip()) for _ in range(N)]
    try:
        for i in range(N):
            for j in range(i+1):
                if G[i][j] == 'R':
                    if G[i+1][j] == G[i+1][j+1] and G[i+1][j] == 'R':
                        G[i][j], G[i+1][j], G[i+1][j+1] = 'O', 'O', 'O'
                    else:
                        print(0)
                        return
                elif G[i][j] == 'B':
                    if G[i][j+1] == G[i+1][j+1] and G[i][j+1] == 'B':
                        G[i][j], G[i][j+1], G[i+1][j+1] = 'O', 'O', 'O'
                    else:
                        print(0)
                        return
                else:
                    continue
    except IndexError:
        print(0)
        return
    print(1)
    return
solve()