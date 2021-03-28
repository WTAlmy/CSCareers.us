import uuid
from flask import Flask, request
from flask_cors import CORS, cross_origin
from google.cloud import storage

app = Flask(__name__, static_url_path='')
CORS(app)

@app.route('/')
def root():
  return app.send_static_file('index.html')

@app.route('/login')
def login():
  return app.send_static_file('login.html')

@app.route('/signup')
def signup():
  return app.send_static_file('signup.html')

@app.route('/home')
def home():
  return app.send_static_file('home.html')

@app.route('/insert', methods=['GET'])
def upload():
  return """
<form method="POST" action="/upload" enctype="multipart/form-data">
    <input type="file" name="image">
    <input type="submit">
</form>
"""

@app.route('/upload', methods=['GET', 'POST'])
@cross_origin()
def process():
  uploaded_file = request.files.get('image')
  for f in request.files:
    print(f)
  if not uploaded_file:
    return "No Image Uploaded", 812

  gcs = storage.Client()
  bucket = gcs.get_bucket("cscareers-main")
  blob = bucket.blob('{}-{}'.format(uuid.uuid4(), uploaded_file.filename))
  
  blob.upload_from_string(
    uploaded_file.read(),
    content_type=uploaded_file.content_type
  )

  return blob.public_url

if __name__ == "__main__":
  app.run(debug=True)
