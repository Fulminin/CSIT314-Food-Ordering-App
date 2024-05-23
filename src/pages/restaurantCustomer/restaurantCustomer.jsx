import React from 'react'
import './restaurantCustomer.css'
import { assets } from '../../Assets/assets';

const restaurantCustomer = () => {
  return (
    <div className='restaurantCustomer'>
      <div>
        <img src={assets.bentoHouseBanner} alt="banner" className='banner'/>
      </div>
      <div className='Restaurant-content'>

      </div>
    </div>
  )
}

export default restaurantCustomer
