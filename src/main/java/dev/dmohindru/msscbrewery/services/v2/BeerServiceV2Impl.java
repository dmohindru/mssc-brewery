package dev.dmohindru.msscbrewery.services.v2;

import dev.dmohindru.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDTO) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDTO) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
