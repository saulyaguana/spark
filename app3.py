def palindrome(word):
    inversed_word = word[::-1]

    word.lower()
    word.replace(" ", "")

    if word == inversed_word:
        return True
    return False

pal1 = palindrome("A  n a")

if pal1:
    print("Palindrome")
else:
    print("NOT a pal")