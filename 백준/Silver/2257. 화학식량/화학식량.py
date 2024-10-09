text = input()
stack = []
atom = {'H':1, 'C':12, 'O':16}
for i in text:
    if i == '(':
        stack.append(i)
    elif i == 'H' or i == 'C' or i == 'O':
        stack.append(atom[i])
    elif i == ')':
        a = 0
        while 1:
            if stack[-1] != '(':
                a += stack.pop()
            else:
                stack.pop()
                stack.append(a)
                break
    else:
        stack.append(stack.pop()*int(i))

print(sum(stack))