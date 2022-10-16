userInput = input('Roman:')
roman = 0

nums = {'M':1000, 'D':500, 'C':100, 'L':50, 'X':10, 'V':5, 'I':1}
sum = 0
for i in range(len(userInput)):
    value = nums[userInput[i]]
    # If the next place holds a larger number, this value is negative
    if i+1 < len(userInput) and nums[userInput[i+1]] > value:
        sum -= value
    else: 
        sum += value

print(sum)


# if input == '+':
#     answer = inputOne + inputTwo
