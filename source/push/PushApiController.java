/**
@api {post} /pushApi/info/card.ssg 카드행사알림
@apiName PushApiController.cardAction
@apiGroup Push
@apiPermission none

@apiDescription 푸시알림 대상 카드 목록을 조회하거나, 푸시알림 대상 카드 목록을 갱신하기 위한 api

<strong>로그인 필요</strong>

담당자 : 권태진

@apiParam {String="list","add"} type 푸시알림 대상 카드 목록조회시에는 list를, 푸시알림 대상 카드 목록 갱신시에는 add를 사용

@apiParamExample {json} Request-Example :
{
   "common":{
      "ts":"20150202100031",
      "mobil_app_no":"3",
      "apl_ver":"2.0.2",
      "os_cd":"20"
   },
   "params":{
      "type":"list"
   }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/pushApi/info/card.ssg -d '
 {"common":{"ts":"20150202100031","mobil_app_no":"3","apl_ver":"2.0.2","os_cd":"20"},"params":{"type":"list"}}'

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {List}      data.cardList 카드목록
@apiSuccess {String}    data.cardList.crdCd 카드 코드값
@apiSuccess {String}    data.cardList.crdNm 카드명
@apiSuccess {String="Y","N"}    data.cardList.selectedYn 알림대상여부


@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "cardList": [
            {
                "crdCd": "06",
                "crdNm": "삼성카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "02",
                "crdNm": "KB국민카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "01",
                "crdNm": "비씨카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "15",
                "crdNm": "우리카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "07",
                "crdNm": "신한카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "38",
                "crdNm": "롯데카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "17",
                "crdNm": "SC은행카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "16",
                "crdNm": "씨티카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "03",
                "crdNm": "하나카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "11",
                "crdNm": "NH농협카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "08",
                "crdNm": "현대카드",
                "selectedYn": "N"
            },
            {
                "crdCd": "18",
                "crdNm": "IBK기업은행카드",
                "selectedYn": "N"
            }
        ]
    }
}
 */