import React from 'react';
import './report.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';

const Report = () => {
  return (
    <div className='report'>
      <div className='banner-container'>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner' />
      </div>
      <div className='report_content'>
        <p>Ratings</p>
        <div>
            <p>
                <img src={assets.tiles} alt="menu" className='menu' />
                Revenue Report
            </p>
            <hr/>
            
        </div>
      </div>
    </div>
  );
}

export default Report;
