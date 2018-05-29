/**
	@api {post} /api/specialshop/index/datas/main.ssg	공식스토어 인덱스페이지
	@apiVersion 1.0.0
	@apiName SpecialIndexController.getSpecialIndexMain
	@apiGroup SpecialShop
	@apiPermission none

	@apiDescription 공식스토어 인덱스페이지

	
	@apiParam {String="6001","6002","6003","6004","6005","6009"} siteNo 앱GNB기준 현재몰 siteNo	
	@apiParam {String} dispSiteNo	전시대상 상품유닛용 siteNo
	@apiParam {String=" ","00","01","02","03","04","05"} [spcshopDispTypeCd=  ]	공식스토어 구분카테고리 코드 default:전체, 00:클립, 01:패션, 02:뷰티&잡화, 03:스포츠, 04:디지털라이프, 05:푸드
	@apiParam {String}	[itemImgSize=253] 상품유닛용 상품이미지 크기
	@apiParam {String}	[page=1] 페이지 번호

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
			"spcshopDispTypeCd":"",
			"itemImgSize":"253",
			"page":"1"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/specialshop/index/datas/main.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005","dispSiteNo":"6005","spcshopDispTypeCd":"","itemImgSize":"253","page":"1"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}	data.hasNext	다음페이지유무 Y/N
	@apiSuccess {List}		data.spcshopDispTypeList		카테고리 구분데이터 리스트 (page=1인 경우에만 전송됨)
	@apiSuccess {String} 	data.spcshopDispTypeList.spcshopDispTypeCd		카테고리 구분코드
	@apiSuccess {String} 	data.spcshopDispTypeList.spcshopDispTypeNm		카테고리 구분이름
	@apiSuccess {List} 	data.spcshopList	공식스토어 데이터 리스트
	@apiSuccess {String} 	data.spcshopList.spcshopId	공식스토어ID
	@apiSuccess {String} 	data.spcshopList.spcshopNm	공식스토어이름
	@apiSuccess {String} 	data.spcshopList.spcshopDesc	공식스토어설명
	@apiSuccess {String} 	data.spcshopList.imgFileNm	배너 이미지 URL
	@apiSuccess {String} 	data.spcshopList.banrRplcTextNm	배너 대체 텍스트
	@apiSuccess {String} 	data.spcshopList.lnkdUrl	연결 URL
	@apiSuccess {String} 	data.spcshopList.isNewYn	NEW 마크 보여주기 Y/N
	@apiSuccess {String} 	data.spcshopList.itemList	[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	@apiSuccess {String} 	data.spcshopList.clipInfo	[클립데이터유닛](#api-header-for-a-submenu-clipunit)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "hasNext": "Y",
	        "spcshopList": [
	            {
	                "clipInfo": {
	                    "attnDivDtlCd": "31",
	                    "attnDivCd": "30",
	                    "attnTgtIdnfNo2": "",
	                    "attnTgtIdnfNo1": "bbr",
	                    "siteNo": "6004",
	                    "infloSiteNo": "6004"
	                },
	                "spcshopNm": "BURBERRY",
	                "spcshopDesc": "   ",
	                "lnkdUrl": "http://m.shinsegaemall.ssg.com/special/specialMain.ssg?dispCtgId=6000011479",
	                "itemList": [
	                    {
	                        "itemId": "1000013801728",
	                        "itemNm": "체크 포켓 티셔츠",
	                        "displayPrc": "100000",
	                        "strikeOutPrc": "",
	                        "minOnetOrdPsblQty": "1",
	                        "maxOnetOrdPsblQty": "1",
	                        "soldOutYn": "N",
	                        "stoppedSellingYn": "N",
	                        "siteNo": "6004",
	                        "siteNm": "shinsegae mall",
	                        "salestrNo": "6005",
	                        "salestrNm": "S.COM몰",
	                        "sellpntNm": "5%S머니적립(8/15까지)",
	                        "brandNm": "버버리(BURBERRY)",
	                        "goItemDetailYn": "Y",
	                        "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                        "attnTgtIdnfNo1": "1000013801728",
	                        "attnTgtIdnfNo2": "6005",
	                        "attnDivCd": "10",
	                        "needAdultCertification": "false",
	                        "itemLnkd": "http://shinsegaemall.ssg.com/special/burberryItemView.ssg?itemId=1000013801728&siteNo=6004&salestrNo=6005",
	                        "itemImgUrl": "http://item.ssgcdn.com/28/17/80/item/1000013801728_i1_253.jpg",
	                        "planDt": "",
	                        "dataFileNm": "",
	                        "pickuItemYn": "N",
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
	                        "benefitGrp1": [],
	                        "benefitGrp2": [],
	                        "benefitGrp3": [
	                            {
	                                "type": "150",
	                                "txt": "S-머니"
	                            },
	                            {
	                                "type": "160",
	                                "txt": "청구할인"
	                            },
	                            {
	                                "type": "170",
	                                "txt": "무이자"
	                            }
	                        ],
	                        "benefitGrp4": []
	                    }
	                ],
	                "isNewYn": "N",
	                "banrRplcTextNm": "BURBERRY",
	                "spcshopId": "bbr",
	                "imgFileNm": "http://static.ssgcdn.com/cmpt/ctg/201707/2017072614551780449748040084_312.jpg"
	            },
	            {
	                "clipInfo": {
	                    "attnDivDtlCd": "31",
	                    "attnDivCd": "30",
	                    "attnTgtIdnfNo2": "",
	                    "attnTgtIdnfNo1": "printbakery",
	                    "siteNo": "6004",
	                    "infloSiteNo": "6004"
	                },
	                "spcshopNm": "프린트베이커리",
	                "spcshopDesc": "   ",
	                "lnkdUrl": "http://m.shinsegaemall.ssg.com/specialStore/printbakery/main.ssg",
	                "itemList": [
	                    {
	                        "itemId": "1000022552447",
	                        "itemNm": "하태임, Un Passage 11",
	                        "displayPrc": "380000",
	                        "strikeOutPrc": "",
	                        "minOnetOrdPsblQty": "1",
	                        "maxOnetOrdPsblQty": "20",
	                        "soldOutYn": "N",
	                        "stoppedSellingYn": "N",
	                        "siteNo": "6004",
	                        "siteNm": "shinsegae mall",
	                        "salestrNo": "6005",
	                        "salestrNm": "S.COM몰",
	                        "sellpntNm": "",
	                        "brandNm": "프린트베이커리(print bakery)",
	                        "goItemDetailYn": "N",
	                        "msgWhenGoToItemDetail": "",
	                        "attnTgtIdnfNo1": "1000022552447",
	                        "attnTgtIdnfNo2": "6005",
	                        "attnDivCd": "10",
	                        "needAdultCertification": "false",
	                        "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000022552447&siteNo=6004&salestrNo=6005",
	                        "itemImgUrl": "http://item.ssgcdn.com/47/24/55/item/1000022552447_i1_253.jpg",
	                        "planDt": "",
	                        "dataFileNm": "",
	                        "pickuItemYn": "N",
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
	                        "benefitGrp1": [],
	                        "benefitGrp2": [],
	                        "benefitGrp3": [
	                            {
	                                "type": "160",
	                                "txt": "청구할인"
	                            }
	                        ],
	                        "benefitGrp4": []
	                    }
	                ],
	                "isNewYn": "N",
	                "banrRplcTextNm": "프린트베이커리",
	                "spcshopId": "printbakery",
	                "imgFileNm": "http://static.ssgcdn.com/cmpt/ctg/201707/2017071309415756322915638291_914.jpg"
	            }
	        ],
	        "spcshopDispTypeList": [
	            {
	                "spcshopDispTypeCd": "",
	                "spcshopDispTypeNm": "전체"
	            },
	            {
	                "spcshopDispTypeCd": "00",
	                "spcshopDispTypeNm": "마이클립"
	            },
	            {
	                "spcshopDispTypeCd": "01",
	                "spcshopDispTypeNm": "패션"
	            },
	            {
	                "spcshopDispTypeCd": "02",
	                "spcshopDispTypeNm": "뷰티&잡화"
	            },
	            {
	                "spcshopDispTypeCd": "04",
	                "spcshopDispTypeNm": "디지털&라이프"
	            }
	        ]
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
