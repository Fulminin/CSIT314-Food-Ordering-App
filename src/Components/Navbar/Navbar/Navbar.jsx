import React from 'react'
import './Navbar.css'
import { assets } from '../../../Assets/assets'


const Navbar = () => {
  return (
    <div className='navbar'>
      <img src={assets.DingGoIcon} alt="DingGo Icon" className='logoBell' />
      <img src={assets.DingGoName} alt="DingGo Name" className='logoName' />

      <div classname='navbarRight'>
        <button>Sign up</button>
        <button>Sign in</button>
      </div>

    </div>
  )
}

export default Navbar
