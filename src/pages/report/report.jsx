import React from 'react';
import './report.css';
import { Link } from 'react-router-dom';
import { assets } from '../../Assets/assets';
import StarRating from '../../Components/StarRating/StarRating';

const Report = () => {

  // Function to generate random height for each bar
  const generateRandomHeight = () => {
    return Math.floor(Math.random() * 100) + 5; // Random height between 1 and 100
  };

  // Array to hold random heights for each bar
  const randomHeights = Array.from({ length: 12 }, () => generateRandomHeight());
  const randomHeights_2 = Array.from({ length: 7 }, () => generateRandomHeight());
  const labels = ['Jan', 'Feb', 'Mar','Apr','May','Jun','Jul','Aug','Sept','Oct','Nov','Dec'];
  const labels_2 = ['Mon', 'Tue', 'Wed','Thu','Fri','Sat','Sun'];


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

      <div className='report_content '>
        <p className='rating'>Average Ratings <StarRating /></p>
        <div>
          <p className='rpt_title'>
            <img src={assets.tiles} alt="rpt" className='rpt' />
            Revenue Report
          </p>
          <hr/>
          <br/>
          
        </div>
        <div>
          <p className='rpt_title'>Monthly report</p>
          <br/>
          <div className="bar-chart">
            {randomHeights.map((height, index) => (
              <div key={index} className="bar-container">
                <div className="bar" style={{ height: `${height * 2}px` }}></div>
                <hr/>
                <div className="bar-label">{labels[index]}</div>
              </div>
            ))}
          </div>
        </div>
        <br/>
        <div>
          <p className='rpt_title'>Weekly report</p>
          <br/>
          <div className="bar-chart">
            {randomHeights_2.map((height, index) => (
              <div key={index} className="bar-container">
                <div className="bar" style={{ height: `${height * 2}px` }}></div>
                <hr/>
                <div className="bar-label">{labels_2[index]}</div>
              </div>
            ))}
          </div>
        </div>
      </div>
    </div>
  );
}

export default Report;
