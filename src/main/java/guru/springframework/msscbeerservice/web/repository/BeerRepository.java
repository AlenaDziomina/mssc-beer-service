package guru.springframework.msscbeerservice.web.repository;

import guru.springframework.msscbeerservice.web.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
