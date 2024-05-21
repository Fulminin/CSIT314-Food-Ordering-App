import React from 'react';
import './manageMenu.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';

const ManageMenu = () => {
  return (
    <div className='manageMenu'>
      <div className='banner-container'>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner' />
      </div>
      <div className='mngMenu'>
        <p>Ratings</p>
        <div>
            <p>
                <img src={assets.menu} alt="menu" className='menu' />
                Manage Menu
            </p>
            <hr/>
            
        </div>
      </div>
    </div>
  );
}

export default ManageMenu;
