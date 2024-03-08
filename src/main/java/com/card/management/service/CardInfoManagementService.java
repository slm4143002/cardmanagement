/**
 * 
 */
package com.card.management.service;

import java.util.List;

import com.card.management.entity.MBatchNumber;

/**
 * @author slm
 *
 */
public interface CardInfoManagementService {
	// 取得批量号信息
	public MBatchNumber getCards(String batchNumber);
	
	// 取得批量号信息
	public List<MBatchNumber> getListCards();
	
	public int countByExample();

}
