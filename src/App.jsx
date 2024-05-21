import React from 'react';
import Navbar from './Components/Navbar/Navbar/Navbar';
import { Route, Routes } from 'react-router-dom';
import Home from './pages/home/home';
import Cart from './pages/cart/cart';
import RestaurantCustomer from './pages/restaurantCustomer/restaurantCustomer';


const App = () => {
  return (
    <div className='app'>
      <Navbar />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/restaurantCustomer' element={<RestaurantCustomer />} />
        <Route path='/cart' element={<Cart />} />
      </Routes>
    </div>
  );
};

export default App;

