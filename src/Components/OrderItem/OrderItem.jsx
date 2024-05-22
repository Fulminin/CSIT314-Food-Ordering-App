import React from 'react';
import './OrderItem.css';

const OrderItem = ({order, onAcceptClick, onRejectClick}) => (
<div className="order-item">
    <h3>Customer #{order.id}</h3>
    <ul>
    {order.items.map((item, idx) => (
        <li key={idx}>{item.name} - ${item.price.toFixed(2)} - Amount: {item.amount}</li>
    ))}
    </ul>
    <button className="accept-button" onClick={onAcceptClick}>Accept</button>
    <button className="reject-button" onClick={onRejectClick}>Reject</button>
</div>
);

export default OrderItem;