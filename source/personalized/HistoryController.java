/**
	@api {post} /api/history/datas/historyListPaginated.ssg		 히스토리 리스트 조회 (쓱톡용)
	@apiVersion 1.0.0
	@apiName HistoryController.historyListPaginated
	@apiGroup History
	@apiPermission none

	@apiDescription 히스토리 리스트 조회 (쓱톡용)

	
	@apiParam {String} [page=1]	페이지넘버, 페이징을 위해 도입되었으나 현재는 사용하지 않음
	@apiParam {String} [pageSize=100]	페이지당 데이터 개수
	@apiParam {String} srchDivCds	조회대상 히스토리 데이터 타입들(,로구분) - 10:상품, 20:카테고리, 30:기획전, 32:IT아이템, 35:라이벌, 40:브랜드, 50:이벤트, 60:검색어
	@apiParam {String="6001","6002","6003","6004","6005","6009","6100","6200","6300"} infloSiteNo 앱GNB기준 현재몰 siteNo	
	@apiParam {String} [itemImgSize=253]	상품유닛의 이미지 크기
	@apiParam {String=" ","1.0","1.1","1.2"} [apiVersion]	신규몰 추가에 따른 앱버전별 예외처리를 위한 버전

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"infloSiteNo":"6005",
			"itemImgSize":"253",
			"page":"1",
			"pageSize":"30",
			"srchDivCds":"10,20"
			"apiVersion":"1.2"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/history/datas/historyListPaginated.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"infloSiteNo":"6005","itemImgSize":"253","page":"1","pageSize":"30","srchDivCds":"10,20","apiVersion":"1.2"}}'

	@apiSuccess {String}	res_code 응답코드
	@apiSuccess {String}	res_message 응답메시지
	@apiSuccess {Object}	data 응답결과값
	@apiSuccess {List}		data.historyList	[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	@apiSuccess {String}	data.historyList.clipInfo	[클립데이터유닛](#api-header-for-a-submenu-clipunit)
	@apiSuccess {String}	data.historyList.clipableYn	클립가능대상 Y/N
	@apiSuccess {String}	data.historyList.srchSeq	히스토리 데이터 sequence
	@apiSuccess {String}	data.historyList.srchDivCd	히스토리 구분코드 10:상품, 20:카테고리, 30:기획전, 32:IT아이템, 35:라이벌, 40:브랜드, 50:이벤트, 60:검색어
	@apiSuccess {String}	data.historyList.srchTgtIdnfNo1	히스토리 구분 ID 1 - 상품ID, 카테고리ID 등
	@apiSuccess {String}	data.historyList.srchTgtIdnfNo2	히스토리 구분 ID 2 - 사용안함
	@apiSuccess {String}	data.historyList.srchwdDtlc	검색어 데이터
	@apiSuccess {String}	data.historyList.infloSiteNo	진입몰 SITE NO
	@apiSuccess {String}	data.historyList.title1	srchDivCd에 따라 다름 - 10:브랜드명   20:해당카테고리 30:기획전명     40:브랜드명     50:이벤트명
	@apiSuccess {String}	data.historyList.title2	srchDivCd에 따라 다름 - 10:상품명     20:카테고리경로 30:기획전시작일 40:브랜드이미지 50:이벤트시작일
	@apiSuccess {String}	data.historyList.title3	srchDivCd에 따라 다름 - 10:셀링포인트 20:카테고리레벨 30:기획전종료일 40:카테고리명   50:이벤트종료일
	@apiSuccess {String}	data.historyList.sellPrc	상품인 경우 판매가
	@apiSuccess {String}	data.historyList.dcSellPrc	상품인 경우 최적가
	@apiSuccess {String}	data.historyList.adultItemYn	성인상품 Y/N
	@apiSuccess {String}	data.historyList.dealItemYn		딜상품 Y/N
	@apiSuccess {String}	data.historyList.lnkdUrl		연결 URL
	@apiSuccess {String}	data.historyList.adultYn		성인여부 Y/N
	@apiSuccess {String}	data.historyList.imgFileNm		사용안함
	@apiSuccess {String}	data.historyList.imgWidth		사용안함
	@apiSuccess {String}	data.historyList.imgHeight		사용안함
	@apiSuccess {String}	hasNext	다음페이지 여부
	@apiSuccess {String}	curPage	현재패이지번호
	@apiSuccess {String}	pageSize	페이지사이즈

	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "historyList": [
	            {
	                "itemId": "",
	                "itemNm": "",
	                "displayPrc": "",
	                "strikeOutPrc": "",
	                "minOnetOrdPsblQty": "",
	                "maxOnetOrdPsblQty": "",
	                "soldOutYn": "",
	                "stoppedSellingYn": "",
	                "siteNo": "6005",
	                "siteNm": "",
	                "salestrNo": "",
	                "salestrNm": "",
	                "sellpntNm": "",
	                "brandNm": "",
	                "goItemDetailYn": "",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "",
	                "attnTgtIdnfNo2": "",
	                "attnDivCd": "10",
	                "needAdultCertification": null,
	                "itemLnkd": "",
	                "itemImgUrl": "",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "N",
	                "qshppPsblYn": "N",
	                "mltSellQty": null,
	                "uItemSamePrcYn": null,
	                "itemOrdQty": null,
	                "itemOrdQtyType": null,
	                "tildeDispYn": "",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": null,
	                "arrivalNotiBtnDispYn": null,
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": null,
	                "zoomImgUrls": [],
	                "benefitGrp1": null,
	                "benefitGrp2": null,
	                "benefitGrp3": null,
	                "benefitGrp4": null,
	                "srchSeq": "1501810163016",
	                "srchDivCd": "30",
	                "srchTgtIdnfNo1": "6000037109",
	                "srchTgtIdnfNo2": "6005^0",
	                "srchwdDtlc": "http://dev-img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201603/2016033108221425961012590201_271.jpg&w=255&h=255&edit=c&t=1e84cb173b6caf75f64204cbb9dfd04d6892bf6b",
	                "infloSiteNo": "6005",
	                "title1": "[점포행사]과자 기획전",
	                "title2": "2015.01.28 00:00:00",
	                "title3": "2018.12.31 23:59:00",
	                "sellPrc": null,
	                "dcSellPrc": null,
	                "adultItemYn": null,
	                "dealItemYn": "N",
	                "lnkdUrl": "http://dev-m.ssg.com/plan/planShop.ssg?dispCmptId=6000037109",
	                "adultYn": "N",
	                "imgFileNm": "",
	                "imgWidth": "",
	                "imgHeight": "",
	                "clipableYn": "Y",
	                "clipInfo": {
	                    "attnDivDtlCd": "",
	                    "attnDivCd": "40",
	                    "attnTgtIdnfNo2": "6005",
	                    "attnTgtIdnfNo1": "6000037109",
	                    "siteNo": "6005",
	                    "infloSiteNo": "6005"
	                }
	            },
	            {
	                "itemId": "",
	                "itemNm": "",
	                "displayPrc": "",
	                "strikeOutPrc": "",
	                "minOnetOrdPsblQty": "",
	                "maxOnetOrdPsblQty": "",
	                "soldOutYn": "",
	                "stoppedSellingYn": "",
	                "siteNo": "6005",
	                "siteNm": "",
	                "salestrNo": "",
	                "salestrNm": "",
	                "sellpntNm": "",
	                "brandNm": "",
	                "goItemDetailYn": "",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "",
	                "attnTgtIdnfNo2": "",
	                "attnDivCd": "10",
	                "needAdultCertification": null,
	                "itemLnkd": "",
	                "itemImgUrl": "",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "N",
	                "qshppPsblYn": "N",
	                "mltSellQty": null,
	                "uItemSamePrcYn": null,
	                "itemOrdQty": null,
	                "itemOrdQtyType": null,
	                "tildeDispYn": "",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": null,
	                "arrivalNotiBtnDispYn": null,
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": null,
	                "zoomImgUrls": [],
	                "benefitGrp1": null,
	                "benefitGrp2": null,
	                "benefitGrp3": null,
	                "benefitGrp4": null,
	                "srchSeq": "1501810154363",
	                "srchDivCd": "50",
	                "srchTgtIdnfNo1": "1100106347",
	                "srchTgtIdnfNo2": "6005^10",
	                "srchwdDtlc": "0",
	                "infloSiteNo": "6005",
	                "title1": "쿠폰 테스트",
	                "title2": "2017.07.28 00:00:00",
	                "title3": "2017.12.31 23:59:59",
	                "sellPrc": null,
	                "dcSellPrc": null,
	                "adultItemYn": null,
	                "dealItemYn": "N",
	                "lnkdUrl": "http://dev-m.ssg.com/event/eventDetail.ssg?promId=1100106347",
	                "adultYn": "N",
	                "imgFileNm": "",
	                "imgWidth": "",
	                "imgHeight": "",
	                "clipableYn": "Y",
	                "clipInfo": {
	                    "attnDivDtlCd": "",
	                    "attnDivCd": "60",
	                    "attnTgtIdnfNo2": "6005",
	                    "attnTgtIdnfNo1": "1100106347",
	                    "siteNo": "6005",
	                    "infloSiteNo": "6005"
	                }
	            }
	        ],
	        "hasNext": "false"
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID  402 / 요청 파라미터 유효성 검사 실패
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/history/datas/insertHistory.ssg	신규 히스토리 생성
	@apiVersion 1.0.0
	@apiName HistoryController.insertHistory
	@apiGroup History
	@apiPermission none

	@apiDescription 신규 히스토리 생성

	
	@apiParam {String="6001","6002","6003","6004","6005","6009","6100","6200","6300"} siteNo 생성될 히스토리의 기준 siteNo
	@apiParam {String} srchDivCd	생성될 히스토리 데이터 타입 10:상품, 20:카테고리, 30:기획전, 32:IT아이템, 35:라이벌, 40:브랜드, 50:이벤트, 60:검색어
	@apiParam {String} srchTgtIdnfNo1	생성될 히스토리 데이터의 타입별 ID값
	@apiParam {String} srchTgtIdnfNo2	생성될 히스토리 데이터 타입이 10:상품인 경우 온라인이면 siteNo 그외는 salestrNo, 상품이 아니면 0
	@apiParam {String} srchwdDtlc	생성될 히스토리가 검색어 인경우 검색어 데이터
	@apiParam {String="6001","6002","6003","6004","6005","6009","6100","6200","6300"} infloSiteNo 앱GNB기준 현재몰 siteNo	

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"siteNo":"6009",
			"srchDivCd":"10",
			"srchTgtIdnfNo1":"1000011363637",
			"srchTgtIdnfNo2":"1009",
			"srchwdDtlc":"0",
			"infloSiteNo":"6005"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/history/datas/insertHistory.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6009","srchDivCd":"10","srchTgtIdnfNo1":"1000011363637","srchTgtIdnfNo2":"1009","srchwdDtlc":"0","infloSiteNo":"6005"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값

	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {}
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/history/datas/deleteHistory.ssg	기존 히스토리 삭제
	@apiVersion 1.0.0
	@apiName HistoryController.deleteHistory
	@apiGroup History
	@apiPermission none

	@apiDescription 기존 히스토리 삭제

	
	@apiParam {String="Y","N"} [deleteAllYn=N]	전체삭제 여부
	@apiParam {String} srchSeq	개별삭제대상 히스토레 데이너 srchSeq값

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"deleteAllYn":"N",
			"srchSeq":"1501811471988"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/history/datas/deleteHistory.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"deleteAllYn":"N","srchSeq":"1501811471988"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값

	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {}
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/history/datas/historyList.ssg	히스토리 리스트 조회
	@apiVersion 1.0.0
	@apiName HistoryController.historyList
	@apiGroup History
	@apiPermission none

	@apiDescription 히스토리 리스트 조회

	
	@apiParam {String} [page=1]	페이지넘버, 페이징을 위해 도입되었으나 현재는 사용하지 않음
	@apiParam {String="6001","6002","6003","6004","6005","6009","6100","6200","6300"} infloSiteNo 앱GNB기준 현재몰 siteNo	
	@apiParam {String} [itemImgSize=253]	상품유닛의 이미지 크기
	@apiParam {String=" ","1.0","1.1","1.2"} [apiVersion]	신규몰 추가에 따른 앱버전별 예외처리를 위한 버전

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"infloSiteNo":"6005",
			"itemImgSize":"253",
			"page":"1",
			"apiVersion":"1.2"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/history/datas/historyList.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"infloSiteNo":"6005","itemImgSize":"253","page":"1","apiVersion":"1.2"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} data.historyList	[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	@apiSuccess {String}	data.historyList.clipInfo	[클립데이터유닛](#api-header-for-a-submenu-clipunit)
	@apiSuccess {String}	data.historyList.clipableYn	클립가능대상 Y/N	
	@apiSuccess {String}	hasNext	다음페이지 여부

	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "historyList": [
	            {
	                "itemId": "",
	                "itemNm": "",
	                "displayPrc": "",
	                "strikeOutPrc": "",
	                "minOnetOrdPsblQty": "",
	                "maxOnetOrdPsblQty": "",
	                "soldOutYn": "",
	                "stoppedSellingYn": "",
	                "siteNo": "6005",
	                "siteNm": "",
	                "salestrNo": "",
	                "salestrNm": "",
	                "sellpntNm": "",
	                "brandNm": "",
	                "goItemDetailYn": "",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "",
	                "attnTgtIdnfNo2": "",
	                "attnDivCd": "10",
	                "needAdultCertification": null,
	                "itemLnkd": "",
	                "itemImgUrl": "",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "N",
	                "qshppPsblYn": "N",
	                "mltSellQty": null,
	                "uItemSamePrcYn": null,
	                "itemOrdQty": null,
	                "itemOrdQtyType": null,
	                "tildeDispYn": "",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": null,
	                "arrivalNotiBtnDispYn": null,
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": null,
	                "zoomImgUrls": [],
	                "benefitGrp1": null,
	                "benefitGrp2": null,
	                "benefitGrp3": null,
	                "benefitGrp4": null,
	                "srchSeq": "1501810163016",
	                "srchDivCd": "30",
	                "srchTgtIdnfNo1": "6000037109",
	                "srchTgtIdnfNo2": "6005^0",
	                "srchwdDtlc": "http://dev-img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201603/2016033108221425961012590201_271.jpg&w=255&h=255&edit=c&t=1e84cb173b6caf75f64204cbb9dfd04d6892bf6b",
	                "infloSiteNo": "6005",
	                "title1": "[점포행사]과자 기획전",
	                "title2": "2015.01.28 00:00:00",
	                "title3": "2018.12.31 23:59:00",
	                "sellPrc": null,
	                "dcSellPrc": null,
	                "adultItemYn": null,
	                "dealItemYn": "N",
	                "lnkdUrl": "http://dev-m.ssg.com/plan/planShop.ssg?dispCmptId=6000037109",
	                "adultYn": "N",
	                "imgFileNm": "",
	                "imgWidth": "",
	                "imgHeight": "",
	                "clipableYn": "Y",
	                "clipInfo": {
	                    "attnDivDtlCd": "",
	                    "attnDivCd": "40",
	                    "attnTgtIdnfNo2": "6005",
	                    "attnTgtIdnfNo1": "6000037109",
	                    "siteNo": "6005",
	                    "infloSiteNo": "6005"
	                }
	            },
	            {
	                "itemId": "",
	                "itemNm": "",
	                "displayPrc": "",
	                "strikeOutPrc": "",
	                "minOnetOrdPsblQty": "",
	                "maxOnetOrdPsblQty": "",
	                "soldOutYn": "",
	                "stoppedSellingYn": "",
	                "siteNo": "6005",
	                "siteNm": "",
	                "salestrNo": "",
	                "salestrNm": "",
	                "sellpntNm": "",
	                "brandNm": "",
	                "goItemDetailYn": "",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "",
	                "attnTgtIdnfNo2": "",
	                "attnDivCd": "10",
	                "needAdultCertification": null,
	                "itemLnkd": "",
	                "itemImgUrl": "",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "N",
	                "qshppPsblYn": "N",
	                "mltSellQty": null,
	                "uItemSamePrcYn": null,
	                "itemOrdQty": null,
	                "itemOrdQtyType": null,
	                "tildeDispYn": "",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": null,
	                "arrivalNotiBtnDispYn": null,
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": null,
	                "zoomImgUrls": [],
	                "benefitGrp1": null,
	                "benefitGrp2": null,
	                "benefitGrp3": null,
	                "benefitGrp4": null,
	                "srchSeq": "1501810154363",
	                "srchDivCd": "50",
	                "srchTgtIdnfNo1": "1100106347",
	                "srchTgtIdnfNo2": "6005^10",
	                "srchwdDtlc": "0",
	                "infloSiteNo": "6005",
	                "title1": "쿠폰 테스트",
	                "title2": "2017.07.28 00:00:00",
	                "title3": "2017.12.31 23:59:59",
	                "sellPrc": null,
	                "dcSellPrc": null,
	                "adultItemYn": null,
	                "dealItemYn": "N",
	                "lnkdUrl": "http://dev-m.ssg.com/event/eventDetail.ssg?promId=1100106347",
	                "adultYn": "N",
	                "imgFileNm": "",
	                "imgWidth": "",
	                "imgHeight": "",
	                "clipableYn": "Y",
	                "clipInfo": {
	                    "attnDivDtlCd": "",
	                    "attnDivCd": "60",
	                    "attnTgtIdnfNo2": "6005",
	                    "attnTgtIdnfNo1": "1100106347",
	                    "siteNo": "6005",
	                    "infloSiteNo": "6005"
	                }
	            }
	        ],
	        "hasNext": "false"
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

