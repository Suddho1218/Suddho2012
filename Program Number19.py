bio=int(input("Enter a maks in Biology:"))
math=int(input("Enter marks in Mathematics:"))
chem=int(input("Enter marks in Chemistry:"))
phy=int(input("Enter marks in Physics:"))
eng=int(input("Enter marks in English:"))
avg=(bio+math+chem+phy+eng)/5
if(avg>=80):
    print("You can take Computer Science")
else:
    print("You can take Biology")
    