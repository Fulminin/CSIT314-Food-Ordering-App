import React from 'react'
import Navbar from './components/Navbar/Navbar' // Import Navbar Component
import { Route, Routes } from 'react-router-dom'
import Home from './pages/Home/Home'
import Cart from './pages/Cart/Cart'
import PlaceOrder from './pages/PlaceOrder/PlaceOrder'
import Footer from './components/Footer/Footer'
import { useState } from 'react'
import LoginPopup from './components/LoginPopup/LoginPopup'
import Menu from './pages/Menu/Menu'
import Promo from './pages/Promo/Promo'
import MemberPricing from './components/MemberPricing/MemberPricing'
import Payment from './pages/Payment/Payment'
import Tracking from './pages/Tracking/Tracking'
import Profile from './pages/Profile/Profile'

import AdminHome from './adminPages/AdminHome/AdminHome'
import AdminCart from './adminPages/AdminCart/AdminCart'
import HomePageRO from './adminPages/HomePageRO/HomePageRO'
import HomePageRS from './adminPages/HomePageRS/HomePageRS'
import ManageMenu from './adminPages/manageMenu/manageMenu'
import Report from './adminPages/Report/Report'
import RestaurantCustomer from './adminPages/RestaurantCustomer/RestaurantCustomer'
import RestaurantInfo from './adminPages/RestaurantInfo/RestaurantInfo'
import ViewOrdersRS from './adminPages/ViewOrdersRS/ViewOrdersRS'
import OrderHistoryRS from './adminPages/OrderHistoryRS/OrderHistoryRS'


const App = () => {

  const [showLogin,setShowLogin] = useState(false)

  return (
    <>
    {showLogin?<LoginPopup setShowLogin={setShowLogin} />:<></>}
      <div className='app'>
        <Navbar setShowLogin={setShowLogin} />
        <Routes>
          < Route path='/home' element={<Home />} />
          < Route path='/Menu' element={<Menu />} />
          < Route path='/promo' element={<Promo />} />
          < Route path='/Profile' element={<Profile />} />
          < Route path='/Membership' element={<MemberPricing />} />
          < Route path='/Cart' element={<Cart />} />
          < Route path='/Order' element={<PlaceOrder />} />
          < Route path='/Payment' element={<Payment />} />
          < Route path='/Tracking' element={<Tracking />} />

          <Route path='/AdminHome' element={<AdminHome />} />  
          <Route path='/AdminCart' element={<AdminCart />} />

          <Route path='/homeRO' element={<HomePageRO />} />
          <Route path='/homeRS' element={<HomePageRS />} />
          <Route path='/manageMenu' element={<ManageMenu />} />
          <Route path='/report' element={<Report />} />
          <Route path='/restaurantCustomer' element={<RestaurantCustomer />} />
          <Route path='/restaurantInfo' element={<RestaurantInfo />} />
          <Route path='/viewOrdersRS' element={<ViewOrdersRS />} />
          <Route path='/orderHistoryRS' element={<OrderHistoryRS />} />
          
          
          
        </Routes>
      </div>
      <Footer />
    </>
  )
}

export default App
