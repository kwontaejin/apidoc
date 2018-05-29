/**
	@api {post} /api/frequently/datas/item.ssg		자주구매상품 조회
	@apiVersion 1.0.0
	@apiName FrequentlyOrderController.getFrequentlyOrderItemList
	@apiGroup Personalized
	@apiPermission none

	@apiDescription 자주구매상품 조회

	
	@apiParam {String="6001","6002","6003","6004","6005","6009"} siteNo 앱GNB기준 현재몰 siteNo	
	@apiParam {String} dispSiteNo	전시대상 상품유닛용 siteNo
	@apiParam {String="oftenBuy","lastBuy"} [orderType=oftenBuy]	자주구매상품 정렬기준 lastBuy:최근구매순, oftenBuy:자주구매순
	@apiParam {String="Y","N"}	[sellStateYn=N] 판매중 상품만 보기 Y/N
	@apiParam {String}	[itemImgSize=253] 상품유닛용 상품이미지 크기
	@apiParam {String}	[page=1] 페이지 번호
	@apiParam {String}	[pageSize=20] 페이지 사이즈

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"siteNo":"6005",
			"dispSiteNo":"6005",
			"orderType":"",
			"sellStateYn":"",
			"itemImgSize":"",
			"page":"1",
			"pageSize":"20"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/frequently/datas/item.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005","dispSiteNo":"6005","orderType":"","sellStateYn":"","itemImgSize":"","page":"1","pageSize":"20"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}		data.isSvcStop		서비스중단여부
	@apiSuccess {String}		data.hasNext		다음페이지 여부
	@apiSuccess {String}		data.infoTypeCd		자주구매 서비스 상태 코드 10:자주구매상품있음, 20:자주구매상품없음, 30:자주구매목록서비스중단
	@apiSuccess {String}		data.infoMessage	자주구매 서비스 상태 이름
	@apiSuccess {List}			data.resultList		[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "isSvcStop": "false",
	        "hasNext": "true",
	        "resultList": [
	            {
	                "itemId": "1000021228197",
	                "itemNm": "닭표 스리라차 칠리소스255g",
	                "displayPrc": "4032",
	                "strikeOutPrc": "4480",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "20",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6001",
	                "siteNm": "emart mall",
	                "salestrNo": "2449",
	                "salestrNm": "emart NE.O.002",
	                "sellpntNm": "",
	                "brandNm": "",
	                "goItemDetailYn": "N",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "1000021228197",
	                "attnTgtIdnfNo2": "2449",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000021228197&siteNo=6001&salestrNo=2449",
	                "itemImgUrl": "http://item.ssgcdn.com/97/81/22/item/1000021228197_i1_253.jpg",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "N",
	                "qshppPsblYn": "N",
	                "mltSellQty": "1",
	                "uItemSamePrcYn": "Y",
	                "itemOrdQty": "",
	                "itemOrdQtyType": "DEAL",
	                "tildeDispYn": "N",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": "N",
	                "arrivalNotiBtnDispYn": "N",
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": "",
	                "zoomImgUrls": [],
	                "benefitGrp1": [
	                    {
	                        "type": "B0",
	                        "txt": "10"
	                    }
	                ],
	                "benefitGrp2": [
	                    {
	                        "type": "110",
	                        "txt": "점포택배"
	                    }
	                ],
	                "benefitGrp3": [],
	                "benefitGrp4": [],
	                "ordCnt": "1"
	            },
	            {
	                "itemId": "0000006821911",
	                "itemNm": "[국내산] 애호박 (1개)",
	                "displayPrc": "2261",
	                "strikeOutPrc": "2380",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "999",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6001",
	                "siteNm": "emart mall",
	                "salestrNo": "2449",
	                "salestrNm": "emart NE.O.002",
	                "sellpntNm": "",
	                "brandNm": "E-MART FRESH",
	                "goItemDetailYn": "N",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "0000006821911",
	                "attnTgtIdnfNo2": "2449",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=0000006821911&siteNo=6001&salestrNo=2449",
	                "itemImgUrl": "http://item.ssgcdn.com/11/19/82/item/0000006821911_i1_253.jpg",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "N",
	                "qshppPsblYn": "N",
	                "mltSellQty": "1",
	                "uItemSamePrcYn": "Y",
	                "itemOrdQty": "",
	                "itemOrdQtyType": "DEAL",
	                "tildeDispYn": "N",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": "N",
	                "arrivalNotiBtnDispYn": "N",
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": "",
	                "zoomImgUrls": [],
	                "benefitGrp1": [
	                    {
	                        "type": "B0",
	                        "txt": "5"
	                    }
	                ],
	                "benefitGrp2": [
	                    {
	                        "type": "100",
	                        "txt": "쓱-배송"
	                    }
	                ],
	                "benefitGrp3": [],
	                "benefitGrp4": [],
	                "ordCnt": "1"
	            }
	        ],
	        "infoTypeCd": "10",
	        "infoMessage": ""
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/refrigerator/frequently/datas/best.ssg		자주구매-재구매베스트 상품조회 (삼성냉장고) 
	@apiVersion 1.0.0
	@apiName FrequentlyOrderController.getFrequentlyOrderBestItemList
	@apiGroup Personalized
	@apiPermission none

	@apiDescription 자주구매-재구매베스트 상품조회 (삼성냉장고) 

	
	@apiParam {String} [siteNo=6001] 이몰SiteNo	
	@apiParam {String} [dispSiteNo=6001]	이몰SiteNo (상품유닛용)
	@apiParam {String}	[itemImgSize=253] 상품유닛용 상품이미지 크기

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"siteNo":"6001",
			"dispSiteNo":"6001",
			"itemImgSize":""
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/refrigerator/frequently/datas/best.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6001","dispSiteNo":"6001","itemImgSize":""}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List}			data.resultList		[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "isSvcStop": "false",
	        "hasNext": "true",
	        "resultList": [
	            {
	                "itemId": "1000021228197",
	                "itemNm": "닭표 스리라차 칠리소스255g",
	                "displayPrc": "4032",
	                "strikeOutPrc": "4480",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "20",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6001",
	                "siteNm": "emart mall",
	                "salestrNo": "2449",
	                "salestrNm": "emart NE.O.002",
	                "sellpntNm": "",
	                "brandNm": "",
	                "goItemDetailYn": "N",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "1000021228197",
	                "attnTgtIdnfNo2": "2449",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000021228197&siteNo=6001&salestrNo=2449",
	                "itemImgUrl": "http://item.ssgcdn.com/97/81/22/item/1000021228197_i1_253.jpg",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "N",
	                "qshppPsblYn": "N",
	                "mltSellQty": "1",
	                "uItemSamePrcYn": "Y",
	                "itemOrdQty": "",
	                "itemOrdQtyType": "DEAL",
	                "tildeDispYn": "N",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": "N",
	                "arrivalNotiBtnDispYn": "N",
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": "",
	                "zoomImgUrls": [],
	                "benefitGrp1": [
	                    {
	                        "type": "B0",
	                        "txt": "10"
	                    }
	                ],
	                "benefitGrp2": [
	                    {
	                        "type": "110",
	                        "txt": "점포택배"
	                    }
	                ],
	                "benefitGrp3": [],
	                "benefitGrp4": [],
	                "ordCnt": "1"
	            },
	            {
	                "itemId": "0000006821911",
	                "itemNm": "[국내산] 애호박 (1개)",
	                "displayPrc": "2261",
	                "strikeOutPrc": "2380",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "999",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6001",
	                "siteNm": "emart mall",
	                "salestrNo": "2449",
	                "salestrNm": "emart NE.O.002",
	                "sellpntNm": "",
	                "brandNm": "E-MART FRESH",
	                "goItemDetailYn": "N",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "0000006821911",
	                "attnTgtIdnfNo2": "2449",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=0000006821911&siteNo=6001&salestrNo=2449",
	                "itemImgUrl": "http://item.ssgcdn.com/11/19/82/item/0000006821911_i1_253.jpg",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "N",
	                "qshppPsblYn": "N",
	                "mltSellQty": "1",
	                "uItemSamePrcYn": "Y",
	                "itemOrdQty": "",
	                "itemOrdQtyType": "DEAL",
	                "tildeDispYn": "N",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": "N",
	                "arrivalNotiBtnDispYn": "N",
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": "",
	                "zoomImgUrls": [],
	                "benefitGrp1": [
	                    {
	                        "type": "B0",
	                        "txt": "5"
	                    }
	                ],
	                "benefitGrp2": [
	                    {
	                        "type": "100",
	                        "txt": "쓱-배송"
	                    }
	                ],
	                "benefitGrp3": [],
	                "benefitGrp4": [],
	                "ordCnt": "1"
	            }
	        ],
	        "infoTypeCd": "10",
	        "infoMessage": ""
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/frequently/datas/status/update.ssg		자주구매 상태변경
	@apiVersion 1.0.0
	@apiName FrequentlyOrderController.updateFrequentlyServiceStatus
	@apiGroup Personalized
	@apiPermission none

	@apiDescription 자주구매 상태변경

	
	@apiParam {String="1","0"} updateStatus	자주구매 변경 상태값 1:중단, 0:계속

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"updateStatus":"0"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/frequently/datas/status/update.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"updateStatus":"0"}}'

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
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/frequently/datas/replaceitem.ssg	자주구매상품 연관상품조회
	@apiVersion 1.0.0
	@apiName FrequentlyOrderController.getFrequentlyOrderReplaceItemList
	@apiGroup Personalized
	@apiPermission none

	@apiDescription 자주구매상품 연관상품조회

	
	@apiParam {String} itemId	연관상품 조회대상 상품ID
	@apiParam {String} siteNo	상품siteNo
	@apiParam {String} dispSiteNo	전시대상 상품유닛용 siteNo
	@apiParam {String} displayPrc	대상상품 가격
	@apiParam {String} [itemImgSize=253]	상품유닛용 상품이미지 크기
	
	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"siteNo":"6005",
			"dispSiteNo":"6004",
			"itemImgSize":"253",
			"itemId":"1000020988526"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/frequently/datas/replaceitem.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005","dispSiteNo":"6005","itemImgSize":"253","itemId":"1000020988526"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {Object}     	data.titleNm			연관상품 카테고리 명
	@apiSuccess {List} 		data.resultList		[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	    	"titleNm":"유아",
	        "resultList": [
	            {
	                "itemId": "1000021088068",
	                "itemNm": "[고소키] 레인코트 FOXY BROWN (GSFSCRCU0008TU)",
	                "displayPrc": "109600",
	                "strikeOutPrc": "137000",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "20",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6009",
	                "siteNm": "신세계백화점",
	                "salestrNo": "1019",
	                "salestrNm": "대구신세계",
	                "sellpntNm": "",
	                "brandNm": "카라멜",
	                "goItemDetailYn": "Y",
	                "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                "attnTgtIdnfNo1": "1000021088068",
	                "attnTgtIdnfNo2": "1019",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000021088068&siteNo=6009&salestrNo=1019",
	                "itemImgUrl": "http://item.ssgcdn.com/68/80/08/item/1000021088068_i1_253.jpg",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "Y",
	                "qshppPsblYn": "N",
	                "mltSellQty": "1",
	                "uItemSamePrcYn": "Y",
	                "itemOrdQty": "",
	                "itemOrdQtyType": "NONE",
	                "tildeDispYn": "N",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": "N",
	                "arrivalNotiBtnDispYn": "N",
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": "",
	                "zoomImgUrls": [],
	                "benefitGrp1": [
	                    {
	                        "type": "B0",
	                        "txt": "20"
	                    }
	                ],
	                "benefitGrp2": [],
	                "benefitGrp3": [
	                    {
	                        "type": "220",
	                        "txt": "카드할인 5%"
	                    },
	                    {
	                        "type": "160",
	                        "txt": "청구할인"
	                    }
	                ],
	                "benefitGrp4": [
	                    {
	                        "type": "mpickup",
	                        "txt": "매직픽업"
	                    }
	                ]
	            },
	            {
	                "itemId": "1000021157967",
	                "itemNm": "[노앤조] 우비 케이프 화이트 [2,4,6,8Y] RAINCAPE (NZDFCRCU0001MZ)",
	                "displayPrc": "70400",
	                "strikeOutPrc": "88000",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "20",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6009",
	                "siteNm": "신세계백화점",
	                "salestrNo": "1019",
	                "salestrNm": "대구신세계",
	                "sellpntNm": "",
	                "brandNm": "카라멜",
	                "goItemDetailYn": "Y",
	                "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                "attnTgtIdnfNo1": "1000021157967",
	                "attnTgtIdnfNo2": "1019",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000021157967&siteNo=6009&salestrNo=1019",
	                "itemImgUrl": "http://item.ssgcdn.com/67/79/15/item/1000021157967_i1_253.jpg",
	                "planDt": "",
	                "dataFileNm": "",
	                "pickuItemYn": "Y",
	                "qshppPsblYn": "N",
	                "mltSellQty": "1",
	                "uItemSamePrcYn": "Y",
	                "itemOrdQty": "",
	                "itemOrdQtyType": "NONE",
	                "tildeDispYn": "N",
	                "recompPoint": "",
	                "recomRegCnt": "",
	                "sellUnitPrc": "",
	                "sellCapaUnitNmWithUnitCapa": "",
	                "replaceBtnDispYn": "N",
	                "arrivalNotiBtnDispYn": "N",
	                "advertAcctId": "",
	                "advertBidId": "",
	                "cartPsblType": "",
	                "zoomImgUrls": [],
	                "benefitGrp1": [
	                    {
	                        "type": "B0",
	                        "txt": "20"
	                    }
	                ],
	                "benefitGrp2": [],
	                "benefitGrp3": [
	                    {
	                        "type": "220",
	                        "txt": "카드할인 5%"
	                    },
	                    {
	                        "type": "160",
	                        "txt": "청구할인"
	                    }
	                ],
	                "benefitGrp4": [
	                    {
	                        "type": "mpickup",
	                        "txt": "매직픽업"
	                    }
	                ]
	            }
	        ],
	        "hasNext": "false"
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

