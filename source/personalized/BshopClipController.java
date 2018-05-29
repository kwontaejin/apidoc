/**
	@api {post} /api/bshop/clip/datas/brand.ssg		샤벳 > 브랜드클립리스트
	@apiVersion 1.0.0
	@apiName BshopClipController.getMyBrandClipList
	@apiGroup Bshop
	@apiPermission none

	@apiDescription 샤벳 > 브랜드클립리스트

	
	@apiParam {String} [page=1]	페이지번호
	@apiParam {String} [pageSize=20]	페이지사이즈
	@apiParam {String="regDts","seaDts"} [sort=regDts]	정렬순서 regDts:등록일역순, seaDts:시즌시작일역순
	
	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"page":"1",
			"pageSize":"20",
			"sort":"seaDts"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/bshop/clip/datas/brand.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"page":"1","pageSize":"20","sort":"seaDts"}}'

	@apiSuccess {String}     resultCode 응답코드
	@apiSuccess {String}     resultMsg 응답메시지
	@apiSuccess {Object}     data 응답결과값	
	@apiSuccess {String}     	data.totalCount		상품개수
	@apiSuccess {String}     	data.lnkdUrl		웹URL
	@apiSuccess {String}     	data.hasNext		다음데이터여부 Y/N
	@apiSuccess {List}     	data.bshopList		브랜드 리스트
	@apiSuccess {String}     	data.bshopList.ETCN		배지구분 50:세일,60:쿠폰,70:BEST,80:NEW
	@apiSuccess {String}     	data.bshopList.EWC		할인율
	@apiSuccess {String}     	data.bshopList.SC		백화점점포코드
	@apiSuccess {String}     	data.bshopList.SN		백화점점포명
	@apiSuccess {String}     	data.bshopList.BC		관코드
	@apiSuccess {String}     	data.bshopList.BN		관명
	@apiSuccess {String}     	data.bshopList.FC		층코드
	@apiSuccess {String}     	data.bshopList.FN		층명
	@apiSuccess {String}     	data.bshopList.SD		시즌등록일자(yyyy.mm.dd)
	@apiSuccess {String}     	data.bshopList.bshopId		브랜드ID
	@apiSuccess {String}     	data.bshopList.bshopTitleNm		브랜드명
	@apiSuccess {String}     	data.bshopList.repBrandId		참조브랜드ID
	@apiSuccess {String}     	data.bshopList.bshopItemCount	등록상품개수
	@apiSuccess {String}     	data.bshopList.bshopEngTitleNm1		영문명1
	@apiSuccess {String}     	data.bshopList.bshopEngTitleNm2		영문명2
	@apiSuccess {List}     	data.bshopList.repSeason		시즌정보 리스트
	@apiSuccess {String}     	data.bshopList.repSeason.newYn		NEW Y/N
	@apiSuccess {String}     	data.bshopList.repSeason.repImgUrl	배너URL
	@apiSuccess {String}     	data.bshopList.repSeason.seasonId	시즌ID
	@apiSuccess {String}     	data.bshopList.repSeason.seasonNm	시즌이름
	@apiSuccess {String}     	data.bshopList.clipInfo			[클립데이터유닛](#api-header-for-a-submenu-clipunit)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "totalCount": "10",
	        "lnkdUrl": "http://m.ssg.com/myssg/myClip/main.ssg?attnDivCd=30",
	        "hasNext": "Y",
	        "bshopList": [
	            {
	                "SD": "2017.08.01",
	                "bshopId": "1000000755",
	                "ETCN": "",
	                "SC": "1004",
	                "clipInfo": {
	                    "attnDivCd": "30",
	                    "attnTgtIdnfNo2": "",
	                    "attnTgtIdnfNo1": "2000000808",
	                    "siteNo": "6005",
	                    "infloSiteNo": "6005"
	                },
	                "bshopEngTitleNm2": "",
	                "EWC": "",
	                "FC": "",
	                "bshopEngTitleNm1": "BILLABONG",
	                "SN": "강남점",
	                "repSeason": {
	                    "newYn": "Y",
	                    "repImgUrl": "/cmpt/banner/201707/2017073110135580435638049563_211.jpg",
	                    "seasonId": "1000006831",
	                    "seasonNm": "2017년7월 강남점"
	                },
	                "repBrandId": "2000000808",
	                "bshopTitleNm": "빌라봉",
	                "bshopItemCount": "0",
	                "FN": "",
	                "BC": "BC000002",
	                "BN": "신관"
	            },
	            {
	                "SD": "2017.07.15",
	                "bshopId": "1000000750",
	                "ETCN": "",
	                "SC": "1006",
	                "clipInfo": {
	                    "attnDivCd": "30",
	                    "attnTgtIdnfNo2": "",
	                    "attnTgtIdnfNo1": "2000000682",
	                    "siteNo": "6005",
	                    "infloSiteNo": "6005"
	                },
	                "bshopEngTitleNm2": "lingerie",
	                "EWC": "",
	                "FC": "",
	                "bshopEngTitleNm1": "barbara",
	                "SN": "경기점",
	                "repSeason": {
	                    "newYn": "N",
	                    "repImgUrl": "/cmpt/banner/201707/2017071316300743384854332585_538.jpg",
	                    "seasonId": "1000006676",
	                    "seasonNm": "2017년 7월 경기점"
	                },
	                "repBrandId": "2000000682",
	                "bshopTitleNm": "바바라 란제리",
	                "bshopItemCount": "0",
	                "FN": "",
	                "BC": "BC000002",
	                "BN": "신관"
	            }
	        ],
	        "hasUserDataYn": "Y"
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/bshop/clip/datas/photo.ssg		샤벳 > 매장사진클립리스트
	@apiVersion 1.0.0
	@apiName BshopClipController.getMyPhotoClipList
	@apiGroup Bshop
	@apiPermission none

	@apiDescription 샤벳 > 매장사진클립리스트

	
	@apiParam {String} [page=1]	페이지번호
	@apiParam {String} [pageSize=20]	페이지사이즈
	
	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
			"page":"1",
			"pageSize":"20"
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/bshop/clip/datas/photo.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"page":"1","pageSize":"20"}}'

	@apiSuccess {String}     resultCode 응답코드
	@apiSuccess {String}     resultMsg 응답메시지
	@apiSuccess {Object}     data 응답결과값	
	@apiSuccess {String}     	data.totalCount		상품개수
	@apiSuccess {String}     	data.lnkdUrl		웹URL
	@apiSuccess {String}     	data.hasNext		다음데이터여부 Y/N
	@apiSuccess {List}     	data.bshopPhotoList		매장사진 리스트
	@apiSuccess {String}     	data.bshopPhotoList.bshopId		브랜드ID
	@apiSuccess {String}     	data.bshopPhotoList.bshopTitleNm		브랜드명
	@apiSuccess {String}     	data.bshopPhotoList.bshopDispCmptId		매장사진ID
	@apiSuccess {String}     	data.bshopPhotoList.bshopDispCmptNm		매장사진명
	@apiSuccess {String}     	data.bshopPhotoList.shopId	샵ID
	@apiSuccess {String}     	data.bshopPhotoList.shopNm	샵명
	@apiSuccess {String}     	data.bshopPhotoList.shopDesc	샵설명
	@apiSuccess {List}     	data.bshopPhotoList.shopTitleNm	샵타이틀명
	@apiSuccess {String}     	data.bshopPhotoList.banrId		배너ID
	@apiSuccess {String}     	data.bshopPhotoList.banrDispNm		배너노출명
	@apiSuccess {String}     	data.bshopPhotoList.banrNm		배너명
	@apiSuccess {String}     	data.bshopPhotoList.banrRplcTextNm	대체텍스트
	@apiSuccess {String}     	data.bshopPhotoList.bakgrndColrCdVal	백그라운드컬러코드
	@apiSuccess {String}     	data.bshopPhotoList.clipCnt		현재클립카운트
	@apiSuccess {String}     	data.bshopPhotoList.imgFileNm		이미지URL
	@apiSuccess {String}     	data.bshopPhotoList.imgWidth		이미지가로크기
	@apiSuccess {String}     	data.bshopPhotoList.imgHeight		이미지세로크기
	@apiSuccess {String}     	data.bshopPhotoList.clipInfo			[클립데이터유닛](#api-header-for-a-submenu-clipunit)

	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "totalCount": "3",
	        "hasNext": "N",
	        "bshopPhotoList": [
	            {
	                "bshopId": "1000000361",
	                "clipInfo": {
	                    "attnDivCd": "31",
	                    "attnTgtIdnfNo2": "",
	                    "attnTgtIdnfNo1": "6000158405",
	                    "siteNo": "6005",
	                    "infloSiteNo": "6005"
	                },
	                "imgWidth": "253",
	                "bshopDispCmptId": "1000006884",
	                "shopNm": "비너스 봄꽃모양",
	                "bshopTitleNm": "비너스",
	                "banrId": "2001102311",
	                "banrDispNm": "",
	                "banrNm": "비너스 봄꽃모양",
	                "shopId": "6000158405",
	                "shopTitleNm": "비너스 봄꽃모양",
	                "clipCnt": "0",
	                "shopDesc": "봄분위기를 물씬 풍기는 엘레강스한 감각의 꽃나염을 사용한 몰드 브라입니다.?\r\n",
	                "bakgrndColrCdVal": "",
	                "banrRplcTextNm": "비너스 봄꽃모양",
	                "bshopDispCmptNm": "2017년 8월 강남점",
	                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017080310295556321185636118_366.jpg",
	                "imgHeight": "294"
	            },
	            {
	                "bshopId": "1000000361",
	                "clipInfo": {
	                    "attnDivCd": "31",
	                    "attnTgtIdnfNo2": "",
	                    "attnTgtIdnfNo1": "6000158408",
	                    "siteNo": "6005",
	                    "infloSiteNo": "6005"
	                },
	                "imgWidth": "253",
	                "bshopDispCmptId": "1000006884",
	                "shopNm": "꽃나염 파자마",
	                "bshopTitleNm": "비너스",
	                "banrId": "2001102318",
	                "banrDispNm": "",
	                "banrNm": "꽃나염 파자마",
	                "shopId": "6000158408",
	                "shopTitleNm": "꽃나염 파자마",
	                "clipCnt": "0",
	                "shopDesc": "심플한 디자인으로 구성된 제품으로 심플한 제품에 화려한 꽃 나염이 포인트가 되는 파자마입니다. \r\n",
	                "bakgrndColrCdVal": "",
	                "banrRplcTextNm": "꽃나염 파자마",
	                "bshopDispCmptNm": "2017년 8월 강남점",
	                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017080310310080483518042451_160.jpg",
	                "imgHeight": "294"
	            }
	        ]
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========



