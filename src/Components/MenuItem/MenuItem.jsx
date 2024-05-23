import React, { useState, useContext } from 'react'
import './MenuItem.css'
import { StoreContext } from '../../context/StoreContext';

const MenuItem = ({id,name,price,description,image}) => {
  const { updateFoodItem } = useContext(StoreContext);
  const [showPopup, setShowPopup] = useState(false);
  const [editedName, setEditedName] = useState(name);
  const [editedPrice, setEditedPrice] = useState(price);
  const [editedDescription, setEditedDescription] = useState(description);

  const handleButtonClick = () => {
    setShowPopup(!showPopup);
  };

  const handleSave = () => {
    const updatedItem = {
      _id: id,
      name: editedName,
      price: editedPrice,
      description: editedDescription,
      image,
    };
    updateFoodItem(updatedItem);
    setShowPopup(false);
  };

  
  return (
    <div className='menu-item'>
      <div className="menu-item-image-container">
        <img className='menu-item-image' src={image} alt='img' />
      </div>
      <div className="menu-item-info">
        <div className="menu-item-name">
            <p>{name}</p>
        </div>
        <p className='menu-item-desc'>{description}</p>
        <p className="price">${price}</p>
      </div>
      <div className="menu-item-buttons">
        <button className="menu-item-button" onClick={handleButtonClick}>Edit</button>
      </div>
      {showPopup && (
        <div className="popup">
          <div className="popup-content">
            <h3>Edit Item</h3>
            <label>
              Name:
              <input
                type="text"
                value={editedName}
                onChange={(e) => setEditedName(e.target.value)}
              />
            </label>
            <label>
              Price:
              <input
                type="number"
                value={editedPrice}
                onChange={(e) => setEditedPrice(e.target.value)}
              />
            </label>
            <label>
              Description:
              <textarea
                value={editedDescription}
                onChange={(e) => setEditedDescription(e.target.value)}
              />
            </label>
            <button className="save-button" onClick={handleSave}>Save</button>
          </div>
        </div>
      )}
    </div>
  )
}

export default MenuItem
