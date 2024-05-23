import React from 'react';
import './RestaurantBanner.css';

const RestaurantBanner = ({ image, onImageUpload }) => (
    <div className="banner" style={{ backgroundImage: image ? `url(${image})` : 'none' }}>
    {!image && (
        <>
        <input type="file" accept="image/*" onChange={onImageUpload} />
        <div className="banner-text">
            <h2>Bento House</h2>
            <p>Japanese Cuisine<br />Specializes in Bento<br />Fast Dispatch</p>
            
        </div>
        </>
    )}
        <div>
            <p>Average Rating: ★★★★★</p>
        </div>
    </div>
);

export default RestaurantBanner;
