import React from 'react'
import './FoodItem.css'

const FoodItem = ({_id,name,price,description,image}) => {
  return (
    <div className='food-item'>
      <div className="food-item-image-container">
        <img className='food-item-image' src={image} alt='img' />
      </div>
      <div className="food-item-info">
        <div className="food-item-name">
            <p>{name}</p>
        </div>
        <p className='food-item-desc'>{description}</p>
        <p className="price">${price}</p>
      </div>
    </div>
  )
}

export default FoodItem
