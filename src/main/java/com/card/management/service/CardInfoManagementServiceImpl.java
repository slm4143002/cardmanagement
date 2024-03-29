/**
 * 
 */
package com.card.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.card.management.entity.MBatchNumber;
import com.card.management.entity.MBatchNumberExample;
import com.card.management.mapper.MBatchNumberMapper;

/**
 * @author slm
 *
 */
@Component
public class CardInfoManagementServiceImpl implements CardInfoManagementService {

	@Autowired
	private MBatchNumberMapper mBatchNumberMapper;

	@Override
	public MBatchNumber getCards(String batchNumber) {
		MBatchNumberExample example = new MBatchNumberExample();
		example.createCriteria().andBatchNumberEqualTo(batchNumber);
		List<MBatchNumber> mn = this.mBatchNumberMapper.selectByExample(example);
		return mn.get(0);
	}

	@Override
	public List<MBatchNumber> getListCards() {
		MBatchNumberExample example = new MBatchNumberExample();
		List<MBatchNumber> mbList = this.mBatchNumberMapper.selectByExample(example);
		return mbList;
	}

	@Override
	public int countByExample() {
		MBatchNumberExample example = new MBatchNumberExample();
		long count = this.mBatchNumberMapper.countByExample(example);
		return (int)count;
	}
}
