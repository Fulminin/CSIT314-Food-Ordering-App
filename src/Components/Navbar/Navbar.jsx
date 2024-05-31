import React, { useContext, useState } from 'react'
import './Navbar.css'
import { assets } from '../../assets/assets'
import { Link } from 'react-router-dom';
import { StoreContext } from '../../context/StoreContext';

const Navbar = ({setShowLogin}) => {

    const[menu,setMenu] = useState("home");

    const {getTotalCartAmount} = useContext(StoreContext)

  return (
    <div className='navbar'>  
        <Link to='/'><img src={assets.logo} alt="" className="logo" /> </Link>
        <ul className="navbar-menu">
            <Link to='/Home' onClick={()=>setMenu("home")} className={menu==="home"?"active":""}>Home</Link>
            <Link to='/Promo' onClick={()=>setMenu("Promo")} className={menu==="Promo"?"active":""}>Promo</Link>
            <Link to='/Membership' onClick={()=>setMenu("Membership")} className={menu==="Membership"?"active":""}>Membership</Link>
            <Link to='/Profile' onClick={()=>setMenu("Profile")} className={menu==="contact-us"?"active":""}>Profile</Link>
        </ul>
        
        <div className="navbar-right">
            <img src={assets.search_icon} alt="" />
            <div className="nav-bar-search-icon">
                <Link to='/cart'> <img src={assets.basket_icon} alt="" /> </Link>
                <div className={getTotalCartAmount()===0?"":"dot"}></div>
            </div>
            <button onClick={()=>setShowLogin(true)}>Sign In</button>
        </div>
    </div>
  )
}

export default Navbar
