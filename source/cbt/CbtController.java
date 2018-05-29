/**
*	@api {post} /api/cbtApi/registCbtMobilApp.ssg CBT 설문조사
*	@apiVersion 1.0.0
*	@apiName CbtController.registCbtMobilApp
*	@apiGroup Cbt
*	@apiPermission none
* 
* 	@apiDescription CBT 설문조사
*
* 	@apiParam {String} mobilAppNo 앱고유번호 10자리 이내 숫자
* 	@apiParam {String} mobilAppNm 앱이름
* 	@apiParam {String="1:이마트몰", "2:신세계몰 B2C", "3:SSG", "5:신세계몰 중문", "6:신세계몰 SFC", "7:가상스토어", "8:트레이더스", "9:모바일 백오피스", "10:샤벳", "11:분스", "12:부츠", "13:MPDO"} mobilAppSvcNo 앱서비스번호. 
* 	@apiParam {String="10:안드로이드", "20:iOS"} osCd OS코드
* 	@apiParam {String} regpeId 등록자ID ("APP_CBT"로 넣어줘야만 등록이 가능합니다. 그렇지 않을 시 error:900 출력)
* 
* 	@apiParamExample {json} Request-Example :
* 	{
*    	"common": {
*        	"apl_ver": "2.1.2",
*        	"os_cd": "10",
*        	"ts": "20151203110355",
*        	"mobil_app_no": "1"
*    	},
*    	"params": {
*        	"mobilAppNo":"0000000007",
*	 		"mobilAppNm":"카테고리 개편",
*			"mobilAppSvcNo" : "3",
*			"osCd" : "20",
*			"regpeId" : "APP_CBT"
*    	}
*	}
*
*	@apiExample Example usage:
*	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/cbtApi/registCbtMobilApp.ssg -d '
*	> {"common": {"apl_ver": "2.1.2","os_cd": "10","ts": "20151203110355","mobil_app_no": "1"},"params": {"mobilAppNo":"000007","mobilAppNm":"카테고리 개편","mobilAppSvcNo" : 3,"osCd" : "20","regpeId" : "180891","regDts" : "SYSDATE","modpeId" : "180891","modDts" : "SYSDATE"}}
*	
*	@apiSuccess {String}	res_code 처리 코드
*	@apiSuccess {String}	res_message 처리 메시지
*
*	@apiSuccessExample Response (example):
*	{
*		"cached": false,
*		"method": "",
*		"res_code": "200",
*		"res_message": "성공",
*		"data": {
*					
*				}
*	}
*
*	@apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
*	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패.
*	@apiError FAIL_ACCESS_DENY 900 / 권한이 없습니다.
*/
