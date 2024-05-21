import React from 'react';
import './homePageRS.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';

const HomePageRS = () => {
  return (
    <div className='homePageRS'>
      <div className='banner-container'>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner' />
      </div>
      <div className='homeRS'>
        <p>Ratings</p>
        <div>
            <p>
                <img src={assets.menu} alt="menu" className='menu' />
                Menu
            </p>
            <hr/>
            
        </div>
      </div>
    </div>
  );
}

export default HomePageRS;
