/**
*	 @api {post} /api/planshop/datas/planshopInfo.ssg 기획전 상세
*	 @apiVersion 1.0.0
*	 @apiName PlanShopController.getPlanShopDetailDates
*	 @apiGroup Plan
*	 @apiPermission none
*
*	 @apiDescription 기획전 상세
*	 
*	 @apiParam {String} dataIndex 데이터index -1 or null : 전체, 부분적으로 필요한 경우 정의필요
*	 @apiParam {String} apiVersion api버전 (앱의 경우 1.0부터 종료된기획전, 임직원기획전 제공)
*	 @apiParam {String="기본값:6005", "6001:신몰", "6002:트레이더스", "6004:신몰(신백)", "6005:SSG", "6009:신백"} siteNo 사이트번호 (일반 기획전 URL Domain 상의 SiteNo (앱의 몰번호 아님) m.shinsegaemall.ssg.com 의 경우 신몰인지 신백인지 판단 할 수 없기때문에 6004로 요청하며, 내부에서 재확인함
*	 @apiParam {String} dispCmptId 기획전ID 
*	 
*	 @apiParamExample {json} Request-Example :
*	 {
*	 	"common" : {
*	 		"apl_ver":"2.1.2",
*	 		"os_cd":"20",
*	 		"ts":"20151203110355",
*	 		"mobil_app_no":"1",
*	 	},
*	 	"params" : {
*	 		"siteNo":"6005",
*	 		"apiVersion":"1.0"
*			"dispCmptId : "6000148884"
*	 	}
*	 }
*	 
*	 @apiExample Example usage:
*	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/planshop/datas/planshopInfo.ssg -d '
*	 > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005", "apiVersion:"1.0", "dispCmptId":"6000148884"}}'
*	
*	 @apiSuccess {String}	res_code 처리 코드("603":B2E 기획전에 진입했을 때, 비로그인의 경우, "604":해당 기획전에 지정된 B2E 회원이 아닐 경우)
*	 @apiSuccess {String}	res_message 처리 메시지
*	 @apiSuccess {Object}	data 데이터
*	 @apiSuccess {String}	 data.dispCmptNm 기획전 명
*	 @apiSuccess {String}	 data.siteNo 사이트 번호(기준으로 상품유닛 구성) - 신백 기획전인 경우 6004로 요청했어도 6009로 내려감
*	 @apiSuccess {String}	 data.imgFileNm 기획전 배너(OSMU 적용) 파일경로 - 크롭 리사이징 된 파일경로
*	 @apiSuccess {List}	   data.apiSiteNoList 적용대상몰 리스트
*	 @apiSuccess {Map}	   data.shareInfo 공유하기 관련데이터 
*	 @apiSuccess {String}	  data.shareInfo.snsTitle 공유명
*	 @apiSuccess {String}	  data.shareInfo.snsSummary 공유요약내용(현재몰 정보 제공됨)
*	 @apiSuccess {String}	  data.shareInfo.snsImg 공유이미지경로
*	 @apiSuccess {String}	  data.shareInfo.snsUrl 공유링크 
*	 @apiSuccess {String}	  data.shareInfo.snsGbn 공유Gbn - 와이즈로그 집계용 구분자
*	 @apiSuccess {Map}	   data.clipInfo 클립하기 관련데이터(데이터가 있는 경우에 한해 버튼 노출)
*	 @apiSuccess {String}	  data.clipInfo.attnDivCd 클립유형 (40:기획전)
*	 @apiSuccess {String}	  data.clipInfo.siteNo 클립한 게시글의 원 사이트번호 - 신몰 기획전을 SSG에도 노출했을 경우, siteNo는 6004가 됨
*	 @apiSuccess {String}	  data.clipInfo.attnTgtIdnfNo1 클립타켓ID정보1
*	 @apiSuccess {String}	  data.clipInfo.attnTgtIdnfNo2 클립타켓ID정보2
*	 @apiSuccess {String}	  data.clipInfo.infloSiteNo 클립액션을 한 사이트 번호(클립하기 InfloSiteNo에 넘겨져야할 값)
*	 @apiSuccess {List}	   data.groupPlanShopList 그룹 기획전 보기(해당 데이터 있는 경우만) 
*	 @apiSuccess {String}	  data.groupPlanShopList.dispCmptNm 기획전 명
*	 @apiSuccess {String}	  data.groupPlanShopList.lnkdType 링크 연결 방법(10: 웹링크로 고정) - 10 : 웹링크, 20 : 앱링크, 30 : 카테고리 앱링크, 40 : 검색 앱링크
*	 @apiSuccess {String}	  data.groupPlanShopList.lnkdUrl 링크 URL 
*	 @apiSuccess {List}	   data.themeList 테마 리스트
*	 @apiSuccess {String}	  data.themeList.themeId 테마ID
*	 @apiSuccess {String} 	  data.themeList.themeNm 테마명
*	 @apiSuccess {List}	   data.bannerList 기획전 상단 > 배너(이미지) 리스트(공통DTO 사용) - 배너 size 정보가 있는 경우만 제공
*	 @apiSuccess {String}	  data.bannerList.title 제목
*	 @apiSuccess {String}	  data.bannerList.desc 설명
*	 @apiSuccess {String}	  data.bannerList.lnkdUrl 링크URL
*	 @apiSuccess {String}  	  data.bannerList.lnkdType 링크 타입
*	 @apiSuccess {String}	  data.bannerList.imgFileNm 배너 이미지 경로
*	 @apiSuccess {String}	  data.bannerList.endDts 전시종료일
*	 @apiSuccess {String}	  data.bannerList.maiTitleNm1 메인제목명1
*	 @apiSuccess {String}     data.bannerList.maiTitleNm2 메인제목명2
*	 @apiSuccess {String}	  data.bannerList.subtitNm1 부제목명1
*	 @apiSuccess {String}	  data.bannerList.subtitNm2 부제목명2
*	 @apiSuccess {List}	   data.bannerList.iconTgtLst 아이콘태그리스트
*	 @apiSuccess {String}	  data.bannerList.titleShadUseYn 제목음영역사용여부
*	 @apiSuccess {String}     data.bannerList.imgWidth 이미지 가로사이즈
*	 @apiSuccess {String}     data.bannerList.imgHeight 이미지 세로사이즈
*	 @apiSuccess {String}  data.htmlViewUrl 기획전 상단영역 HTML 데이터 페이지 URL
*	 @apiSuccess {String}  data.pnshopTypeCd 기획전 유형 (10:일반기획전, 31:star Brand, 40:it ITEM, 60:라이벌전, 61:SSG전용 기획전, 70:노미네이트 기획전, 80:이얼싼기획전, 91:매장습격, 92:생활의 발명)
*	 @apiSuccess {String}  data.pnshopStartDay 기획전 시작일자 (yyyy.MM.dd)
*	 @apiSuccess {String}  data.pnshopEndDay 기획전 종료일자 (yyyy.MM.dd)
*	 @apiSuccess {Map}	   data.brandInfo 브랜드 정보
*	 @apiSuccess {String}	  data.brandInfo.brandNm 브랜드 이름
*	 @apiSuccess {String}	  data.brandInfo.linkUrl 브랜드 링크URL
*	 @apiSuccess {Map}	   data.categoryInfo 카테고리 정보
*	 @apiSuccess {String}	  data.categoryInfo.dispCtgNm 카테고리 이름
*	 @apiSuccess {String}	  data.categoryInfo.linkUrl 카테고리 링크 URL
*	 @apiSuccess {Boolean} data.isShowEndPlanshopLayer 종료된 기획전 레이어 노출 여부
*	 
*	 @apiSuccessExample Response (example):
*	 {
*	    "cached": false,
*	    "method": "",
*	    "res_code": "200",
*	    "res_message": "성공",
*	    "data": {
*	        "categoryInfo": {
*	            "dispCtgNm": "안마의자/마사지기",
*	            "linkUrl": "http://m.ssg.com/disp/category.ssg?dispCtgId=5500001329"
*	        },
*	        "bannerList": [],
*	        "htmlViewUrl": "",
*	        "clipInfo": {
*	            "attnDivCd": "40",
*	            "siteNo": "6004",
*	            "attnTgtIdnfNo1": "6000148884",
*	            "attnTgtIdnfNo2": "",
*	            "infloSiteNo": "6005"
*	        },
*	        "pnshopStartDay": "2017.06.16",
*	        "siteNo": "6005",
*	        "aplSiteNoList": [
*	            "6004"
*	        ],
*	        "dispCmptDateInfo": "",
*	        "themeList": [
*	            {
*	                "themeId": "",
*	                "themeNm": "테마 전체 보기"
*	            },
*	            {
*	                "themeId": "7200286709",
*	                "themeNm": "허그브레오 런칭"
*	            }
*	        ],
*	        "dispCmptNm": "[허그브레오] 브레오가 만든 또 하나의 브레오",
*	        "pnshopTypeCd": "10",
*	        "shareInfo": {
*	            "snsTitle": "[허그브레오] 브레오가 만든 또 하나의 브레오",
*	            "snsSummary": "SSG.COM",
*	            "snsImg": "http://static.ssgcdn.com/cmpt/banner/201706/2017061611115056329135631023_496.jpg",
*	            "snsUrl": "http://m.ssg.com/plan/planShop.ssg?dispCmptId=6000148884",
*	            "snsGbn": "PLANSHOP",
*	            "snsTgtId": "6000148884"
*	        },
*	        "planShopGroupList": [],
*	        "isShowEndPlanshopLayer": "false",
*	        "brandInfo": {},
*	        "imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201706/2017061611115056329135631023_496.jpg&w=720&h=470&edit=c&t=4a8a9ec23acea2241b5e6cc3c1e6967f23ebea95",
*	        "pnshopEndDay": "2020.12.31"
*	    }
*	  }
*		
*	 @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
*  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
*	 @apiError FAIL_PLANSHOP_DETAIL 601 / 죄송합니다. 유효하지 않은 기획전 이거나 종료된 기획전 입니다.
*	 @apiError REQUIRED_LOGIN_PLANSHOP_ISFORB2E 603 / 회원사 또는 임직원 전용 기획전입니다. 로그인 하신 후 연결이 가능합니다. 취소 시 이전페이지로 이동합니다.
*	 @apiError FAIL_ACCESS_PLANSHOP_ONLYFORB2E 604 / 해당되지 않는 회원사 또는 임직원 기획전입니다. 이전 페이지로 이동합니다.
*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
*	 @api {post} /api/planshop/datas/allItem.ssg 기획전 전체 상품 조회
*	 @apiVersion 1.0.0
*	 @apiName PlanShopController.getPlanShopDetailAllItemDatas
*	 @apiGroup Plan
*	 @apiPermission none
*
*	 @apiDescription 기획전 상세 - 전체 상품 조회
*	 
*	 @apiParam {String} dataIndex 데이터index -1 or null : 전체, 부분적으로 필요한 경우 정의필요
*	 @apiParam {String} apiVersion api버전 (현재 사용용도는 없음)
*	 @apiParam {String="기본값:6005", "6001:신몰", "6002:트레이더스", "6004:신몰(신백)", "6005:SSG", "6009:신백"} siteNo 사이트번호 (일반 기획전 URL Domain 상의 SiteNo (앱의 몰번호 아님) m.shinsegaemall.ssg.com 의 경우 신몰인지 신백인지 판단 할 수 없기때문에 6004로 요청하며, 내부에서 재확인함
*	 @apiParam {String} dispCmptId 기획전ID 
*	 @apiParam {String} [itemImgSize=202] 아이템 이미지 사이즈 (배너 사이즈가 아닌 상품 이미지 사이즈)
*	 
*	 @apiParamExample {json} Request-Example :
*	 {
*	 	"common" : {
*	 		"apl_ver":"2.1.2",
*	 		"os_cd":"20",
*	 		"ts":"20151203110355",
*	 		"mobil_app_no":"1",
*	 	},
*	 	"params" : {
*	 		"siteNo":"6005",
*			"dispCmptId":"6000114257",
*			"apiVersion":"1.0",
*			"itemImgSize":"202"
*	 	}
*	 }
*	 @apiExample Example usage:
*	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/planshop/datas/allItem.ssg -d '
*	 > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005", "dispCmptId":"6000114257", "apiVersion:"1.0","itemImgSize":"202"}}'	
*	
*    @apiSuccess {String}	res_code 처리 코드 (유효하지 않은 경우 "601")
*	 @apiSuccess {String}	res_message 처리 메시지
*	 @apiSuccess {Object}	data 데이터
*	 @apiSuccess {String}	 data.dispCmptNm 기획전 명
*	 @apiSuccess {String} 	 data.isCenterPlanShop 센터전용기획전 여부 
*	 @apiSuccess {String} 	 data.centerThemeId 센터전용기획전 중 한정 수량 갱신이 필요한 테마 ID (센터기획전이여도 빈값일 수 있음)
*	 @apiSuccess {List} 	 data.themeList 테마리스트
*	 @apiSuccess {String} 	 	data.themeList.themeId 테마ID
*	 @apiSuccess {String} 	 	data.themeList.themeNm 테마명
*	 @apiSuccess {List} 	 data.themeItemList 테마별 상품리스트
*	 @apiSuccess {String} 		data.themeItemList.themeId 테마ID
*	 @apiSuccess {String} 		data.themeItemList.themeNm 테마명
*	 @apiSuccess {List} 		data.themeItemList.itemList 테마 내 상품리스트
*	 @apiSuccess {Object} 			data.themeItemList.itemList.--  상품공통유닛 (상품 유닛 - 한정수량재고수량 추가 itemOrdQtyType:REMAIN_QTY, itemOrdQty 수량 표기)
*	
*	 @apiSuccessExample Response (example):
*    {
*	    "cached": false,
*	    "method": "",
*	    "res_code": "200",
*	    "res_message": "성공",
*	    "data": {
*	        "isCenterPlanShop": "false",
*	        "themeList": [
*	            {
*	                "themeId": "",
*	                "themeNm": "테마 전체 보기"
*	            },
*	            {
*	                "themeId": "7200230486",
*	                "themeNm": "[본점] 올리아키친"
*	            }
*	        ],
*	        "centerThemeId": "",
*	        "themeItemList": [
*	                "themeId": "7200230486",
*	                "themeNm": "[본점] 올리아키친",
*	                "itemList": [
*	                    {
*	                        "itemId": "1000019601387",
*	                        "itemNm": "본점_시저샐러드",
*	                        "displayPrc": "19800",
*	                        "strikeOutPrc": "",
*	                        "minOnetOrdPsblQty": "1",
*	                        "maxOnetOrdPsblQty": "20",
*	                        "soldOutYn": "N",
*	                        "stoppedSellingYn": "N",
*	                        "siteNo": "6009",
*	                        "siteNm": "신세계백화점",
*	                        "salestrNo": "1002",
*	                        "salestrNm": "본점",
*	                        "sellpntNm": "",
*	                        "brandNm": "올리아키친",
*	                        "goItemDetailYn": "Y",
*	                        "msgWhenGoToItemDetail": "해당 상품은 바로 구매만 가능합니다.\n바로 구매하시겠습니까?",
*	                        "attnTgtIdnfNo1": "1000019601387",
*	                        "attnTgtIdnfNo2": "1002",
*	                        "attnDivCd": "10",
*	                        "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000019601387&siteNo=6009&salestrNo=1002",
*	                        "itemImgUrl": "http://item.ssgcdn.com/87/13/60/item/1000019601387_i1_202.jpg",
*	                        "planDt": "",
*	                        "dataFileNm": "",
*	                        "pickuItemYn": "N",
*	                        "qshppPsblYn": "N",
*	                        "mltSellQty": "1",
*	                        "uItemSamePrcYn": "Y",
*	                        "itemOrdQty": "",
*	                        "itemOrdQtyType": "DEAL",
*	                        "tildeDispYn": "N",
*	                        "recompPoint": "",
*	                        "recomRegCnt": "",
*	                        "sellCapaUnitNmWithUnitCapa": "",
*	                        "replaceBtnDispYn": "N",
*	                        "arrivalNotiBtnDispYn": "N",
*	                        "advertAcctId": "",
*	                        "advertBidId": "",
*	                        "cartPsblType": "",
*	                        "zoomImgUrls": [],
*	                        "benefitGrp1": [],
*	                        "benefitGrp2": [],
*	                        "benefitGrp3": [],
*	                        "benefitGrp4": [
*	                                "type": "ssgcon",
*	                                "txt": "쓱콘"
*	                            }
*	                        ]
*						 ]
*					   ]	
*	                 }
*	             }
*	               	           	            
*	 @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
*  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
*  	 @apiError FAIL_PLANSHOP_DETAIL 601 / 죄송합니다. 유효하지 않은 기획전 이거나 종료된 기획전 입니다.
*/
// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
*	 @api {post} /api/planshop/datas/shopAttackBanr.ssg 매장습격 기획전 목록(배너) 
*	 @apiVersion 1.0.0
*	 @apiName PlanShopController.getShopAttackBannerDatas
*	 @apiGroup Plan
*	 @apiPermission none
*
*	 @apiDescription 매장습격 기획전 목록(배너)
*	 
*	 @apiParam {String} dataIndex 데이터index -1 or null : 전체, 부분적으로 필요한 경우 정의필요
*	 @apiParam {String} apiVersion api버전 (현재 사용용도는 없음)
*	 @apiParam {String="기본값:6005", "6001:신몰", "6002:트레이더스", "6004:신몰(신백)", "6005:SSG", "6009:신백"} siteNo 
*	 @apiParam {String} [page=1] 페이지
*	 @apiParam {String} [pageSize=4] 페이지크기
*
*	 @apiParamExample {json} Request-Example :
*	 {
*	 	"common" : {
*	 		"apl_ver":"2.1.2",
*	 		"os_cd":"20",
*	 		"ts":"20151203110355",
*	 		"mobil_app_no":"1",
*	 	},
*	 	"params" : {
*	 		"siteNo":"6005",
*			"page":"1",
*			"pageSize":"4"
*	 	}
*	 }
*	 @apiExample Example usage:
*	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/planshop/datas/shopAttackBanr.ssg -d '
*	 > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005", "page":"1", "pageSize":"4"}}'	
*	
*    @apiSuccess {String}	res_code 처리 코드 (유효하지 않은 경우 "601")
*	 @apiSuccess {String}	res_message 처리 메시지
*	 @apiSuccess {Object}	data 데이터
*	 @apiSuccess {List}	 	data.bannerList 매장습격 기획전 > 배너 리스트로 제공(공통DTO 사용)
*	 @apiSuccess {String} 	 data.bannerList.title 제목
*	 @apiSuccess {String} 	 data.bannerList.desc 설명
*	 @apiSuccess {String} 	 data.bannerList.lnkdUrl 링크URL
*	 @apiSuccess {String} 	 data.bannerList.lnkType 링크 타입
*	 @apiSuccess {String} 	 data.bannerList.imgFileNm 배너 이미지 경로
*	 @apiSuccess {String} 	 data.bannerList.endDts 전시종료일
*	 @apiSuccess {String} 	 data.bannerList.maiTitleNm1 메인제목명1
*	 @apiSuccess {String} 	 data.bannerList.maiTitleNm2 메인제목명2
*	 @apiSuccess {String} 	 data.bannerList.subtitlNm1 부제목명1
*	 @apiSuccess {String} 	 data.bannerList.subtitlNm2 부제목명2
*	 @apiSuccess {String} 	 data.bannerList.iconTgtLst 아이콘태그리스트
*	 @apiSuccess {String} 	 data.bannerList.titleShadUseYn 제목음영역사용여부
*	 @apiSuccess {String} 	 data.bannerList.imgWidth 이미지 가로사이즈
*	 @apiSuccess {String} 	 data.bannerList.imgHeight 이미지 세로사이즈
*	 @apiSuccess {String} 	 data.hasNext 매장습격목록 더보기 유무 "hasNext":"false"
*
*	 @apiSuccessExample Response (example):
*	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "bannerList": [
	            {
	                "id": "",
	                "title": "매장습격",
	                "desc": "",
	                "lnkdUrl": "http://m.ssg.com/plan/shopAttack.ssg?dispCmptId=6000157989",
	                "lnkdType": "10",
	                "imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017080419122609044380903538_956.jpg&w=132&h=90&edit=cb&t=fb2e4ab4d777fac7dfb7b5f40bcec5ea73684497",
	                "strtDts": "",
	                "endDts": "",
	                "maiTitleNm1": "매장습격",
	                "maiTitleNm2": "마몽드",
	                "subtitlNm1": "플래그십스토어",
	                "subtitlNm2": "",
	                "iconTgtLst": "",
	                "titleShadUseYn": "",
	                "imgWidth": "132",
	                "imgHeight": "154",
	                "dispOrdr": "",
	                "bakgrndColrCdVal": "",
	                "iconTgtList": []
	            }
	        ],
	        "hasNext": "true"
	    }
	 }
*
*	 @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
*  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
*/
// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
*	 @api {post} /api/planshop/datas/planshopCtgList.ssg 기획전 카테고리 조회
*	 @apiVersion 1.0.0
*	 @apiName PlanShopController.getPlanshopCategoryListDatas
*	 @apiGroup Plan
*	 @apiPermission none
*
*	 @apiDescription 기획전 카테고리 조회
*	 
*	 @apiParam {String} dataIndex 데이터index -1 or null : 전체, 부분적으로 필요한 경우 정의필요
*	 @apiParam {String} apiVersion api버전 (현재 사용용도는 없음)
*	 @apiParam {String="기본값:6005", "6001:신몰", "6002:트레이더스", "6004:신몰(신백)", "6005:SSG", "6009:신백"} siteNo 
*
*	 @apiParamExample {json} Request-Example :
*	 {
*	 	"common" : {
*	 		"apl_ver":"2.1.2",
*	 		"os_cd":"20",
*	 		"ts":"20151203110355",
*	 		"mobil_app_no":"1",
*	 	},
*	 	"params" : {
*	 		"siteNo":"6005"
*	 	}
*	 }
*	 @apiExample Example usage:
*	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/planshop/datas/planshopCtgList.ssg -d '
*	 > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005"}}'	
*	
*    @apiSuccess {String}	res_code 처리 코드 
*	 @apiSuccess {String}	res_message 처리 메시지
*	 @apiSuccess {Object}	data 데이터
*	 @apiSuccess {List}	 	data.planshopCtgList 베스트 기획전 카테고리 리스트
*	 @apiSuccess {String} 	 data.planshopCtgList.dispCtgId 카테고리ID (메인 타이틀 카테고리 경우는 ""으로 출력)
*	 @apiSuccess {String} 	 data.planshopCtgList.dispCtgNm 카테고리이름
*	 @apiSuccess {String} 	 data.planshopCtgList.siteNo 사이트번호
*	 @apiSuccess {String} 	data.defaultCd 기본 카테고리 ID
*
*	 @apiSuccessExample Response (example):
*	{
	   "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
        "planshopCtgList": [
            {
                "dispCtgNm": "전체",
                "dispCtgId": "",
                "siteNo": "6005"
            },
            {
                "dispCtgNm": "FASHION",
                "dispCtgId": "5410000001",
                "siteNo": "6005"
            },
            {
                "dispCtgNm": "BEAUTY",
                "dispCtgId": "5410000002",
                "siteNo": "6005"
            },
            {
                "dispCtgNm": "LIVING",
                "dispCtgId": "5410000003",
                "siteNo": "6005"
            },
            {
                "dispCtgNm": "BABY&amp;KIDS",
                "dispCtgId": "5410000004",
                "siteNo": "6005"
            },
            {
                "dispCtgNm": "DIGITAL",
                "dispCtgId": "5410000005",
                "siteNo": "6005"
            },
            {
                "dispCtgNm": "SPORTS",
                "dispCtgId": "5410000006",
                "siteNo": "6005"
            },
            {
                "dispCtgNm": "FOOD",
                "dispCtgId": "5410000007",
                "siteNo": "6005"
            }
        ],
        "defaultCd": ""
    	}
	 }
*
*	 @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
*  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
*/
// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
/**
*	 @api {post} /api/planshop/datas/collectionUI/planshopList.ssg 기획전 리스트 조회
*	 @apiVersion 1.0.0
*	 @apiName PlanShopController.getPlanshopListDatasForCollectionUI
*	 @apiGroup Plan
*	 @apiPermission none
*
*	 @apiDescription 컬렉션 UI용 기획전 리스트 조회 
*	 
*	 @apiParam {String} dataIndex 데이터index -1 or null : 전체, 부분적으로 필요한 경우 정의필요
*	 @apiParam {String} apiVersion api버전 (현재 사용용도는 없음)
*	 @apiParam {String="기본값:6005", "6001:신몰", "6002:트레이더스", "6004:신몰(신백)", "6005:SSG", "6009:신백"} siteNo 
*	 @apiParam {String} dispCtgId 카테고리ID
*	 @apiParam {String} [page=1] 페이지 (베스트 기획전은 값과 상관없이 1로 고정)
*	 @apiParam {String} [pageSize=20] 페이지크기 (베스트 기획전은 값과 상관없이 8로 고정)
*
*	 @apiParamExample {json} Request-Example :
*	 {
*	 	"common" : {
*	 		"apl_ver":"2.1.2",
*	 		"os_cd":"20",
*	 		"ts":"20151203110355",
*	 		"mobil_app_no":"1",
*	 	},
*	 	"params" : {
*	 		"siteNo":"6001",
*			"dispCtgId":"best",
*			"page":"1",
*			"pageSize":"8"
*	 	}
*	 }
*	 @apiExample Example usage:
*	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/planshop/datas/collectionUI/planshopList.ssg -d '
*	 > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005", "dispCtgId":"best", "page":"1", "pageSize":"8"}}'	
*	
*    @apiSuccess {String}	res_code 처리 코드 
*	 @apiSuccess {String}	res_message 처리 메시지
*	 @apiSuccess {Object}	data 데이터
*	 @apiSuccess {List}	 	data.planshopList 기획전 리스트 (banr공통DTO 사용)
*	 @apiSuccess {Object}  data.planshopList.planshop 기획전
*	 @apiSuccess {String} 	 data.planshopList.planshop.title 제목
*	 @apiSuccess {String} 	 data.planshopList.planshop.desc 설명
*	 @apiSuccess {String} 	 data.planshopList.planshop.lnkUrl 링크URL
*	 @apiSuccess {String} 	 data.planshopList.planshop.lnkType 링크 타입
*	 @apiSuccess {String} 	 data.planshopList.planshop.imgFileNm 배너 이미지 경로
*	 @apiSuccess {String} 	 data.planshopList.planshop.endDts 전시종료일
*	 @apiSuccess {String} 	 data.planshopList.planshop.maiTitleNm1 메인제목명1
*	 @apiSuccess {String} 	 data.planshopList.planshop.maiTitleNm2 메인제목명2
*	 @apiSuccess {String} 	 data.planshopList.planshop.subtitlNm1 부제목명1
*	 @apiSuccess {String} 	 data.planshopList.planshop.subtitlNm2 부제목명2
*	 @apiSuccess {String} 	 data.planshopList.planshop.iconTgtList 아이콘태그리스트
*	 @apiSuccess {String} 	 data.planshopList.planshop.titleShadUseYn 제목음영역사용여부
*	 @apiSuccess {String} 	 data.planshopList.planshop.imgWidth 이미지 가로사이즈
*	 @apiSuccess {String} 	 data.planshopList.planshop.imgHeight 이미지 세로사이즈
*	 @apiSuccess {List} 	 data.planshopList.itemList 공통유닛 리스트
*	 @apiSuccess {String} 	 data.hasNext 기획전 더보기 유무 
*
*	 @apiSuccessExample Response (example):
	 {
	 	"cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "hasNext": "false",
	        "planshopList": [
	            {
                "planshop": {
	                    "id": "",
	                    "title": "",
	                    "desc": "",
	                    "lnkdUrl": "http://m.emart.ssg.com/plan/planShop.ssg?dispCmptId=6000159691",
	                    "lnkdType": "10",
	                    "imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017080914003309058210903921_371.jpg&w=750&h=452&edit=c&t=144a69661589a902d895e70995d71719afef013e",
	                    "strtDts": "",
	                    "endDts": "",
	                    "maiTitleNm1": "아모레퍼시픽",
	                    "maiTitleNm2": "마스크팩초특가★",
	                    "subtitlNm1": "20매 9900원",
	                    "subtitlNm2": "",
	                    "iconTgtLst": "",
	                    "titleShadUseYn": "",
	                    "imgWidth": "720",
	                    "imgHeight": "720",
	                    "dispOrdr": "",
	                    "bakgrndColrCdVal": "",
	                    "iconTgtList": []
	                },
	                "itemList": [
	                    {
	                        "itemId": "2097000182841",
	                        "itemNm": "마몽드 플라워 에센스 석류 마스크-생기 10 + 10",
	                        "displayPrc": "9900",
	                        "strikeOutPrc": "30000",
	                        "minOnetOrdPsblQty": "1",
	                        "maxOnetOrdPsblQty": "20",
	                        "soldOutYn": "N",
	                        "stoppedSellingYn": "N",
	                        "siteNo": "6001",
	                        "siteNm": "emart mall",
	                        "salestrNo": "2439",
	                        "salestrNm": "emart NE.O.001",
	                        "sellpntNm": "",
	                        "brandNm": "",
	                        "goItemDetailYn": "N",
	                        "msgWhenGoToItemDetail": "",
	                        "attnTgtIdnfNo1": "2097000182841",
	                        "attnTgtIdnfNo2": "2439",
	                        "attnDivCd": "10",
	                        "needAdultCertification": "false",
	                        "itemLnkd": "http://m.emart.ssg.com/item/itemView.ssg?itemId=2097000182841&siteNo=6001&salestrNo=2439",
	                        "itemImgUrl": "http://item.ssgcdn.com/41/28/18/item/2097000182841_i1_500.jpg",
	                        "planDt": "",
	                        "dataFileNm": "",
	                        "pickuItemYn": "N",
	                        "qshppPsblYn": "N",
	                        "mltSellQty": "1",
	                        "uItemSamePrcYn": "Y",
	                        "itemOrdQty": "",
	                        "itemOrdQtyType": "NONE",
	                        "tildeDispYn": "N",
	                        "recompPoint": "",
	                        "recomRegCnt": "",
	                        "sellUnitPrc": "",
	                        "sellCapaUnitNmWithUnitCapa": "",
	                        "replaceBtnDispYn": "N",
	                        "arrivalNotiBtnDispYn": "N",
	                        "advertAcctId": "",
	                        "advertBidId": "",
	                        "cartPsblType": "",
	                        "zoomImgUrls": [],
	                        "benefitGrp1": [
	                            {
	                                "type": "A0",
	                                "txt": "67"
	                            }
	                        ]
	                       }
	                       ]
                    }
                  ]
	         }
	      }
*
*	 @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
*  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
*  	 @apiError FAIL_PLANSHOP_DETAIL 601 / 죄송합니다. 유효하지 않은 기획전 이거나 종료된 기획전 입니다.
*/
// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
/**
*	 @api {post} /api/planshop/datas/main/banr.ssg 기획전 메인 운영배너
*	 @apiVersion 1.0.0
*	 @apiName PlanShopController.getPlanShopMainBanrDatas
*	 @apiGroup Plan
*	 @apiPermission none
*
*	 @apiDescription 기획전 메인 운영배너
*	 
*	 @apiParam {String} dataIndex 데이터index -1 or null : 전체, 부분적으로 필요한 경우 정의필요
*	 @apiParam {String} apiVersion api버전 (현재 사용용도는 없음)
*	 @apiParam {String} siteNo 사이트번호
*
*	 @apiParamExample {json} Request-Example :
*	 {
*	 	"common" : {
*	 		"apl_ver":"2.1.2",
*	 		"os_cd":"20",
*	 		"ts":"20151203110355",
*	 		"mobil_app_no":"1",
*	 	},
*	 	"params" : {
*	 		"siteNo":"6005"
*	 	}
*	 }
*	 @apiExample Example usage:
*	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/planshop/datas/main/banr.ssg -d '
*	 > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005"}}'	
*	
*    @apiSuccess {String}	res_code 처리 코드 
*	 @apiSuccess {String}	res_message 처리 메시지
*	 @apiSuccess {Object}	data 데이터
*	 @apiSuccess {List}	 	data.planShopBanrList 
*	 @apiSuccess {String}	 	data.planShopBanrList.lnkdUrl 링크URL
*	 @apiSuccess {String}	 	data.planShopBanrList.imgFileNm 기획전 배너 파일경로 - 크롭 리사이징이 필요한 경우 처리된 파일경로
*	 @apiSuccess {String}	 	data.planShopBanrList.maiTitleNm1 메인제목명1
*	 @apiSuccess {String}	 	data.planShopBanrList.maiTitleNm2 메인제목명2
*	 @apiSuccess {String}	 	data.planShopBanrList.subtitlNm1 부제목명1
*	 @apiSuccess {String}	 	data.planShopBanrList.subtitlNm2 부제목명2
*	 @apiSuccess {String}	 	data.planShopBanrList.imgWidth 이미지 가로사이즈
*	 @apiSuccess {String}	 	data.planShopBanrList.imgHeight 이미지 세로사이즈
*	 @apiSuccess {String}	 	data.planShopEmallLnkdUrl 이몰 기획전 링크 경로 (SSG인 경우 사용)
*	 @apiSuccess {String}	 	data.planShopSmallLnkdUrl 신몰 기획전 링크 경로 (SSG인 경우 사용)
*	 @apiSuccess {String}	 	data.planShopDeptLnkdUrl 백화점 기획전 링크 경로 (SSG인 경우 사용)
*
*	 @apiSuccessExample Response (example):
     {
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "planShopBanrList": [],
	        "planShopSmallLnkdUrl": "http://m.ssg.com/plan/shoppingPlanShopTabShmall.ssg",
	        "planShopDeptLnkdUrl": "http://m.ssg.com/plan/shoppingPlanShopTabShdept.ssg",
	        "planShopEmallLnkdUrl": "http://m.ssg.com/plan/shoppingPlanShopTabEmall.ssg"
	    }
	  }
*
*	 @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
*  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
*/
// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
/**
*	 @api {post} /api/planshop/historyType/main.ssg 생활의 발명 메인 게이트(Mo)
*	 @apiVersion 1.0.0
*	 @apiName PlanShopController.getHistoryTypeMain
*	 @apiGroup Plan
*	 @apiPermission none
*
*	 @apiDescription 생활의 발명 > 모바일 메인 > 게이트페이지용
*	 
*	 @apiParam {String} dataIndex 데이터index -1 or null : 전체, 부분적으로 필요한 경우 정의필요
*	 @apiParam {String} apiVersion api버전 (현재 사용용도는 없음)
*	 @apiParam {String} [pnshopTypeCd=92(생활의발명)] 기획전 유형 코드
*	 @apiParam {String} [page=1] 페이지
*	 @apiParam {String} [siteNo=6001] 사이트번호
*
*	 @apiParamExample {json} Request-Example :
*	 {
*	 	"common" : {
*	 		"apl_ver":"2.1.2",
*	 		"os_cd":"20",
*	 		"ts":"20151203110355",
*	 		"mobil_app_no":"1",
*	 	},
*	 	"params" : {
*	 		"pnshopTypeCd":"92",
*			"page":"1",
*			"siteNo":"6001"
*	 	}
*	 }
*	 @apiExample Example usage:
*	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/planshop/historyType/main.ssg -d '
*	 > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"pnshopTypeCd":"92", "page":"1", "siteNo":"6001"}}'	
*	
*    @apiSuccess {String}	res_code 처리 코드 
*	 @apiSuccess {String}	res_message 처리 메시지
*	 @apiSuccess {Object}	data 데이터
*	 @apiSuccess {List}		data.vodList 코너 동영상타입 - "코너구성대상" 참조
*	 @apiSuccess {Object}   data.banner 상단 띄 배너
*	 @apiSuccess {String}   data.banner.lnkdUrl 링크URL
*	 @apiSuccess {String} 	data.banner.imgFileNm 배너 파일경로
*	 @apiSuccess {String} 	data.banner.bakgrndColrCdVal BG 컬로코드(#제외)
*	 @apiSuccess {String} 	data.banner.banrRplcTextNm 대체텍스트
*	 @apiSuccess {List}	 	data.planshopList 기획전 리스트
* 	 @apiSuccess {String}	data.planshopList.lnkdUrl 링크URL
* 	 @apiSuccess {String} 	data.planshopList.imgFileNm 기획전 배너 파일경로 - 크롭 리사이징이 필요한경우 처리된 파일경로
*  	 @apiSuccess {String} 	data.planshopList.title 타이틀
* 	 @apiSuccess {String} 	data.planshopList.lnkdType 링크 타입
* 	 @apiSuccess {String} 	data.planshopList.startDts 전시시작일
*  	 @apiSuccess {Map} 		data.planshopList.shareInfo 공유하기 관련데이터
*    @apiSuccess {String} 		data.planshopList.shareInfo.snsTitle 공유명
*    @apiSuccess {String} 		data.planshopList.shareInfo.snsSummary 공유요약내용(현재몰 정보 제공됨)
*    @apiSuccess {String} 		data.planshopList.shareInfo.snsImg 공유이미지경로
*    @apiSuccess {String} 		data.planshopList.shareInfo.snsUrl 공유링크
*    @apiSuccess {String} 		data.planshopList.shareInfo.snsGbn 공유Gbn - 와이즈로그 집계용 구분자
*    @apiSuccess {Map} 		data.planshopList.clipInfo 클립하기 관련데이터(데이터가 있는 경우에 한해 버튼 노출)
*    @apiSuccess {String} 		data.planshopList.clipInfo.attnDivCd 클립유형
*    @apiSuccess {String} 		data.planshopList.clipInfo.siteNo 클립한 게시글의 원 사이트번호
*    @apiSuccess {String} 		data.planshopList.clipInfo.attnTgtldnfNo1 클립타겟 ID정보1
*    @apiSuccess {String} 		data.planshopList.clipInfo.attnTgtldnfNo2 클립타겟 ID정보2
*    @apiSuccess {String} 		data.planshopList.clipInfo.infloSiteNo  클립액션을 한 사이트 번호(클립하기 infloSiteNo에 넘겨져야할 값)
*    @apiSuccess {String}   data.page 페이지
*    @apiSuccess {String}   data.pageSize 페이지 사이즈
*    @apiSuccess {String}   data.hasNext 기획전 더보기 유무
*    
*	 @apiSuccessExample Response (example):
	 {
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "planShopList": [
	            {
	                "lnkdUrl": "http://m.emart.ssg.com/plan/invent.ssg?dispCmptId=6000158601&hideTop=Y",
	                "imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017080919003843342644339264_823.jpg&w=350&h=154&edit=ct&t=6f486643ed99891fbcf250074764f1e29eb3bb32",
	                "title": "즐주2탄! 최강콤비맥주안주",
	                "lnkdType": "10",
	                "startDts": "2017. 08. 10",
	                "shareInfo": {
	                    "snsTitle": "[생활의발명] 맥주안주 2",
	                    "snsSummary": "이마트몰",
	                    "snsImg": "http://static.ssgcdn.com/cmpt/banner/201708/2017080919003843342644339264_823.jpg",
	                    "snsUrl": "http://m.emart.ssg.com/plan/invent.ssg?dispCmptId=6000158601",
	                    "snsGbn": "PLANSHOP",
	                    "snsTgtId": "6000158601"
	                },
	                "clipInfo": {
	                    "attnDivCd": "40",
	                    "siteNo": "6001",
	                    "attnTgtIdnfNo1": "6000158601",
	                    "attnTgtIdnfNo2": "",
	                    "infloSiteNo": "6001"
	                }
	            }
	          ]
	        }
	      }
*
*/
// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
/**
*	 @api {post} /api/planshop/datas/refreshItem.ssg 기획전 상세 테마 상품 조회 (센터기획전 한정수량 갱신) 
*	 @apiVersion 1.0.0
*	 @apiName PlanShopController.getPlanShopDetailRefreshItemDatas
*	 @apiGroup Plan
*	 @apiPermission none
*
*	 @apiDescription 기획전 상세 테마 상품 조회 > 센터 기획전 한정수량 갱신용 
*	 
*	 @apiParam {String} dataIndex 데이터index -1 or null : 전체, 부분적으로 필요한 경우 정의필요
*	 @apiParam {String} apiVersion api버전 (현재 사용용도는 없음)
*	 @apiParam {String} siteNo 사이트번호
*	 @apiParam {String} dispCmptId 기획전ID
*	 @apiParam {String} themeId 테마ID
*
*	 @apiParamExample {json} Request-Example :
*	 {
*	 	"common" : {
*	 		"apl_ver":"2.1.2",
*	 		"os_cd":"20",
*	 		"ts":"20151203110355",
*	 		"mobil_app_no":"1",
*	 	},
*	 	"params" : {
*			"siteNo":"6005",
*			"dispCmptId":"6000148884",
*			"themeId":"7200286709"
*	 	}
*	 }
*	 @apiExample Example usage:
*	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/planshop/datas/refreshItem.ssg -d '
*	 > {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005","dispCmptId":"6000148884","themeId":"7200286709"}}'	
*	
*    @apiSuccess {String}	res_code 처리 코드 
*	 @apiSuccess {String}	res_message 처리 메시지
*	 @apiSuccess {Object}	data 데이터
*	 @apiSuccess {List}		data.itemList 상품 리스트 (상품ID가 없거나, 한정수량재고가 없는 경우 리스트에서 제거)
*	 @apiSuccess {String}   	data.itemList.itemId 상품ID
*    @apiSuccess {String}   	data.itemList.soldOutYn 일시품절 여부
*    @apiSuccess {String}   	data.itemList.itemOrdQtyType 상품수량표시 타입
*    @apiSuccess {String}   	data.itemList.itemOrdQty 한정수량 재고 숫자
*    
*	 @apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "itemList": [
	            {
	                "itemId": "1000022140942",
	                "soldOutYn": "N",
	                "itemOrdQtyType": "REMAIN_QTY",
	                "itemOrdQty": "0"
	            },
	            {
	                "itemId": "1000022140684",
	                "soldOutYn": "N",
	                "itemOrdQtyType": "REMAIN_QTY",
	                "itemOrdQty": "0"
	            },
	            {
	                "itemId": "1000022141126",
	                "soldOutYn": "N",
	                "itemOrdQtyType": "REMAIN_QTY",
	                "itemOrdQty": "0"
	            }
	        ]
	    }
	}
*    @apiError FAIL_PARAM_NOT_EXIST 401 / 요청 파라미터가 없습니다.
*  	 @apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패. 
*    @apiError FAIL_PLANSHOP_DETAIL 601 / 죄송합니다. 유효하지 않은 기획전 이거나 종료된 기획전 입니다.
*/
// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

















