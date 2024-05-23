import React, { useContext } from 'react';
import './MenuDisplay.css';
import { StoreContext } from '../../context/StoreContext';
import MenuItem from '../../Components/MenuItem/MenuItem';

const MenuDisplay = ({ category }) => {
  const { food_list } = useContext(StoreContext);

  console.log('food_list:', food_list);

  return (
    <div className='menu-display' id='menu-display'>
      <div className="menu-display-list">
        {food_list && food_list.map((item, index) => (
          <MenuItem
            key={index}
            id={item._id}
            name={item.name}
            description={item.description}
            price={item.price}
            image={item.image}
          />
        ))}
      </div>
    </div>
  );
};

export default MenuDisplay;
