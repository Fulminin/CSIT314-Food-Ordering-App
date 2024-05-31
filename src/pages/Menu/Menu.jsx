import React, {useState} from 'react'
import './Menu.css'
import FoodDisplay from '../../components/FoodDisplay/FoodDisplay'
import RestaurantHeader from '../../components/RestaurantHeader/RestaurantHeader'

const Menu = () => {
  
  const[category, setCategory] = useState("All");

  return (
    <div>
      <RestaurantHeader/>
      <FoodDisplay category={category}/>
    </div>
    
  )
}

export default Menu
