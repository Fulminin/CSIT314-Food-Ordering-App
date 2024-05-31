import React, { useContext, useState } from 'react'
import './Tracking.css'
import { StoreContext } from '../../context/StoreContext'
import { useNavigate } from 'react-router-dom'
import { assets } from '../../assets/assets'
import Receipt from '../../components/Receipt/Receipt'

const Tracking = () => {

  const { cartItems, food_list, removeFromCart, getTotalCartAmount } = useContext(StoreContext);

  const [showReceipt,setShowReceipt] = useState(false)

  const navigate = useNavigate();


  return (
    <>
     {showReceipt?<Receipt setShowReceipt={showReceipt} />:<></>}
    <div className='cart'>
      <h2>Order Details</h2>
      <div className="cart-items">
        <div className="cart-items-title">
          <p>Items</p>
          <p>Title</p>
          <p>Price</p>
          <p>Quantity</p>
          <p>Total</p>
        </div>
        <br />
        <hr />
        {food_list.map((item, index) => {
          if (cartItems[item._id] > 0) {
            return (
              <div>
                <div className="cart-items-title cart-items-item">
                  <img src={item.image} alt="" />
                  <p>{item.name}</p>
                  <p>${item.price}</p>
                  <p>{cartItems[item._id]}</p>
                  <p>${item.price * cartItems[item._id]}</p>
                </div>
                <hr />
              </div>
            )
          }
        })}
      </div>
      <div className="cart-bottom">
        <div className="cart-total">
          <h2>Total</h2>
          <div>
            <div className="cart-total-details">
              <p>Subtotal</p>
              <p>${getTotalCartAmount()}</p>
            </div>
            <hr />
            <div className="cart-total-details">
              <p>Delivery Fee</p>
              <p>${getTotalCartAmount() === 0 ? 0 : 2}</p>
            </div>
            <hr />
            <div className="cart-total-details">
              <b>Total</b>
              <b>${getTotalCartAmount() === 0 ? 0 : getTotalCartAmount() + 2}</b>
            </div>
          </div>
          <div className="multi-fields">
            <button onClick={()=>setShowReceipt(true)}>VIEW RECEIPT</button>
            <button>SEND A REVIEW</button>
          </div>
          <button>TRACK ORDER</button>
        </div>
        <div className="cart-promocode">
          <img src={assets.map_tracker} alt="" className='map-image' />
        </div>
      </div>
    </div>
    </>
  )
}

export default Tracking