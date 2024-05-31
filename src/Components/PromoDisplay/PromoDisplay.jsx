import React, { useState } from 'react'
import './PromoDisplay.css'

const PromoDisplay = () => {

  return (
    <div>
      <div className='header' id='promo1'>
        <div className="header-contents">
          <h2>30% Off All Orders Today!</h2>
          <p>Claim an extra 10% off drinks when you spend at least $50 with this DingGo code</p>
          <div class="header-promo">
            <input id="copyvalue" type="text" readonly value="DING50AUS" />
            <button onclick="copyIt()" class="copybtn">Copy</button>
          </div>
        </div>
      </div>

      <div className='header' id='promo2'>
        <div className="header-contents">
          <h2>Take 20% Off Your Next Meal</h2>
          <p>Spend $15+ on your first meal and get 30% off using our exclusive DingGo code</p>
          <div class="header-promo">
            <input id="copyvalue" type="text" readonly value="GOFREE" />
            <button onclick="copyIt()" class="copybtn">Copy</button>
          </div>
        </div>
      </div>

      <div className='header' id='promo3'>
        <div className="header-contents">
          <h2>10% Off Your First Order!</h2>
          <p>Unlock your next order with 35% savings using DingGo coupon</p>
          <div class="header-promo">
            <input type="text" readonly value="YAY35" />
            <button>Copy</button>
          </div>
        </div>
      </div>

      
    </div>

  )
}

export default PromoDisplay
