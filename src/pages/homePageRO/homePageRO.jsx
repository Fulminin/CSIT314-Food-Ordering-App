import React, {useState} from 'react';
import './homePageRO.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';
import FoodDisplay from '../../Components/FoodDisplay/FoodDisplay';
import StarRating from '../../Components/StarRating/StarRating';

const HomePageRO = () => {

  const [category] =useState("All");  

  return (
    <div className='homePageRO'>
      <div className='banner-container'>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner' />
      </div>
      <div className='homeRO'>
        <p className='rating'>Average Ratings <StarRating /></p>
        <div className='button-group'>
          <Link to="/" className='nav-button'>ORDER</Link>
          <Link to="/manageMenu" className='nav-button'>MANAGE MENU</Link>
          <Link to="/" className='nav-button'>MANAGE INFO</Link>
          <Link to="/report" className='nav-button'>REVENUE REPORT</Link>
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
