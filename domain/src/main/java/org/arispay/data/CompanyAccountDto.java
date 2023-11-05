package org.arispay.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.arispay.utils.DtoEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyAccountDto implements DtoEntity {
	private Long id;


	private Long companyId;

	private String accountNumber;

	private String accountName;

	private String bankCode;

	private String bankName;

	private String pesaLinkPhone;

	private byte isPesaLinkRegistered;
}
