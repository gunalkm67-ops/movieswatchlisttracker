# Movie Watchlist Tracker

A backend REST API built with Spring Boot that integrates with The Movie Database (TMDB) API to search movies and lets users manage a personal watchlist, backed by PostgreSQL.

## Features
- Search movies via live TMDB API integration
- Add movies to a personal watchlist
- View a user's watchlist
- Remove movies from the watchlist

## Tech Stack
- Backend: Java, Spring Boot (Spring Web, Spring Data JPA)
- Database: PostgreSQL
- External API: TMDB (The Movie Database)
- Testing: Postman
- Build Tool: Maven

## API Endpoints

GET /movies/search?query= - Search movies via TMDB
POST /watchlist - Add a movie to the watchlist
GET /watchlist/{userId} - Get a user's watchlist
DELETE /watchlist/{id} - Remove a movie from watchlist

## Setup Instructions

1. Clone the repository
2. Create a PostgreSQL database named moviedb
3. Update src/main/resources/application.properties with your database credentials and TMDB API key
4. Get a free TMDB API key at themoviedb.org
5. Run the application using STS (Run As - Spring Boot App)
6. Test endpoints using Postman

## What I Learned
Building this project helped me practice REST API design, third-party API integration, database persistence with JPA, and structuring a Spring Boot application with proper separation of concerns.