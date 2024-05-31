import React, {useState} from 'react';
import './HomePageRS.css';
import { Link } from 'react-router-dom';
import { assets } from '../../adminAssets/adminAssets'
import FoodDisplay from '../../adminComponents/FoodDisplay/FoodDisplay';
import StarRating from '../../adminComponents/StarRating/StarRating';

const HomePageRS = () => {

  const [category] =useState("All");  

  return (
    <div className='homePageRS'>
      <div className='banner-container'>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner' />
      </div>
      <div className='homeRS'>
        <p className='rating'>Average Ratings <StarRating /></p>
        <div className='button-group'>
          <Link to="/" className='nav-button'>ORDER</Link>
          <Link to="/orderHistoryRS" className='nav-button'>ORDER HISTORY</Link>
        </div>
        <div>
            <p className='menuTitle'>
                <img src={assets.menu} alt="menu" className='menu' />
                Menu
            </p>
            <hr/>
        </div>
        <div>
        <FoodDisplay category={category}/>
        </div>
      </div>
    </div>
  );
}

export default HomePageRS;
