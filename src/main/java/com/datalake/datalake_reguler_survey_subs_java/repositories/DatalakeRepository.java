package com.datalake.datalake_reguler_survey_subs_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datalake.datalake_reguler_survey_subs_java.entities.DatalakeEntity;

@Repository
public interface DatalakeRepository extends JpaRepository<DatalakeEntity, Long> {

}
