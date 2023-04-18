package com.sniklz.tabletkitest.repository;

import com.sniklz.tabletkitest.model.Cure;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CureRepository extends JpaRepository<Cure, Long> {
}
