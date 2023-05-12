import random

def get_computer_move():
    moves = ["rock", "paper", "scissors", "lizard", "spock"]
    return random.choice(moves)

def determine_winner(player_move, computer_move):
    if player_move == computer_move:
        return "ничья"
    elif (player_move == "rock" and computer_move in ["scissors", "lizard"]) or \
         (player_move == "paper" and computer_move in ["rock", "spock"]) or \
         (player_move == "scissors" and computer_move in ["paper", "lizard"]) or \
         (player_move == "lizard" and computer_move in ["paper", "spock"]) or \
         (player_move == "spock" and computer_move in ["rock", "scissors"]):
        return "player"
    else:
        return "computer"

while True:
    print("Добро пожаловать в игру - камень, ножницы, бумага, ящерица, Спок")
    print("Выберите вашу роль: rock, paper, scissors, lizard, или spock. Пишите на английском")
    player_move = input("> ").lower()
    while player_move not in ["rock", "paper", "scissors", "lizard", "spock"]:
        print("Неправильно написано, попробуйте снова.")
        player_move = input("> ").lower()
    computer_move = get_computer_move()
    print(f"Компьютер выбрал {computer_move}.")
    result = determine_winner(player_move, computer_move)
    if result == "tie":
        print("Это ничья")
    elif result == "player":
        print("Ты выйграл!!!")
    else:
        print("Компьютер победил")
    play_again = input("Сыграть снова? (y/n) ").lower()
    if play_again != "y":
        break
