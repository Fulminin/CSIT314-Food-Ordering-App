import React, { useContext }  from 'react'
import './RestaurantDisplay.css'
import { StoreContext } from '../../context/StoreContext'
import Restaurant from '../Restaurant/Restaurant'

const RestaurantDisplay = ({category}) => {

    const {restaurant_list} = useContext(StoreContext);

  return (
    <div className='food-display' id='food-display'>
        <h2>Top restaurants near you</h2>
        <div className="food-display-list">
            {restaurant_list.map((item,index)=>{
                if (category==="All" || category===item.category) { // Show Food Items Based on Category Selected
                  return <Restaurant key={index} id={item._id} name={item.name} description={item.description} price={item.price} image={item.image}/>
                }
            })}
        </div>
        
    </div>
  )
}

export default RestaurantDisplay


/*
import React, { useContext } from 'react'
import './FoodDisplay.css'
import { StoreContext } from '../../context/StoreContext'

const FoodDisplay = ({category}) => {

    const {food_list} = useContext(StoreContext);

  return (
    <div className='food-display' id='food-display'>
        <h2>Top dishes near you</h2>
        <div className="food-display-list"></div>
            {food_list.map((item,index) =>{
                return <FoodItem key={index} id={item._id} name={item.name} description={item.description} price={item.price} image={item.image} />

            })}
    </div>
  )
}

*/