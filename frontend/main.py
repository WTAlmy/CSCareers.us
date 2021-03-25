from flask import Flask, request
from flask_cors import CORS

app = Flask(__name__, static_url_path='')
CORS(app)

@app.route('/')
def root():
  return app.send_static_file('index.html')

@app.route('/login')
def login():
  return app.send_static_file('login.html')

@app.route('/home')
def home():
  return app.send_static_file('home.html')

if __name__ == "__main__":
  app.run(debug=True)
