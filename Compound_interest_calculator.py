percent = 0 
rate = 0
time = 0

while percent<=0:
    percent = float(input("Enter the principal amount: "))
    if percent <= 0:
        print("Please enter a positive number for the principal amount.")

while rate<=0:
    rate = float(input("Enter the interest rate : "))
    if rate <= 0:
        print("Please enter a positive number for the interest rate.")

while time<=0:
    time = float(input("Enter the time in years: "))
    if time <= 0:
        print("Please enter a positive number for the time in years.")

final_amount = percent * pow((1 + (rate / 100)), time)
print(f"The final amount after {time} years will be: ${final_amount:.2f}")