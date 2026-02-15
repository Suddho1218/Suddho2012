SP = int(input("Enter selling price:"))
CP = int(input("Enter cost price:"))
if (SP>CP):
    print("Profit = ₹",SP-CP)
    print("Profit Percentage = ", (SP-CP/CP)*100,"%")
else:
    print("Loss = ₹", CP-SP)
    print("Loss Percentage = ", (CP-SP/CP)*100,"%")