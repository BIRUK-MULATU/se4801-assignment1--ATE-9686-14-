// Student Number: [ATE/9686/14 ]
// Student Name: BIRUK MULATU
package com.shopwave.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateStockRequest {
    @NotNull(message = "Delta is required")
    private Integer delta;
}
