import React from 'react'
import Navbar from './Components/Navbar/Navbar/Navbar'
import { Route, Routes } from 'react-router-dom'
import Home from './pages/home/home'
import Cart from './pages/cart/cart'
import RestaurantCustomer from './pages/restaurantCustomer/restaurantCustomer'
import HomePageRO from './pages/homePageRO/homePageRO'
import HomePageRS from './pages/homePageRS/homePageRS'
import ViewOrdersRS from './pages/viewOrdersRS/viewOrdersRS'
import OrderHistoryPage from './pages/OrderHistoryRS/OrderHistoryRS'
import RestaurantInfo from './pages/restaurantInfo/restaurantInfo'
import ManageMenu from './pages/manageMenu/manageMenu'
import Report from './pages/report/report'

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
        <Route path='/viewOrdersRS' element={<ViewOrdersRS />} />
        <Route path='/manageMenu' element={<ManageMenu />} />
        <Route path='/report' element={<Report />} />
        <Route path='/orderHistory' element={<OrderHistoryPage />} />
        <Route path='/restaurantInfo' element={<RestaurantInfo />} />
      </Routes>
    </div>

  );
};

export default App;

