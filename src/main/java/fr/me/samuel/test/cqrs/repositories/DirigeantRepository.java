package fr.me.samuel.test.cqrs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.me.samuel.test.cqrs.model.Dirigeant;

@Repository
public interface DirigeantRepository extends JpaRepository<Dirigeant, Long> {

}
