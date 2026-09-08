package com.gunalkm.moviewatchlisttracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.gunalkm.moviewatchlisttracker.model.MOVIE;

public interface MovieRepository extends JpaRepository<MOVIE, Long> {
}