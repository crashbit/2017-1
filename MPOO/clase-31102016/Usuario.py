class Usuario():
	def __init__(self, email, password):
		self.email = email
		self.password = password
		self.completo = email +" "+password

	#toString -> java
	def __str__(self):
		return self.completo


nobody = Usuario("jojo@hotmail.com", "abracadabra")
print nobody
