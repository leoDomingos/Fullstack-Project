# Stage 1: Build the React app
FROM node:20.18.0 AS build

# Set the working directory
WORKDIR /app

# Copy package.json and package-lock.json (or yarn.lock)
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of your application code
COPY . .

# Build the React application
RUN npm run build

# Stage 2: Serve the app using a lightweight web server
FROM nginx:alpine

# Copy the built files from the previous stage to the Nginx HTML directory
COPY --from=build /app/build /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Command to run Nginx
CMD ["nginx", "-g", "daemon off;"]
