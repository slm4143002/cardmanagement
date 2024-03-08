$(function() {
	var nIntervId;
	$("#batchNumber").focus();
	document.addEventListener('keyup', function() {
		$("#cardInfo1").on("input", function() {

			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan1, 500);
			}
		});
		$("#cardInfo2").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan2, 500);
			}
		});
		$("#cardInfo3").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan3, 500);
			}
		});
		$("#cardInfo4").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan4, 500);
			}
		});
		$("#cardInfo5").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan5, 500);
			}
		});
		$("#cardInfo6").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan6, 500);
			}
		});
		$("#cardInfo7").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan7, 500);
			}
		});
		$("#cardInfo8").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan8, 500);
			}
		});
		$("#cardInfo9").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan9, 500);
			}
		});
		$("#cardInfo10").on("input", function() {
			if (!nIntervId) {
				scanList = ""
				// 启动定时器
				nIntervId = setInterval(checkScan10, 500);
			}
		});
	});

	function checkScan1() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo1").unbind();
		$("#cardInfo2").focus();

	}
	function checkScan2() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo2").unbind();
		$("#cardInfo3").focus();

	}
	function checkScan3() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo3").unbind();
		$("#cardInfo4").focus();

	}
	function checkScan4() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo4").unbind();
		$("#cardInfo5").focus();

	}
	function checkScan5() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo5").unbind();
		$("#cardInfo6").focus();

	}
	function checkScan6() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo6").unbind();
		$("#cardInfo7").focus();

	}
	function checkScan7() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo7").unbind();
		$("#cardInfo8").focus();

	}
	function checkScan8() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo8").unbind();
		$("#cardInfo9").focus();

	}
	function checkScan9() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo9").unbind();
		$("#cardInfo10").focus();

	}
	function checkScan10() {// 0.5秒结束

		// 清除定时器
		clearInterval(nIntervId);
		nIntervId = null
		$("#cardInfo10").unbind();
		$("#cardInfo1").focus();

	}
	
	$("#card_form_back").on("submit", function(e) {
		e.preventDefault();  // デフォルトのイベント(ページの遷移やデータ送信など)を無効にする
		$.ajax({
			url: $(this).attr("action"),  // リクエストを送信するURLを指定（action属性のurlを抽出）
			type: "POST",  // HTTPメソッドを指定（デフォルトはGET）
			data: {
				batchNumber: $("#batchNumber").val()  // 送信データ
			}
		})
			.done(function(data) {
				$("#machineCategoryName").val(`${data.machineCategoryName}`);
				$("#machineCount").val(`${data.machineCount}`);
				$("#carCount").val(`${data.carCount}`);
				$("#writeDate").val(`${data.writeDate}`);
			})
			.fail(function() {
				alert("error!");  // 通信に失敗した場合の処理
			})
	});

	// 搜索按下
	$("#search").click(function(event) {
		event.preventDefault();
		if ($("#batchNumber").val()=="") {
			alert("请输入批量号!");
			$("#batchNumber").focus();
		} else {
			getCardInfo();
			$("#cardInfo1").focus();
		}
		
	});
	function getCardInfo() {
		$.ajax(
			{
				url: "/searchCardInfo",
				type: "POST",
				data: {
					batchNumber: $("#batchNumber").val()  // 送信データ
				},
				dataType: 'json',
				success: function(data) {

					$("#machineCategoryName").val(`${data.machineCategoryName}`);
					$("#machineCount").val(`${data.machineCount}`);
					$("#carCount").val(`${data.carCount}`);
					$("#writeDate").val(`${data.writeDate}`);
					for (var i = 1; i <= `${data.carCount}`; i++) {
						$("#cardcount" + i).val(i + "/" + `${data.carCount}`);
					}
					var j = (Number(`${data.carCount}`) + 1)
					for (j; j <= 10; j++) {
						$("#cardInfo" + j).prop("disabled", true)
						$("#cardInfo" + j).removeAttr('placeholder');
						$("#cardcount" + j).prop("disabled", true)
					}

				},
				error: function(e) {
					alert("Error!")
					console.log("ERROR: ", e);
				}
			}
		)
	}

});

function clearValue(num) {
	$("#cardInfo"+num).val("")	
}

function checkItem() {
	
	const letters = new Set();
	for (var i = 1; i <= $("#carCount").val(); i++) {
		
		if ($("#cardInfo" + i).val() == "") {
			event.preventDefault();
			alert("请扫码输入！");
			$("#cardInfo" + i).focus();
			return;
		}
		letters.add($("#cardInfo" + i).val());
	}

	if (letters.size != $("#carCount").val()) {
		event.preventDefault();
		alert("有重复信息，请确认");
	}
}


