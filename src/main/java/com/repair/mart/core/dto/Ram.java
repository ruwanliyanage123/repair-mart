package com.repair.mart.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ram {
    private Long id;
    private String modelNumber;
    private String brandName;
    private String clockSpeed;
}
