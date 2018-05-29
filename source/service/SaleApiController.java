/**

@api {post} /api/sale/emall/datas/code.ssg 이마트몰 - 행사중 - 카테고리
@apiVersion 1.0.0
@apiName SaleController.getSaleEmallDatasCode
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
이마트몰 행사중 카테고리 정보 API

<br>- source : SaleController.getSaleEmallDatasCode()
<br>- 담당자 : 박정환P

@apiParam {String} dataIndex (사용여부 확인 필요)
@apiParam {String} apiVersion (사용여부 확인 필요)
@apiParam {String="sale", "plus"} [type="sale"] 탭구분

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.dispCtgList 카테고리 리스트
@apiSuccess {Object} data.dispCtgList.categoryZoneType 카테고리존이름
@apiSuccess {Object} data.dispCtgList.dispCtgId 카테고리이름
@apiSuccess {Object} data.dispCtgList.dispCtgNm 카테고리ID
@apiSuccess {Object} data.dispCtgList.dispCtgLvl 카테고리레벨
@apiSuccess {Object} data.dispCtgList.dispCtgList
@apiSuccess {Object} data.dispCtgList.dispCtgList.categoryZoneType 카테고리존이름
@apiSuccess {Object} data.dispCtgList.dispCtgList.dispCtgId 카테고리이름
@apiSuccess {Object} data.dispCtgList.dispCtgList.dispCtgNm 카테고리ID
@apiSuccess {Object} data.dispCtgList.dispCtgList.dispCtgLvl 카테고리레벨

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/sale/emall/datas/item.ssg 이마트몰 - 행사중 - 상품목록
@apiVersion 1.0.0
@apiName SaleController.getSaleEmallDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
이마트몰 행사중 상품 정보 API

<br>- source : SaleController.getSaleEmallDatasItem()
<br>- 담당자 : 박정환P

@apiParam {String} dataIndex (사용여부 확인 필요)
@apiParam {String} apiVersion (사용여부 확인 필요)
@apiParam {String="sale", "plus"} [type="sale"] 탭구분
@apiParam {String} [categoryZoneType] 카테고리존이름 (카테고리존 이름에 따라 카테고리값 변경 (hot or all, food, life))
@apiParam {String} dispCtgId 카테고리ID
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [pageSize="30"] 페이지사이즈
@apiParam {String} [itemImgSize] 아이템이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String=true, false} data.hasNext 페이지더보기 유무
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 수
@apiSuccess {Object} data.itemList 공통상품유닛 리스트

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/sale/boots/datas/item.ssg Boots - 세일
@apiVersion 1.0.0
@apiName SaleController.getSaleBootsDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
Boots 세일 API

<br>- source : SaleController.getSaleBootsDatasItem()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [pageSize="30"] 페이지사이즈
@apiParam {String} [itemImgSize="150"] 아이템이미지사이즈
@apiParam {String} [tabType] 탭 구분 (List 데이터 참고 (default : 세일탭 노출))
@apiParam {String} [dispCtgId] 카테고리ID ("" or 카테고리ID)

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.tabList 탭 리스트
@apiSuccess {String} data.tabList.type 탭 구분
@apiSuccess {String} data.tabList.name 탭 이름
@apiSuccess {String} data.hasNext 다음페이지 여부
@apiSuccess {String} data.pageSize 페이지 사이즈
@apiSuccess {List} data.itemList 상품 리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/howdy/sale/datas.ssg howdy - Sale
@apiVersion 1.0.0
@apiName HowdyServiceController.howdySaleDatas
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
howdy Sale API

<br>- source : HowdyServiceController.howdySaleDatas()
<br>- 담당자 : 박정환P

@apiParam {String} dataIndex 데이터 index (0: sortList, ctgIdList, brandList, rcmdBanrList 노출)
@apiParam {String} apiVersion API 버전
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [pageSize="30"] 페이지사이즈
@apiParam {String="dcrt", "best", "regdt", "prcdsc", "prcasc"} [sort="dcrt"] 정렬 (dcrt : SALE% , best: RECOMMEND regdt : NEWEST, prcdsc : HIGH PRICE, prcasc : LOW PRICE)
@apiParam {String} [ctgId] 전시카테고리ID
@apiParam {String} [brand] 브랜드ID (브랜드ID 여러 개 입력시 | 로 연결 ex) 1010000723|1010100001)
@apiParam {String} itemImgSize 아이템이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext 다음페이지 여부
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 개수
@apiSuccess {List} data.itemList 상품 리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛
@apiSuccess {List} data.sortList 정렬 리스트
@apiSuccess {String} data.sortList.sort 정렬
@apiSuccess {String} data.sortList.sortNm 정렬명
@apiSuccess {List} data.brandList 브랜드 리스트
@apiSuccess {String} data.brandList.brandNm 브래늗명
@apiSuccess {String} data.brandList.brandId 브랜드ID
@apiSuccess {List} data.categoryList 카테고리 리스트
@apiSuccess {String} data.categoryList.dispCtgNm 카테고리명
@apiSuccess {String} data.categoryList.dispCtgId 카테고리ID
@apiSuccess {List} data.rcmdBanrList 상품 리스트
@apiSuccess {Object} data.rcmdBanrList.banr 공통배너유닛

*/
