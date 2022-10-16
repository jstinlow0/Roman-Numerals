#asks user for two roman number to be converted
userOne = input('Enter roman number #1: \n')
userTWo = input('Enter roman Number #2: \n')


roman = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000,'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
i = 0
x = 0

userNumberOne = 0
userNumberTwo = 0
#grabs and searches the index from users' input
while i < len(userOne):   
    #if statment to check whether there are still characters in the input and if the index being checked is a special case number
    if i+1<len(userOne) and userOne[i:i+2] in roman:
        userNumberOne+=roman[userOne[i:i+2]]
        #increments by 2 because of special case number
        i+=2
        #else, if it's not a special case number, automatically search for the number in the dictionary
    else:
        userNumberOne+=roman[userOne[i]]
        i+=1

#does the same thing as the first while loop
while x < len(userTWo):   
    if x+1<len(userTWo) and userTWo[x:x+2] in roman:
        userNumberTwo+=roman[userTWo[x:x+2]]
        x+=2
    else:
        userNumberTwo+=roman[userTWo[x]]
        x+=1

#asks the user for the input 
userThree = input('Operator:')
operator = ''

if userThree == '+':
    answer = userNumberOne + userNumberTwo
elif userThree == '-':
    answer = userNumberOne + userNumberTwo
elif userThree == '/':
    answer = userNumberOne/userNumberTwo

print(userNumberOne)
print(userNumberTwo)
print(answer)

