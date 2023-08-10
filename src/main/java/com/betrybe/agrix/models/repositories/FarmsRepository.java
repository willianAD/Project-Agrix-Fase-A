package com.betrybe.agrix.models.repositories;

import com.betrybe.agrix.models.entities.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface FarmsRepository.
 */
@Repository
public interface FarmsRepository extends JpaRepository<Farm, Long> {
}
