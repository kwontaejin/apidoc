/**
	@api {post} /api/personalized/datas/tabItemList/type.ssg	개인화탭 데이터 조회
	@apiVersion 1.0.0
	@apiName PersonalizedTabController.tabItemListType
	@apiGroup Personalized
	@apiPermission none

	@apiDescription 개인화탭 데이터 조회 ( /api/refrigerator/personalized/datas/tabItemList/type 와 동일 )

	
	@apiParam {String="6001","6002","6003","6004","6005","6009"} siteNo 앱GNB기준 현재몰 siteNo	
	@apiParam {String} [dispSiteNo=6005]	전시대상 상품유닛용 siteNo
	@apiParam {String} [itemImgSize=253]	상품유닛용 상품이미지 크기
	@apiParam {String=" ","51","44","21","31","52","53","ZZ"} [reqDataGrp]	조회 대상 개인화 데이터그룹 코드 default부터 53까지 데이터가 없는 경우 ZZ(대체제)로 한번더 호출해야합니다

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
			"reqDataGrp":""
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/personalized/datas/tabItemList/type.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005","dispSiteNo":"6005","itemImgSize":"253","reqDataGrp":""}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 	data.tabItemList	개인화 데이터 그룹 유닛
	@apiSuccess {String} 	data.tabItemList.psnzDivCd	개인화 데이터 구분코드 10:재구매도래, 20:장바구니할인, 21:장바구니연관, 30:자주구매할인, 31:자주구매연관, 40:클립할인, 41:클립할인연관, 42:클립브랜드베스트, 43:클립브랜드신상품
			, 44:클립상품연관, 50:최근본상품할인, 51:최근본상품연관, 60:10개이상판매, 61:100개이상판매, 62:인기SNS공유, 70:연관상품 
	@apiSuccess {String} 	data.tabItemList.psnzDivColorCd	데이터구분 코드별 컬러코드값
	@apiSuccess {String} 	data.tabItemList.psnzDivTitle	데이터구분 코드별 타이틀
	@apiSuccess {String} 	data.tabItemList.psnzAppInfraCode	데이터구분 코드별 분석용 코드값
	@apiSuccess {List} 	data.tabItemList.itemList	[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	@apiSuccess {String} 	data.tabItemList.purchItemYn	자주구매상품 Y/N
	@apiSuccess {String} 	data.tabItemList.obanjangYn		오반상상품 Y/N
	@apiSuccess {String} 	data.tabItemList.spPriceYn		해바상품 Y/N
	@apiSuccess {String} 	data.tabItemList.evalSrc	상품평가 점수
	@apiSuccess {String}	hasPersonalData		개인화데이터 포함여부
	@apiSuccess {String}	tabItemType		A/B 테스트 타입 코드 (B로 고정됨)
	@apiSuccess {String}	nextDataGrp		다음 조회 데이터그룹 코드
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "hasPersonalData": "true",
	        "tabItemType": "B",
	        "nextDataGrp": "51",
	        "tabItemList": [
	            {
	                "psnzDivCd": "50",
	                "psnzDivColorCd": "#93A5E9",
	                "psnzDivTitle": "최근 본 상품이 할인 중입니다.",
	                "psnzAppInfraCode": "최근본상품할인",
	                "itemList": [
	                    {
	                        "itemId": "1000022207639",
	                        "itemNm": " 키즈아이템 코스트클로그/바야/크록밴드 외 34종",
	                        "displayPrc": "18155",
	                        "strikeOutPrc": "19500",
	                        "minOnetOrdPsblQty": "1",
	                        "maxOnetOrdPsblQty": "20",
	                        "soldOutYn": "N",
	                        "stoppedSellingYn": "N",
	                        "siteNo": "6004",
	                        "siteNm": "shinsegae mall",
	                        "salestrNo": "6005",
	                        "salestrNm": "S.COM몰",
	                        "sellpntNm": "",
	                        "brandNm": "크록스",
	                        "goItemDetailYn": "Y",
	                        "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                        "attnTgtIdnfNo1": "1000022207639",
	                        "attnTgtIdnfNo2": "6005",
	                        "attnDivCd": "10",
	                        "needAdultCertification": "false",
	                        "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000022207639&siteNo=6004&salestrNo=6005",
	                        "itemImgUrl": "http://item.ssgcdn.com/39/76/20/item/1000022207639_i1_253.jpg",
	                        "planDt": "",
	                        "dataFileNm": "",
	                        "pickuItemYn": "N",
	                        "qshppPsblYn": "N",
	                        "mltSellQty": "1",
	                        "uItemSamePrcYn": "N",
	                        "itemOrdQty": "",
	                        "itemOrdQtyType": "NONE",
	                        "tildeDispYn": "Y",
	                        "recompPoint": "4.39",
	                        "recomRegCnt": "18",
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
	                                "type": "C0",
	                                "txt": "6"
	                            }
	                        ],
	                        "benefitGrp2": [],
	                        "benefitGrp3": [
	                            {
	                                "type": "180",
	                                "txt": "무료배송"
	                            }
	                        ],
	                        "benefitGrp4": [
	                            {
	                                "type": "ssgtalk",
	                                "txt": "0000007616"
	                            }
	                        ],
	                        "psnzDivCd": "50",
	                        "psnzDivColorCd": "#93A5E9",
	                        "psnzDivTitle": "최근 본 상품이 할인 중입니다.",
	                        "evalScr": "11",
	                        "purchItemYn": "N",
	                        "obanjangYn": "N",
	                        "spPriceYn": "N"
	                    }
	                ]
	            },
	            {
	                "psnzDivCd": "40",
	                "psnzDivColorCd": "#74CC6C",
	                "psnzDivTitle": "클립한 상품이 할인 중입니다.",
	                "psnzAppInfraCode": "클립상품할인",
	                "itemList": [
	                    {
	                        "itemId": "1000016402245",
	                        "itemNm": "IPL 제모기 SIPL-1000 ( 20만회 램프 기본장착 + 20만회 램프 추가증정 + 쿨링기 추가증정)",
	                        "displayPrc": "200000",
	                        "strikeOutPrc": "250000",
	                        "minOnetOrdPsblQty": "1",
	                        "maxOnetOrdPsblQty": "100",
	                        "soldOutYn": "N",
	                        "stoppedSellingYn": "N",
	                        "siteNo": "6004",
	                        "siteNm": "shinsegae mall",
	                        "salestrNo": "6005",
	                        "salestrNm": "S.COM몰",
	                        "sellpntNm": "",
	                        "brandNm": "이오시카",
	                        "goItemDetailYn": "N",
	                        "msgWhenGoToItemDetail": "",
	                        "attnTgtIdnfNo1": "1000016402245",
	                        "attnTgtIdnfNo2": "6005",
	                        "attnDivCd": "10",
	                        "needAdultCertification": "false",
	                        "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000016402245&siteNo=6004&salestrNo=6005",
	                        "itemImgUrl": "http://item.ssgcdn.com/45/22/40/item/1000016402245_i1_253.jpg",
	                        "planDt": "",
	                        "dataFileNm": "",
	                        "pickuItemYn": "N",
	                        "qshppPsblYn": "N",
	                        "mltSellQty": "1",
	                        "uItemSamePrcYn": "Y",
	                        "itemOrdQty": "",
	                        "itemOrdQtyType": "NONE",
	                        "tildeDispYn": "N",
	                        "recompPoint": "4.74",
	                        "recomRegCnt": "35",
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
	                                "type": "C0",
	                                "txt": "20"
	                            }
	                        ],
	                        "benefitGrp2": [],
	                        "benefitGrp3": [
	                            {
	                                "type": "160",
	                                "txt": "청구할인"
	                            }
	                        ],
	                        "benefitGrp4": [
	                            {
	                                "type": "ssgtalk",
	                                "txt": "0007709082"
	                            }
	                        ],
	                        "psnzDivCd": "40",
	                        "psnzDivColorCd": "#74CC6C",
	                        "psnzDivTitle": "클립한 상품이 할인 중입니다.",
	                        "evalScr": "4",
	                        "purchItemYn": "N",
	                        "obanjangYn": "N",
	                        "spPriceYn": "N"
	                    }
	                ]
	            },
	            {
	                "psnzDivCd": "20",
	                "psnzDivColorCd": "#FF9A4C",
	                "psnzDivTitle": "장바구니 담은 상품이 할인 중입니다.",
	                "psnzAppInfraCode": "장바구니할인상품",
	                "itemList": [
	                    {
	                        "itemId": "1000018729258",
	                        "itemNm": " 독일 유아 저불소 치약 50ml 2개세트 - 향선택",
	                        "displayPrc": "11537",
	                        "strikeOutPrc": "13800",
	                        "minOnetOrdPsblQty": "1",
	                        "maxOnetOrdPsblQty": "9999",
	                        "soldOutYn": "N",
	                        "stoppedSellingYn": "N",
	                        "siteNo": "6004",
	                        "siteNm": "shinsegae mall",
	                        "salestrNo": "6005",
	                        "salestrNm": "S.COM몰",
	                        "sellpntNm": "",
	                        "brandNm": "푸치",
	                        "goItemDetailYn": "Y",
	                        "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                        "attnTgtIdnfNo1": "1000018729258",
	                        "attnTgtIdnfNo2": "6005",
	                        "attnDivCd": "10",
	                        "needAdultCertification": "false",
	                        "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000018729258&siteNo=6004&salestrNo=6005",
	                        "itemImgUrl": "http://item.ssgcdn.com/58/92/72/item/1000018729258_i1_253.jpg",
	                        "planDt": "",
	                        "dataFileNm": "",
	                        "pickuItemYn": "N",
	                        "qshppPsblYn": "N",
	                        "mltSellQty": "1",
	                        "uItemSamePrcYn": "Y",
	                        "itemOrdQty": "",
	                        "itemOrdQtyType": "NONE",
	                        "tildeDispYn": "N",
	                        "recompPoint": "5",
	                        "recomRegCnt": "6",
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
	                                "type": "C0",
	                                "txt": "16"
	                            }
	                        ],
	                        "benefitGrp2": [],
	                        "benefitGrp3": [],
	                        "benefitGrp4": [],
	                        "psnzDivCd": "20",
	                        "psnzDivColorCd": "#FF9A4C",
	                        "psnzDivTitle": "장바구니 담은 상품이 할인 중입니다.",
	                        "evalScr": "1",
	                        "purchItemYn": "N",
	                        "obanjangYn": "N",
	                        "spPriceYn": "N"
	                    }
	                ]
	            },
	            {
	                "psnzDivCd": "40",
	                "psnzDivColorCd": "#74CC6C",
	                "psnzDivTitle": "클립한 상품이 할인 중입니다.",
	                "psnzAppInfraCode": "클립상품할인",
	                "itemList": [
	                    {
	                        "itemId": "1000015883359",
	                        "itemNm": "IPL 제모기 SIPL-900 50K (쿨링기 사은품증정)",
	                        "displayPrc": "180000",
	                        "strikeOutPrc": "225000",
	                        "minOnetOrdPsblQty": "1",
	                        "maxOnetOrdPsblQty": "500",
	                        "soldOutYn": "N",
	                        "stoppedSellingYn": "N",
	                        "siteNo": "6004",
	                        "siteNm": "shinsegae mall",
	                        "salestrNo": "6005",
	                        "salestrNm": "S.COM몰",
	                        "sellpntNm": "",
	                        "brandNm": "이오시카",
	                        "goItemDetailYn": "N",
	                        "msgWhenGoToItemDetail": "",
	                        "attnTgtIdnfNo1": "1000015883359",
	                        "attnTgtIdnfNo2": "6005",
	                        "attnDivCd": "10",
	                        "needAdultCertification": "false",
	                        "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000015883359&siteNo=6004&salestrNo=6005",
	                        "itemImgUrl": "http://item.ssgcdn.com/59/33/88/item/1000015883359_i1_253.jpg",
	                        "planDt": "",
	                        "dataFileNm": "",
	                        "pickuItemYn": "N",
	                        "qshppPsblYn": "N",
	                        "mltSellQty": "1",
	                        "uItemSamePrcYn": "Y",
	                        "itemOrdQty": "",
	                        "itemOrdQtyType": "NONE",
	                        "tildeDispYn": "N",
	                        "recompPoint": "4.75",
	                        "recomRegCnt": "72",
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
	                                "type": "C0",
	                                "txt": "20"
	                            }
	                        ],
	                        "benefitGrp2": [],
	                        "benefitGrp3": [
	                            {
	                                "type": "160",
	                                "txt": "청구할인"
	                            }
	                        ],
	                        "benefitGrp4": [
	                            {
	                                "type": "ssgtalk",
	                                "txt": "0007709082"
	                            }
	                        ],
	                        "psnzDivCd": "40",
	                        "psnzDivColorCd": "#74CC6C",
	                        "psnzDivTitle": "클립한 상품이 할인 중입니다.",
	                        "evalScr": "1",
	                        "purchItemYn": "N",
	                        "obanjangYn": "N",
	                        "spPriceYn": "N"
	                    }
	                ]
	            },
	            {
	                "psnzDivCd": "20",
	                "psnzDivColorCd": "#FF9A4C",
	                "psnzDivTitle": "장바구니 담은 상품이 할인 중입니다.",
	                "psnzAppInfraCode": "장바구니할인상품",
	                "itemList": [
	                    {
	                        "itemId": "1000022116104",
	                        "itemNm": "남성 조던 슈퍼.플라이 팀 NIKE 716985-011",
	                        "displayPrc": "27440",
	                        "strikeOutPrc": "49000",
	                        "minOnetOrdPsblQty": "1",
	                        "maxOnetOrdPsblQty": "20",
	                        "soldOutYn": "N",
	                        "stoppedSellingYn": "N",
	                        "siteNo": "6009",
	                        "siteNm": "신세계백화점",
	                        "salestrNo": "1017",
	                        "salestrNm": "김해점",
	                        "sellpntNm": "",
	                        "brandNm": "나이키",
	                        "goItemDetailYn": "Y",
	                        "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                        "attnTgtIdnfNo1": "1000022116104",
	                        "attnTgtIdnfNo2": "1017",
	                        "attnDivCd": "10",
	                        "needAdultCertification": "false",
	                        "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000022116104&siteNo=6009&salestrNo=1017",
	                        "itemImgUrl": "http://item.ssgcdn.com/04/61/11/item/1000022116104_i1_253.jpg",
	                        "planDt": "",
	                        "dataFileNm": "",
	                        "pickuItemYn": "N",
	                        "qshppPsblYn": "N",
	                        "mltSellQty": "1",
	                        "uItemSamePrcYn": "Y",
	                        "itemOrdQty": "",
	                        "itemOrdQtyType": "NONE",
	                        "tildeDispYn": "N",
	                        "recompPoint": "4.86",
	                        "recomRegCnt": "58",
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
	                                "txt": "44"
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
	                        "benefitGrp4": [],
	                        "psnzDivCd": "20",
	                        "psnzDivColorCd": "#FF9A4C",
	                        "psnzDivTitle": "장바구니 담은 상품이 할인 중입니다.",
	                        "evalScr": "0",
	                        "purchItemYn": "N",
	                        "obanjangYn": "N",
	                        "spPriceYn": "N"
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
	@api {post} /api/personalized/datas/relatedItemList.ssg		개인화탭 연관상품 조회
	@apiVersion 1.0.0
	@apiName PersonalizedTabController.relatedItemList
	@apiGroup Personalized
	@apiPermission none

	@apiDescription 개인화탭 연관상품 조회

	
	@apiParam {String="6001","6002","6003","6004","6005","6009"} siteNo 앱GNB기준 현재몰 siteNo	
	@apiParam {String} [dispSiteNo=6005]	전시대상 상품유닛용 siteNo
	@apiParam {String} [itemImgSize=253]	상품유닛용 상품이미지 크기
	@apiParam {String} itemId	연관상품 조회대상 상품ID

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
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/personalized/datas/relatedItemList.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005","dispSiteNo":"6005","itemImgSize":"253","itemId":"1000020988526"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 	data.relatedItemList	[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "relatedItemList": [
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


