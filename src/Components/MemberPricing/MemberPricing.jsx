import React from 'react'
import './MemberPricing.css'

const MemberPricing = () => {
    return (
        <div>
            <p id='title'>Membership Options</p>
        <div className="price-cards">
            <div className='price-card' id="card1">
                <div className="food-item-header">
                    <p class='title'>Basic</p>
                    <p class="price">$15</p>
                    <p class="small-text">per month</p>
                    <button>Select</button>
                </div>

            </div>

            <div className='price-card' id="card2">
                <div className="food-item-header">
                    <p class='title'>Standard</p>
                    <p class="price">$35</p>
                    <p class="small-text">per month</p>
                    <button>Select</button>
                </div>
            </div>

            <div className='price-card' id="card3">
                <div className="food-item-header">
                    <p class='title'>Pro</p>
                    <p class="price">$45</p>
                    <p class="small-text">per month</p>
                    <button>Select</button>
                </div>
            </div>

        </div>
        </div>

    )
}

export default MemberPricing
