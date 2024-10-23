import React, { useState, useEffect, useRef } from 'react';
import './RandomImage.css';

const RandomImageHardcoded = () => {
    const [userGuess, setUserGuess] = useState('');
    const [message, setMessage] = useState('');
    const [isLoading, setIsLoading] = useState(false);
    const [imageData, setImageData] = useState(null);
    const canvasRef = useRef(null);

    const fetchRandomImage = async () => {
        setIsLoading(true);  // Start loading
        try {
            const response = await fetch('http://localhost:8080/api/random'); // Getting the image from the Backend
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            const data = await response.json();
            setImageData(data); // Placing image
            setUserGuess('');   // Reset input box when fetching a new image
            setMessage('');     // Clear previous message
        } catch (error) {
            console.error('Error fetching random image:', error);
        } finally {
            setIsLoading(false);  // Stop loading after request
        }
    };

    const handleGuess = () => {
        if (userGuess.toLowerCase() === imageData.country.toLowerCase()) { // why the triple "?" (===)
            setMessage('Correct!');
        } else {
            setMessage(`Incorrect! The correct answer is ${imageData.country}.`);
        }

        // Set a timer to clear the message after 1 second
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
        if (imageData) {
            const canvas = canvasRef.current;
            const ctx = canvas.getContext('2d');
            const img = new Image();
            img.src = imageData.imageUrl;

            img.onload = function () {
                const imgWidth = img.width;
                const imgHeight = img.height;
                const canvasWidth = canvas.width;
                const canvasHeight = canvas.height;

                // Ensure the image is drawn proportionally
                const scale = Math.min(canvasWidth / imgWidth, canvasHeight / imgHeight);
                const x = (canvasWidth / 2) - (imgWidth / 2) * scale;
                const y = (canvasHeight / 2) - (imgHeight / 2) * scale;

                // Draw the full image
                ctx.drawImage(img, x, y, imgWidth * scale, imgHeight * scale);

                // Apply the first blur filter to a specific part of the image
                ctx.filter = 'blur(3px)';  // Adjust the blur strength

                // Coordinates for the area to blur (first blur effect)
                const blur1X = x + 250 * scale + 90; // Adjust coordinates as needed
                const blur1Y = y + 100 * scale + 145;
                const blur1Width = 500 * scale + 5; // Width of blur region
                const blur1Height = 95 * scale; // Height of blur region

                // Redraw the blurred portion of the image (first blur effect)
                ctx.drawImage(img, blur1X, blur1Y, blur1Width, blur1Height, blur1X, blur1Y, blur1Width, blur1Height);

                // Apply the second blur filter to another specific part of the image
                ctx.filter = 'blur(3px)'; // Adjust the blur strength for the second effect

                // Coordinates for the area to blur (second blur effect)
                const blur2X = x + 100 * scale - 50; // Adjust coordinates for the second blur
                const blur2Y = y + 100 * scale - 30;
                const blur2Width = 500 * scale; // Width of the second blur region
                const blur2Height = 90 * scale; // Height of the second blur region

                // Redraw the blurred portion of the image (second blur effect)
                ctx.drawImage(img, blur2X, blur2Y, blur2Width, blur2Height, blur2X, blur2Y, blur2Width, blur2Height);

                // Reset filter after applying blur
                ctx.filter = 'none';

            };
        }
    }, [imageData]);

    useEffect(() => {
        fetchRandomImage();
    }, []);

    return (
        <div className="container">
            <div className="game-box">
            <h1 className="title">
                <span class="U-highlight">U</span>-know?
            </h1>
                {isLoading ? (
                    <div className="loading">Loading new image...</div>
                ) : (
                    imageData && (
                        <div className="image-container fade-in">
                            <canvas
                                ref={canvasRef}
                                width={500}  // Set canvas size
                                height={500} // Adjust according to your image size
                                className="country-image"
                            ></canvas>
                        </div>
                    )
                )}
                
                <input
                    type="text"
                    value={userGuess}
                    onChange={(e) => setUserGuess(e.target.value)}
                    onKeyPress={handleKeyPress}
                    placeholder="Guess the element"
                    className="guess-input"
                />
                {message && (
                    <p className={`feedback-message ${message.includes('Correct') ? 'correct' : 'incorrect'}`}>
                        {message}
                    </p>
                )}
            </div>
        </div>
    );
    
};

export default RandomImageHardcoded;
