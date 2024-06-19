import random

number = int(input("Write an integer between 1 and 100: "))
random_number = random.randint(1, 100)

while number != random_number:
    if number < random_number:
        number = int(input("Write an highter integer: "))
    else:
        number = int(input("Write a lower integer: "))

if number == random_number:
    print(f"You won, the number was {random_number}")