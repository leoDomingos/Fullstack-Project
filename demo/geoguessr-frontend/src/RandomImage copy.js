import React, { useEffect, useState } from 'react';

const RandomImage = () => {
    const [imageData, setImageData] = useState(null);
    const [userGuess, setUserGuess] = useState('');
    const [message, setMessage] = useState('');

    const fetchRandomImage = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/random');
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            const data = await response.json();
            setImageData(data);
            setUserGuess(''); // Reset input box when fetching a new image
            setMessage(''); // Clear previous message
        } catch (error) {
            console.error('Error fetching random image:', error);
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
        }, 3000);
    };

    const handleKeyPress = (event) => {
        if (event.key === 'Enter') {
            handleGuess(); // Call handleGuess when Enter is pressed
        }
    };

    useEffect(() => {
        fetchRandomImage();
    }, []);

    return (
        <div>
            {imageData && (
                <div>
                    <img src={imageData.imageUrl} alt={imageData.country} style={{ width: '300px' }} />
                    <p>{imageData.country}</p>
                </div>
            )}
            <input 
                type="text" 
                value={userGuess} 
                onChange={(e) => setUserGuess(e.target.value)} 
                onKeyPress={handleKeyPress} // Handle Enter key press
                placeholder="Guess the country" 
            />
            {message && <p>{message}</p>} {/* Display the message */}
        </div>
    );
};

export default RandomImage;
