from flask import Flask, request
from flask_cors import CORS

app = Flask(__name__, static_url_path='')
CORS(app)

@app.route('/')
def root():
  return app.send_static_file('index.html')

if __name__ == "__main__":
  app.run(debug=True)
