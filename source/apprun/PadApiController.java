/**
@api {post} /api/pad/launch/datas/info1.ssg 패드앱-info1
@apiName PadApiController.getLaunchInfo1
@apiGroup App Run
@apiPermission none

@apiDescription 패드앱 메뉴 정보 조회 API

<strong>pad앱인 경우에는 lnkdUrl이 절대경로이며 pad앱이 아닌 경우에는 상대경로이다.</strong>

담당자 : 권태진

@apiParamExample {json} Request-Example :
{
   "common":{
      "ts":"20150511194501",
      "mobil_app_no":"2",
      "apl_ver":"1.0.5",
      "os_cd":"20"
   },
   "params":{
      "ckwhere":"app_31"
   }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/api/pad/launch/datas/info1.ssg -d '
 {"common":{"ts":"20150511194501","mobil_app_no":"2","apl_ver":"1.0.5","os_cd":"20"},"params":{"ckwhere":"app_31"}}'

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {List}      data.6001 이마트 메뉴정보
@apiSuccess {String}    data.6001.title 메뉴명
@apiSuccess {String}    data.6001.lnkdUrl 메뉴URL
@apiSuccess {String}    data.6001.type 미사용
@apiSuccess {List}      data.6004 신세계몰 메뉴정보
@apiSuccess {String}    data.6004.title 메뉴명
@apiSuccess {String}    data.6004.lnkdUrl 메뉴URL
@apiSuccess {String}    data.6004.type 미사용
@apiSuccess {List}      data.6005 SSG몰 메뉴정보
@apiSuccess {String}    data.6005.title 메뉴명
@apiSuccess {String}    data.6005.lnkdUrl 메뉴URL
@apiSuccess {String}    data.6005.type 미사용
@apiSuccess {List}      data.6009 백화점몰 메뉴정보
@apiSuccess {String}    data.6009.title 메뉴명
@apiSuccess {String}    data.6009.lnkdUrl 메뉴URL
@apiSuccess {String}    data.6009.type 미사용

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "6001": [
            {
                "title": "오반장",
                "lnkdUrl": "http://m.emart.ssg.com/main.ssg",
                "type": ""
            },
            {
                "title": "추석 사전예약",
                "lnkdUrl": "http://m.emart.ssg.com/variable/variableContent.ssg?dispCtgId=6000016267",
                "type": ""
            },
            {
                "title": "이.얼.싼",
                "lnkdUrl": "http://m.emart.ssg.com/variable/variableContent.ssg?dispCtgId=6000006274",
                "type": ""
            },
            {
                "title": "e요리이벤트",
                "lnkdUrl": "http://m.emart.ssg.com/variable/variableContent.ssg?dispCtgId=6000006275",
                "type": ""
            },
            {
                "title": "전단광고",
                "lnkdUrl": "http://m.emart.ssg.com/variable/variableContent.ssg?dispCtgId=6000006276",
                "type": ""
            },
            {
                "title": "파격가/하나더",
                "lnkdUrl": "http://m.emart.ssg.com/variable/variableContent.ssg?dispCtgId=6000016266",
                "type": ""
            },
            {
                "title": "노브랜드",
                "lnkdUrl": "http://m.emart.ssg.com/variable/variableContent.ssg?dispCtgId=6000038940",
                "type": ""
            },
            {
                "title": "행사중",
                "lnkdUrl": "http://m.emart.ssg.com/sale/saleMain.ssg",
                "type": ""
            },
            {
                "title": "베스트",
                "lnkdUrl": "http://m.emart.ssg.com/best/bestMain.ssg",
                "type": ""
            },
            {
                "title": "생활의발명",
                "lnkdUrl": "http://m.emart.ssg.com/plan/inventMain.ssg",
                "type": ""
            },
            {
                "title": "기획전",
                "lnkdUrl": "http://m.emart.ssg.com/planshop/planShopBest.ssg",
                "type": ""
            },
            {
                "title": "공식스토어",
                "lnkdUrl": "http://m.emart.ssg.com/special/index.ssg",
                "type": ""
            },
            {
                "title": "이벤트&쿠폰",
                "lnkdUrl": "http://m.emart.ssg.com/event/eventMain.ssg",
                "type": ""
            },
            {
                "title": "늘사던거",
                "lnkdUrl": "http://m.emart.ssg.com/express/expressMain.ssg",
                "type": ""
            },
            {
                "title": "오늘은 e-요리",
                "lnkdUrl": "http://m.emart.ssg.com/recipe/trecipeMain.ssg",
                "type": ""
            }
        ],
        "6004": [
            {
                "title": "홈",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/mall/main.ssg",
                "type": ""
            },
            {
                "title": "해피바이러스",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/service/happybuyrus.ssg",
                "type": ""
            },
            {
                "title": "추석사전매장",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/variable/variableContent.ssg?ctgId=6000006261",
                "type": ""
            },
            {
                "title": "베스트100",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/mall/best/bestShop.ssg",
                "type": ""
            },
            {
                "title": "기획전",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/cu/shoppingPlanShopShmall.ssg",
                "type": ""
            },
            {
                "title": "SHOP@",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/mall/shopat/shopatMain.ssg",
                "type": ""
            },
            {
                "title": "디자이너#",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/contents/lifeMagazineMain.ssg",
                "type": ""
            },
            {
                "title": "이벤트&쿠폰",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/event/eventMain.ssg",
                "type": ""
            },
            {
                "title": "공식스토어",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/special/index.ssg",
                "type": ""
            }
        ],
        "6005": [
            {
                "title": "쓱",
                "lnkdUrl": "http://m.ssg.com/main.ssg",
                "type": ""
            },
            {
                "title": "오반장",
                "lnkdUrl": "http://m.ssg.com/service/obanjang.ssg",
                "type": ""
            },
            {
                "title": "해피바이러스",
                "lnkdUrl": "http://m.ssg.com/service/happybuyrus.ssg",
                "type": ""
            },
            {
                "title": "쓱력",
                "lnkdUrl": "http://m.ssg.com/variable/variableContent.ssg?ctgId=6000006255",
                "type": ""
            },
            {
                "title": "클립할인",
                "lnkdUrl": "http://m.ssg.com/service/clipsale.ssg",
                "type": ""
            },
            {
                "title": "장보기",
                "lnkdUrl": "http://m.ssg.com/service/market.ssg",
                "type": ""
            },
            {
                "title": "오늘은 e-요리",
                "lnkdUrl": "http://m.ssg.com/recipe/trecipeMain.ssg",
                "type": ""
            },
            {
                "title": "매거진",
                "lnkdUrl": "http://m.ssg.com/contents/lifeMagazineMain.ssg",
                "type": ""
            },
            {
                "title": "SHOP@",
                "lnkdUrl": "http://m.ssg.com/shopat/shopatMain.ssg",
                "type": ""
            },
            {
                "title": "이벤트&쿠폰",
                "lnkdUrl": "http://m.ssg.com/event/eventMain.ssg",
                "type": ""
            },
            {
                "title": "공식스토어",
                "lnkdUrl": "http://m.ssg.com/special/index.ssg",
                "type": ""
            }
        ],
        "6009": [
            {
                "title": "홈",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/main.ssg",
                "type": ""
            },
            {
                "title": "베스트100",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/best/bestShop.ssg",
                "type": ""
            },
            {
                "title": "기획전",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/cu/shoppingPlanShopShdept.ssg",
                "type": ""
            },
            {
                "title": "공식스토어",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/special/index.ssg",
                "type": ""
            },
            {
                "title": "SHOP@",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/shopat/shopatMain.ssg",
                "type": ""
            },
            {
                "title": "브랜드",
                "lnkdUrl": "http://m.shinsegaemall.ssg.com/disp/brandShop.ssg",
                "type": ""
            }
        ]
    }
}
 */