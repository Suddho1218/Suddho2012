#String
#Different ways for writing strings
str1 = "Hi"
str2 = 'hello'
str3 = '''Bye'''
print(str1)
print(str2)
print(str3)
#Escape sequence characters
#1)\n: used for writing something in the next linr
str5 = "Hello. \n My name is Suddhosatto De"
print(str5)
#2)\t: used for putting tab space in between two words or senteces or something else
str6 = "Hello \t Hola"
print(str6)
#Concatenation
print(str1+str2)
#using len function
str7 = "Amigo"
print(str7)
print(len(str7))
str8 = "Wow" +" "+ "Booya"
print(str8)
len8 = len(str8)
print(len8)
#Indexing
str9 = "End"
print(str9)
ch = str9[1]
print(ch)
str10 = "start"
print(str10)
print(str10[2])
#Slicing
str11 = "School"
print(str11)
print(str11[0:4])
#print(str[:4]) means [0:4]
#print(str[5:]) means (5:len(str)) which means initial to end
str12 = "Collage"
print(str12)
print(str12[-4:-1])
#String Function:str.endswith
print(str12.endswith("age"))
#String function:str.replace
str13 = "i am a hero"
print(str13.capitalize())
#String function:str.replace
str14 = "python"
print(str14.replace("python","C++"))
#String function:str.find
str15 = "I am studying python from ApnaCollege"
print(str15.find("o"))
#String function:str.count
str16 = "I am staying in Shillong in laban"
print(str16.count("in"))
#Questions
#Q1)WAP to input user's first name and print its length
Name = input("enter your name:")
print(Name)
print("Length=",len(Name))
Count = input("enter a character:")
print("Number=",Name.count(Count))
#Conditional statements
Marks = int(input("Enter Yous marks:"))
print("Marks=",Marks)
if(Marks >= 90):
   Grade = "A"
elif(Marks >= 80 and Marks < 90):
    Grade = "B"
elif(Marks >= 70 and Marks < 80):
    Grade = "C"
else:
    Grade = "D"

print("Your Grade=",Grade)
#Nesting
Age = int(input("enter your age:"))
if(Age>=18):
    if(Age>=80):
        print("Not an suitable age for driving")
    else:
        print("can drive")
else:
    print("Cannot drive")
#practice questions
#Q1)WAP to check if a number entered by the user is odd or even
Num = int(input("enter a number"))
if(Num==2):
    print("Number is even")
else:
    print("Number is odd")
#Q2)WAP to find the greatest of 3 numbers entered by the user
a = int(input("Noa."))
b = int(input("Nob."))
c = int(input("Noc."))
if(a>b and a>c):
    print(a)
elif(b>a and b>c):
    print(b)
else:
    print(c)
#Q3)WAP to check if a number is a multiple of 7 or not
Num = int(input("No."))
if(Num%7 == 0):
    print("Multiple")
else:
    print("not a multiple")

    
