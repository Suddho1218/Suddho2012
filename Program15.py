Number = int(input("Enter a Number:")) #To input the number
for i in range(1,Number): #To start the loop of dividing the number only till the number it self
    if Number%i==0: #To check if the number is divisible by the value of the present number in the loop 
        print("∵ The factors are:",end="")
        print(i) #To print the factors of the number
if i==Number: #To check if the sum of the factor of the number is equal to the number or not  
    print("∴ It is a perfect Number")
else:
    print("∴ It is not a perfect number")    