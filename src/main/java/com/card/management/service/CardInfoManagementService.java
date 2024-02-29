/**
 * 
 */
package com.card.management.service;

import com.card.management.entity.MBatchNumber;

/**
 * @author slm
 *
 */
public interface CardInfoManagementService {
	// 取得批量号信息
	public MBatchNumber getCards(String batchNumber);

}
