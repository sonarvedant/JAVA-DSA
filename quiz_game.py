questions = (
    "What planet is known as the Red Planet?",
    "What is the chemical formula for water?",
    "What gas do plants absorb from the atmosphere during photosynthesis?",
    "What is the hardest natural substance on Earth?",
    "How many bones are in the adult human body?",
)

options = (
    ("A) Mars", "B) Venus", "C) Jupiter", "D) Saturn"),
    ("A) H2O", "B) CO2", "C) O2 ", "D) NaCl"),
    ("A) Oxygen", "B) Carbon Dioxide", "C) Nitrogen", "D) Hydrogen"),
    ("A) Diamond", "B) Gold", "C) Iron", "D) Quartz"),
    ("A) 206", "B) 201", "C) 210", "D) 215"),  
)

answers = ("A", "A", "B", "A", "A")

guesses = []
score = 0
question_num = 0
for que in questions:
    print("-------------------------")
    print(que)
    for option in options[question_num]:
        print(option)

    guess = input("Enter (A, B, C, or D): ").upper()
    guesses.append(guess)
    if guess == answers[question_num]:
        score += 1
        print("CORRECT!")
    else:
        print("Incorrect!")
        print(f"{answers[question_num]} is the correct answer.")
    question_num += 1

print("-------------------------")
print("          RESULTS        ")
print("-------------------------")

print("Answers: ", end="")
for ans in answers:
    print(ans, end=" ")
print()

print("guesses: ", end="")
for guess in guesses:
    print(guess, end=" ")
print()

score = int((score / len(questions)) * 100)
print(f"Your score is: {score}%")   