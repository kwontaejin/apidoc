/**
 
@api {post} /api/bshop/hotsale/datas/brand.ssg  샤벳 > 핫세일 리스트 조회
@apiVersion 1.0.0
@apiName ShopTalkController.getHotSaleBshopSaleList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
핫세일리스트 API

@apiParam {String} apiVersion api버전
@apiParam {String} page 페이지번호
@apiParam {String} pageSize 페이지사이즈

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"2.3.2",
        "os_cd":"20",
        "ts":"20161101141508",
        "mobil_app_no":"55"
    },
    "params":{
        "apiVersion":"2.0",
        "page":"1",
        "pageSize":"20",
    }
}

@apiExample Example usage:
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/hotsale/datas/brand.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","page":"1","pageSize":"20"}}

@apiSuccess {String}	res_code 응답코드
@apiSuccess {String}	res_message 응답메시지
@apiSuccess {Object}	data 응답결과값
@apiSuccess {List}		data.bshopList 세일 브랜드 리스트
@apiSuccess {Object}	data.bshopList.offerInfo 세일정보
@apiSuccess {Object}	data.bshopList.offerInfo.offerType 오퍼타입       [50:세일 60:쿠폰]
@apiSuccess {Object}	data.bshopList.offerInfo.offerBn 오퍼명
@apiSuccess {Object}	data.bshopList.offerInfo.dispOrdr 오퍼우선순위
@apiSuccess {Object}	data.bshopList.offerInfo.dispStrtDts 오퍼전시시작일
@apiSuccess {Object}	data.bshopList.offerInfo.dispEndDts 오퍼전시종료일

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========