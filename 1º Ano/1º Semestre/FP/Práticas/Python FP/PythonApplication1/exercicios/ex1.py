'''
numbers = [2,3,5]

for i in range(len(numbers)):
	numbers[i] = numbers[i] * 2

print(numbers)


z = [12312312,5 ,66576,76453,456765]


fruit = 'banana'
for char in fruit:
	print(char)

index = 0
while index < len(fruit):
	letter = fruit[index]
	print(letter)


prefixes = 'JKLMNOPQ'
suffix = 'ack'
for letter in prefixes:
	print(letter + suffix)


word = 'banana'; count = 0
for letter in word:
	if letter == 'a':
		count = count + 1
print(count)

word1 = "banana"
word2= "bannaneira"
for letter in word1:
	if letter in word2:
		print(letter)


z1="ola, EU ssou o tomás"
print(z1.isalpha)
'''
t = [('a', 0), ('b', 1), ('c', 2)]
for letter, number in t:
print(number, letter)
