/**
	@api {post} /api/magazine/ssg/datas/banr 매거진 배너리스트 조회
	@apiVersion 0.0.0
	@apiName MagazineController.getSsgMagazineBanr
	@apiGroup MagazineController
	@apiPermission none
	@apiDescription 매거진 배너 목록을 가져온다

	@apiParam {String} [dispCtgId=""] 컨텐츠 타입 코드 (지정 안해줄시 모든 컨텐츠 타입 전체보기)
	@apiParam {String} [page="1"] 페이지 번호
	@apiParam {String} [pageSize="20"] 한 페이지당 배너 갯수 
	@apiParam {String="10", "20", "30"} [shpgMgzTypeCd="10"] 매거진 유형 코드 (10 - 매거진, 20 - 하우디 저널, 30 - SIV 매거진)
	@apiParam {String="20", "30", "50"} [shpgMgzContentGrpCd="20"] 매거진 컨텐츠 타입의 그룹 코드 (20 - 매거진, 30 - 하우디 저널, 50 - SIV 매거진)
	@apiParam {String="10", "20", "30", "40", "50"} [shpgMgzDispGrpDtlCd="10"] 매거진 전시 위치 그룹 코드 (10 - SSG, 20 - 사이니지(슈퍼샵), 30 - 하우디, 40 - 신세계몰, 50 - SIV 매거진)
	
	@apiParamExample {json} Request-Example :
	{
		"common": {
			"ts": "20140619175133",
			"mobil_app_no": "13",
			"apl_ver": "1.1.3",
			"os_cd": "20"
		},
		"params": {
	      "page" : "1",
	      "pageSize" : "10",
	      "shpgMgzDispGrpDtlCd" : "10",
	      "shpgMgzTypeCd" : "20",
	      "shpgMgzContentGrpCd" : "10",
	      "dispCtgId" : ""
	    }
	}

	@apiExample Example-Usage : 
	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/eventcoupon/main/datas.ssg -d'
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"}, "params": {"page" : "1","pageSize" : "10","shpgMgzDispGrpDtlCd" : "10","shpgMgzTypeCd" : "20","shpgMgzContentGrpCd" : "10","dispCtgId" : ""}}'

	@apiSuccess {String} hasNext [다음 페이지 여부]
	@apiSuccess {String} pageSize [페이지 사이즈]
	@apiSuccess {List} banrList [배너 리스트](#api-header-for-a-submenu-commonconrbanr)

	@apiSuccessExample Response-Example : 
	{
		"cached": false,
		"method": "",
		"res_code": "200",
		"res_message": "성공",
		"data": {
		"hasNext": "true",
		"pageSize": "20",
		"banrList": [
				 {
					"id": "7000000167",
					"title": "ㅎㅎㅎㅎㅎ",
					"desc": "",
					"lnkdUrl": "http://dev-m.ssg.com/contents/lifeMagazine.ssg?planShopId=7000000167",
					"lnkdType": "10",
					"imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201705/2017052315241437260113723021_390.jpg",
					"strtDts": "20170523000000",
					"endDts": "29991231235959",
					"maiTitleNm1": "ㅎㅎㅎㅎㅎ",
					"maiTitleNm2": "",
					"subtitlNm1": "",
					"subtitlNm2": "",
					"iconTgtLst": "이유있는 추천",
					"titleShadUseYn": "",
					"imgWidth": "0",
					"imgHeight": "0",
					"dispOrdr": "0",
					"bakgrndColrCdVal": "",
					"iconTgtList": [],
				}
			]
		}
	}
	
	@apiError ERR_INTERNAL 서버 오류입니다
*/

// ============================================================================

/**
	@api {post} /api/magazine/ssg/datas/code 매거진 컨텐츠 타입 코드 조회
	@apiVersion 0.0.0
	@apiName MagazineController.getSsgMagazineCode
	@apiGroup MagazineController
	@apiPermission none
	@apiDescription 매거진 상단의 매거진 컨텐츠 타입 코드 목록을 가져오는 메소드
	
	@apiParam {String="20", "30", "50"} [shpgMgzContentGrpCd="20"] 매거진 컨텐츠 타입의 그룹 코드 (20 - 매거진, 30 - 하우디 저널, 50 - SIV 매거진)

	@apiParamExample {json} Request-Example : 
	{
		"common" : {
		"apl_ver" : "2.1.2",
		"os_cd" : "20",
		"ts" : "20151203110355",
		"mobil_app_no": "1",
 	},
	 	"params" : {
			"shpgMgzContentGrpCd" : "20"
		}
	}
	
	@apiExample Example-Usage : 
	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/eventcoupon/main/datas.ssg -d'
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"shpgMgzContentGrpCd":"20"}}'

	@apiSuccess {List} dispCtgList [컨텐츠 타입 목록]
	@apiSuccess {String} dispCtgList.dispCtgNm [컨텐츠 타입명]
	@apiSuccess {String} dispCtgList.dispCtgId [컨텐츠 타입 코드]

	@apiSuccessExample Response-Example : 

	{
		"cached": false,
		"method": "",
		"res_code": "200",
		"res_message": "성공",
		"data": {
			"dispCtgList": [
				{
					"dispCtgNm": "전체보기",
					"dispCtgId": ""
				},
				{
					"dispCtgNm": "브랜드를 만나다",
					"dispCtgId": "20"
				},
				{
					"dispCtgNm": "이유있는 추천",
					"dispCtgId": "10"
				},
				{
					"dispCtgNm": "채널 SSG",
					"dispCtgId": "30"
				},
				{
					"dispCtgNm": "탐나는 라이프",
					"dispCtgId": "40"
				},
				{
					"dispCtgNm": "디자이너 #",
					"dispCtgId": "50"
				}
			],
		}
	}
	
	@apiError ERR_INTERNAL 서버 오류입니다
*/
