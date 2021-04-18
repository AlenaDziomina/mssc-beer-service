package guru.springframework.msscbeerservice.web.service;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerPageList;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId, boolean showInventoryOnHand);

    void save(BeerDto beerDto);

    void update(UUID beerId, BeerDto beerDto);

    BeerPageList listBeers(String beerName, BeerStyleEnum beerStyle, Pageable pageRequest, boolean showInventoryOnHand);

    BeerDto getByUpc(String upc);
}
