/**
	@api {post} /api/clip/datas/insertclip.ssg	클립생성
	@apiVersion 1.0.0
	@apiName ClipController.insertClipDatsMyclip
	@apiGroup Clip
	@apiPermission none

	@apiDescription 클립생성

	
	@apiParam {String="6001","6002","6003","6004","6005","6009","6100","6200","6300"} siteNo 생성될 클립의 기준 siteNo
	@apiParam {String} attnDivCd		생성될 클립 데이터 타입		[클립코드정보](#api-header-for-a-submenu-clipcodeinfo)
	@apiParam {String} attnDivDtlCd	생성될 클립 데이터 상세타입		[클립코드정보](#api-header-for-a-submenu-clipcodeinfo)
	@apiParam {String} attnTgtIdnfNo1	생성될 클립 데이터의 타입별 ID값
	@apiParam {String} attnTgtIdnfNo2	클립대상이 상품인 경우 온라인상품이면 siteNo, 점포상품이면 salestrNo
	@apiParam {String="6001","6002","6003","6004","6005","6009","6100","6200","6300"} infloSiteNo 앱GNB기준 현재몰 siteNo	
	@apiParam {String} [uitemIdAndSalestrNo=00000]	일반상품 또는 선택된옵션이 없는경우 "00000", 다수개의 옵션이 선택된 경유 해당 옵션별 UITEM_ID와 SALESTR_NO를 +로 합쳐서 콤마로 연결하여 세팅 (ex:"00001+1004,00004+1002")

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
			"attnDivCd":"10",
			"attnDivDtlCd":"10",
			"attnTgtIdnfNo1":"2097000177366",
			"attnTgtIdnfNo2":"2449",
			"infloSiteNo":"6005",
			"uitemIdAndSalestrNo":"00001+1004,00004+1002"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/insertclip.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6001","attnDivCd":"10","attnDivDtlCd":"10","attnTgtIdnfNo1":"2097000177366","attnTgtIdnfNo2":"2449","infloSiteNo":"6005"}}'

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
	@api {post} /api/clip/datas/deleteclip.ssg	클립삭제
	@apiVersion 1.0.0
	@apiName ClipController.deleteClipDatsMyclip
	@apiGroup Clip
	@apiPermission none

	@apiDescription 클립삭제

	
	@apiParam {String} attnDivCd		삭제할 클립 데이터 타입		[클립코드정보](#api-header-for-a-submenu-clipcodeinfo)
	@apiParam {String} attnTgtIdnfNo1	삭제할 클립 데이터의 타입별 ID값

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"attnDivCd":"10",
			"attnTgtIdnfNo1":"2097000177366"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/deleteclip.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"attnDivCd":"10","attnTgtIdnfNo1":"2097000177366"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}		data.attnTgtIdnfCnt		해당 클립의 전체 클립개수 집계 cnt
	@apiSuccess {String}		data.deleteClipMsg		클립해제시 노출 메시지, empty string이면 pass

	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	    	"attnTgtIdnfCnt": "123",
	    	"deleteClipMsg": "n개의 옵션상품클립이 해제되었습니다."
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/clip/datas/myclip.ssg	클립전체 리스트 for APP CACHE
	@apiVersion 1.0.0
	@apiName ClipController.getClipDatsMyclip
	@apiGroup Clip
	@apiPermission none

	@apiDescription 클립생성

	

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/myclip.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List}       data.itemClipList		상품클립리스트	[클립코드정보](#api-header-for-a-submenu-clipcodeinfo)
	@apiSuccess {List}       data.dispCtgClipList	카테고리클립리스트 
	@apiSuccess {List}       data.brandClipList		브랜드클립리스트
	@apiSuccess {List}       data.dispCmptList		기획전클립리스트
	@apiSuccess {List}       data.eventist			이벤트클립리스트
	@apiSuccess {List}       data.lifeMagazineList	매거진클립리스트	

	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "itemClipList": [
	            "0000010680499",
	            "1000015453606",
	            "1000016509074",
	            "1000014071426",
	            "1000020272713",
	            "1000012345771",
	            "0000009832892",
	            "1000014198321",
	            "0000006454914",
	            "0000001993068",
	            "1000020301922",
	            "1000007824022",
	            "1000020706805",
	            "1000014267711",
	            "1000005895334",
	            "1000011576988",
	            "1000012627164",
	            "1000020058867",
	            "1000012925636",
	            "1000018908413",
	            "1000013664593",
	            "1000013045545",
	            "0000008794950",
	            "1000010502488",
	            "1000012536781",
	            "1000013429439",
	            "1000018385577"
	        ],
	        "dispCmptList": [
	            "6000062681",
	            "6000062478",
	            "6000016745",
	            "3600148193",
	            "6000087048",
	            "6000046875",
	            "3600163868",
	            "6000073535",
	            "6000086594",
	            "6000086593",
	            "6000090044",
	            "6000041673",
	            "6000128157",
	            "6000149430",
	            "6000020529",
	            "3600080984",
	            "6000057119",
	            "6000022106",
	            "6000058801"
	        ],
	        "dispCtgClipList": [
	            "6000034069",
	            "5500000747",
	            "5500003059",
	            "5500000192",
	            "5500000667",
	            "5500000316"
	        ],
	        "brandClipList": [
	            "2000007406",
	            "2000004432",
	            "3000003168",
	            "2000007631",
	            "calvinklein",
	            "2000004827",
	            "2011014489",
	            "2000000928",
	            "3000013032",
	            "descente",
	            "2000000803",
	            "2000000808",
	            "3000005298",
	            "3000003138",
	            "electromart",
	            "nobrand",
	            "2011010089",
	            "3000003108",
	            "2000009095",
	            "3000013178",
	            "3000000452",
	            "peacock",
	            "2011011507",
	            "2000008767",
	            "2000014736",
	            "2010031366",
	            "2000001410",
	            "3000004171",
	            "3000004797",
	            "2000000940",
	            "1020770198",
	            "2000000084",
	            "3000007150",
	            "1010100108",
	            "2011014733",
	            "shinsegaefood",
	            "2000004287",
	            "1010000702",
	            "lego",
	            "3000003392",
	            "2000008364",
	            "3000010209",
	            "scentence",
	            "2011012774",
	            "3000004243"
	        ],
	        "lifeMagazineList": [
	            "6000019943",
	            "49265",
	            "15878",
	            "6000047859",
	            "43415",
	            "7000000423",
	            "7000000401",
	            "63758"
	        ],
	        "eventList": [
	            "1100215788",
	            "1100145980",
	            "1100176930",
	            "1100220814",
	            "1100205793",
	            "1100189605",
	            "1100236894",
	            "1100195880"
	        ]
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/clip/datas/checkmyclip.ssg		클립여부 확인조회
	@apiVersion 1.0.0
	@apiName ClipController.checkMyclip
	@apiGroup Clip
	@apiPermission none

	@apiDescription 클립생성

	
	@apiParam {String} attnDivCd		생성될 클립 데이터 타입		[클립코드정보](#api-header-for-a-submenu-clipcodeinfo)
	@apiParam {String} attnTgtIdnfNo1	생성될 클립 데이터의 타입별 ID값

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"attnDivCd":"10",
			"attnTgtIdnfNo1":"2097000177366"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/checkmyclip.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"attnDivCd":"10","attnTgtIdnfNo1":"2097000177366"}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}     data.myClipYn  클립존재 Y/N
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	    	"myClipYn":"Y"
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/clip/datas/getmysize.ssg		나의신발 사이즈 조회
	@apiVersion 1.0.0
	@apiName ClipController.getMySizeList
	@apiGroup Clip
	@apiPermission none

	@apiDescription 나의신발 사이즈 조회

	

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/getmysize.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{}}'

	@apiSuccess {String}     resultCode 응답코드
	@apiSuccess {String}     resultMsg 응답메시지
	@apiSuccess {List}     result 신발 사이즈 LIST
	
	@apiSuccessExample Response (example):
	{
	    "resultCode": "SUCCESS",
	    "resultMsg": "정상적으로 처리 되었습니다.",
	    "result": [
	        "270",
	        "265",
	        "240",
	        "235",
	        "230"
	    ]
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/clip/datas/getclipcount.ssg		클립카운트조회
	@apiVersion 1.0.0
	@apiName ClipController.getClipCount
	@apiGroup Clip
	@apiPermission none

	@apiDescription 클립카운트조회

	
	@apiParam {List} tgtList		조회대상 클립 데이터 리스트
	@apiParam {String} tgtList.attnDivCd		조회대상 클립 데이터 타입		[클립코드정보](#api-header-for-a-submenu-clipcodeinfo)
	@apiParam {String} tgtList.attnTgtIdnfNo1	조회대상 클립 데이터의 타입별 ID값

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
  			"tgtList":[
      			{
					"attnDivCd":"10",
					"attnTgtIdnfNo1":"2097000177366"
    			},
    			{
  					"attnDivCd":"40",
					"attnTgtIdnfNo1":"6000086593"  	
    			}
     		]
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/getclipcount.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"attnDivCd":"10","attnTgtIdnfNo1":"2097000177366"}}'

	@apiSuccess {String}     resultCode 응답코드
	@apiSuccess {String}     resultMsg 응답메시지
	@apiSuccess {Object}     data 응답결과값	
	@apiSuccess {List}     	data.tgtList 클립 데이터 리스트
	@apiSuccess {String}     	data.tgtList.attnDivCd 		클립타입코드
	@apiSuccess {String}     	data.tgtList.attnTgtIdnfNo1 클립대상ID
	@apiSuccess {String}     	data.tgtList.attnTgtIdnfCnt 클립카운드(실시간)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "tgtList": [
	            {
	                "attnDivCd": "10",
	                "attnTgtIdnfNo1": "2097000177366",
	                "attnTgtIdnfCnt": "0"
	            },
	            {
	                "attnDivCd": "40",
	                "attnTgtIdnfNo1": "6000086593",
	                "attnTgtIdnfCnt": "3"
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
	@api {post} /api/clip/datas/mycliplist.ssg		클립타입별 클립데이터조회
	@apiVersion 1.0.0
	@apiName ClipController.getMyClipList
	@apiGroup Clip
	@apiPermission none

	@apiDescription 클립타입별 클립데이터조회

	
	@apiParam {String} tgtList.attnDivCd		조회대상 클립 데이터 타입		[클립코드정보](#api-header-for-a-submenu-clipcodeinfo)
	@apiParam {String} [page=1]	페이지넘버
	@apiParam {String} [pageSize=20]	페이지당 데이터 개수
	@apiParam {String} [itemImgSize=253]	상품유닛의 이미지 크기

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"attnDivCd":"10",
			"page":"1",
			"pageSize":"10",
			"itemImgSize":"253"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/mycliplist.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"attnDivCd":"10","page":"1","pageSize":"10","itemImgSize":"253"}}'

	@apiSuccess {String}     resultCode 응답코드
	@apiSuccess {String}     resultMsg 응답메시지
	@apiSuccess {Object}     data 응답결과값	
	@apiSuccess {String}     	data.totalCount			요청클립타입 전체카운트
	@apiSuccess {String}     	data.lnkdUrl			MY클립웹URL
	@apiSuccess {String}     	data.hasNext			추가데이터 여부 Y/N
	@apiSuccess {List}     	data.itemClipList 		상품클립 데이터 리스트 - 요청 attnDivCd = 10인 경우   [상품유닛리스트](#api-header-for-a-submenu-itemunit)
	@apiSuccess {List}     	data.dispCtgClipList	카테고리클립 데이터 리스트 - 요청 attnDivCd =20인 경우
	@apiSuccess {List}     	data.brandClipList 		브랜드클립 데이터 리스트 - 요청 attnDivCd = 30인 경우
	@apiSuccess {List}     	data.brandClipList 		기획전클립 데이터 리스트 - 요청 attnDivCd = 40인 경우
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "totalCount": "332",
	        "lnkdUrl": "http://m.ssg.com/myssg/myClip/main.ssg?attnDivCd=10",
	        "hasNext": "Y",
	        "itemClipList": [
	            {
	                "itemId": "1000021257001",
	                "itemNm": "MYKIT +MASION MARGIELA MMESSE007 E2-GOLD",
	                "displayPrc": "630000",
	                "strikeOutPrc": "700000",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "20",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6100",
	                "siteNm": "howdy",
	                "salestrNo": "2468",
	                "salestrNm": "하우디몰",
	                "sellpntNm": "",
	                "brandNm": "MYKITA",
	                "goItemDetailYn": "N",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "1000021257001",
	                "attnTgtIdnfNo2": "2468",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.howdy.ssg.com/item/itemView.ssg?itemId=1000021257001&siteNo=6100&salestrNo=2468",
	                "itemImgUrl": "http://item.ssgcdn.com/01/70/25/item/1000021257001_i1_253.jpg",
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
	                "benefitGrp2": [],
	                "benefitGrp3": [
	                    {
	                        "type": "160",
	                        "txt": "청구할인"
	                    },
	                    {
	                        "type": "180",
	                        "txt": "무료배송"
	                    }
	                ],
	                "benefitGrp4": []
	            },
	            {
	                "itemId": "1000021156625",
	                "itemNm": "I-1 즉석카메라",
	                "displayPrc": "445550",
	                "strikeOutPrc": "469000",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "20",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6100",
	                "siteNm": "howdy",
	                "salestrNo": "2468",
	                "salestrNm": "하우디몰",
	                "sellpntNm": "",
	                "brandNm": "IMPOSSIBLE",
	                "goItemDetailYn": "N",
	                "msgWhenGoToItemDetail": "",
	                "attnTgtIdnfNo1": "1000021156625",
	                "attnTgtIdnfNo2": "2468",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.howdy.ssg.com/item/itemView.ssg?itemId=1000021156625&siteNo=6100&salestrNo=2468",
	                "itemImgUrl": "http://item.ssgcdn.com/25/66/15/item/1000021156625_i1_253.jpg",
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
	        "dispCtgClipList": [
	            {
	                "dispCtgDclsId": "",
	                "dispCtgSdclsNm": "",
	                "dispCtgDclsNm": "",
	                "dispCtgId": "6000034069",
	                "attnTgtIdnfNo1": "6000034069",
	                "dispCtgSclsNm": "",
	                "dispCtgLvl": "2",
	                "dispCtgLclsId": "6000034048",
	                "dispCtgZoneId": "",
	                "attnDivCd": "20",
	                "dispCtgNm": "언더웨어",
	                "priorDispCtgId": "",
	                "dispCtgMclsId": "6000034069",
	                "dispCtgMclsNm": "언더웨어",
	                "lnkdUrl": "http://m.ssg.com/disp/category.ssg?ctgId=6000034069",
	                "dispCtgSclsId": "",
	                "aplSiteNo": "",
	                "dispCtgSdclsId": "",
	                "dispCtgLclsNm": "패션의류/언더웨어"
	            },
	            {
	                "dispCtgDclsId": "",
	                "dispCtgSdclsNm": "",
	                "dispCtgDclsNm": "",
	                "dispCtgId": "5500000316",
	                "attnTgtIdnfNo1": "5500000316",
	                "dispCtgSclsNm": "속옷세트",
	                "dispCtgLvl": "3",
	                "dispCtgLclsId": "5500000162",
	                "dispCtgZoneId": "",
	                "attnDivCd": "20",
	                "dispCtgNm": "속옷세트",
	                "priorDispCtgId": "",
	                "dispCtgMclsId": "5500000315",
	                "dispCtgMclsNm": "커플 속옷/잠옷 세트",
	                "lnkdUrl": "http://m.ssg.com/disp/category.ssg?ctgId=5500000316",
	                "dispCtgSclsId": "5500000316",
	                "aplSiteNo": "",
	                "dispCtgSdclsId": "",
	                "dispCtgLclsNm": "유니섹스/언더웨어"
	            }
	        ],
	        "brandClipList": [
	            {
	                "useYn": "Y",
	                "attnDivDtlCd": "30",
	                "brandNm": "PEACOCK",
	                "attnDivCd": "30",
	                "lnkdUrl": "http://m.ssg.com/disp/brandShop.ssg?brandIds=1010100105",
	                "attnTgtIdnfNo1": "1010100105",
	                "brandId": "1010100105",
	                "imgFileNm": ""
	            },
	            {
	                "useYn": "Y",
	                "attnDivDtlCd": "31",
	                "brandNm": "No Brand",
	                "attnDivCd": "30",
	                "lnkdUrl": "http://m.emart.ssg.com/specialStore/nobrand/main.ssg",
	                "attnTgtIdnfNo1": "nobrand",
	                "brandId": "nobrand",
	                "imgFileNm": "http://static.ssgcdn.com/cmpt/ctg/201707/2017072515134180441518048151_315.jpg"
	            }
	        ],       	        
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/clip/datas/clipsalemy.ssg		클립세일상품리스트-나의클립
	@apiVersion 1.0.0
	@apiName ClipController.getClipSaleMy
	@apiGroup Clip
	@apiPermission none

	@apiDescription 클립세일상품리스트-나의클립

	
	@apiParam {String} [itemImgSize=253]	상품유닛의 이미지 크기
	
	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"itemImgSize":"253"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/clipsalemy.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"itemImgSize":"253"}}'

	@apiSuccess {String}     resultCode 응답코드
	@apiSuccess {String}     resultMsg 응답메시지
	@apiSuccess {Object}     data 응답결과값	
	@apiSuccess {String}     	data.totalCount		상품개수
	@apiSuccess {List}     	data.itemList		상품리스트		[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "nextPage": "1",
	        "totalCount": "9",
	        "hasNext": "N",
	        "itemList": [
	            {
	                "itemId": "0000010358037",
	                "itemNm": "타일줄눈보수제 EZ타일 200G",
	                "displayPrc": "5220",
	                "strikeOutPrc": "5800",
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
	                "attnTgtIdnfNo1": "0000010358037",
	                "attnTgtIdnfNo2": "2449",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=0000010358037&siteNo=6001&salestrNo=2449",
	                "itemImgUrl": "http://item.ssgcdn.com/37/80/35/item/0000010358037_i1_253.jpg",
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
	                "itemSellPrc": "5830"
	            },
	            {
	                "itemId": "1000017165374",
	                "itemNm": "[NEW] 더블웨어 브라이트닝 파우더 SPF25/ PA+++ (10g) -리필",
	                "displayPrc": "47200",
	                "strikeOutPrc": "59000",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "3",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6009",
	                "siteNm": "신세계백화점",
	                "salestrNo": "1004",
	                "salestrNm": "강남점",
	                "sellpntNm": "",
	                "brandNm": "에스티로더",
	                "goItemDetailYn": "Y",
	                "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                "attnTgtIdnfNo1": "1000017165374",
	                "attnTgtIdnfNo2": "1004",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000017165374&siteNo=6009&salestrNo=1004",
	                "itemImgUrl": "http://item.ssgcdn.com/74/53/16/item/1000017165374_i1_253.jpg",
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
	                        "txt": "20"
	                    }
	                ],
	                "benefitGrp2": [],
	                "benefitGrp3": [
	                    {
	                        "type": "220",
	                        "txt": "카드할인 5%"
	                    }
	                ],
	                "benefitGrp4": [],
	                "itemSellPrc": "53100"
	            },
	            {
	                "itemId": "0000000826706",
	                "itemNm": "더블 웨어 모이스춰 파우더 스테이-인-플레이스 메이크업 SPF 14/PA++ (리필) 11g",
	                "displayPrc": "44000",
	                "strikeOutPrc": "55000",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "3",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6009",
	                "siteNm": "신세계백화점",
	                "salestrNo": "1004",
	                "salestrNm": "강남점",
	                "sellpntNm": "",
	                "brandNm": "에스티로더",
	                "goItemDetailYn": "Y",
	                "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                "attnTgtIdnfNo1": "0000000826706",
	                "attnTgtIdnfNo2": "1004",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=0000000826706&siteNo=6009&salestrNo=1004",
	                "itemImgUrl": "http://item.ssgcdn.com/06/67/82/item/0000000826706_i1_253.jpg",
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
	                        "txt": "20"
	                    }
	                ],
	                "benefitGrp2": [],
	                "benefitGrp3": [
	                    {
	                        "type": "220",
	                        "txt": "카드할인 5%"
	                    }
	                ],
	                "benefitGrp4": [],
	                "itemSellPrc": "49500"
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
	@api {post} /api/clip/datas/clipsalebest.ssg		클립세일상품리스트-클립베스트
	@apiVersion 1.0.0
	@apiName ClipController.getClipSaleMy
	@apiGroup Clip
	@apiPermission none

	@apiDescription 클립세일상품리스트-클립베스트

	
	@apiParam {String} [itemImgSize=253]	상품유닛의 이미지 크기
	
	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"itemImgSize":"253"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/clip/datas/clipsalebest.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"itemImgSize":"253"}}'

	@apiSuccess {String}     resultCode 응답코드
	@apiSuccess {String}     resultMsg 응답메시지
	@apiSuccess {Object}     data 응답결과값	
	@apiSuccess {String}     	data.totalCount		상품개수
	@apiSuccess {List}     	data.itemList		상품리스트		[상품유닛리스트](#api-header-for-a-submenu-itemunit)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "nextPage": "1",
	        "totalCount": "9",
	        "hasNext": "N",
	        "itemList": [
	            {
	                "itemId": "0000010358037",
	                "itemNm": "타일줄눈보수제 EZ타일 200G",
	                "displayPrc": "5220",
	                "strikeOutPrc": "5800",
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
	                "attnTgtIdnfNo1": "0000010358037",
	                "attnTgtIdnfNo2": "2449",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=0000010358037&siteNo=6001&salestrNo=2449",
	                "itemImgUrl": "http://item.ssgcdn.com/37/80/35/item/0000010358037_i1_253.jpg",
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
	                "itemSellPrc": "5830"
	            },
	            {
	                "itemId": "1000017165374",
	                "itemNm": "[NEW] 더블웨어 브라이트닝 파우더 SPF25/ PA+++ (10g) -리필",
	                "displayPrc": "47200",
	                "strikeOutPrc": "59000",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "3",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6009",
	                "siteNm": "신세계백화점",
	                "salestrNo": "1004",
	                "salestrNm": "강남점",
	                "sellpntNm": "",
	                "brandNm": "에스티로더",
	                "goItemDetailYn": "Y",
	                "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                "attnTgtIdnfNo1": "1000017165374",
	                "attnTgtIdnfNo2": "1004",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000017165374&siteNo=6009&salestrNo=1004",
	                "itemImgUrl": "http://item.ssgcdn.com/74/53/16/item/1000017165374_i1_253.jpg",
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
	                        "txt": "20"
	                    }
	                ],
	                "benefitGrp2": [],
	                "benefitGrp3": [
	                    {
	                        "type": "220",
	                        "txt": "카드할인 5%"
	                    }
	                ],
	                "benefitGrp4": [],
	                "itemSellPrc": "53100"
	            },
	            {
	                "itemId": "0000000826706",
	                "itemNm": "더블 웨어 모이스춰 파우더 스테이-인-플레이스 메이크업 SPF 14/PA++ (리필) 11g",
	                "displayPrc": "44000",
	                "strikeOutPrc": "55000",
	                "minOnetOrdPsblQty": "1",
	                "maxOnetOrdPsblQty": "3",
	                "soldOutYn": "N",
	                "stoppedSellingYn": "N",
	                "siteNo": "6009",
	                "siteNm": "신세계백화점",
	                "salestrNo": "1004",
	                "salestrNm": "강남점",
	                "sellpntNm": "",
	                "brandNm": "에스티로더",
	                "goItemDetailYn": "Y",
	                "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
	                "attnTgtIdnfNo1": "0000000826706",
	                "attnTgtIdnfNo2": "1004",
	                "attnDivCd": "10",
	                "needAdultCertification": "false",
	                "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=0000000826706&siteNo=6009&salestrNo=1004",
	                "itemImgUrl": "http://item.ssgcdn.com/06/67/82/item/0000000826706_i1_253.jpg",
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
	                        "txt": "20"
	                    }
	                ],
	                "benefitGrp2": [],
	                "benefitGrp3": [
	                    {
	                        "type": "220",
	                        "txt": "카드할인 5%"
	                    }
	                ],
	                "benefitGrp4": [],
	                "itemSellPrc": "49500"
	            }
	        ]
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========


