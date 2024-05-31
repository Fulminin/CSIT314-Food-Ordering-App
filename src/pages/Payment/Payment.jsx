import React from 'react'
import './Payment.css'
import { useContext } from 'react'
import { StoreContext } from '../../context/StoreContext'
import { Link } from 'react-router-dom'

const Payment = () => {

  const { getTotalCartAmount } = useContext(StoreContext)

  return (
    <form className='place-order'>
      <div className="place-order-left">
        <p className="title">Payment Details</p>

        <p>Name on card</p>
        <input type="text" placeholder='e.g. John Smith' />
        <p>Card details</p>
        <input type="text" placeholder='XXXX XXXX XXXX XXXX' />
        
        <div className="multi-fields">
          <input type="text" placeholder='MM/YY' />
          <input type="text" placeholder='CVC' />
        </div>
        
        <p>Billing address</p>
        <input type="text" placeholder='Address 1' />
        
        <div className="multi-fields">
          <input type="text" placeholder='ZIP Code' />
          <input type="text" placeholder='City' />
          <input type="text" placeholder='State' />
        </div>
        
        <input type="text" placeholder='Country' />
        
        <div className="place-order-right">
          <div className="cart-total">
            <Link to='/Tracking'><button>PLACE ORDER</button></Link>
          </div>
        </div>

      </div>


    </form >

  )
}

export default Payment
