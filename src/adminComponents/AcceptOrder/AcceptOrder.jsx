import React from 'react';
import './AcceptOrder.css';

    const AcceptOrder = ({ order, onBack }) => (
    <div className="accept-order">
    <h2>Accept an order</h2>
    <div className="order-details">
        <h3>Order details</h3>
        <p>Customer #{order.id}</p>
        <ul>
            {order.items.map((item, idx) => (
                <li key={idx}> <br></br> {item.name} <br></br> ${item.price.toFixed(2)} <br></br> Amount: {item.amount}</li>
            ))}
        </ul>
        <p><br></br>Total: ${order.items.reduce((total, item) => total + (item.price * item.amount), 0).toFixed(2)}</p>
    </div>
    <div className="button-div">
        <button className="previous" onClick={onBack}>Previous</button>
        <button className="accept">Accept Order</button>
    </div>
    </div>
    );

export default AcceptOrder;