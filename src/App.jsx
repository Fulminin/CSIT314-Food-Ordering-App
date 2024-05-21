import React from 'react'
import Navbar from './Components/Navbar/Navbar/Navbar'
import { Route, Routes } from 'react-router-dom'
import Home from './pages/home/home'
import Cart from './pages/cart/cart'
import RestaurantCustomer from './pages/restaurantCustomer/restaurantCustomer'
import HomePageRO from './pages/homePageRO/homePageRO'
import HomePageRS from './pages/homePageRS/homePageRS'

const App = () => {
  return (
    <div className='app'>
      <Navbar />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/restaurantCustomer' element={<RestaurantCustomer />} />
        <Route path='/cart' element={<Cart />} />
        <Route path='/homeRO' element={<HomePageRO />} />
        <Route path='/homeRS' element={<HomePageRS />} />
      </Routes>
    </div>
  );
};

export default App;

