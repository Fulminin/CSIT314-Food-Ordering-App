import React, { useContext, useState } from 'react'
import './Receipt.css'
import { assets } from '../../assets/assets'
import { StoreContext } from '../../context/StoreContext';

const Receipt = ({setShowReceipt}) => {

    const [currState,setCurrState] = useState("Sign Up")

  return (
    <div className="receipe-popup">
      
        <div className="login-popup-condition">
           
        </div>
      
      </div>
    
  )
}

export default Receipt
