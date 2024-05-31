import React from 'react'
import './AdminCart.css'
import { assets } from '../../adminAssets/adminAssets'

const AdminCart = () => {
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

export default AdminCart