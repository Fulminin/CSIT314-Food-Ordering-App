import React from 'react';
import './report.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';
import StarRating from '../../Components/StarRating/StarRating';

const Report = () => {
  return (
    <div className='report'>
      <div className='banner-container'>
        <Link to="/homeRO" className='back'>Back to home page</Link>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner' />
      </div>
      <div className='report_content'>
      <p className='rating'>Average Ratings <StarRating /></p>
        <div>
            <p className='rpt_title'>
                <img src={assets.tiles} alt="rpt" className='rpt' />
                Revenue Report
            </p>
            <hr/>
            
        </div>
      </div>
    </div>
  );
}

export default Report;
