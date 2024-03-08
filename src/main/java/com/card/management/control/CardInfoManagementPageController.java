/**
 * 
 */
package com.card.management.control;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.card.management.entity.MBatchNumber;
import com.card.management.service.CardInfoManagementService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jakarta.validation.Valid;

/**
 * @author slm
 *
 */
@Controller
public class CardInfoManagementPageController {

	@Autowired
	public CardInfoManagementService service;

	@GetMapping("/login")
	public String getCards() {
		return "navigation";
	}

	@GetMapping("/gotoCrdview")
	public String creadCard(@Valid @ModelAttribute("cardview") CardView cardview, BindingResult bindingResult,
			Model model) {
		model.addAttribute("crdview", new CardView());
		return "cardview";
	}

	@PostMapping("/searchCardInfo")
	public ResponseEntity<Object> searchCardInfo(@RequestParam String batchNumber) {
		CardView cv = new CardView();
		cv.setBatchNumber("A123");
		cv.setCarCount("5");
		cv.setMachineCategoryName("机种名");
		cv.setMachineCount("3");
		cv.setWriteDate("");
		return new ResponseEntity<Object>(cv, HttpStatus.OK);
	}

	@PostMapping("/createCardInfo")
	public String createCardInfo(@ModelAttribute CardView cardview, Model model) {
		System.out.print( cardview.getCardInfoList().get(0).getCardInfo());
		System.out.print( cardview.getCardInfoList().get(0).getCardCount());
		//model.addAttribute("crdview", cardview);
		return "navigation";
	}

	/** 
	 * 跳转到筹备明细 
	 * 
	 */
	@GetMapping("/preparatoryDetail")
	public String preparatoryDetail() {

		return "preparator-detail-list";
	}

	@PostMapping("/preparatoryDetailResult")
	public ResponseEntity<Pages<MBatchNumber>> preparatoryDetailResult(@RequestParam int pageNumber,String pageSize) {
		String regex = "\\d*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pageSize);
		
		if (matcher.matches()) {
			PageHelper.startPage(pageNumber,Integer.valueOf(pageSize));
		} else {
			PageHelper.startPage(1,service.countByExample());
		}
		
		List<MBatchNumber> all = service.getListCards();
		PageInfo<MBatchNumber> pageInfo = new PageInfo<MBatchNumber>(all);
		Pages<MBatchNumber> pages = new Pages<MBatchNumber>();
        pages.setRows(all);
        pages.setTotal((int)pageInfo.getTotal());
		//List<User> userList=userMapper.getALLUsers();
		//		CardView cv = new CardView();
		//		cv.setBatchNumber("A123");
		//		cv.setCarCount("5");
		//		cv.setMachineCategoryName("机种名");
		//		cv.setMachineCount("3");
		//		cv.setWriteDate("");
		//		ArrayList<CardInfo> alList = new ArrayList<CardInfo>();
		//		CardInfo cd = new CardInfo();
		//		cd.setCardCount("2");
		//		cd.setCardInfo("AAAA-CCC");
		//		
		//		CardInfo cd1 = new CardInfo();
		//		cd1.setCardCount("2");
		//		cd1.setCardInfo("AAAA-BBB");
		//		alList.add(cd);
		//		alList.add(cd1);
		//		cv.setCardInfoList(alList);
		return new ResponseEntity<Pages<MBatchNumber>>(pages, HttpStatus.OK);
	}

}
