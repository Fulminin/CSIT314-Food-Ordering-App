import React, {useState} from 'react'
import './Promo.css'
import PromoDisplay from '../../components/PromoDisplay/PromoDisplay'

const Promo = () => {
  
  const[category, setCategory] = useState("All");

  return (
    <div>
      <PromoDisplay/>
    </div>
    
  )
}

export default Promo
