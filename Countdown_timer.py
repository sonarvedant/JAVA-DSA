import time
#time.sleep(3) 
#print("timeup")
#then timeup is printed after 3 seconds

my_timer = int(input("Enter the time in seconds: "))
for x in reversed(range(0, my_timer)):
    seconds = x % 60
    minutes = int(x / 60)
    hour = int(x / 3600)
    print(f"{hour:02}:{minutes:02}:{seconds:02}")
    time.sleep(1)
print("Time's up!")