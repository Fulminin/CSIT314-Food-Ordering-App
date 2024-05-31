import { createContext, useEffect, useState } from "react";
import { food_list } from "../assets/assets";
import { restaurant_list } from "../assets/assets";

export const StoreContext = createContext(null)

const StoreContextProvider = (props) => {

    const [cartItems, setCartItems] = useState({});

    const addToCart = (itemId) => {

        if (!cartItems[itemId]) {  // Adding the "first entry" of a product ID and setting quantity equal to 1
            setCartItems((prev) => ({ ...prev, [itemId]: 1 }))
        }

        else { // If there is an entry of the product ID, increment quantity by 1
            setCartItems((prev) => ({ ...prev, [itemId]: prev[itemId] + 1 }))
        }
    }

    const removeFromCart = (itemId) => { // Removing entry of Product ID
        setCartItems((prev) => ({ ...prev, [itemId]: prev[itemId] - 1 }))
    }

    const getTotalCartAmount = () => {
        let totalAmount = 0;
        for (const item in cartItems) {
            if (cartItems[item] > 0) {
                let itemInfo = food_list.find((product) => product._id === item);
                totalAmount += itemInfo.price * cartItems[item];
            }
        }
        return totalAmount;
    }
        const contextValue = {
            food_list,
            restaurant_list,
            cartItems,
            setCartItems,
            addToCart,
            removeFromCart,
            getTotalCartAmount
        }

        return (
            <StoreContext.Provider value={contextValue}>
                {props.children}
            </StoreContext.Provider>
        )
}

    export default StoreContextProvider


/*
import { createContext } from "react";
import { food_list } from "../assets/assets";

export const StoreContext = createContext(null)

const StoreContextProvider = (props) => {




    const contextValue = {
        food_list

    }
    return(
        <StoreContext.Provider value={contextValue}>
            {props.children}
        </StoreContext.Provider>
    )
}

export default StoreContextProvider
*/


/*

// Create Cart Item Object
    const [cartItems,setCartItems] = useState({});

    const addToCart = (itemId) => {
        if(!cartItems[itemId]) {  // If the user adds an "product" in the cart for the first time, quanity of the product is  '1'
            setCartItems((prev)=>({...prev,[itemId]:1})) // Creates a new entry for food product
        }
        else { // If user already has this "product" in the cart, the current quanitty of the product is incremeted by 1
            setCartItems((prev)=>({...prev,[itemId]:prev[itemId]+1}))
        }
    }

    const removeFromCart = (itemId) => { // Decreases the value of the "product" by 1 
        setCartItems((prev)=>({...prev,[itemId]:prev[item]-1}))
    }

    useEffect(()=>{
        console.log(cartItems);
    },[cartItems])
    
    
    const contextValue = {
        food_list, 
        cartItems,
        setCartItems,
        addToCart,
        removeFromCart
    }

*/