package com.gunalkm.moviewatchlisttracker.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gunalkm.moviewatchlisttracker.model.WatchList;
import com.gunalkm.moviewatchlisttracker.repository.WatchListRepository;

@RestController
@RequestMapping("/watchlist")
public class WatchListController {

    @Autowired
    private WatchListRepository watchListRepository;

    @PostMapping
    public WatchList addToWatchlist(@RequestBody WatchList watchlist) {
        return watchListRepository.save(watchlist);
    }

    @GetMapping("/{userId}")
    public List<WatchList> getWatchlist(@PathVariable Long userId) {
        return watchListRepository.findByUserId(userId);
    }

    @DeleteMapping("/{id}")
    public void removeFromWatchlist(@PathVariable Long id) {
        watchListRepository.deleteById(id);
    }
}