package com.card.management.control;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CardView {

	private String batchNumber;
	private String machineCategoryName;
	private String machineCount;
	private String carCount;
	private String writeDate;
	private List<CardInfo>  cardInfoList;

}
