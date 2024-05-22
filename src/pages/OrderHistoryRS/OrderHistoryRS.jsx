import React from 'react';
import './OrderHistoryRS.css';
import { assets } from '../../Assets/assets';

const orders = [
{
    id: 1111,
    customerId: 1122,
    items: [
    { name: 'Chicken Teriyaki Bento', price: 16.90, image: assets.chickenTeriyakiBento},
    { name: 'Chicken Katsu Bento', price: 15.90, image: assets.chickenKBento },
    { name: 'Salmon Teriyaki Bento', price: 17.90, image: assets.SalmonTBento },
    { name: 'Seafood Sushi Plater', price: 24.50, image: assets.sSushiPlater },
    ],
},
];


const OrderHistoryPage = () => {
return (
    <div className="order-history-page">
    {orders.map(order => (
        <div key={order.id} className="order-item">
        {order.items.map((item, index) => (
            <div key={index} className="order-detail">
            <img src={item.image} alt={item.name} />
            <div className="info">
                <h3>{item.name}</h3>
                <p>Customer #{order.customerId}</p>
                <p>Price: ${item.price.toFixed(2)}</p>
            </div>
            </div>
        ))}
        </div>
    ))}
    </div>
);
};

export default OrderHistoryPage;