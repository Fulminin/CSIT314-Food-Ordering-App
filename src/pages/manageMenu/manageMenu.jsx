import React, { useState } from 'react';
import './manageMenu.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';
import MenuDisplay from '../../Components/MenuDisplay/MenuDisplay';

const ManageMenu = () => {
  const [category] = useState("All");

  return (
    <div className='manageMenu'>
      <div className='banner-container'>
        <Link to="/homeRO" className='back'>Back to home page</Link>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner' />
      </div>
      <div className='mngMenu'>
        <div>
          <p className='menuTitle'>
            <img src={assets.menu} alt="menu" className='menu' />
            Manage Menu
          </p>
          <hr />
        </div>
        <div>
          <MenuDisplay category={category} />
        </div>
      </div>
    </div>
  );
};

export default ManageMenu;
