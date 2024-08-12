package com.datalake.datalake_reguler_survey_subs_java.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DatalakeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String order_id;
    private String current_form_desc;
    private Long appl_no;
    private String appl_date;
    private String order_date;
    private Long appl_contract_no;

}
