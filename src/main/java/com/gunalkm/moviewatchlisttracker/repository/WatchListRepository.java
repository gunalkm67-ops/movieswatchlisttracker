package com.gunalkm.moviewatchlisttracker.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gunalkm.moviewatchlisttracker.model.WatchList;

public interface WatchListRepository extends JpaRepository<WatchList, Long> {
    List<WatchList> findByUserId(Long userId);
}