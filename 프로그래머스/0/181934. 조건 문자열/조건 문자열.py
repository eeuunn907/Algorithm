'''
n과 m이 주어진다
'''

def solution(ineq, eq, n, m):
    answer = 0
    if ineq == '>' and eq == '=':
        answer = 1 if n >= m else 0
    elif ineq == '<' and eq == '=':
        answer = 1 if n <= m else 0
    elif ineq == '>' and eq == '!':
        answer = 1 if n > m else 0
    elif ineq == '<' and eq == '!':
        answer = 1 if n < m else 0
    return answer