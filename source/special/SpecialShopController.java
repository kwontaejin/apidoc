/**
	@api {post} /api/specialshop/datas/common/main.ssg	베이직 전문관 메인
	@apiVersion 1.0.0
	@apiName SpecialShopController.getSpecialShopCommonMain
	@apiGroup SpecialShop
	@apiPermission none

	@apiDescription 베이직 전문관 메인

	@apiParam {String} spcshopId 전문관ID

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"spcshopId":"claudiepierlot"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/specialshop/datas/common/main.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"spcshopId":"claudiepierlot"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}		data.spcshopNm 전문관명
	@apiSuccess {String}		data.spcshopDivCd 전문관 구분 코드 (10:베이직, 20:스페셜, 30:데이터)
	@apiSuccess {String}		data.siteNo 사이트번호
	@apiSuccess {String}		data.gnbTitle GNB 타이틀
	@apiSuccess {Map}			data.ctgTree 전체 카테고리 데이터
	@apiSuccess {String}			data.ctgTree.dispCtgNm 카테고리명
	@apiSuccess {String}			data.ctgTree.dispCtgId 카테고리ID
	@apiSuccess {List}				data.ctgTree.subDispCtgList 하위 카테고리 리스트 (계층 구조로 카테고리 데이터 존재)
	@apiSuccess {List}			data.cornrList 메인의 코너 데이터
	@apiSuccess {String}			data.cornrList.cornrId 코너ID
	@apiSuccess {String}			data.cornrList.cornrNm 코너명
	@apiSuccess {String}			data.cornrList.cornrCmptTypeCd 코너구성유형코드, D032와 동일 (현재 10:상품, 30:배너, 50:HTML 만 사용)
	@apiSuccess {String}			data.cornrList.cornrCmptTypeDtlCd 코너구성유형상세코드, 전문관 전용의 코너 유형 세분화 코드 (상품: 21-썸네일, 22-리스트 / 배너: 31:이미지, 32-이미지텍스트, 33-2x1, 34:LNB+이미지 / HTML:50) 
	@apiSuccess {String}			data.cornrList.cornrTitleExpsrTextNm 코너타이틀 텍스트
	@apiSuccess {String}			data.cornrList.cornrTitleExpsrImgFileNm 코너타이틀 이미지파일명
	@apiSuccess {String}			data.cornrList.cornrDispExpsrCont 노출수
	@apiSuccess {String}			data.cornrList.semoYn 더보기여부 (Y/N)
	@apiSuccess {String}			data.cornrList.cornrDataList 코너데이터리스트 - 상품/배너/HTML
	@apiSuccess {Map}		data.option 옵션
	@apiSuccess {String}			data.option.옵션명 (value1, value2, value3, value4) log, defaultItemSortType, cssPath 등 

	@apiSuccessExample Response (example):
		{
		    "cached": false,
		    "method": "",
		    "res_code": "200",
		    "res_message": "성공",
		    "data": {
		        "ctgTree": {
		            "dispCtgNm": "CLAUDIE PIERLOT",
		            "dispCtgId": "6000039594",
		            "subDispCtgList": [
		                {
		                    "dispCtgNm": "TOP",
		                    "dispCtgId": "6000039595",
		                    "subDispCtgList": [
		                        {
		                            "dispCtgNm": "TOP",
		                            "dispCtgId": "6000039605",
		                            "subDispCtgList": []
		                        },
		                        {
		                            "dispCtgNm": "BLOUSE",
		                            "dispCtgId": "6000039606",
		                            "subDispCtgList": []
		                        }
		                    ]
		                },
		                {
		                    "dispCtgNm": "DRESS",
		                    "dispCtgId": "6000039596",
		                    "subDispCtgList": [
		                        {
		                            "dispCtgNm": "DRESS",
		                            "dispCtgId": "6000039607",
		                            "subDispCtgList": []
		                        }
		                    ]
		                }
		            ]
		        },
		        "spcshopNm": "CLAUDIE PIERLOT",
		        "gnbTitle": "CLAUDIE PIERLOT 공식 스토어",
		        "spcshopDivCd": "00",
		        "siteNo": "6009",
		        "cornrList": [
		            {
		                "cornrCmptTypeCd": "30",
		                "cornrNm": "전문관공통(N)_Mobile_배너",
		                "cornrDataList": [
		                    {
		                        "banrNm": "오픈 축하 구매 사은",
		                        "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/planShop.ssg?planShopId=6000159991",
		                        "imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017081111104543339694331079_920.jpg&w=720&h=440&edit=c&t=8b6a2dd0c51a40ca03d1567b793751e1a67c53a2"
		                    },
		                    {
		                        "banrNm": "SUMMER SALE",
		                        "lnkdUrl": "http://m.shinsegaemall.ssg.com#",
		                        "imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017081111094843385144337614_831.jpg&w=720&h=440&edit=c&t=b0bd027d6d221a5da4cc3f099fcbfaa49adc699a"
		                    }
		                ],
		                "cornrTitleExpsrTypeCd": "30",
		                "semoUrl": "",
		                "cornrTitleExpsrTextNm": "",
		                "cornrId": "7000182304",
		                "cornrTitleExpsrImgFileNm": "",
		                "cornrDispExpsrCont": "9999",
		                "semoYn": "N",
		                "cornrCmptTypeDtlCd": "3H"
		            }
		        ],
		        "option": {
		            "logo": {
		                "value1": "IMAGE",
		                "value2": "/cmpt/ctg/201707/2017072820550656307315634731_101.png",
		                "value3": "",
		                "value4": ""
		            },
		            "defaultItemSortType": {
		                "value1": "regdt",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "itemImageSize": {
		                "value1": "500",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "color": {
		                "value1": "{\"footer\":\"222222\",\"font\":\"0f0f0f\",\"menu\":\"ffffff\",\"footerFont\":\"ffffff\",\"menuLayer\":\"ffffff\",\"menuLayerButton\":\"999999\"}",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "pageSize": {
		                "value1": "40",
		                "value2": "40,60,80,100",
		                "value3": "",
		                "value4": ""
		            },
		            "mainUrl": {
		                "value1": "http://m.shinsegaemall.ssg.com/specialStore/claudiepierlot/main.ssg",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "defaultItemViewType": {
		                "value1": "thmb",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "header": {
		                "value1": "<<NOT_USED>>",
		                "value2": "CLAUDIE PIERLOT 공식 스토어",
		                "value3": "",
		                "value4": ""
		            },
		            "sns": {
		                "value1": "CLAUDIE PIERLOT 공식 스토어",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "iconType": {
		                "value1": "BLACK",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            }
		        }
		    }
		}
     @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/specialshop/datas/common/sub.ssg 베이직 전문관 서브
	@apiVersion 1.0.0
	@apiName SpecialShopController.getSpecialShopCommonSub
	@apiGroup SpecialShop
	@apiPermission none

	@apiDescription 베이직 전문관 서브

	@apiParam {String} spcshopId 전문관ID
	@apiParam {String} dispCtgId 카테고리ID
	@apiParam {String} page 페이지
	@apiParam {String} pageSize 페이지 사이즈
	@apiParam {String} sort 정렬 유형
	
	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"spcshopId":"claudiepierlot",
			"dispCtgId":"6000039595",
			"page":"1",
			"pageSize":"80"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/specialshop/datas/common/sub.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"spcshopId":"claudiepierlot", "dispCtgId":"6000039595", "page":"1", "pageSize":"1"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}		data.spcshopNm 전문관명
	@apiSuccess {String}		data.spcshopDivCd 전문관 구분 코드 (10:베이직, 20:스페셜, 30:데이터)
	@apiSuccess {String}		data.siteNo 사이트번호
	@apiSuccess {String}		data.gnbTitle GNB 타이틀
	@apiSuccess {Map}			data.ctgTree 전체 카테고리 데이터
	@apiSuccess {String}			data.ctgTree.dispCtgNm 카테고리명
	@apiSuccess {String}			data.ctgTree.dispCtgId 카테고리ID
	@apiSuccess {List}				data.ctgTree.subDispCtgList 하위 카테고리 리스트 (계층 구조로 카테고리 데이터 존재)
	@apiSuccess {List}			data.subCtgList 서브 카테고리 목록
	@apiSuccess {Map}			data.currentCtg 현재 카테고리 데이터	
	@apiSuccess {Map} 			data.ctgItemData 카테고리 상품 데이터
	@apiSuccess {String} 			data.ctgItemData.page 페이지
	@apiSuccess {String} 			data.ctgItemData.pageSize 페이지 사이즈
	@apiSuccess {String} 			data.ctgItemData.sort 정렬 유형
	@apiSuccess {String} 			data.ctgItemData.hasNext 다음 페이지 존재 여부
	@apiSuccess {String} 			data.ctgItemData.ctgItemList 카테고리 상품 목록 (아이템)
	@apiSuccess {List} 			data.sortList 정렬유형	
	@apiSuccess {Map}			data.option 옵션
	@apiSuccess {String}			data.option.옵션명 (value1, value2, value3, value4) log, defaultItemSortType, cssPath 등 

	@apiSuccessExample Response (example):
		{
		    "cached": false,
		    "method": "",
		    "res_code": "200",
		    "res_message": "성공",
		    "data": {
		        "subCtgList": [
		            {
		                "dispCtgNm": "TOP 전체",
		                "dispCtgId": "6000039595"
		            },
		            {
		                "dispCtgNm": "TOP",
		                "dispCtgId": "6000039605"
		            },
		            {
		                "dispCtgNm": "BLOUSE",
		                "dispCtgId": "6000039606"
		            }
		        ],
		        "ctgTree": {
		            "dispCtgNm": "CLAUDIE PIERLOT",
		            "dispCtgId": "6000039594",
		            "subDispCtgList": [
		                {
		                    "dispCtgNm": "TOP",
		                    "dispCtgId": "6000039595",
		                    "subDispCtgList": [
		                        {
		                            "dispCtgNm": "TOP",
		                            "dispCtgId": "6000039605",
		                            "subDispCtgList": []
		                        },
		                        {
		                            "dispCtgNm": "BLOUSE",
		                            "dispCtgId": "6000039606",
		                            "subDispCtgList": []
		                        }
		                    ]
		                },
		                {
		                    "dispCtgNm": "DRESS",
		                    "dispCtgId": "6000039596",
		                    "subDispCtgList": [
		                        {
		                            "dispCtgNm": "DRESS",
		                            "dispCtgId": "6000039607",
		                            "subDispCtgList": []
		                        }
		                    ]
		                },
		                {
		                    "dispCtgNm": "OUTER",
		                    "dispCtgId": "6000039602",
		                    "subDispCtgList": [
		                        {
		                            "dispCtgNm": "CARDIGAN",
		                            "dispCtgId": "6000039608",
		                            "subDispCtgList": []
		                        },
		                        {
		                            "dispCtgNm": "JACKET",
		                            "dispCtgId": "6000039609",
		                            "subDispCtgList": []
		                        },
		                        {
		                            "dispCtgNm": "COAT",
		                            "dispCtgId": "6000039610",
		                            "subDispCtgList": []
		                        }
		                    ]
		                }
		            ]
		        },
		        "spcshopNm": "CLAUDIE PIERLOT",
		        "gnbTitle": "CLAUDIE PIERLOT 공식 스토어",
		        "spcshopDivCd": "00",
		        "currentCtg": {
		            "dispCtgId": "6000039595",
		            "dispCtgNm": "TOP",
		            "dispCtgLvl": "2",
		            "dispCtgLastLvlYn": "N",
		            "dispCtgLclsId": "6000039594",
		            "dispCtgLclsNm": "CLAUDIE PIERLOT",
		            "dispCtgMclsId": "6000039595",
		            "dispCtgMclsNm": "TOP",
		            "dispCtgSclsId": "",
		            "dispCtgSclsNm": "",
		            "dispCtgDclsId": "",
		            "dispCtgDclsNm": ""
		        },
		        "siteNo": "6009",
		        "ctgItemData": {
		            "page": "1",
		            "pageSize": "1",
		            "sort": "regdt",
		            "hasNext": "true",
		            "ctgItemList": [
		                {
		                    "itemId": "1000023230791",
		                    "itemNm": "[끌로디 피에로] 탑 PTA67T5",
		                    "displayPrc": "169000",
		                    "strikeOutPrc": "",
		                    "minOnetOrdPsblQty": "1",
		                    "maxOnetOrdPsblQty": "20",
		                    "soldOutYn": "N",
		                    "stoppedSellingYn": "N",
		                    "siteNo": "6009",
		                    "siteNm": "신세계백화점",
		                    "salestrNo": "1004",
		                    "salestrNm": "강남점",
		                    "sellpntNm": "",
		                    "brandNm": "끌로디피에로",
		                    "goItemDetailYn": "Y",
		                    "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
		                    "attnTgtIdnfNo1": "1000023230791",
		                    "attnTgtIdnfNo2": "1004",
		                    "attnDivCd": "10",
		                    "needAdultCertification": "false",
		                    "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000023230791&siteNo=6009&salestrNo=1004",
		                    "itemImgUrl": "http://item.ssgcdn.com/91/07/23/item/1000023230791_i1_500.jpg",
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
		                    "benefitGrp1": [],
		                    "benefitGrp2": [],
		                    "benefitGrp3": [
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
		            ]
		        },
		        "sortList": [
		            {
		                "sortCd": "regdt",
		                "sortNm": "신상품순"
		            },
		            {
		                "sortCd": "best",
		                "sortNm": "인기상품순"
		            },
		            {
		                "sortCd": "prcdsc",
		                "sortNm": "높은 가격순"
		            },
		            {
		                "sortCd": "prcasc",
		                "sortNm": "낮은 가격순"
		            }
		        ],
		        "option": {
		            "logo": {
		                "value1": "IMAGE",
		                "value2": "/cmpt/ctg/201707/2017072820550656307315634731_101.png",
		                "value3": "",
		                "value4": ""
		            },
		            "defaultItemSortType": {
		                "value1": "regdt",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "itemImageSize": {
		                "value1": "500",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "color": {
		                "value1": "{\"footer\":\"222222\",\"font\":\"0f0f0f\",\"menu\":\"ffffff\",\"footerFont\":\"ffffff\",\"menuLayer\":\"ffffff\",\"menuLayerButton\":\"999999\"}",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "pageSize": {
		                "value1": "40",
		                "value2": "40,60,80,100",
		                "value3": "",
		                "value4": ""
		            },
		            "mainUrl": {
		                "value1": "http://m.shinsegaemall.ssg.com/specialStore/claudiepierlot/main.ssg",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "defaultItemViewType": {
		                "value1": "thmb",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "header": {
		                "value1": "<<NOT_USED>>",
		                "value2": "CLAUDIE PIERLOT 공식 스토어",
		                "value3": "",
		                "value4": ""
		            },
		            "sns": {
		                "value1": "CLAUDIE PIERLOT 공식 스토어",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "iconType": {
		                "value1": "BLACK",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            }
		        }
		    }
		}

     @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
 */

/**
	@api {post} /api/specialstore/datas/common/main.ssg	템플릿 전문관 메인
	@apiVersion 1.0.0
	@apiName SpecialShopController.getSpecialStoreCommonMain
	@apiGroup SpecialShop
	@apiPermission none

	@apiDescription 템플릿 전문관 메인

	@apiParam {String} spcshopId 전문관ID

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"spcshopId":"lululemon"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/specialstore/datas/common/main.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"spcshopId":"lululemon"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}		data.spcshopNm 전문관명
	@apiSuccess {String}		data.spcshopDivCd 전문관 구분 코드 (00:템플릿,  10:베이직, 20:스페셜, 30:데이터)
	@apiSuccess {String}		data.siteNo 사이트번호
	@apiSuccess {String}		data.gnbTitle GNB 타이틀
	@apiSuccess {Map}			data.optionColor  컬러 옵션 값 
	@apiSuccess {String}			data.optionColor.footer 푸터
	@apiSuccess {String}			data.optionColor.font 폰트
	@apiSuccess {String}			data.optionColor.menu 메뉴
	@apiSuccess {String}			data.optionColor.footerFont 푸터 폰트
	@apiSuccess {String}			data.optionColor.menuLayer 메뉴레이어
	@apiSuccess {String}			data.optionColor.menuLayerButton 메뉴레이어 버튼색상
	@apiSuccess {Map}			data.ctgTree 전체 카테고리 데이터
	@apiSuccess {String}			data.ctgTree.dispCtgNm 카테고리명
	@apiSuccess {String}			data.ctgTree.dispCtgId 카테고리ID
	@apiSuccess {String}			data.ctgTree.dispCtgLinkUrl 카테고리링크 URL. 전문관 서브가 아닌 URL이동일 경우만 해당 값 셋팅
	@apiSuccess {List}				data.ctgTree.subDispCtgList 하위 카테고리 리스트 (계층 구조로 카테고리 데이터 존재)
	@apiSuccess {List}			data.cornrList 메인의 코너 데이터
	@apiSuccess {String}			data.cornrList.cornrId 코너ID
	@apiSuccess {String}			data.cornrList.cornrNm 코너명
	@apiSuccess {String}			data.cornrList.cornrCmptTypeCd 코너구성유형코드, D032와 동일 (현재 10:상품, 30:배너, 50:HTML 만 사용)
	@apiSuccess {String}			data.cornrList.cornrCmptTypeDtlCd 코너구성유형상세코드, 전문관 전용의 코너 유형 세분화 코드 (상품: 21-썸네일, 22-리스트 / 배너- '3A' : 전문관공통(N)_Basic_배너, '3I' : 공통 배너 - 1단 배너, 3B'  : 공통 배너 - 2단 배너 , '3C' : 공통 배너 - 3단 배너, '3D' :공통 배너 - 매거진 배너, '3H' : 전문관공통(N)_Mobile_배너 , '3S' :  전문관 SNS 코너,  / HTML- '50' : 일반 HTML 코너, 'F5' : FOOTER 코너) 
	@apiSuccess {String}			data.cornrList.cornrTitleExpsrTextNm 코너타이틀 텍스트
	@apiSuccess {String}			data.cornrList.cornrTitleExpsrImgFileNm 코너타이틀 이미지파일명
	@apiSuccess {String}			data.cornrList.cornrDispExpsrCont 노출수 (상품타입인 경우만 셋팅)	
	@apiSuccess {List}			data.cornrList.cornrDataList 코너데이터리스트 - 상품/배너/HTML
	@apiSuccess {Map}			data.option 옵션
	@apiSuccess {String}			data.option.value1 (value1, value2, value3, value4) logo, defaultItemSortType 등 
	@apiSuccess {Map}	   		data.shareInfo 공유하기 관련데이터 
    @apiSuccess {String}	  		data.shareInfo.snsTitle 공유명
    @apiSuccess {String}	  		data.shareInfo.snsSummary 공유요약내용(현재몰 정보 제공됨)
	@apiSuccess {String}	  		data.shareInfo.snsImg 공유이미지경로
	@apiSuccess {String}	  		data.shareInfo.snsUrl 공유링크 
	@apiSuccess {String}	  		data.shareInfo.snsGbn 공유Gbn - 와이즈로그 집계용 구분자
	@apiSuccess {Map}	   		data.clipInfo 클립하기 관련데이터(데이터가 있는 경우에 한해 버튼 노출)
	@apiSuccess {String}	  		data.clipInfo.attnDivCd 클립유형 (30:전문관)
	@apiSuccess {String}	  		data.clipInfo.attnDivDtlCd 클립상세유형 (31:전문관)
	@apiSuccess {String}	  		data.clipInfo.siteNo 클립한 게시글의 원 사이트번호 - 신몰 기획전을 SSG에도 노출했을 경우, siteNo는 6004가 됨
	@apiSuccess {String}	  		data.clipInfo.attnTgtIdnfNo1 클립타켓ID정보1
	@apiSuccess {String}	  		data.clipInfo.attnTgtIdnfNo2 클립타켓ID정보2
	@apiSuccess {String}	  		data.clipInfo.infloSiteNo 클립액션을 한 사이트 번호(클립하기 InfloSiteNo에 넘겨져야할 값)

	@apiSuccessExample Response (example):
		{
		    "cached": false,
		    "method": "",
		    "res_code": "200",
		    "res_message": "성공",
		    "data": {
		       "ctgTree": {
		            "dispCtgNm": "The Kitchen Gallery",
		            "dispCtgLinkUrl": "",
		            "dispCtgId": "3600028268",
		            "subDispCtgList": [
		                {
		                    "dispCtgNm": "2DEPTH 리프",
		                    "dispCtgLinkUrl": "",
		                    "dispCtgId": "6000027683",
		                    "subDispCtgList": []
		                },
		                {
		                    "dispCtgNm": "아이템별 보기",
		                    "dispCtgLinkUrl": "",
		                    "dispCtgId": "3600028269",
		                    "subDispCtgList":[]
		                }
		             ]   
		         },      
		        "spcshopNm": "CLAUDIE PIERLOT",
		        "gnbTitle": "CLAUDIE PIERLOT 공식 스토어",
		        "spcshopDivCd": "00",
		        "siteNo": "6009",
		        "cornrList": [
		            {
		                "cornrCmptTypeCd": "30",
		                "cornrNm": "전문관공통(N)_Mobile_배너",
		                "cornrDataList": [
		                    {
		                        "banrNm": "오픈 축하 구매 사은",
		                        "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/planShop.ssg?planShopId=6000159991",
		                        "imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017081111104543339694331079_920.jpg&w=720&h=440&edit=c&t=8b6a2dd0c51a40ca03d1567b793751e1a67c53a2"
		                    },
		                    {
		                        "banrNm": "SUMMER SALE",
		                        "lnkdUrl": "http://m.shinsegaemall.ssg.com#",
		                        "imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017081111094843385144337614_831.jpg&w=720&h=440&edit=c&t=b0bd027d6d221a5da4cc3f099fcbfaa49adc699a"
		                    }
		                ],
		                "cornrTitleExpsrTypeCd": "30",
		                "semoUrl": "",
		                "cornrTitleExpsrTextNm": "",
		                "cornrId": "7000182304",
		                "cornrTitleExpsrImgFileNm": "",
		                "cornrDispExpsrCont": "9999",
		                "semoYn": "N",
		                "cornrCmptTypeDtlCd": "3H"
		            }
		        ],
		        
		        "clipInfo": {
		            "attnDivCd": "30",
		            "attnDivDtlCd": "31",
		            "siteNo": "6004",
		            "attnTgtIdnfNo1": "kkk",
		            "attnTgtIdnfNo2": "",
		            "infloSiteNo": "6004"
		        },
		         "optionColor": {
		            "footer": "222222",
		            "font": "0f0f0f",
		            "menu": "ffffff",
		            "footerFont": "ffffff",
		            "menuLayer": "ffffff",
		            "menuLayerButton": "999999"
		        },
		        "shareInfo": {
		            "snsTitle": "키친샵",
		            "snsSummary": "신세계몰",
		            "snsImg": "http://dev-static.ssgcdn.com/cmpt/ctg/201703/2017033010565337286433722843_578.jpg",
		            "snsUrl": "http://dev-m.shinsegaemall.ssg.com/specialStore/kkk/main.ssg",
		            "snsShareType": "SPECIAL",
		            "snsTgtId": "kkk",
		            "useSnsShare": "true"
		        },   
		        "option": {
		            "logo": {
		                "value1": "IMAGE",
		                "value2": "http://dev-static.ssgcdn.com/cmpt/ctg/201703/2017030814460537281883722198_15.png",
		                "value3": "",
		                "value4": ""
		            },
		            "defaultItemSortType": {
		                "value1": "regdt",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "itemImageSize": {
		                "value1": "500",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "pageSize": {
		                "value1": "80",
		                "value2": "40,60,80,100",
		                "value3": "",
		                "value4": ""
		            },
		            "mainUrl": {
		                "value1": "http://dev-m.shinsegaemall.ssg.com/specialStore/kkk/main.ssg",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "defaultItemViewType": {
		                "value1": "thmb",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "header": {
		                "value1": "<<NOT_USED>>",
		                "value2": "공식스토어",
		                "value3": "",
		                "value4": ""
		            },
		            "iconType": {
		                "value1": "BLACK",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            }
		        }
		      
		    }
		}
     @apiError FAIL_WRONG_ACCESS 400 / 잘못된 접근입니다.
     @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/specialstore/datas/common/sub.ssg 템플릿 전문관 서브
	@apiVersion 1.0.0
	@apiName SpecialShopController.getSpecialStoreCommonSub
	@apiGroup SpecialShop
	@apiPermission none

	@apiDescription 템플릿 전문관 서브

	@apiParam {String} spcshopId 전문관ID
	@apiParam {String} dispCtgId 카테고리ID
	@apiParam {String} page 페이지
	@apiParam {String} pageSize 페이지 사이즈
	@apiParam {String} sort 정렬 유형
	@apiParam {String} emartStrItemYn 이마트점포상품만조회 ("Y","N")
	
	
	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"spcshopId":"lululemon",
			"dispCtgId":"6000043491",
			"page":"1",
			"pageSize":"80"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/specialstore/datas/common/sub.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"spcshopId":"lululemon", "dispCtgId":"6000043491", "page":"1", "pageSize":"80"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}		data.spcshopNm 전문관명
	@apiSuccess {String}		data.spcshopDivCd 전문관 구분 코드(00:템플릿,  10:베이직, 20:스페셜, 30:데이터)
	@apiSuccess {String}		data.siteNo 사이트번호
	@apiSuccess {String}		data.gnbTitle GNB 타이틀
	@apiSuccess {Map}			data.optionColor  컬러 옵션 값 
	@apiSuccess {String}			data.optionColor.footer 푸터
	@apiSuccess {String}			data.optionColor.font 폰트
	@apiSuccess {String}			data.optionColor.menu 메뉴
	@apiSuccess {String}			data.optionColor.footerFont 푸터 폰트
	@apiSuccess {String}			data.optionColor.menuLayer 메뉴레이어
	@apiSuccess {String}			data.optionColor.menuLayerButton 메뉴레이어 버튼색상
	@apiSuccess {Map}			data.ctgTree 전체 카테고리 데이터
	@apiSuccess {String}			data.ctgTree.dispCtgNm 카테고리명
	@apiSuccess {String}			data.ctgTree.dispCtgId 카테고리ID
	@apiSuccess {String}			data.ctgTree.dispCtgLinkUrl 카테고리링크 URL. 전문관 서브가 아닌 URL이동일 경우만 해당 값 셋팅
	@apiSuccess {List}				data.ctgTree.subDispCtgList 하위 카테고리 리스트 (계층 구조로 카테고리 데이터 존재)
	@apiSuccess {Map}			data.siblingCtgList 동위 카테고리 데이터
	@apiSuccess {String}			data.siblingCtgList.selected 현재카테고리 선택여부
	@apiSuccess {String}			data.siblingCtgList.dispCtgNm 카테고리명
	@apiSuccess {String}			data.siblingCtgList.dispCtgId 카테고리ID
	@apiSuccess {String}			data.siblingCtgList.dispCtgLinkUrl 카테고리링크 URL. 전문관 서브가 아닌 URL이동일 경우만 해당 값 셋팅
	@apiSuccess {List}			data.subCtgList 서브 카테고리 목록
	@apiSuccess {Map}			data.currentCtg 현재 카테고리 데이터	
	@apiSuccess {Map}			data.priorCtgInfo 상위 카테고리 데이터(중카인경우 빈맵)
	@apiSuccess {String}			data.priorCtgInfo.dispCtgNm 카테고리명
	@apiSuccess {String}			data.priorCtgInfo.dispCtgId 카테고리ID
	@apiSuccess {String}			data.priorCtgInfo.dispCtgLinkUrl 카테고리링크 URL. 전문관 서브가 아닌 URL이동일 경우만 해당 값 셋팅
	@apiSuccess {Map} 			data.ctgItemData 카테고리 상품 데이터
	@apiSuccess {String} 			data.ctgItemData.page 페이지
	@apiSuccess {String} 			data.ctgItemData.pageSize 페이지 사이즈
	@apiSuccess {String} 			data.ctgItemData.sort 정렬 유형
	@apiSuccess {String} 			data.ctgItemData.hasNext 다음 페이지 존재 여부
	@apiSuccess {String} 			data.ctgItemData.ctgItemList 카테고리 상품 목록 (아이템)
	@apiSuccess {List}			data.cornrList 서브의 코너 데이터
	@apiSuccess {String}			data.cornrList.cornrId 코너ID
	@apiSuccess {String}			data.cornrList.cornrNm 코너명
	@apiSuccess {String}			data.cornrList.cornrCmptTypeCd 코너구성유형코드, D032와 동일 (현재 10:상품, 30:배너, 50:HTML 만 사용)
	@apiSuccess {String}			data.cornrList.cornrCmptTypeDtlCd 코너구성유형상세코드, 전문관 전용의 코너 유형 세분화 코드 (상품: 21-썸네일, 22-리스트 / 배너- '3A' : 전문관공통(N)_Basic_배너, '3I' : 공통 배너 - 1단 배너, 3B'  : 공통 배너 - 2단 배너 , '3C' : 공통 배너 - 3단 배너, '3D' :공통 배너 - 매거진 배너, '3H' : 전문관공통(N)_Mobile_배너 , '3S' :  전문관 SNS 코너,  / HTML- '50' : 일반 HTML 코너, 'F5' : FOOTER 코너) 
	@apiSuccess {String}			data.cornrList.cornrTitleExpsrTextNm 코너타이틀 텍스트
	@apiSuccess {String}			data.cornrList.cornrTitleExpsrImgFileNm 코너타이틀 이미지파일명
	@apiSuccess {String}			data.cornrList.cornrDispExpsrCont 노출수 (상품타입인 경우만 셋팅)	
	@apiSuccess {List}				data.cornrList.cornrDataList 코너데이터리스트 - 상품/배너/HTML
	@apiSuccess {List} 			data.sortList 정렬유형	
	@apiSuccess {Map}			data.option 옵션
	@apiSuccess {String}			data.option.옵션명 (value1, value2, value3, value4) logo, defaultItemSortType 등 
	@apiSuccess {Map}	   		data.shareInfo 공유하기 관련데이터 
    @apiSuccess {String}	  		data.shareInfo.snsTitle 공유명
    @apiSuccess {String}	  		data.shareInfo.snsSummary 공유요약내용(현재몰 정보 제공됨)
	@apiSuccess {String}	  		data.shareInfo.snsImg 공유이미지경로
	@apiSuccess {String}	  		data.shareInfo.snsUrl 공유링크 
	@apiSuccess {String}	  		data.shareInfo.snsGbn 공유Gbn - 와이즈로그 집계용 구분자
	@apiSuccess {Map}	   		data.clipInfo 클립하기 관련데이터(데이터가 있는 경우에 한해 버튼 노출)
	@apiSuccess {String}	  		data.clipInfo.attnDivCd 클립유형 (30:전문관)
	@apiSuccess {String}	  		data.clipInfo.attnDivDtlCd 클립상세유형 (31:전문관)
	@apiSuccess {String}	  		data.clipInfo.siteNo 클립한 게시글의 원 사이트번호
	@apiSuccess {String}	  		data.clipInfo.attnTgtIdnfNo1 클립타켓ID정보1
	@apiSuccess {String}	  		data.clipInfo.attnTgtIdnfNo2 클립타켓ID정보2
	@apiSuccess {String}	  		data.clipInfo.infloSiteNo 클립액션을 한 사이트 번호(클립하기 InfloSiteNo에 넘겨져야할 값)

	@apiSuccessExample Response (example):
		{
		    "cached": false,
		    "method": "",
		    "res_code": "200",
		    "res_message": "성공",
		    "data": {
		    	"siblingCtgList": [
		            {
		                "selected": "true",
		                "dispCtgNm": "테이블웨어",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600028271"
		            },
		            {
		                "selected": "false",
		                "dispCtgNm": "쿡웨어",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600028273"
		            },
		            {
		                "selected": "false",
		                "dispCtgNm": "조리도구",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600028275"
		            },
		            {
		                "selected": "false",
		                "dispCtgNm": "주방가전",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600028297"
		            },
		            {
		                "selected": "false",
		                "dispCtgNm": "주방잡화",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600028281"
		            },
		            {
		                "selected": "false",
		                "dispCtgNm": "커피&티용품",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600028295"
		            },
		            {
		                "selected": "false",
		                "dispCtgNm": "와인용품",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600028296"
		            },
		            {
		                "selected": "false",
		                "dispCtgNm": "보관/보냉용기",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600028276"
		            }
		        ],
		       "subCtgList": [
		            {
		                "dispCtgNm": "9번째",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "6000027685"
		            },
		            {
		                "dispCtgNm": "10번째",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "6000027686"
		            },
		            {
		                "dispCtgNm": "11번째",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "6000027687"
		            },
		            {
		                "dispCtgNm": "잔/컵/머그",
		                "dispCtgLinkUrl": "",
		                "dispCtgId": "3600029159"
		            }
		        ],
		          "ctgTree": {
		            "dispCtgNm": "The Kitchen Gallery",
		            "dispCtgLinkUrl": "",
		            "dispCtgId": "3600028268",
		            "subDispCtgList": [
		                {
		                    "dispCtgNm": "2DEPTH 리프",
		                    "dispCtgLinkUrl": "",
		                    "dispCtgId": "6000027683",
		                    "subDispCtgList": []
		                },
		                {
		                    "dispCtgNm": "아이템별 보기",
		                    "dispCtgLinkUrl": "",
		                    "dispCtgId": "3600028269",
		                    "subDispCtgList":[]
		                }
		             ]   
		         },    
		        "spcshopNm": "CLAUDIE PIERLOT",
		        "gnbTitle": "CLAUDIE PIERLOT 공식 스토어",
		        "spcshopDivCd": "00",
		        "currentCtg": {
		            "dispCtgId": "6000039595",
		            "dispCtgNm": "TOP",
		            "dispCtgLvl": "2",
		            "dispCtgLastLvlYn": "N",
		            "dispCtgLclsId": "6000039594",
		            "dispCtgLclsNm": "CLAUDIE PIERLOT",
		            "dispCtgMclsId": "6000039595",
		            "dispCtgMclsNm": "TOP",
		            "dispCtgSclsId": "",
		            "dispCtgSclsNm": "",
		            "dispCtgDclsId": "",
		            "dispCtgDclsNm": ""
		        },
		      "priorCtgInfo": {
			         
			        },
	          "clipInfo": {
		            "attnDivCd": "30",
		            "attnDivDtlCd": "31",
		            "siteNo": "6004",
		            "attnTgtIdnfNo1": "kkk",
		            "attnTgtIdnfNo2": "",
		            "infloSiteNo": "6004"
		        },
		         "optionColor": {
		            "footer": "222222",
		            "font": "0f0f0f",
		            "menu": "ffffff",
		            "footerFont": "ffffff",
		            "menuLayer": "ffffff",
		            "menuLayerButton": "999999"
		        },
		        "cornrList": [
		            {
		                "cornrId": "7000182023",
		                "cornrNm": "전문관공통(N)_Mobile_푸터",
		                "cornrCmptTypeDtlCd": "F5",
		                "cornrTitleExpsrTypeCd": "30",
		                "cornrTitleExpsrTextNm": "",
		                "cornrTitleExpsrImgFileNm": "",
		                "cornrDispExpsrCont": "",
		                "cornrCmptTypeCd": "50",
		                "cornrDataList": [
		                    [
		                        {
		                            "url": "http://local-m.shinsegaemall.ssg.com/special/kkk/html.ssg?cornrId=7000182023&cornrSetId=7200236874&cornrCmptId=7000371206"
		                        }
		                    ]
		                ]
		            }
		        ],
		        "shareInfo": {
		            "snsTitle": "키친샵",
		            "snsSummary": "신세계몰",
		            "snsImg": "http://dev-static.ssgcdn.com/cmpt/ctg/201703/2017033010565337286433722843_578.jpg",
		            "snsUrl": "http://dev-m.shinsegaemall.ssg.com/specialStore/kkk/main.ssg",
		            "snsShareType": "SPECIAL",
		            "snsTgtId": "kkk",
		            "useSnsShare": "true"
		        },
		        "siteNo": "6009",
		        "ctgItemData": {
		            "page": "1",
		            "pageSize": "1",
		            "sort": "regdt",
		            "hasNext": "true",
		            "ctgItemList": [
		                {
		                    "itemId": "1000023230791",
		                    "itemNm": "[끌로디 피에로] 탑 PTA67T5",
		                    "displayPrc": "169000",
		                    "strikeOutPrc": "",
		                    "minOnetOrdPsblQty": "1",
		                    "maxOnetOrdPsblQty": "20",
		                    "soldOutYn": "N",
		                    "stoppedSellingYn": "N",
		                    "siteNo": "6009",
		                    "siteNm": "신세계백화점",
		                    "salestrNo": "1004",
		                    "salestrNm": "강남점",
		                    "sellpntNm": "",
		                    "brandNm": "끌로디피에로",
		                    "goItemDetailYn": "Y",
		                    "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
		                    "attnTgtIdnfNo1": "1000023230791",
		                    "attnTgtIdnfNo2": "1004",
		                    "attnDivCd": "10",
		                    "needAdultCertification": "false",
		                    "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000023230791&siteNo=6009&salestrNo=1004",
		                    "itemImgUrl": "http://item.ssgcdn.com/91/07/23/item/1000023230791_i1_500.jpg",
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
		                    "benefitGrp1": [],
		                    "benefitGrp2": [],
		                    "benefitGrp3": [
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
		            ]
		        },
		        "sortList": [
		            {
		                "sortCd": "regdt",
		                "sortNm": "신상품순"
		            },
		            {
		                "sortCd": "best",
		                "sortNm": "인기상품순"
		            },
		            {
		                "sortCd": "prcdsc",
		                "sortNm": "높은 가격순"
		            },
		            {
		                "sortCd": "prcasc",
		                "sortNm": "낮은 가격순"
		            }
		        ],
		        "option": {
		            "logo": {
		                "value1": "IMAGE",
		                "value2": "http://dev-static.ssgcdn.com/cmpt/ctg/201703/2017030814460537281883722198_15.png",
		                "value3": "",
		                "value4": ""
		            },
		            "defaultItemSortType": {
		                "value1": "regdt",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "itemImageSize": {
		                "value1": "500",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "pageSize": {
		                "value1": "80",
		                "value2": "40,60,80,100",
		                "value3": "",
		                "value4": ""
		            },
		            "mainUrl": {
		                "value1": "http://dev-m.shinsegaemall.ssg.com/specialStore/kkk/main.ssg",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "defaultItemViewType": {
		                "value1": "thmb",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            },
		            "header": {
		                "value1": "<<NOT_USED>>",
		                "value2": "공식스토어",
		                "value3": "",
		                "value4": ""
		            },
		            "iconType": {
		                "value1": "BLACK",
		                "value2": "",
		                "value3": "",
		                "value4": ""
		            }
		        }
		    }
		}
	 @apiError FAIL_WRONG_ACCESS 400 / 잘못된 접근입니다.
     @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
 */

