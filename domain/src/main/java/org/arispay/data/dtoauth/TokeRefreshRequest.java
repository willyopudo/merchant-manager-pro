package org.arispay.data.dtoauth;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TokeRefreshRequest {
    @NotBlank
    private String refreshToken;
}
