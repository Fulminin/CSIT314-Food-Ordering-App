import React from 'react';
import './StarRating.css'; // Make sure to create and import the CSS for styling

const StarRating = () => {
  return (
    <div className="star-rating">
      <span className="star">&#9733;</span>
      <span className="star">&#9733;</span>
      <span className="star">&#9733;</span>
      <span className="star">&#9733;</span>
      <span className="star">&#9734;</span>
    </div>
  );
};

export default StarRating;