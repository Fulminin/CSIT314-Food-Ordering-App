import React from 'react';
import OrderItem from '../OrderItem/OrderItem';
import './OrderList.css';


const OrderList = ({orders, onAcceptClick, onRejectClick}) => (
    <div className="order-list">
    {orders.map((order, index) => (
        <OrderItem
            key={index}
            order={order}
            onAcceptClick={() => onAcceptClick(order)}
            onRejectClick={() => onRejectClick(order)}
        />
        ))}
    </div>
);

export default OrderList;