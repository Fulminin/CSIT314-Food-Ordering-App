import React, {useState} from 'react';
import './homePageRS.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';
import FoodDisplay from '../../Components/FoodDisplay/FoodDisplay';
import StarRating from '../../Components/StarRating/StarRating';

const HomePageRO = () => {

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
          <Link to="/" className='nav-button'>ORDER HISTORY</Link>
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

export default HomePageRO;
