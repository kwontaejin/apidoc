/**
 * @api {post} /api/trend/wordtrend/datas.ssg 트랜드조회
 * @apiVersion 0.0.0
 * @apiName TrendController.getWordTrendDatas
 * @apiGroup Common Trend
 * @apiPermission none
 *
 * @apiDescription 트랜드매장 API
 *
 * 
 * @apiParam {String} [siteNo]    		요청 사이트번호
 * @apiParam {String} [itemImgSize]     이미지사이즈
 * @apiParam {String} [apiVersion]   	api버젼
 *
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *       "apl_ver": "2.4.0",
 *       "os_cd": "20",
 *       "ts": "20170808151332",
 *       "mobil_app_no": "12"
 *   },
 *   "params": {
 *       "siteNo": "6005",
 *       "itemImgSize" : "500",
 *		 "apiVersion" : "1.0"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/trend/wordtrend/datas.ssg -d '
 * > 
{"common":{"apl_ver":"2.2.4","os_cd":"20","ts":"20160907172520","mobil_app_no":"1"},"params":{"siteNo":"6005","itemImgSize":"360", "apiVersion":"1.0"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {Array} data.trendList.titleNm 	타이틀명
 * @apiSuccess {String} data.trendList.score	스코어
 * @apiSuccess {List} data.trendList.itemList	상품검색결과 리스트
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "trendList": [
 *             {
 *                 "titleNm": [
 *                     "#나스립스틱"
 *                 ],
 *                 "itemList": [
 *                     {
 *                         "itemId": "1000012122440",
 *                         "itemNm": " 여름에도션해 남방",
 *                         "displayPrc": "25000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "9999",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6004",
 *                         "siteNm": "shinsegae mall",
 *                         "salestrNo": "6005",
 *                         "salestrNm": "S.COM몰",
 *                         "sellpntNm": "",
 *                         "brandNm": "화이트폭스",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000012122440",
 *                         "attnTgtIdnfNo2": "6005",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000012122440&siteNo=6004&salestrNo=6005",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/40/24/12/item/1000012122440_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/40/24/12/item/1000012122440_i1_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "",
 *                         "recomRegCnt": "",
 *                         "sellUnitPrc": "",
 *                         "sellCapaUnitNmWithUnitCapa": "",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     }
 *                 ],
 *                 "score": "3456"
 *             },
 *             {
 *                 "titleNm": [
 *                     "#나스쿠션",
 *                     "#이효리쿠션"
 *                 ],
 *                 "itemList": [
 *                     {
 *                         "itemId": "1000005047522",
 *                         "itemNm": "컨투어 블러쉬",
 *                         "displayPrc": "74000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "3",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "나스",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000005047522",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000005047522&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/22/75/04/item/1000005047522_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/22/75/04/item/1000005047522_i1_360.jpg",
 *                             "http://dev-item.ssgcdn.com/22/75/04/item/1000005047522_i2_360.jpg",
 *                             "http://dev-item.ssgcdn.com/22/75/04/item/1000005047522_i3_360.jpg",
 *                             "http://dev-item.ssgcdn.com/22/75/04/item/1000005047522_i4_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "5",
 *                         "recomRegCnt": "6",
 *                         "sellUnitPrc": "74000",
 *                         "sellCapaUnitNmWithUnitCapa": "1개",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     },
 *                     {
 *                         "itemId": "1000007583261",
 *                         "itemNm": "스킨 리스토레티브 나이트 트리트먼트",
 *                         "displayPrc": "128000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "1000",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "나스",
 *                         "goItemDetailYn": "N",
 *                         "msgWhenGoToItemDetail": "",
 *                         "attnTgtIdnfNo1": "1000007583261",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000007583261&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/61/32/58/item/1000007583261_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/61/32/58/item/1000007583261_i1_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "5",
 *                         "recomRegCnt": "1",
 *                         "sellUnitPrc": "128000",
 *                         "sellCapaUnitNmWithUnitCapa": "1개",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     },
 *                     {
 *                         "itemId": "1000009636799",
 *                         "itemNm": "올 데이 루미너스 파우더 파운데이션 SPF25/PA+++",
 *                         "displayPrc": "70000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "10",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "나스",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000009636799",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000009636799&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i1_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i2_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i3_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i4_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i5_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i6_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i7_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i8_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i9_360.jpg",
 *                             "http://dev-item.ssgcdn.com/99/67/63/item/1000009636799_i10_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.67",
 *                         "recomRegCnt": "9",
 *                         "sellUnitPrc": "70000",
 *                         "sellCapaUnitNmWithUnitCapa": "1개",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     }
 *                 ],
 *                 "score": "1234"
 *             },
 *             {
 *                 "titleNm": [
 *                     "#따뚜아쥬꾸뛰르",
 *                     "#입생로랑"
 *                 ],
 *                 "itemList": [
 *                     {
 *                         "itemId": "1000004669162",
 *                         "itemNm": "포에버 라이트 크리에이터 컴팩트",
 *                         "displayPrc": "79000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "3",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "YSL",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000004669162",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000004669162&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/62/91/66/item/1000004669162_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/62/91/66/item/1000004669162_i1_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.76",
 *                         "recomRegCnt": "41",
 *                         "sellUnitPrc": "",
 *                         "sellCapaUnitNmWithUnitCapa": "",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     },
 *                     {
 *                         "itemId": "1000011195809",
 *                         "itemNm": "베르니 아 레브르 팝 워터 (박수진 워터 틴트)",
 *                         "displayPrc": "41000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "3",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "YSL",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000011195809",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000011195809&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/09/58/19/item/1000011195809_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/09/58/19/item/1000011195809_i1_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.9",
 *                         "recomRegCnt": "473",
 *                         "sellUnitPrc": "",
 *                         "sellCapaUnitNmWithUnitCapa": "",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     },
 *                     {
 *                         "itemId": "1000009937618",
 *                         "itemNm": "볼립떼 틴트-인-오일",
 *                         "displayPrc": "43000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "3",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "YSL",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000009937618",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000009937618&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/18/76/93/item/1000009937618_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/18/76/93/item/1000009937618_i1_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.94",
 *                         "recomRegCnt": "393",
 *                         "sellUnitPrc": "",
 *                         "sellCapaUnitNmWithUnitCapa": "",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     }
 *                 ],
 *                 "score": "300"
 *             },
 *             {
 *                 "titleNm": [
 *                     "#잉크더포근벨벳"
 *                 ],
 *                 "itemList": [
 *                     {
 *                         "itemId": "1000012554444",
 *                         "itemNm": "[수입사직배송]루즈 에디션 벨벳",
 *                         "displayPrc": "28000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "20",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6004",
 *                         "siteNm": "shinsegae mall",
 *                         "salestrNo": "6005",
 *                         "salestrNm": "S.COM몰",
 *                         "sellpntNm": "",
 *                         "brandNm": "부르조아",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000012554444",
 *                         "attnTgtIdnfNo2": "6005",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000012554444&siteNo=6004&salestrNo=6005",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/44/44/55/item/1000012554444_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/44/44/55/item/1000012554444_i1_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.92",
 *                         "recomRegCnt": "113",
 *                         "sellUnitPrc": "",
 *                         "sellCapaUnitNmWithUnitCapa": "",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     },
 *                     {
 *                         "itemId": "1000011534225",
 *                         "itemNm": "[롯데] 팜온더로드 레드벨벳 150g",
 *                         "displayPrc": "3200",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "999999",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6001",
 *                         "siteNm": "emart mall",
 *                         "salestrNo": "2034",
 *                         "salestrNm": "성수점",
 *                         "sellpntNm": "",
 *                         "brandNm": "",
 *                         "goItemDetailYn": "N",
 *                         "msgWhenGoToItemDetail": "",
 *                         "attnTgtIdnfNo1": "1000011534225",
 *                         "attnTgtIdnfNo2": "2034",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000011534225&siteNo=6001&salestrNo=2034",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/25/42/53/item/1000011534225_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/25/42/53/item/1000011534225_i1_360.jpg",
 *                             "http://dev-item.ssgcdn.com/25/42/53/item/1000011534225_i2_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.88",
 *                         "recomRegCnt": "258",
 *                         "sellUnitPrc": "214",
 *                         "sellCapaUnitNmWithUnitCapa": "10g",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [
 *                             {
 *                                 "type": "90",
 *                                 "txt": "쓱-배송"
 *                             }
 *                         ],
 *                         "benefitGrp3": [],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": [
 *                             "달고맛있어요",
 *                             "상큼달달하니맛있음",
 *                             "달콤폭신맛있어요",
 *                             "계속이맛유지해주세요",
 *                             "고가인데맛은있어요",
 *                             "고급지네요",
 *                             "고급진맛이라고해야하나",
 *                             "너무맛이있어요"
 *                         ]
 *                     }
 *                 ],
 *                 "score": "55"
 *             },
 *             {
 *                 "titleNm": [
 *                     "#트랜드"
 *                 ],
 *                 "itemList": [
 *                     {
 *                         "itemId": "0000004445885",
 *                         "itemNm": "퓨어 매트 립스틱",
 *                         "displayPrc": "37000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "10",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "나스",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "0000004445885",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=0000004445885&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/85/58/44/item/0000004445885_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/85/58/44/item/0000004445885_i1_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.92",
 *                         "recomRegCnt": "160",
 *                         "sellUnitPrc": "",
 *                         "sellCapaUnitNmWithUnitCapa": "",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     },
 *                     {
 *                         "itemId": "0000004498745",
 *                         "itemNm": "립스틱",
 *                         "displayPrc": "37000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "10",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "나스",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "0000004498745",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=0000004498745&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/45/87/49/item/0000004498745_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/45/87/49/item/0000004498745_i1_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.94",
 *                         "recomRegCnt": "649",
 *                         "sellUnitPrc": "",
 *                         "sellCapaUnitNmWithUnitCapa": "",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     },
 *                     {
 *                         "itemId": "1000006327342",
 *                         "itemNm": "어데이셔스 립스틱",
 *                         "displayPrc": "39000",
 *                         "strikeOutPrc": "",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "10",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6009",
 *                         "siteNm": "신세계백화점",
 *                         "salestrNo": "1004",
 *                         "salestrNm": "강남점",
 *                         "sellpntNm": "",
 *                         "brandNm": "나스",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000006327342",
 *                         "attnTgtIdnfNo2": "1004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://local-m.ssg.com/item/itemView.ssg?itemId=1000006327342&siteNo=6009&salestrNo=1004",
 *                         "itemImgUrl": "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i1_360.jpg",
 *                         "itemImgUrlList": [
 *                             "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i1_360.jpg",
 *                             "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i2_360.jpg",
 *                             "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i3_360.jpg",
 *                             "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i4_360.jpg",
 *                             "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i5_360.jpg",
 *                             "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i6_360.jpg",
 *                             "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i7_360.jpg",
 *                             "http://dev-item.ssgcdn.com/42/73/32/item/1000006327342_i8_360.jpg"
 *                         ],
 *                         "planDt": "",
 *                         "dataFileNm": "",
 *                         "pickuItemYn": "N",
 *                         "qshppPsblYn": "N",
 *                         "mltSellQty": "1",
 *                         "uItemSamePrcYn": "Y",
 *                         "itemOrdQty": "",
 *                         "itemOrdQtyType": "DEAL",
 *                         "tildeDispYn": "N",
 *                         "recompPoint": "4.96",
 *                         "recomRegCnt": "307",
 *                         "sellUnitPrc": "39000",
 *                         "sellCapaUnitNmWithUnitCapa": "1개",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "advertBilngTypeCd": "",
 *                         "advertKindCd": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [],
 *                         "benefitGrp2": [],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [],
 *                         "itemTagNmList": []
 *                     }
 *                 ],
 *                 "score": "7"
 *             }
 *         ]
 *     }
 * }
 * 
*/