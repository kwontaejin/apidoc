/**
@api {post} /api/sns/datas.ssg 공유하기URL생성
@apiName SnsController.shareinfo
@apiGroup Sns Share
@apiPermission none

@apiDescription sns공유를 위한 url 생성용 api

담당자 : 권태진

@apiParam {String} title 제목
@apiParam {String} summary 내용
@apiParam {String} url 공유할 원본 URL
@apiParam {String} siteNo 현재 사이트 번호

@apiParamExample {json} Request-Example :
{
   "common":{
      "ts":"20150421101123",
      "mobil_app_no":"51",
      "apl_ver":"2.0.4",
      "os_cd":"20"
   },
   "params":{
      "title":"여기가타이틀이다.",
      "summary":"여기가요약이다.",
      "url":"http://qa-m.ssg.com",
      "siteNo":"6005"
   },
   "ckwhere":"emart_app_iOS"
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/pushApi/info/card.ssg -d '
 {"common":{"ts":"20150421101123","mobil_app_no":"51","apl_ver":"2.0.4","os_cd":"20"},"params":{"title":"여기가타이틀이다.","summary":"여기가요약이다.","url":"http://qa-m.ssg.com","siteNo":"6005"}}'
 

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {String}    data.kakaoTalk 카카오 공유하기 URL
@apiSuccess {String}    data.twitter 트위터 공유하기 URL - <strong> 구버전 앱용. 사용하지 말 것, 2017년 7월이후 업데이트된 앱에서는 사용하지 않음</strong>
@apiSuccess {String}    data.twitterShort 트위터 공유하기 Short URL
@apiSuccess {String}    data.faceBook 페이스북 공유하기 URL
@apiSuccess {String}    data.web 웹공유하기 URL - <strong> 구버전 앱용. 사용하지 말 것, 2017년 7월이후 업데이트된 앱에서는 사용하지 않음</strong>
@apiSuccess {String}    data.webShort 웹공유하기 Short URL
@apiSuccess {String}    data.kakaoStory 카카오스토리 공유하기 URL
@apiSuccess {String}    data.pinterest 핀터레스트 공유하기 URL

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "kakaoTalk": "http://qa-m.ssg.com/snsGateway.ssg?url=http%3A%2F%2Fqa.ssg.li%2F5PQNo&mobilAppSvcNo=10&img=http%3A%2F%2Fstatic.ssgcdn.com%2Fui%2Fcommon%2Fimg%2Fsns%2Fssg.png&title=%EC%97%AC%EA%B8%B0%EA%B0%80%ED%83%80%EC%9D%B4%ED%8B%80%EC%9D%B4%EB%8B%A4.&summary=%EC%97%AC%EA%B8%B0%EA%B0%80%EC%9A%94%EC%95%BD%EC%9D%B4%EB%8B%A4.%EC%9D%84+%EC%B6%94%EC%B2%9C%ED%95%A9%EB%8B%88%EB%8B%A4.%0D%0A%EC%97%AC%EA%B8%B0%EA%B0%80%ED%83%80%EC%9D%B4%ED%8B%80%EC%9D%B4%EB%8B%A4.",
        "twitter": "http://qa-m.ssg.com/snsGateway.ssg?url=http%3A%2F%2Fqa-m.ssg.com%3FgateYn%3DY%26mobilAppSvcNo%3D10%26ckwhere%3Dssg_twit&mobilAppSvcNo=10",
        "faceBook": "http://qa-m.ssg.com/snsGateway.ssg?url=http%253A%252F%252Fqa-m.ssg.com%3Fckwhere%3Dssg_face&mobilAppSvcNo=10&img=http%3A%2F%2Fstatic.ssgcdn.com%2Fui%2Fcommon%2Fimg%2Fsns%2Fssg.png&title=%EC%97%AC%EA%B8%B0%EA%B0%80%ED%83%80%EC%9D%B4%ED%8B%80%EC%9D%B4%EB%8B%A4.&summary=%EC%97%AC%EA%B8%B0%EA%B0%80%EC%9A%94%EC%95%BD%EC%9D%B4%EB%8B%A4.",
        "webShort": "http://qa.ssg.li/DCn4c",
        "web": "http://qa-m.ssg.com/snsGateway.ssg?url=http%3A%2F%2Fqa-m.ssg.com%3Fckwhere%3Dssg_url&mobilAppSvcNo=10",
        "kakaoStory": "http://qa-m.ssg.com/snsGateway.ssg?url=http%3A%2F%2Fqa.ssg.li%2F5PQNp&mobilAppSvcNo=10&img=http%3A%2F%2Fstatic.ssgcdn.com%2Fui%2Fcommon%2Fimg%2Fsns%2Fssg.png&title=%EC%97%AC%EA%B8%B0%EA%B0%80%ED%83%80%EC%9D%B4%ED%8B%80%EC%9D%B4%EB%8B%A4.&summary=%EC%97%AC%EA%B8%B0%EA%B0%80%EC%9A%94%EC%95%BD%EC%9D%B4%EB%8B%A4.",
        "twitterShort": "http://qa.ssg.li/DCn4d",
        "pinterest": "http://qa-m.ssg.com/snsGateway.ssg?url=http%253A%252F%252Fqa-m.ssg.com%3Fckwhere%3Dssg_pinterest&mobilAppSvcNo=10&img=http%3A%2F%2Fstatic.ssgcdn.com%2Fui%2Fcommon%2Fimg%2Fsns%2Fssg.png&title=%EC%97%AC%EA%B8%B0%EA%B0%80%ED%83%80%EC%9D%B4%ED%8B%80%EC%9D%B4%EB%8B%A4.&summary=%EC%97%AC%EA%B8%B0%EA%B0%80%EC%9A%94%EC%95%BD%EC%9D%B4%EB%8B%A4."
    }
}
 */