import turtle

t = turtle.Pen()


for i in range(1,19):
	t.forward(100)
	if i % 2 == 0:
		t.left(175)
	else:
		t.left(225)

raw_input()
