
/**
 * @api {post} /api/category/bundle/datas.ssg 묶음배송
 * @apiVersion 0.0.0
 * @apiName CategoryCommController.bundle
 * @apiGroup Common Category
 * @apiPermission none
 *
 * @apiDescription 묶음배송 API
 *
 *
 * @apiParam {String} [apiVersion]    api버전
 * @apiParam {String} [splVenId]      업체번호
 * @apiParam {String} siteNo         SITE NO
 * @apiParam {String} itemSiteNo     상품 SITE NO
 * @apiParam {String} shppcstId     상품의출고배송비ID
 * @apiParam {String} grpAddrId     상품의출고배송지의그룹ID
 * @apiParam {String} [brandIds]      브랜드ID
 * @apiParam {String} [dispCtgId]     전시카테고리ID
 * @apiParam {String} [itemImgSize]   아이템이미지사이즈
 * @apiParam {String="best","regdt","cnt","prcdsc","prcasc"} [sort="best"]        정렬코드
 * @apiParam {String} [page]          페이지번호
 * @apiParam {String} [minPrc]        최저 가격
 * @apiParam {String} [maxPrc]        최대 가격
 * @apiParam {String} target        전체(dtl 제외) : mobile_all, 상품 : mobile_item, 상세검색: mobile_dtl
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *       "apl_ver": "2.3.2",
 *       "os_cd": "20",
 *       "ts": "20170307155228",
 *       "mobil_app_no": "12"
 *   },
 *   "params": {
 *          "siteNo":"6004"
 *          ,"shppcstId":"0000017098"
 *          ,"splVenId":"0000006284"
 *          ,"grpAddrId" : "DIRECT6004"
 *    }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/category/bundle/datas.ssg -d '
 * > {"common":{"apl_ver":"2.4.4","os_cd":"20","ts":"20171110102010","mobil_app_no":"12"},"params":{"siteNo":"6004","shppcstId":"0000017098","splVenId":"0000006284"}}
 *
 * @apiSuccess {String}     res_code 응답코드
 * @apiSuccess {String}     res_message 응답메시지
 * @apiSuccess {Object}     data 응답결과값
 * @apiSuccess {List} data.item
 * @apiSuccess {String} data.item.itemCount						카테고리 상품수
 * @apiSuccess {String} data.item.hasNext						페이지더보기유무
 * @apiSuccess {List} data.item.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
 * @apiSuccess {List} data.total
 * @apiSuccess {List} data.total.sortFilterList 			    정렬리스트
 * @apiSuccess {List} data.siblingCtgList 						동일레벨 카테고리 리스트
 * @apiSuccess {List} data.priorCtgInfo 						부모 카테고리 정보
 * @apiSuccess {List} data.dispCtgList	 						카테고리리스트
 * @apiSuccess {Object} data.bundleInfo                         묶음 배송 정보
 * @apiSuccess {String} data.bundleInfo.venId				    업체ID
 * @apiSuccess {String} data.bundleInfo.venNm				    업체명
 * @apiSuccess {String} data.bundleInfo.shppcstStrtCritnAmt		배송비 면제 금액
 * @apiSuccess {String} data.siteNo								사이트번호
 * @apiSuccess {String} data.defaultViewType					기본 뷰 타입
 * @apiSuccess {String} data.defaultCd							기본정렬값
 * @apiSuccess {String} data.dispCtgLvl							카테고리 뎁스
 * @apiSuccess {List} data.itemDtl
 * @apiSuccess {List} data.itemDtl.brandFilterList 			   	브랜드리스트
 * @apiSuccess {List} data.itemDtl.sortFilterList               정렬리스트
 * @apiSuccess {List} data.itemDtl.minPrc                       최저 가격
 * @apiSuccess {List} data.itemDtl.maxPrc                       최대 가격
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "bundleInfo": {
 *             "shppcstId": null,
 *             "grpAddrId": null,
 *             "venId": null,
 *             "venNm": "신세계몰 추천",
 *             "shppcstStrtCritnAmt": "20000"
 *         },
 *         "item": {
 *             "hasNext": "true",
 *             "itemList": [
 *                 {
 *                     "itemId": "1000010797377",
 *                     "itemNm": "[106893]독서대(에이스더블/그랜드/A500)",
 *                     "displayPrc": "18300",
 *                     "strikeOutPrc": "",
 *                     "minOnetOrdPsblQty": "1",
 *                     "maxOnetOrdPsblQty": "100",
 *                     "soldOutYn": "N",
 *                     "stoppedSellingYn": "N",
 *                     "siteNo": "6004",
 *                     "siteNm": "shinsegae mall",
 *                     "salestrNo": "6005",
 *                     "salestrNm": "",
 *                     "sellpntNm": "",
 *                     "brandNm": "오피스디포",
 *                     "goItemDetailYn": "N",
 *                     "msgWhenGoToItemDetail": "",
 *                     "attnTgtIdnfNo1": "1000010797377",
 *                     "attnTgtIdnfNo2": "6005",
 *                     "attnDivCd": "10",
 *                     "needAdultCertification": "false",
 *                     "itemLnkd": "http://dev-m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000010797377&siteNo=6004&salestrNo=6005",
 *                     "itemImgUrl": "http://dev-item.ssgcdn.com/77/73/79/item/1000010797377_i1_360.jpg",
 *                     "itemImgUrlList": [
 *                         "http://dev-item.ssgcdn.com/77/73/79/item/1000010797377_i1_360.jpg"
 *                     ],
 *                     "planDt": "",
 *                     "dataFileNm": "",
 *                     "pickuItemYn": "N",
 *                     "qshppPsblYn": "N",
 *                     "mltSellQty": "1",
 *                     "uItemSamePrcYn": "Y",
 *                     "itemOrdQty": "",
 *                     "itemOrdQtyType": "DEAL",
 *                     "tildeDispYn": "N",
 *                     "recompPoint": "5",
 *                     "recomRegCnt": "8",
 *                     "sellUnitPrc": "",
 *                     "sellCapaUnitNmWithUnitCapa": "",
 *                     "replaceBtnDispYn": "N",
 *                     "arrivalNotiBtnDispYn": "N",
 *                     "advertAcctId": "",
 *                     "advertBidId": "",
 *                     "advertBilngTypeCd": "",
 *                     "advertKindCd": "",
 *                     "cartPsblType": "",
 *                     "zoomImgUrls": [],
 *                     "benefitGrp1": [],
 *                     "benefitGrp2": [],
 *                     "benefitGrp3": [],
 *                     "benefitGrp4": [],
 *                     "itemTagNmList": []
 *                 },
 *                 {
 *                     "itemId": "1000010856842",
 *                     "itemNm": "[100391]단색크레파스(빨강/12본)",
 *                     "displayPrc": "700",
 *                     "strikeOutPrc": "",
 *                     "minOnetOrdPsblQty": "1",
 *                     "maxOnetOrdPsblQty": "100",
 *                     "soldOutYn": "N",
 *                     "stoppedSellingYn": "N",
 *                     "siteNo": "6004",
 *                     "siteNm": "shinsegae mall",
 *                     "salestrNo": "6005",
 *                     "salestrNm": "",
 *                     "sellpntNm": "",
 *                     "brandNm": "오피스디포",
 *                     "goItemDetailYn": "N",
 *                     "msgWhenGoToItemDetail": "",
 *                     "attnTgtIdnfNo1": "1000010856842",
 *                     "attnTgtIdnfNo2": "6005",
 *                     "attnDivCd": "10",
 *                     "needAdultCertification": "false",
 *                     "itemLnkd": "http://dev-m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000010856842&siteNo=6004&salestrNo=6005",
 *                     "itemImgUrl": "http://dev-item.ssgcdn.com/42/68/85/item/1000010856842_i1_360.jpg",
 *                     "itemImgUrlList": [
 *                         "http://dev-item.ssgcdn.com/42/68/85/item/1000010856842_i1_360.jpg"
 *                     ],
 *                     "planDt": "",
 *                     "dataFileNm": "",
 *                     "pickuItemYn": "N",
 *                     "qshppPsblYn": "N",
 *                     "mltSellQty": "1",
 *                     "uItemSamePrcYn": "Y",
 *                     "itemOrdQty": "",
 *                     "itemOrdQtyType": "DEAL",
 *                     "tildeDispYn": "N",
 *                     "recompPoint": "5",
 *                     "recomRegCnt": "1",
 *                     "sellUnitPrc": "",
 *                     "sellCapaUnitNmWithUnitCapa": "",
 *                     "replaceBtnDispYn": "N",
 *                     "arrivalNotiBtnDispYn": "N",
 *                     "advertAcctId": "",
 *                     "advertBidId": "",
 *                     "advertBilngTypeCd": "",
 *                     "advertKindCd": "",
 *                     "cartPsblType": "",
 *                     "zoomImgUrls": [],
 *                     "benefitGrp1": [],
 *                     "benefitGrp2": [],
 *                     "benefitGrp3": [],
 *                     "benefitGrp4": [],
 *                     "itemTagNmList": []
 *                 }
 *             ],
 *             "itemCount": "6101"
 *         },
 *         "dispCtgList": [
 *             {
 *                 "level": "1",
 *                 "dispCtgId": "3500000069",
 *                 "dispCtgNm": "문구/사무/팬시",
 *                 "selected": "false"
 *             },
 *             {
 *                 "level": "2",
 *                 "dispCtgId": "3500000074",
 *                 "dispCtgNm": "문구용품",
 *                 "selected": "false"
 *             },
 *             {
 *                 "level": "2",
 *                 "dispCtgId": "3500000107",
 *                 "dispCtgNm": "사무용품",
 *                 "selected": "false"
 *             }
 *         ]
 *     }
 * }
 */