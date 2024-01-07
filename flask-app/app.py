from flask import Flask, render_template, request, redirect, url_for,json
from flask_mongoengine import MongoEngine

app = Flask(__name__)
app.config['MONGODB_SETTINGS'] = {
    'db': 'mydatabase',
    'host': 'mongodb://13.127.218.70:27017/mydatabase'
}
db = MongoEngine(app)

class User(db.Document):
    username = db.StringField(required=True, unique=True)

@app.route('/')
def index():
    users = User.objects()
    return render_template('index.html', users=users)

@app.route('/add_user', methods=['POST'])
def add_user():
    username = request.form['username']
    new_user = User(username=username)
    new_user.save()
    return redirect(url_for('index'))

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')
