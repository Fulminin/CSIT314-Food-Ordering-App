import React from 'react';
import './homePageRO.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';

const HomePageRO = () => {
  return (
    <div className='homePageRO'>
      <div className='banner-container'>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner' />
      </div>
      <div className='homeRO'>
        <p>Ratings</p>
        <div className='button-group'>
          <Link to="/" className='nav-button'>ORDER</Link>
          <Link to="/" className='nav-button'>MANAGE MENU</Link>
          <Link to="/" className='nav-button'>MANAGE INFO</Link>
          <Link to="/" className='nav-button'>REVENUE REPORT</Link>
          <Link to="/" className='nav-button'>ORDER HISTORY</Link>
        </div>
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

export default HomePageRO;
