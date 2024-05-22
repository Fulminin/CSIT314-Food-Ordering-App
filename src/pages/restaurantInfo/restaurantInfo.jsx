import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './restaurantInfo.css';
import { assets } from '../../Assets/assets';

const RestaurantInfo = () => {
  const [restaurantName, setRestaurantName] = useState("Restaurant Name");
  const [phoneNumber, setPhoneNumber] = useState("0412345678");
  const [email, setEmail] = useState("email@email.com");
  const [bannerDescription, setBannerDescription] = useState("Banner Description");
  const [description, setDescription] = useState("Description");
  const [avatar, setAvatar] = useState(null);

  const [isEditing, setIsEditing] = useState({
    name: false,
    phoneNumber: false,
    email: false,
    banner: false,
    description: false,
  });

  const navigate = useNavigate();

  const toggleEditing = (field) => {
    setIsEditing((prevState) => ({
      ...prevState,
      [field]: !prevState[field],
    }));
  };

  const handleInputChange = (setFunction, event) => {
    setFunction(event.target.value);
  };

  const handleAvatarChange = (event) => {
    if (event.target.files && event.target.files[0]) {
      const reader = new FileReader();
      reader.onload = (e) => {
        setAvatar(e.target.result);
      };
      reader.readAsDataURL(event.target.files[0]);
    }
  };

  const handleSave = () => {
    console.log("Restaurant Info Saved");
    console.log("Name:", restaurantName);
    console.log("Phone Number:", phoneNumber);
    console.log("Email:", email);
    console.log("Banner Description:", bannerDescription);
    console.log("Description:", description);
    console.log("Avatar:", avatar);
  };

  const handleGoBack = () => {
    navigate(-1);
  };

  return (
    <div className="info-page">
      <div className="info-container">
        <div className="info-header">
          <div className="avatar-container">
            <div className="avatar">
              {avatar ? <img src={avatar} alt="Avatar" /> : <div className="default-avatar"></div>}
            </div>
            <label className="edit-button edit-button-icon">
              <img src={assets.editInfo} alt="edit icon" />
              <input
                type="file"
                accept="image/*"
                onChange={handleAvatarChange}
                style={{ display: 'none' }}
              />
            </label>
          </div>
        </div>
        <div className="info-body">
          <div className="info-item">
            <label>Name</label>
            <div className="info-content">
              {isEditing.name ? (
                <input
                  type="text"
                  maxLength={20}
                  value={restaurantName}
                  onChange={(e) => handleInputChange(setRestaurantName, e)}
                />
              ) : (
                <span>{restaurantName}</span>
              )}
              <button
                className="edit-button edit-button-mini"
                onClick={() => toggleEditing('name')}
              >
                <img src={assets.editInfo} alt="edit icon" />
              </button>
            </div>
          </div>
          <div className="info-item">
            <label>Phone Number</label>
            <div className="info-content">
              {isEditing.phoneNumber ? (
                <input
                  type="text"
                  maxLength={16}
                  value={phoneNumber}
                  onChange={(e) => handleInputChange(setPhoneNumber, e)}
                />
              ) : (
                <span>{phoneNumber}</span>
              )}
              <button
                className="edit-button edit-button-mini"
                onClick={() => toggleEditing('phoneNumber')}
              >
                <img src={assets.editInfo} alt="edit icon" />
              </button>
            </div>
          </div>
          <div className="info-item">
            <label>Email</label>
            <div className="info-content">
              {isEditing.email ? (
                <input
                  type="email"
                  maxLength={20}
                  value={email}
                  onChange={(e) => handleInputChange(setEmail, e)}
                />
              ) : (
                <span>{email}</span>
              )}
              <button
                className="edit-button edit-button-mini"
                onClick={() => toggleEditing('email')}
              >
                <img src={assets.editInfo} alt="edit icon" />
              </button>
            </div>
          </div>
          <div className="info-item">
            <label>Banner</label>
            <div className="info-content">
              {isEditing.banner ? (
                <input
                  type="text"
                  maxLength={20}
                  value={bannerDescription}
                  onChange={(e) => handleInputChange(setBannerDescription, e)}
                />
              ) : (
                <span>{bannerDescription}</span>
              )}
              <button
                className="edit-button edit-button-mini"
                onClick={() => toggleEditing('banner')}
              >
                <img src={assets.editInfo} alt="edit icon" />
              </button>
            </div>
          </div>
          <div className="info-item">
            <label>Description</label>
            <div className="info-content">
              {isEditing.description ? (
                <input
                  type="text"
                  maxLength={20}
                  value={description}
                  onChange={(e) => handleInputChange(setDescription, e)}
                />
              ) : (
                <span>{description}</span>
              )}
              <button
                className="edit-button edit-button-mini"
                onClick={() => toggleEditing('description')}
              >
                <img src={assets.editInfo} alt="edit icon" />
              </button>
            </div>
          </div>
        </div>
        <div className="info-footer">
          <button className="save-button" onClick={handleSave}>Save</button>
          <button className="back-button" onClick={handleGoBack}>Go Back</button>
        </div>
      </div>
    </div>
  );
};

export default RestaurantInfo;