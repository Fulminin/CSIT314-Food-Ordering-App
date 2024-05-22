import { createContext, useState } from "react";
import { food_list } from "./../Assets/assets";
import { food_list as initialFoodList } from "./../Assets/assets";

export const StoreContext = createContext(null)

const StoreContextProvider = (props) => {

    const [food_list, setFoodList] = useState(initialFoodList);

    const updateFoodItem = (updatedItem) => {
      setFoodList((prevList) =>
        prevList.map((item) =>
          item._id === updatedItem._id ? updatedItem : item
        )
      );
    };

    const contextValue ={
        food_list,
        updateFoodItem,
    }
    
    return(
        <StoreContext.Provider value={contextValue}>
            {props.children}
        </StoreContext.Provider>
    )
}

export default StoreContextProvider;