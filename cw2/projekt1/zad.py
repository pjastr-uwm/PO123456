import random

random.seed(123456)
randomlist = [random.randrange(1, 101) for i in range(200)]

print(min(randomlist))

randomlist = list(set(randomlist))
print(len(randomlist))