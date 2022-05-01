package dev.dmohindru.msscbrewery.services;

import dev.dmohindru.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDTO);

    void updateBeer(UUID beerId, BeerDto beerDTO);

    void deleteById(UUID beerId);
}
