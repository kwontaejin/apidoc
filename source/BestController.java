/**
 * @apiDefine zoneParameter
 * @apiParam {String="local",dev","qa","stg"} [zone=prod] zone이름
 * 
 * 실제 api동작과 무관하며 sample request를 어느 서버로 전송할지를 결정한다.
 */

/**
 * @api {post} /api/best/emall/datas/item.ssg 이몰베스트
 * @apiVersion 0.0.0
 * @apiName BestController.getMemallBestDispCtgItemDatas
 * @apiGroup BEST
 * @apiPermission none
 *
 * @apiDescription mEmall 베스트 매장용 API
 * 
 * @apiUse zoneParameter
 * @apiParam {String} apiVersion api버전
 * @apiParam {String} categoryZoneType food or life
 * @apiParam {String} dispCtgId 카테고리ID(전체인 경우 ALL)
 *
 * @apiParamExample {json} Request-Example :
 *  {
 *    "common":{
 *       "apl_ver":"2.1.2",
 *       "os_cd":"20",
 *       "ts":"20151203110355",
 *       "mobil_app_no":"1"
 *    },
 *    "params":{
 *       "categoryZoneType":"food",
 *       "dispCtgId":"ALL",
 *       "itemImgSize":"360"
 *    }
 * }
 * @apiExample Example usage:
 *  curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/best/emall/datas/item.ssg -d '
 * > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"categoryZoneType":"food","dispCtgId":"ALL","itemImgSize":"360"}}'
 *
 * @apiSuccess {String}     res_code 응답코드
 * @apiSuccess {String}     res_message 응답메시지
 * @apiSuccess {Object}     data 응답결과값
 * @apiSuccess {List} data.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
 *
 * @apiSuccessExample Response (example):
 *  {
 *   "cached": false,
 *   "method": "",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
 *     "itemList": [
 *       {
 *         "itemId": "0000006821911",
 *         "itemNm": "[국내산] 애호박 (1개)",
 *         "displayPrc": "1140",
 *         "strikeOutPrc": "",
 *         "minOnetOrdPsblQty": "5",
 *         "maxOnetOrdPsblQty": "999999",
 *         "soldOutYn": "N",
 *         "stoppedSellingYn": "N",
 *         "siteNo": "6001",
 *         "siteNm": "emart mall",
 *         "salestrNo": "2449",
 *         "salestrNm": "emart NE.O.002",
 *         "sellpntNm": "",
 *         "brandNm": "E-MART FRESH",
 *         "goItemDetailYn": "N",
 *         "msgWhenGoToItemDetail": "",
 *         "attnTgtIdnfNo1": "0000006821911",
 *         "attnTgtIdnfNo2": "2449",
 *         "attnDivCd": "10",
 *         "needAdultCertification": "false",
 *         "itemLnkd": "http://dev-m.emart.ssg.com/item/itemView.ssg?itemId=0000006821911&siteNo=6001&salestrNo=2449",
 *         "itemImgUrl": "http://dev-item.ssgcdn.com/11/19/82/item/0000006821911_i1_360.jpg",
 *         "planDt": "",
 *         "dataFileNm": "http://dev-c3po.ssgcdn.com/63/01/00/0000000000163_ad1_h.mp4",
 *         "pickuItemYn": "N",
 *         "qshppPsblYn": "N",
 *         "mltSellQty": "1",
 *         "uItemSamePrcYn": "Y",
 *         "itemOrdQty": "",
 *         "itemOrdQtyType": "DEAL",
 *         "tildeDispYn": "N",
 *         "recompPoint": "4.94",
 *         "recomRegCnt": "92684",
 *         "sellUnitPrc": "",
 *         "sellCapaUnitNmWithUnitCapa": "",
 *         "replaceBtnDispYn": "N",
 *         "arrivalNotiBtnDispYn": "N",
 *         "advertAcctId": "",
 *         "advertBidId": "",
 *         "frebieYn": "N",
 *         "zoomImgUrls": [],
 *         "benefitGrp1": [],
 *         "benefitGrp2": [
 *           {
 *             "type": "120",
 *             "txt": "명절GIFT"
 *           }
 *         ],
 *         "benefitGrp3": [],
 *         "benefitGrp4": []
 *       }
 *     ]
 *   }
 * }
 * @apiError UserNotFound   The <code>id</code> of the User was not found.
 */

 /**
 * @api {post} /api/best/emall/datas/item.ssg 이몰베스트
 * @apiVersion 1.0.0
 * @apiName BestController.getMemallBestDispCtgItemDatas
 * @apiGroup BEST
 * @apiPermission none
 *
 * @apiDescription mEmall 베스트 매장용 API
 * 
 * @apiUse zoneParameter
 * @apiParam {String} apiVersion api버전
 * @apiParam {String} categoryZoneType food or life
 * @apiParam {String} dispCtgId 카테고리ID(전체인 경우 ALL)
 * @apiParam {String} [itemImgSize=256] 상품이미지 size
 *
 * @apiParamExample {json} Request-Example :
 *  {
 *    "common":{
 *       "apl_ver":"2.1.2",
 *       "os_cd":"20",
 *       "ts":"20151203110355",
 *       "mobil_app_no":"1"
 *    },
 *    "params":{
 *       "categoryZoneType":"food",
 *       "dispCtgId":"ALL",
 *       "itemImgSize":"360"
 *    }
 * }
 * @apiExample Example usage:
 *  curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/best/emall/datas/item.ssg -d '
 * > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"categoryZoneType":"food","dispCtgId":"ALL","itemImgSize":"360"}}'
 *
 * @apiSuccess {String}     res_code 응답코드
 * @apiSuccess {String}     res_message 응답메시지
 * @apiSuccess {Object}     data 응답결과값
 * @apiSuccess {List} data.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
 * @apiSuccess {String}     rank_update 랭킹변경일자
 *
 * @apiSuccessExample Response (example):
 *  {
 *   "cached": false,
 *   "method": "",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
         "rank_update" : "20170601"
 *     "itemList": [
 *       {
 *         "itemId": "0000006821911",
 *         "itemNm": "[국내산] 애호박 (1개)",
 *         "displayPrc": "1140",
 *         "strikeOutPrc": "",
 *         "minOnetOrdPsblQty": "5",
 *         "maxOnetOrdPsblQty": "999999",
 *         "soldOutYn": "N",
 *         "stoppedSellingYn": "N",
 *         "siteNo": "6001",
 *         "siteNm": "emart mall",
 *         "salestrNo": "2449",
 *         "salestrNm": "emart NE.O.002",
 *         "sellpntNm": "",
 *         "brandNm": "E-MART FRESH",
 *         "goItemDetailYn": "N",
 *         "msgWhenGoToItemDetail": "",
 *         "attnTgtIdnfNo1": "0000006821911",
 *         "attnTgtIdnfNo2": "2449",
 *         "attnDivCd": "10",
 *         "needAdultCertification": "false",
 *         "itemLnkd": "http://dev-m.emart.ssg.com/item/itemView.ssg?itemId=0000006821911&siteNo=6001&salestrNo=2449",
 *         "itemImgUrl": "http://dev-item.ssgcdn.com/11/19/82/item/0000006821911_i1_360.jpg",
 *         "planDt": "",
 *         "dataFileNm": "http://dev-c3po.ssgcdn.com/63/01/00/0000000000163_ad1_h.mp4",
 *         "pickuItemYn": "N",
 *         "qshppPsblYn": "N",
 *         "mltSellQty": "1",
 *         "uItemSamePrcYn": "Y",
 *         "itemOrdQty": "",
 *         "itemOrdQtyType": "DEAL",
 *         "tildeDispYn": "N",
 *         "recompPoint": "4.94",
 *         "recomRegCnt": "92684",
 *         "sellUnitPrc": "",
 *         "sellCapaUnitNmWithUnitCapa": "",
 *         "replaceBtnDispYn": "N",
 *         "arrivalNotiBtnDispYn": "N",
 *         "advertAcctId": "",
 *         "advertBidId": "",
 *         "frebieYn": "N",
 *         "zoomImgUrls": [],
 *         "benefitGrp1": [],
 *         "benefitGrp2": [
 *           {
 *             "type": "120",
 *             "txt": "명절GIFT"
 *           }
 *         ],
 *         "benefitGrp3": [],
 *         "benefitGrp4": []
 *       }
 *     ]
 *   }
 * }
 * @apiError UserNotFound   The <code>id</code> of the User was not found.
 */