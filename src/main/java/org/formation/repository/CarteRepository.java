package org.formation.repository;

import org.formation.entity.CarteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteRepository extends JpaRepository<CarteBancaire, Long> {

}
