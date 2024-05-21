import React from 'react'
import './cart.css'
import { assets } from '../../assets/assets';

const Cart = () => {
    return(
        <div className='cart'>
            <div className='cartContent'>
                <div className='cartBanner'>
                    <img src={assets.shoppingCart} alt="shopping card" className='cart'/>
                    <p>Shopping Cart</p>

                    <hr/>
                </div>
            </div>
        </div>
    )
}

export default Cart