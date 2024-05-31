import React from 'react'
import './RestaurantCustomer.css'
import { assets } from '../../adminAssets/adminAssets'

const RestaurantCustomer = () => {
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

export default RestaurantCustomer
