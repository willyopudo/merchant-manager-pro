package org.arispay.data.dtoresponse.Validation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payload {

    private String identifier;
    private String identifier_type;
    private String customer_id;
    private String customer_name;
}
