numbers = input("Enter a sequence of comma separated values: ")
sum = 0
for number in numbers.split(","):
  sum += int(number)
print(sum)