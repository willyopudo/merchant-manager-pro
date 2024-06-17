package org.arispay.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDto {

	private String bankTransRef;

	private String arisTransRef;

	private Float transAmount;

	private String bankAccount;

	private Long companyId;

	private Long client;

	private String payerName;

	private String payerPhone;

	private String paymentMode;

	private String narration;

	private String apiChannel;

	private Date transDate;

	private String crDrInd;
}
