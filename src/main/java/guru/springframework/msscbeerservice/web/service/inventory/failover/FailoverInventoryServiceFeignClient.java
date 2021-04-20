package guru.springframework.msscbeerservice.web.service.inventory.failover;

import guru.springframework.msscbeerservice.web.model.BeerInventoryDto;
import guru.springframework.msscbeerservice.web.service.inventory.BeerInventoryServiceRestTemplateImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "inventory-failover")
public interface FailoverInventoryServiceFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/inventory-failover")
    ResponseEntity<List<BeerInventoryDto>> getOnhandInventory();
}
