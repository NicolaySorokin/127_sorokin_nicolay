
def g(tom, jer, s):
    if tom > jer:
        fg = s / (tom - jer)
        print("Том догонит Джерри через", fg, "секунд")
    elif tom < jer:
       print("Том не догонит Джерри")
print("Введите скорость Тома")
tom = int(input())
print("Введите скорость Джерри")
jer = int(input())
print("Введите расстояние между ними")
s = int(input())
print(g(tom, jer, s))





