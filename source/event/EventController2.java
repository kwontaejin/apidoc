/**
* @api {post} /api/eventcoupon/main/datas.ssg 이벤트 메인
* @apiVersion 1.1.0
* @apiName EventController.getEventMainDatas 
* @apiGroup Event
* @apiPermission none
* @apiDescription 각 몰별 이벤트 & 쿠폰 매장 인덱스 페이지의 이벤트 목록 및 당첨자 발표 링크를 가져오는 API.<br/>
* 기획전 목록이 같이 들어가있는 사이트들은 기획전 api에서 따로 request를 날려 정보를 가져온다.<br/>
* 참고 레드마인 - https://redmine.ssgadm.com/redmine/issues/233001.<br/>
*
* 담당자 : 권태진 파트너, 문한주 파트너, 최새암 파트너
*
* @apiParam {String="6001", "6002", "6003", "6004", "6005", "6009", "6100", "6200", "6300"} siteNo 사이트번호
*
* @apiParamExample {json} Request-Example :
* {
* 	"common" : {
* 		"apl_ver" : "2.1.2",
* 		"os_cd" : "20",
* 		"ts" : "20151203110355",
* 		"mobil_app_no": "1",
* 	},
* 	"params" : {
* 		"siteNo" : "6001",
* 		"apiVersion" : "1.1.0"
* 	}
* }
* 
* @apiExample Example-Usage : 
* curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/eventcoupon/main/datas.ssg -d '
* > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6001", "apiVersion":"1.1.0"}}'
* 
* @apiSuccess {String} cpnBookPageLnkd 쿠폰북 페이지 링크주소
* @apiSuccess {String} myEntryEvntList 이벤트 참여현황 링크주소
* @apiSuccess {List} topbannerList [상단 코너 배너 리스트](#api-header-for-a-submenu-commonconrbanr)
* @apiSuccess {String} winnerPageLnkd 당첨자 리스트 페이지 링크주소
* @apiSuccess {String} birtydayCpnPageLnkd 생일쿠폰 안내 페이지 주소
* @apiSuccess {String} couponGiftPageLnkd 쿠폰선물하기 페이지 주소
* @apiSuccess {Object} downPsblCpn 다운가능 쿠폰영역정보 
* @apiSuccess {String} downPsblCpn.cpnCnt 다운가능 쿠폰개수
* @apiSuccess {String} downPsblCpn.lnkdUrl 쿠폰페이지 링크 주소
* @apiSuccess {Object} usePsblCpn 사용가능 쿠폰영역정보 
* @apiSuccess {String} usePsblCn.cpnCnt 사용가능 쿠폰개수
* @apiSuccess {String} usePsblCpn.lnkdUrl 쿠폰보관함 페이지 링크 주소
* @apiSuccess {Object} mbrgrdCpn 등급쿠폰 영역정보
* @apiSuccess {String} mbrgrdCpn.lnkdUrl 등급쿠폰 링크주소
* @apiSuccess {String} mbrgrdCpn.imgFileNm 등급쿠폰 배너 이미지 파일주소
* @apiSuccess {Object} firstbuyCpn 첫구매 쿠폰영역정보
* @apiSuccess {String} firstbuyCpn.lnkdUrl 첫구매 쿠폰 링크주소
* @apiSuccess {String} firstbuyCpn.imgFileNm 첫구매 쿠폰 배너 이미지 파일주소
* @apiSuccess {List} evntList 진행중인 이벤트 목록 리스트
* @apiSuccess {String} evntList.evntGbn 전시이벤트 그룹 코드(D480)
* @apiSuccess {String} evntList.dispStrtDts 이벤트 시작일 
* @apiSuccess {String} evntList.dispEndDts 이벤트 종료일
* @apiSuccess {String} evntList.subtitlNm1 이벤트 서브제목명1
* @apiSuccess {String} evntList.subtitlNm2 이벤트 서브제목명2
* @apiSuccess {String} evntList.expsrImgUrl 이벤트 이미지 Url
* @apiSuccess {String} evntList.lnkdUrl 이벤트 유형 
* @apiSuccess {String="10","20","25","30","40","50"} evntList.evntType 이벤트 타입 (10 - 통합형, 20 - 구매합산, 25 - 주문사은, 30 - 체험단, 40 - 문화, 50 - 해피찬스)
* @apiSuccess {String} evntList.dispSiteNo 이벤트 몰 구분
* 
* @apiSuccessExample Response-Example : 
* 
* {
*	"cached": false,
*	"method": "",
*	"res_code": "200",
*	"res_message": "성공",
*	"data": {
*	"cpnBookPageLnkd": "http://m.ssg.com/event/couponZone.ssg?dispSiteNo=6001",
*	"myEntryEvntList": "http://m.ssg.com/myssg/activityMng/eventEntryStatusList.ssg",
*	"topbannerList": [
*		{
*			"id": "",
*			"title": "쓱배송(7/10~16)",
*			"desc": "쓱배송(7/10~16)",
*			"lnkdUrl": "http://m.emart.ssg.com/event/eventDetail.ssg?promId=1100236557",
*			"lnkdType": "10",
*			"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201707/2017070718570156343395639339_969.jpg",
*			"strtDts": "20170710000000",
*			"endDts": "20170716235959",
*			"maiTitleNm1": "",
*			"maiTitleNm2": "",
*			"subtitlNm1": "",
*			"subtitlNm2": "",
*			"iconTgtLst": "",
*			"titleShadUseYn": "",
*			"imgWidth": "720",
*			"imgHeight": "452",
*			"dispOrdr": "-12",
*			"bakgrndColrCdVal": "",
*			"iconTgtList": [],
*		}
*	],
*	"winnerPageLnkd": "http://m.emart.ssg.com/event/eventNoticeList.ssg",
*	"downPsblCpn": {
*		"lnkdUrl": "http://m.ssg.com/event/couponZone.ssg?dispSiteNo=6001"
*	},
*	"usePsblCpn": {
*		"lnkdUrl": "http://m.ssg.com/myssg/moneyMng/memberCpnOwnList.ssg"
*	},
*	"mbrgrdCpn": {
*		"lnkdUrl": "http://m.ssg.com/event/couponInfo.ssg"
*	},
*	"eventList": [
*		{
*			"dispEndDts": "20170714235959",
*			"subtitlNm1": "7만원이상 결제 시 7% 청구할인 ",
*			"subtitlNm2": "(일부카드 제외) ",
*			"lnkdUrl": "http://m.emart.ssg.com/event/eventDetail.ssg?promId=1100237389",
*			"expsrImgUrl": "http://static.ssgcdn.com/promo/event/ssg/201707/1100237389_1499405609939.jpg",
*			"dispSiteNo": "6005",
*			"evntType": "10",
*			"dispStrtDts": "20170713000000",
*			"evntNm": "NH채움카드 ",
*			"evntGbn": "20"
*		},
*		{
*			"dispEndDts": "20170725235959",
*			"subtitlNm1": "천사의 피로 악마를 살리다 ",
*			"subtitlNm2": "20명 증정 (1인 2매) ",
*			"lnkdUrl": "http://m.emart.ssg.com/event/eventDetail.ssg?promId=1100232975",
*			"expsrImgUrl": "http://static.ssgcdn.com/promo/event/ssg/201706/1100232975_1498022426976.jpg",
*			"dispSiteNo": "6001",
*			"evntType": "50",
*			"dispStrtDts": "20170711000000",
*			"evntNm": "샌드백 ",
*			"evntGbn": "20"
*		}
*	],
*	"firstbuyCpn": {
*			"lnkdUrl": "http://m.ssg.com/event/firstbuyCpn.ssg",
*			"imgFileNm": "http://static.ssgcdn.com/ui/m_ssg/img/img_first_down.png"
*		},
*	"birtydayCpnPageLnkd": "http://m.ssg.com/event/birthdayCpn.ssg",
*	"couponGiftPageLnkd": "http://m.ssg.com/event/giftCouponEvent.ssg"
*	}
* }
* 
* @apiError PARAM_NOT_EXIST 파라미터 없음 (카테고리가 null값일때)
* @apiError PARAM_NOT_VALID 파라미터 유효성 검사 실패
*/