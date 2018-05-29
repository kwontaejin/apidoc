/**
@api {post} /appApi/pickup/salestr.ssg 매직픽업점포목록
@apiName AppApiController.getPickupPsblSalestr
@apiGroup INFO API
@apiPermission none

@apiDescription 매직픽업 가능한 점포목록을 조회한다.

담당자 : 권태진

@apiParam {String} itemId 상품ID

@apiParamExample {json} Request-Example :
{
   "common":{
      "ts":"20150408215242",
      "mobil_app_no":"1",
      "apl_ver":"2.0.4",
      "os_cd":"20"
   },
   "params":{
      "itemId":"1000011625561"
   }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/appApi/pickup/salestr.ssg -d '
 {"common":{"ts":"20150408215242","mobil_app_no":"1","apl_ver":"2.0.4","os_cd":"20"},"params":{"itemId":"1000011625561"}}'

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {List}      data.saleStrList 매직픽업 가능 점포 목록
@apiSuccess {String}    data.saleStrList.salestrNm 점포명

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "saleStrList": [
            {
                "salestrNm": "본점"
            },
            {
                "salestrNm": "인천점"
            },
            {
                "salestrNm": "의정부점"
            },
            {
                "salestrNm": "센텀시티점"
            },
            {
                "salestrNm": "영등포점A"
            },
            {
                "salestrNm": "김해점"
            }
        ]
    }
}
*/


/**
@api {post} /appApi/datas/originurl.ssg 원본 url 조회
@apiName AppApiController.getOriginUrl
@apiGroup INFO API
@apiPermission none

@apiDescription 입력받은 url을 type에 따라 원본 url로 return한다.

담당자 : 권태진

@apiParam {String} [type=short] 입력받는 url의 type
@apiParam {String} url 변환대상 url

@apiParamExample {json} Request-Example :
{
   "common":{
      "ts":"20150408215242",
      "mobil_app_no":"1",
      "apl_ver":"2.0.4",
      "os_cd":"20"
   },
   "params":{
      "type":"short",
      "url":"http://ssg.li/Cv0BU"
   }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/appApi/datas/originurl.ssg -d '
 {"common":{"ts":"20150408215242","mobil_app_no":"1","apl_ver":"2.0.4","os_cd":"20"},"params":{"type":"short","url":"http://ssg.li/Cv0BU"}}'

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {String}    data.url 원본URL

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "url": "http://m.emart.ssg.com/snsGateway.ssg?url=http%3A%2F%2Fm.emart.ssg.com%2Fevent%2FeventDetail.ssg%3FpromId%3D1100236557&img=http%3A%2F%2Fstatic.ssgcdn.com%2Fpromo%2Fevent%2Fssg%2F201707%2F1100236557_1499419326458.jpg&title=%EC%97%AC%EB%A6%84%EC%97%94_%EC%93%B1%EB%B0%B0%EC%86%A1%202%ED%83%84(1)&summary=%5B%EC%9D%B4%EB%A7%88%ED%8A%B8%EB%AA%B0%5D&ckwhere=mobile_emart_url"
    }
}
*/


/**
@api {post} /appApi/scan/datas/item.ssg 바코드스캔
@apiName AppApiController.scanDatas
@apiGroup INFO API
@apiPermission none

@apiDescription 바코드를 입력받아 매핑되는 상품정보를 return한다.

담당자 : 권태진

@apiParam {String} [itemImgSize=290] 상품이미지 size
@apiParam {String="barcode","itemid"} [type=itemid] 조회유형
@apiParam {String} [barcode] 바코드값, type이 barcode인 경우에는 필수
@apiParam {String} [itemIds] 상품ID 목록, type이 itemid인 경우에는 필수. 복수개가 올 수 있으며 복수개가 올 경우 구분자는 ","이다. 

@apiParamExample {json} Request-Example :
{
   "common":{
      "ts":"20150408215242",
      "mobil_app_no":"1",
      "apl_ver":"2.0.4",
      "os_cd":"20"
   },
   "params":{
      "type":"barcode",
      "barcode":"8801037054248"
   },
   "ckwhere":"emart_app_iOS"
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/appApi/scan/datas/item.ssg -d '
 {"common":{"ts":"20150408215242","mobil_app_no":"1","apl_ver":"2.0.4","os_cd":"20"},"params":{"type":"barcode","barcode":"8801037054248"}}'

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {List}      data.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "scanDatas",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "itemList": [
            {
                "itemId": "0000008956719",
                "itemNm": "[맥심] 모카믹스 365입",
                "displayPrc": "36280",
                "strikeOutPrc": "",
                "minOnetOrdPsblQty": "1",
                "maxOnetOrdPsblQty": "20",
                "soldOutYn": "N",
                "stoppedSellingYn": "N",
                "siteNo": "6002",
                "siteNm": "traders",
                "salestrNo": "2154",
                "salestrNm": "",
                "sellpntNm": "",
                "brandNm": "",
                "goItemDetailYn": "N",
                "msgWhenGoToItemDetail": "",
                "attnTgtIdnfNo1": "0000008956719",
                "attnTgtIdnfNo2": "2154",
                "attnDivCd": "10",
                "needAdultCertification": "false",
                "itemLnkd": "http://qa-m.emart.ssg.com/item/itemView.ssg?itemId=0000008956719&siteNo=6002&salestrNo=2154",
                "itemImgUrl": "http://qa-item.ssgcdn.com/19/67/95/item/0000008956719_i1_290.jpg",
                "planDt": "",
                "dataFileNm": "",
                "pickuItemYn": "N",
                "qshppPsblYn": "N",
                "mltSellQty": "1",
                "uItemSamePrcYn": "Y",
                "itemOrdQty": "",
                "itemOrdQtyType": "DEAL",
                "tildeDispYn": "N",
                "recompPoint": "4.96",
                "recomRegCnt": "2887",
                "sellUnitPrc": "83",
                "sellCapaUnitNmWithUnitCapa": "10g",
                "replaceBtnDispYn": "N",
                "arrivalNotiBtnDispYn": "N",
                "advertAcctId": "",
                "advertBidId": "",
                "cartPsblType": "",
                "zoomImgUrls": [],
                "benefitGrp1": [],
                "benefitGrp2": [],
                "benefitGrp3": [],
                "benefitGrp4": []
            }
        ]
    }
}
*/