class Prime:
    def __init__(self, num):
        self.num = num

    def isPrime(self):
        counter = 0
        for i in range(1, self.num + 1):
            if self.num % i == 0:
                counter += 1
        if counter == 2:
            return True
        return False

if __name__ == "__main__":
    number = int(input("Write an integer: "))

    pr = Prime(number)

    if pr.isPrime():
        print("Your integer is prime")
    else:
        print("Your integer is NOT prime")