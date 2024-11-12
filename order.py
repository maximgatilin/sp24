from utils import request, jsonify
from models import db, User, Trip
from app import app

@app.route('/book_trip', methods=['POST'])
def book_trip():
    session = request.json.get('session')
    destination = request.json.get('destination')
    date = request.json.get('date')

    # Mock session handling
    user_id = session.get('user_id')
    user = User.query.get(user_id)

    if not user:
        return jsonify({'error': 'User not found'}), 404

    new_trip = Trip(user_id=user.id, destination=destination, date=date)
    db.session.add(new_trip)
    db.session.commit()

    return jsonify({'message': 'Trip booked successfully'}), 201