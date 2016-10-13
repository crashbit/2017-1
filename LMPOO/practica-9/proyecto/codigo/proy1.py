from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
	return "Hola mundo"

if __name__ == '__main__':
	app.run(host='127.0.0.2', port=5000, debug=True)