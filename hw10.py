nicks = ["Мавпродош", "Лорнектиф", "Древерол", "Фиригарпиг", "Клодобродыч"]

user_nick = input("Введите свой ник:")

# проверяем, есть ли введенный ник в списке секретных ников
if user_nick in nicks:
    print("Ты – свой. Приветствую, любезный", user_nick + "!")
else:
    print("Тут ничего нет. Еще есть вопросы?")