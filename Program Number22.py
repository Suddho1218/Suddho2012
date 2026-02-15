Ba = int(input("Your Balance:"))
ch = 0
while ch !=4:
    print("1. Deposit\n2. Withdraw\n3.Check Balance\n4.Exit")
    ch=int(input("Enter you choice as 1/2/3/4:"))
    if (ch==1):
        de=int(input("Enter deposit amount"))
        nba1=de+Ba
        print("New Balance = ₹",nba1)
    elif (ch==2):
        wi=int(input("Enter withdraw amount"))
        if(wi<=Ba):
            nba2=Ba-wi
            print("New Balance = ₹",nba2)
        else:
            print("Insufficient balance to withdraw money")
    elif(ch==3):
        print(Ba)
    else:
        print("Exiting Operation")