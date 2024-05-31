import React from 'react'
import './ProfileDisplay.css'
import { useContext } from 'react'
import { StoreContext } from '../../context/StoreContext'
import { Link } from 'react-router-dom'

const ProfileDisplay = () => {

  const { getTotalCartAmount } = useContext(StoreContext)

  return (
    <form className='place-order'>
      <div className="place-order-left">
        <p className="title">Profile Details</p>

        <p>UserName</p>
        <input type="text" placeholder='John Smith' />
        <p>Password</p>
        <input type="text" placeholder='***********' />
        
        <p>Address</p>
        <input type="text" placeholder='123 Waverson Drive ' />
        
        <div className="multi-fields">
         <input type="text" placeholder='Wollonong' />
          <input type="text" placeholder='2500' />
          <input type="text" placeholder='NSW' />
        </div>
        
        <input type="text" placeholder='Australia' />
        
        <div className="place-order-right">
          <div className="cart-total">
              <button>SAVE</button>
          </div>
        </div>

      </div>


    </form >

  )
}

export default ProfileDisplay
