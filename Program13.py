def is_palindrome(word):
    # Convert to lowercase to make it case-insensitive
    word = word.lower()
    return word == word[::-1]

Spelling = input("enter")
if is_palindrome (Spelling):
    print(f"'{Spelling} is a palindrome")
else:
    print(f"'{Spelling}' is not a palindrome")
