package dev.dmohindru.msscbrewery.services;

import dev.dmohindru.msscbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
