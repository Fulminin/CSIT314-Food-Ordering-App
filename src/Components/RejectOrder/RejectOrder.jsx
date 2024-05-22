import React from 'react';
import './RejectOrder.css';

const RejectOrder = ({ order, onBack }) => (
<div className="reject-order">
    <h2>Reject an order</h2>
    <div className="order-details">
        <h3>Order details</h3>
        <p>Customer #{order.id}</p>
        <ul>
            {order.items.map((item, idx) => (
                <li key={idx}> <br></br> {item.name} <br></br> ${item.price.toFixed(2)} <br></br> Amount: {item.amount}</li>
            ))}
        </ul>
        <p> <br></br>Total: ${order.items.reduce((total, item) => total + (item.price * item.amount), 0).toFixed(2)}</p>
    </div>
    <div className="rejection-reason">
        <h3>Reason of Rejection</h3>
        <textarea placeholder="Please write your reason here"></textarea>
    </div>
    <div className="button-div">
        <button className="previous" onClick={onBack}>Previous</button>
        <button className="reject">Reject Order</button>
    </div>
</div>
);

export default RejectOrder;