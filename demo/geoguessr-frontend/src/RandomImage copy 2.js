import React, { useState, useEffect } from 'react';
import './RandomImage.css'; // Assuming you have a CSS file

const RandomImageHardcoded = () => {
    const [userGuess, setUserGuess] = useState('');
    const [message, setMessage] = useState('');
    const [isLoading, setIsLoading] = useState(false);
    const [imageData, setImageData] = useState(null);

    const fetchRandomImage = async () => {
        setIsLoading(true);  // Start loading
        try {
            const response = await fetch('http://localhost:8080/api/random');
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            const data = await response.json();
            setImageData(data);
            setUserGuess(''); // Reset input box when fetching a new image
            setMessage('');   // Clear previous message
        } catch (error) {
            console.error('Error fetching random image:', error);
        } finally {
            setIsLoading(false);  // Stop loading after request
        }
    };

    const handleGuess = () => {
        if (userGuess.toLowerCase() === imageData.country.toLowerCase()) {
            setMessage('Correct!');
        } else {
            setMessage(`Incorrect! The correct answer is ${imageData.country}.`);
        }

        // Set a timer to clear the message after 3 seconds
        setTimeout(() => {
            setMessage('');
            fetchRandomImage(); // Fetch a new random image
        }, 1000);
    };

    const handleKeyPress = (event) => {
        if (event.key === 'Enter') {
            handleGuess();
        }
    };

    useEffect(() => {
        fetchRandomImage();
    }, []);

    return (
        <div className="container">
            <div className="game-box">
                {isLoading ? (
                    <div className="loading">Loading new image...</div>
                ) : (
                    imageData && (
                        <div className="image-container fade-in">
                            <img src={imageData.imageUrl} alt={imageData.country} className="country-image" />
                        </div>
                    )
                )}
                <input
                    type="text"
                    value={userGuess}
                    onChange={(e) => setUserGuess(e.target.value)}
                    onKeyPress={handleKeyPress}
                    placeholder="Guess the country"
                    className="guess-input"
                />
                {message && <p className="feedback-message">{message}</p>}
            </div>
        </div>
    );
};

export default RandomImageHardcoded;
