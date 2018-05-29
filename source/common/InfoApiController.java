/**

@api {post} /appApi/mbrProgOrdCnt.ssg 진행주문 수
@apiVersion 1.0.0
@apiName InfoApiController.mbrProgOrdCnt
@apiGroup INFO API
@apiSampleRequest off
@apiPermission none

@apiDescription
회원 진행중인 주문 수 조회
<br>캐시 : 5분
<br><br>담당자 : 개발1팀 박정환P → 권태진P

@apiParam {String="Y","N"} [cacheResetYn="N"] 캐시 초기화 Y/N

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
        "cacheResetYn": "N"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.mbrProgOrdCnt="0" 진행주문 수

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "mbrProgOrdCnt",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "mbrProgOrdCnt": "0"
    }
}

*/



/**

@api {post} /appApi/mbrRsvtShppInfo.ssg 예약배송 정보 조회
@apiVersion 1.0.0
@apiName InfoApiController.mbrRsvtShppInfo
@apiGroup INFO API
@apiSampleRequest off
@apiPermission none

@apiDescription
예약배송 정보 조회
<br>캐시 : 1분
<br><br>담당자 : 개발1팀 박정환P

@apiParam {String="6001","6002"} siteNo 사이트번호

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
        "siteNo": "6001"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String = "Y", "N"} data.psblYn 가능여부 (N일 경우 예약배송 불가)
@apiSuccess {String} data.siteNm 사이트명
@apiSuccess {String} data.salestrNm 영업점명
@apiSuccess {String} data.headMsg 머릿말 메시지
@apiSuccess {String} data.dateMsg 날짜 메시지
@apiSuccess {String} data.timeMsg 시간 메시지
@apiSuccess {String} data.deliMsg 배송 메시지

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "rsvtShppInfo",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "timeMsg": "14:00부터",
        "psblYn": "Y",
        "headMsg": "지금 주문하면",
        "salestrNm": "성수점",
        "dateMsg": "오늘",
        "siteNm": "이마트",
        "deliMsg": "쓱배송"
    }
}

*/
