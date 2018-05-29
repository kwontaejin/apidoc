/**

@api {post} /api/marketshopping/planshop/datas.ssg SSG - 장보기 - 점포행사
@apiVersion 1.0.0
@apiName MarketShoppingController.getMarketShoppingPlanshopDatas
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
SSG 장보기 점포행사 API

<br>- source : MarketShoppingController.getMarketShoppingPlanshopDatas()
<br>- 담당자 : 박정환P

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.menuList 메뉴리스트
@apiSuccess {String} data.menuList.menuId 메뉴ID
@apiSuccess {String} data.menuList.menuDispNm 메뉴전시명
@apiSuccess {String} data.menuList.selected 선택여부 (true or false)
@apiSuccess {List} data.resultList
@apiSuccess {String} data.resultList.storeSaleLnkdUrl 금주의 신문광고 기획전 링크, Null일 경우 얼럿 노출
@apiSuccess {List} data.resultList.dispCmptList 전단기획전 배너리스트
@apiSuccess {String} data.resultList.dispCmptList.lnkdUrl 링크URL
@apiSuccess {String} data.resultList.dispCmptList.imgFileNm 배너이미지
@apiSuccess {String} data.resultList.dispCmptList.maiTitleNm1 메인타이틀1
@apiSuccess {String} data.resultList.dispCmptList.maiTitleNm2 메인타이틀2
@apiSuccess {List} data.resultList.dispCmptList.itemList 상품리스트
@apiSuccess {Object} data.resultList.dispCmptList.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/marketshopping/sale/datas.ssg SSG - 장보기 - 세일중
@apiVersion 1.0.0
@apiName MarketShoppingController.getMarketShoppingSaleDatas
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
SSG 장보기 세일중 API

<br>- source : MarketShoppingController.getMarketShoppingSaleDatas()
<br>- 담당자 : 박정환P

@apiParam {String} [itemImgSize="253"] 상품이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.menuList 메뉴리스트
@apiSuccess {String} data.menuList.menuId 메뉴ID
@apiSuccess {String} data.menuList.menuDispNm 메뉴전시명
@apiSuccess {String} data.menuList.selected 선택여부 (true or false)
@apiSuccess {List} data.resultList
@apiSuccess {List} data.resultList.itemList 상품리스트
@apiSuccess {Object} data.resultList.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/marketshopping/best/datas.ssg SSG - 장보기 - 베스트
@apiVersion 1.0.0
@apiName MarketShoppingController.getMarketShoppingBestDatas
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
SSG 장보기 베스트 API

<br>- source : MarketShoppingController.getMarketShoppingBestDatas()
<br>- 담당자 : 박정환P

@apiParam {String} [itemImgSize="253"] 상품이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.menuList 메뉴리스트
@apiSuccess {String} data.menuList.menuId 메뉴ID
@apiSuccess {String} data.menuList.menuDispNm 메뉴전시명
@apiSuccess {String} data.menuList.selected 선택여부 (true or false)
@apiSuccess {List} data.resultList
@apiSuccess {List} data.resultList.itemList 상품리스트
@apiSuccess {Object} data.resultList.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
