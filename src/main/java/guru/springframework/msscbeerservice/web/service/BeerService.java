package guru.springframework.msscbeerservice.web.service;

import guru.springframework.msscbeerservice.web.model.BeerDto;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId);

    void save(BeerDto beerDto);

    void update(UUID beerId, BeerDto beerDto);

    List<BeerDto> getAllBeer();
}
