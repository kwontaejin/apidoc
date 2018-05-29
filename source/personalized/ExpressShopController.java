/**
	@api {post} /api/express/emall/datas/code.ssg	늘사던거 - 품목조회
	@apiVersion 1.0.0
	@apiName ExpressShopController.getExpressEmallDatasCode
	@apiGroup Express
	@apiPermission none

	@apiDescription 늘사던거 - 품목조회 ( /api/marketshopping/express/datas, /api/refrigerator/express/emall/datas/code 와 동일 )

	
	@apiParam {String="20","90","80"} sortCd null이면 전체3가지 품목, 아니면 개별품목리스트만 - 20:인기품목순, 90:가나다순, 80:나의품목순(로그인)

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"sortCd":""
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/express/emall/datas/code.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"sortCd":""}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 	data.resultList	응답리스트
	@apiSuccess {String} 	data.resultList.sortCd	품목정렬코드 - 20:인기품목순, 90:가나다순, 80:나의품목순(로그인)
	@apiSuccess {List} 	data.resultList.dispCtgList	품목데이터
	@apiSuccess {String} 	data.resultList.dispCtgList.dispCtgId	카테고리ID
	@apiSuccess {String} 	data.resultList.dispCtgList.dispCtgNm	카테고리명
	@apiSuccess {String} 	data.resultList.dispCtgList.myExpressYn	즐겨찾기유무Y/N
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "resultList": [
	            {
	                "sortCd": "20",
	                "dispCtgList": [
	                    {
	                        "dispCtgNm": "우유",
	                        "dispCtgId": "6000028742",
	                        "myExpressYn": "N",
	                        "imgFileNm": ""
	                    },
	                    {
	                        "dispCtgNm": "세탁/세제",
	                        "dispCtgId": "6000028803",
	                        "myExpressYn": "N",
	                        "imgFileNm": ""
	                    }
	                ]
	            },
	            {
	                "sortCd": "90",
	                "dispCtgList": [
	                    {
	                        "dispCtgNm": "간편가정식",
	                        "dispCtgId": "6000028763",
	                        "myExpressYn": "N",
	                        "imgFileNm": ""
	                    },
	                    {
	                        "dispCtgNm": "휴지",
	                        "dispCtgId": "6000028797",
	                        "myExpressYn": "N",
	                        "imgFileNm": ""
	                    }
	                ]
	            },
	            {
	                "sortCd": "80",
	                "dispCtgList": [
	                    {
	                        "dispCtgNm": "여성용품",
	                        "dispCtgId": "6000028799",
	                        "myExpressYn": "N",
	                        "imgFileNm": ""
	                    },
	                    {
	                        "dispCtgNm": "양말",
	                        "dispCtgId": "6000028790",
	                        "myExpressYn": "N",
	                        "imgFileNm": ""
	                    }
	                ]
	            }
	        ]
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/express/emall/datas/item.ssg	늘사던거 - 품목별 상품조회
	@apiVersion 1.0.0
	@apiName ExpressShopController.getExpressEmallDatasItem
	@apiGroup Express
	@apiPermission none

	@apiDescription 늘사던거 - 품목별 상품조회 ( /api/marketshopping/express/datas/item, /api/refrigerator/express/emall/datas/item 와 동일 )

	
	@apiParam {String} [siteNo=6001] 조회 SITE NO
	@apiParam {String} dispCtgId	조회 대상 품목 카테고리ID
	@apiParam {String} [itemImgSize=290]	상품유닛용 상품이미지 크기

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
			"dispCtgId":"6000028799",
			"itemImgSize":"290"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/express/emall/datas/item.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6001","dispCtgId":"6000028799","itemImgSize":"290"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 	data.itemList	[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	@apiSuccess {String} 	data.itemList.purchItemYn	내가늘사던상품Y/N
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "itemList": [
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

/**
	@api {post} /api/express/emall/datas/category/update.ssg	늘사던거 - 사용자 품목순서 저장
	@apiVersion 1.0.0
	@apiName ExpressShopController.updateExpressCategory
	@apiGroup Express
	@apiPermission none

	@apiDescription 늘사던거 - 사용자 품목순서 저장 ( /api/marketshopping/express/datas/category/update, /api/refrigerator/express/emall/datas/category/update 와 동일 )

	@apiParam {String} dispCtgId 저장할 품목순서의 카테고리ID (delimeter ",")

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"dispCtgId":"6000028744,6000028745,6000028791,6000028743,6000028766,6000028742,6000028756,6000028746,6000028747,6000028748,6000028749,6000028760,6000028752,6000028753,6000028755,6000028799,6000028800,6000028758,6000028757,6000028773,6000028774,6000028776,6000028763,6000028751,6000028770,6000028767,6000028768,6000028772,6000028775,6000028765,6000028781,6000028782,6000028793,6000028778,6000028780,6000028801,6000028802,6000028803,6000028797,6000028798,6000028785,6000028783,6000028777,6000028764,6000028794,6000028789,6000028796,6000028759,6000028754,6000028784,6000028795,6000028750,6000028762,6000028769,6000028771,6000028779,6000028786,6000028787,6000028788,6000028790"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/express/emall/datas/category/update.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"dispCtgId":"6000028744,6000028745,6000028791,6000028743,6000028766,6000028742,6000028756,6000028746,6000028747,6000028748,6000028749,6000028760,6000028752,6000028753,6000028755,6000028799,6000028800,6000028758,6000028757,6000028773,6000028774,6000028776,6000028763,6000028751,6000028770,6000028767,6000028768,6000028772,6000028775,6000028765,6000028781,6000028782,6000028793,6000028778,6000028780,6000028801,6000028802,6000028803,6000028797,6000028798,6000028785,6000028783,6000028777,6000028764,6000028794,6000028789,6000028796,6000028759,6000028754,6000028784,6000028795,6000028750,6000028762,6000028769,6000028771,6000028779,6000028786,6000028787,6000028788,6000028790"}}'

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

