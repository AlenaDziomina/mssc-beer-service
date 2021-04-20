package guru.springframework.msscbeerservice.web.service.inventory.failover;

import guru.springframework.msscbeerservice.web.model.BeerInventoryDto;
import guru.springframework.msscbeerservice.web.service.inventory.InventoryServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class FailoverInventoryServiceFeign implements InventoryServiceFeignClient {

    @Autowired
    private FailoverInventoryServiceFeignClient feignClient;

    @Override
    public ResponseEntity<List<BeerInventoryDto>> getOnhandInventory(UUID beerId) {
        return feignClient.getOnhandInventory();
    }
}
