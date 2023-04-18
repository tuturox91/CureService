package com.sniklz.tabletkitest.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "cure")
public class Cure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double size;
    private BigDecimal cost;
    @Enumerated(EnumType.STRING)
    private Type type;

    public enum Type {
        INJECTION("injection"),
        PILLS("pills"),
        OINTMENT("ointment");

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getType() {
            return value;
        }
    }
}
