import random

def guess_number():
    number = random.randint(1, 100)
    attempts = 0

    print("Добро пожаловать в игру 'Угадай число'!")
    print("Я загадал число от 1 до 100. Попробуйте угадать его.")

    while True:
        guess = int(input("Введите ваше предположение: "))
        attempts += 1

        if guess < number:
            print("Мое число больше вашего.")
        elif guess > number:
            print("Мое число меньше вашего.")
        else:
            print(f"Поздравляю! Вы угадали число {number} за {attempts} попыток.")
            break

    print("Спасибо, что играли в 'Угадай число'!")

guess_number()
