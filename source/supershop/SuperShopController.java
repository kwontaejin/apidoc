/**
 * @api {post} /api/supershop/main/datas.ssg SuperShop 메인
 * @apiVersion 1.0.0
 * @apiName SuperShopController.getSuperShopEventBanr
 * @apiGroup SuperShop
 * @apiPermission none
 *
 * @apiDescription 슈퍼샵 메인 API
 * 
 * 
 * @apiParam {String} [apiVersion=1.0.0] api버전
 * @apiParam {String} [itemImgSize=330] 이미지사이즈
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *     "apl_ver": "2.4.2",
 *     "os_cd": "20",
 *     "ts": "20170818153636",
 *     "mobil_app_no": "12"
 *   },
 *   "params": {
 *     "apiVersion": "",
 *     "itemImgSize": "350"
 *   }
 * }
 * @apiExample Example usage:
 *  curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/supershop/main/datas.ssg -d '
 * > {"common": {"apl_ver": "2.4.2","os_cd": "20","ts": "20170818153636","mobil_app_no": "12"},"params": {"apiVersion": "","itemImgSize": "350"}}'
 *
 * @apiSuccess {String} res_code [처리 코드](#api-header-for-a-submenu-rescode)
 * @apiSuccess {String} res_message 처리 메시지
 * @apiSuccess {Object} data 처리 결과값
 * @apiSuccess {Map} data.superShopBest	SuperShop 베스트 링크 정보
 * @apiSuccess {String} data.superShopBest.lnkdUrl
 * @apiSuccess {String} data.superShopBest.lnkdType
 * @apiSuccess {Map} data.aboutPage	매장안내 페이지 링크 정보
 * @apiSuccess {String} data.aboutPage.lnkdUrl
 * @apiSuccess {String} data.aboutPage.lnkdType
 * @apiSuccess {List} data.eventList	이벤트 배너 목록
 * @apiSuccess {String} data.eventList.lnkdUrl
 * @apiSuccess {String} data.eventList.lnkdType
 * @apiSuccess {String} data.eventList.imgFileNm
 * @apiSuccess {List} data.themeBanrList	시즌테마 배너 목록
 * @apiSuccess {String} data.themeBanrList.lnkdUrl
 * @apiSuccess {String} data.themeBanrList.lnkdType
 * @apiSuccess {String} data.themeBanrList.imgFileNm
 * @apiSuccess {List} data.tutorial	튜토리얼
 * @apiSuccess {String} data.tutorial.lnkdUrl
 * @apiSuccess {String} data.tutorial.lnkdType
 * @apiSuccess {String} data.tutorial.imgFileNm
 * @apiSuccess {String} data.tutorial.bakgrndColrCdVal
 * @apiSuccess {String} data.tutorial.imgWidth
 * @apiSuccess {String} data.tutorial.imgHeight
 * @apiSuccess {List} data.bestCtgList	categrory best 목록
 * @apiSuccess {String} data.bestCtgList.cornrDispNm	코너 전시 이름
 * @apiSuccess {String} data.bestCtgList.cornrSetId	코너 세트 ID
 * @apiSuccess {List} data.bestCtgList.itemList	[상품유닛리스트](#api-header-for-a-submenu-itemunit)
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "bestCtgList": [
 *             {
 *                 "cornrDispNm": "Living",
 *                 "cornrSetId": "7200212657",
 *                 "itemList": [
 *                     {
 *                         "itemId": "1000020455955",
 *                         "itemNm": "프리미엄 공기청정기 발뮤다 에어엔진 그레이",
 *                         "displayPrc": "529000",
 *                         "strikeOutPrc": "699000",
 *                         "minOnetOrdPsblQty": "1",
 *                         "maxOnetOrdPsblQty": "1",
 *                         "soldOutYn": "N",
 *                         "stoppedSellingYn": "N",
 *                         "siteNo": "6004",
 *                         "siteNm": "shinsegae mall",
 *                         "salestrNo": "6004",
 *                         "salestrNm": "신세계몰",
 *                         "sellpntNm": "한정수량! 로그인시 499,000원+추가카드 청구혜택!",
 *                         "brandNm": "발뮤다",
 *                         "goItemDetailYn": "Y",
 *                         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                         "attnTgtIdnfNo1": "1000020455955",
 *                         "attnTgtIdnfNo2": "6004",
 *                         "attnDivCd": "10",
 *                         "needAdultCertification": "false",
 *                         "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000020455955&siteNo=6004&salestrNo=6004",
 *                         "itemImgUrl": "http://item.ssgcdn.com/55/59/45/item/1000020455955_i1_350.jpg",
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
 *                         "recomRegCnt": "1307",
 *                         "sellUnitPrc": "",
 *                         "sellCapaUnitNmWithUnitCapa": "",
 *                         "replaceBtnDispYn": "N",
 *                         "arrivalNotiBtnDispYn": "N",
 *                         "advertAcctId": "",
 *                         "advertBidId": "",
 *                         "cartPsblType": "",
 *                         "zoomImgUrls": [],
 *                         "benefitGrp1": [
 *                             {
 *                                 "type": "C0",
 *                                 "txt": "24"
 *                             }
 *                         ],
 *                         "benefitGrp2": [
 *                             {
 *                                 "type": "sschoice",
 *                                 "txt": "슈퍼샵 초이스"
 *                             }
 *                         ],
 *                         "benefitGrp3": [
 *                             {
 *                                 "type": "160",
 *                                 "txt": "청구할인"
 *                             }
 *                         ],
 *                         "benefitGrp4": [
 *                             {
 *                                 "type": "happy",
 *                                 "txt": "해피바이러스"
 *                             }
 *                         ]
 *                     }
 *                 ]
 *             }
 *         ],
 *         "superShopBest": {
 *             "lnkdUrl": "supershop_best_main",
 *             "lnkdType": "20"
 *         },
 *         "aboutPage": {
 *             "lnkdUrl": "http://m.ssg.com/special/supershop/about.ssg",
 *             "lnkdType": "10"
 *         },
 *         "tutorial": [
 *             {
 *                 "id": "",
 *                 "title": "서비스안내_튜토리얼_1번",
 *                 "desc": "서비스안내_튜토리얼_1번",
 *                 "lnkdUrl": "#",
 *                 "lnkdType": "20",
 *                 "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201610/2016102611015743339434337943_427.png",
 *                 "strtDts": "20161026000000",
 *                 "endDts": "20171026235959",
 *                 "maiTitleNm1": "",
 *                 "maiTitleNm2": "",
 *                 "subtitlNm1": "",
 *                 "subtitlNm2": "",
 *                 "iconTgtLst": "",
 *                 "titleShadUseYn": "",
 *                 "imgWidth": "640",
 *                 "imgHeight": "890",
 *                 "dispOrdr": "1",
 *                 "bakgrndColrCdVal": "",
 *                 "iconTgtList": []
 *             }
 *         ],
 *         "eventList": [
 *             {
 *                 "id": "",
 *                 "title": "쿨썸머(cool~summer) ",
 *                 "desc": "쿨썸머(cool~summer) ",
 *                 "lnkdUrl": "http://m.ssg.com/plan/planShop.ssg?planShopId=6000155954",
 *                 "lnkdType": "10",
 *                 "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017080114105080430398048039_984.png",
 *                 "strtDts": "20170801000000",
 *                 "endDts": "20180801235959",
 *                 "maiTitleNm1": "",
 *                 "maiTitleNm2": "",
 *                 "subtitlNm1": "",
 *                 "subtitlNm2": "",
 *                 "iconTgtLst": "",
 *                 "titleShadUseYn": "",
 *                 "imgWidth": "750",
 *                 "imgHeight": "480",
 *                 "dispOrdr": "1",
 *                 "bakgrndColrCdVal": "",
 *                 "iconTgtList": []
 *             }
 *         ],
 *         "themeBanrList": [
 *             {
 *                 "id": "",
 *                 "title": "슈퍼샵에 놀러온 디즈니",
 *                 "desc": "매년 돌아오는 봄이 매번 상큼하듯이, 매번 만나도 항상 귀여운 디즈니 캐릭터들이 슈퍼샵에 놀러왔습니다. 슈퍼샵에서 디즈니 상품 구매하는 200분께 미녀와 야수 영화 예매권을 증정합니다. 엠마왓슨의 미녀와 야수 영화와 함께 따뜻한 봄데이트를 즐겨보세요.",
 *                 "lnkdUrl": "http://m.ssg.com/contents/lifeMagazine.ssg?planShopId=7000000353&shpgMgzDispGrpDtlCd=20",
 *                 "lnkdType": "10",
 *                 "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201703/2017031716162256307755635775_995.jpg",
 *                 "strtDts": "20170316000000",
 *                 "endDts": "29991231235959",
 *                 "maiTitleNm1": "슈퍼샵에 놀러온 디즈니",
 *                 "maiTitleNm2": "그리고 돌아온 미녀와 야수",
 *                 "subtitlNm1": "",
 *                 "subtitlNm2": "",
 *                 "iconTgtLst": "이유있는 추천",
 *                 "titleShadUseYn": "",
 *                 "imgWidth": "0",
 *                 "imgHeight": "0",
 *                 "dispOrdr": "0",
 *                 "bakgrndColrCdVal": "",
 *                 "iconTgtList": []
 *             }
 *         ]
 *     }
 * }
 */

/**
 * @api {post} /api/supershop/best/datas/dispctg.ssg 베스트 카테고리영역
 * @apiVersion 1.0.0
 * @apiName SuperShopController.getDispCtg
 * @apiGroup SuperShop
 * @apiPermission none
 *
 * @apiDescription 슈퍼샵 베스트 카테고리영역 API
 * 
 * 
 * @apiParam {String} [apiVersion=1.0.0] api버전
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *     "apl_ver": "2.4.2",
 *     "os_cd": "20",
 *     "ts": "20170821124706",
 *     "mobil_app_no": "12"
 *   },
 *   "params": {
 *     "apiVersion": ""
 *   }
 * }
 * @apiExample Example usage:
 *  curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/supershop/best/datas/dispctg.ssg -d '
 * > {"common":{"apl_ver":"2.4.2","os_cd":"20","ts":"20170821124706","mobil_app_no":"12"},"params":{"apiVersion":""}}
 *
 * @apiSuccess {String} res_code [처리 코드](#api-header-for-a-submenu-rescode)
 * @apiSuccess {String} res_message 처리 메시지
 * @apiSuccess {Object} data 처리 결과값
 * @apiSuccess {List} data.cornrSetList 
 * @apiSuccess {String} data.cornrSetList.cornrSetId 
 * @apiSuccess {String} data.cornrSetList.cornrSetNm 
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": true,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "cornrSetList": [
 *             {
 *                 "cornrSetId": "7200212657",
 *                 "cornrSetNm": "Living"
 *             }
 *         ]
 *     }
 * }
 */

/**
 * @api {post} /api/supershop/best/datas/item.ssg 베스트 상품영역
 * @apiVersion 1.0.0
 * @apiName SuperShopController.getDispCtgItem
 * @apiGroup SuperShop
 * @apiPermission none
 *
 * @apiDescription 슈퍼샵 베스트 상품영역 API
 * 
 * 
 * @apiParam {String} [apiVersion=1.0.0] api버전
 * @apiParam {String} [cornrSetId]
 * @apiParam {String} itemImgSize 이미지사이즈
 * @apiParam {String} [pageSize=100] 페이지사이즈
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *     "apl_ver": "2.4.2",
 *     "os_cd": "20",
 *     "ts": "20170818153636",
 *     "mobil_app_no": "12"
 *   },
 *   "params": {
 *     "apiVersion": "",
 *     "cornrSetId": "7200212657",
 *     "itemImgSize": "500",
 *     "pageSize": "100"
 *   }
 * }
 * @apiExample Example usage:
 *  curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/supershop/best/datas/item.ssg -d '
 * > {"common":{"apl_ver":"2.4.2","os_cd":"20","ts":"20170821124706","mobil_app_no":"12"},"params":{"cornrSetId":"7200212657","itemImgSize":"500","pageSize":"100"}}
 *
 * @apiSuccess {String} res_code [처리 코드](#api-header-for-a-submenu-rescode)
 * @apiSuccess {String} res_message 처리 메시지
 * @apiSuccess {Object} data 처리 결과값
 * @apiSuccess {List} data.itemList
 * @apiSuccess {String} data.pageSize
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "itemList": [
 *             {
 *                 "itemId": "1000020455955",
 *                 "itemNm": "프리미엄 공기청정기 발뮤다 에어엔진 그레이",
 *                 "displayPrc": "529000",
 *                 "strikeOutPrc": "699000",
 *                 "minOnetOrdPsblQty": "1",
 *                 "maxOnetOrdPsblQty": "1",
 *                 "soldOutYn": "N",
 *                 "stoppedSellingYn": "N",
 *                 "siteNo": "6004",
 *                 "siteNm": "shinsegae mall",
 *                 "salestrNo": "6004",
 *                 "salestrNm": "신세계몰",
 *                 "sellpntNm": "한정수량! 로그인시 499,000원+추가카드 청구혜택!",
 *                 "brandNm": "발뮤다",
 *                 "goItemDetailYn": "Y",
 *                 "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                 "attnTgtIdnfNo1": "1000020455955",
 *                 "attnTgtIdnfNo2": "6004",
 *                 "attnDivCd": "10",
 *                 "needAdultCertification": "false",
 *                 "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000020455955&siteNo=6004&salestrNo=6004",
 *                 "itemImgUrl": "http://item.ssgcdn.com/55/59/45/item/1000020455955_i1_500.jpg",
 *                 "planDt": "",
 *                 "dataFileNm": "",
 *                 "pickuItemYn": "N",
 *                 "qshppPsblYn": "N",
 *                 "mltSellQty": "1",
 *                 "uItemSamePrcYn": "Y",
 *                 "itemOrdQty": "",
 *                 "itemOrdQtyType": "DEAL",
 *                 "tildeDispYn": "N",
 *                 "recompPoint": "4.9",
 *                 "recomRegCnt": "1309",
 *                 "sellUnitPrc": "",
 *                 "sellCapaUnitNmWithUnitCapa": "",
 *                 "replaceBtnDispYn": "N",
 *                 "arrivalNotiBtnDispYn": "N",
 *                 "advertAcctId": "",
 *                 "advertBidId": "",
 *                 "cartPsblType": "",
 *                 "zoomImgUrls": [],
 *                 "benefitGrp1": [
 *                     {
 *                         "type": "C0",
 *                         "txt": "24"
 *                     }
 *                 ],
 *         ],
 *         "pageSize": "100"
 *     }
 * }
 */