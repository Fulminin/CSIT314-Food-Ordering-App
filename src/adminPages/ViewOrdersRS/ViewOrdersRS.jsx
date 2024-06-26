import React, { useState } from 'react';
//import RestaurantBanner from '../../Components/RestaurantBanner/RestaurantBanner';
import OrderList from '../../adminComponents/OrderList/OrderList';
import AcceptOrder from '../../adminComponents/AcceptOrder/AcceptOrder';
import RejectOrder from '../../adminComponents/RejectOrder/RejectOrder';
import './ViewOrdersRS.css';


const orders = [
{
    id: 1122,
    items: [
    { name: 'Chicken Teriyaki Bento', price: 16.90, amount: 1},
    { name: 'Chicken Katsu Bento', price: 15.90, amount: 1},
    { name: 'Salmon Teriyaki Bento', price: 17.90, amount: 1},
    ]
},
{
    id: 1123,
    items: [
    { name: 'Chicken Katsu Bento', price: 15.90, amount: 3},
    { name: 'Salmon Teriyaki Bento', price: 15.90, amount: 1},
    ],
},
];

const ViewOrdersRS = () => {
const [bannerImage, setBannerImage] = useState(null);
const [selectedOrder, setSelectedOrder] = useState(null);
const [showAcceptForm, setShowAcceptForm] = useState(false);
const [showRejectForm, setShowRejectForm] = useState(false);

/*
const handleImageUpload = (event) => {
    const file = event.target.files[0];
    const reader = new FileReader();
    reader.onloadend = () => {
    setBannerImage(reader.result);
    };
    if (file) {
    reader.readAsDataURL(file);
    }
};
*/

const handleAcceptClick = (order) => {
    setSelectedOrder(order);
    setShowAcceptForm(true);
    setShowRejectForm(false);
};

const handleRejectClick = (order) => {
    setSelectedOrder(order);
    setShowAcceptForm(false);
    setShowRejectForm(true);
};

return (
    <div className="orders-page">

    {showAcceptForm && (
        <AcceptOrder order={selectedOrder} onBack={() => setShowAcceptForm(false)} />
    )}
    {showRejectForm && (
        <RejectOrder order={selectedOrder} onBack={() => setShowRejectForm(false)} />
    )}
    {!showAcceptForm && !showRejectForm && (
        <OrderList orders={orders} onAcceptClick={handleAcceptClick} onRejectClick={handleRejectClick} />
    )}
    </div>
);
};

export default ViewOrdersRS;