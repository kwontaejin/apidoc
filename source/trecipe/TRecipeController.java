/**
	@api {post} /api/recipe/category/datas.ssg 카테고리 조회
	@apiVersion 0.0.0
	@apiName TRecipeController.getRecipeCategory
	@apiGroup Recipe
	@apiPermission none
	@apiDescription 카테고리 조회 API
	
	담당자 : 최새암 파트너
	
	@apiParamExample {json} Request-Example :
	{
		"common" : {
			"apl_ver" : "2.1.2",
			"os_cd" : "20",
			"ts" : "20151203110355",
			"mobil_app_no": "1",
		},
		"params" : {
		}
	}
	
	@apiExample Example-Usage : 
	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/recipe/category/datas.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{}}'
	
	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 	data.mthdList	방법별 카테고리 리스트
	@apiSuccess {String} 	data.mthdList.clsId	분류코드
	@apiSuccess {String} 	data.mthdList.clsNm	분류이름 
	@apiSuccess {String} 	data.mthdList.dtlId	상세코드 
	@apiSuccess {String} 	data.mthdList.dtlNm	상세이름  
	@apiSuccess {List} 	data.ingrdClsList	재료별 카테고리 리스트
	@apiSuccess {String} 	data.ingrdClsList.clsId	분류코드
	@apiSuccess {String} 	data.ingrdClsList.clsNm	분류이름 
	@apiSuccess {String} 	data.ingrdClsList.dtlId	상세코드 
	@apiSuccess {String} 	data.ingrdClsList.dtlNm	상세이름
	@apiSuccess {List} 	data.situList	상황별 카테고리 리스트
	@apiSuccess {String} 	data.situList.clsId	분류코드
	@apiSuccess {String} 	data.situList.clsNm	분류이름 
	@apiSuccess {String} 	data.situList.dtlId	상세코드 
	@apiSuccess {String} 	data.situList.dtlNm	상세이름
	@apiSuccess {List} 	data.kindList	종류별 카테고리 리스트
	@apiSuccess {String} 	data.kindList.clsId	분류코드
	@apiSuccess {String} 	data.kindList.clsNm	분류이름 
	@apiSuccess {String} 	data.kindList.dtlId	상세코드 
	@apiSuccess {String} 	data.kindList.dtlNm	상세이름
	
	@apiSuccessExample Response-Example : 
	
	{
	    "cached": false,
	    "method": "getRecipeCategory",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "resultList": {
	            "mthdList": [
	                {
	                    "clsId": "1",
	                    "clsNm": "방법별",
	                    "dtlId": "1",
	                    "dtlNm": "끓이기"
	                }
	            ],
	            "ingrdClsList": [
	                {
	                    "clsId": "3",
	                    "clsNm": "재료별",
	                    "dtlId": "23",
	                    "dtlNm": "육류"
	                
	            ],
	            "situList": [
	                {
	                    "clsId": "2",
	                    "clsNm": "상황별",
	                    "dtlId": "12",
	                    "dtlNm": "일상"
	                }
	            ],
	            "kindList": [
	                {
	                    "clsId": "4",
	                    "clsNm": "종류별",
	                    "dtlId": "52",
	                    "dtlNm": "밥/죽/떡"
	                }
	            ]
	        }
	    }
	}
	
	@apiError PARAM_NOT_EXIST 파라미터 없음 (카테고리가 null값일때)
	@apiError PARAM_NOT_VALID 파라미터 유효성 검사 실패
*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/recipe/relation/datas.ssg  연관 레시피 조회
	@apiVersion 0.0.0
	@apiName TRecipeController.getRecipeRelation
	@apiGroup Recipe
	@apiPermission none
	@apiDescription 연관 레시피 조회 API
	
	담당자 : 최새암 파트너
	@apiParam {String} recipeId	레시피ID
	
	@apiParamExample {json} Request-Example :
	{
		"common" : {
			"apl_ver" : "2.1.2",
			"os_cd" : "20",
			"ts" : "20151203110355",
			"mobil_app_no": "1",
		},
		"params" : {
			"recipeId" : "1"
		}
	}
	
	@apiExample Example-Usage : 
	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/recipe/relation/datas.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"recipeId" : "1"}}'
	
	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 		data.resultList	연관레시피 결과 리스트
	@apiSuccess {String} 	data.resultList.recipeId	레시피ID
	@apiSuccess {String} 	data.resultList.recipeNm	레시피명 
	@apiSuccess {String} 	data.resultList.imgUrl		레시피이미지URL 
	@apiSuccess {String} 	data.resultList.recipeLnkd	레시피상세링크URL
	@apiSuccess {String} 	data.resultList.vodYn		동영상유무
	@apiSuccess {String} 	data.resultList.vodUrl		동영상URL(유투브) 
	@apiSuccess {String} 	data.resultList.brwsCnt		조회수 
	@apiSuccess {String} 	data.resultList.dispOrdr	전시순서  
	@apiSuccess {String} 	data.resultList.iconBadge	아이콘뱃지
	@apiSuccess {String} 	data.resultList.textBadge	문구뱃지 
	@apiSuccess {String} 	data.resultList.ingrdBadge	재료뱃지 
	@apiSuccess {String} 	data.resultList.itemId		상품ID    
	@apiSuccess {String} 	data.resultList.clipInfo	클립 공통
	@apiSuccess {String} 	data.resultList.shareInfo	공유하기 공통
	@apiSuccess {Object} 	data.resultList.item		상품 공통유닛
	
	@apiSuccessExample Response-Example : 
	
	{
	    "cached": false,
	    "method": "getRecipeRelation",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "resultList": [
	            {
	                "recipeId": "185260",
	                "recipeNm": "머리부터 발끝까지 초콜릿, 초콜릿 생크림 타르트",
	                "imgUrl": "http://dev-static.ssgcdn.com/cmpt/recipe/201702/ae0e8caef7c4707baf2077e2ac081c8e1.jpg",
	                "recipeLnkd": "http://dev-m.emart.ssg.com/recipe/recipe/detail.ssg?recipeId=185260",
	                "vodYn": null,
	                "vodUrl": "",
	                "brwsCnt": null,
	                "dispOrdr": null,
	                "iconBadge": null,
	                "textBadge": null,
	                "ingrdBadge": null,
	                "itemId": null,
	                "clipInfo": null,
	                "shareInfo": null,
	                "item": null
	            }
	        ]
	    }
	}
	
	@apiError PARAM_NOT_EXIST 파라미터 없음 (카테고리가 null값일때)
	@apiError PARAM_NOT_VALID 파라미터 유효성 검사 실패
*/


// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/recipe/detail/datas.ssg  레시피 상세
	@apiVersion 0.0.0
	@apiName TRecipeController.getRecipeDetail
	@apiGroup Recipe
	@apiPermission none
	@apiDescription 레시피 상세 API
	
	담당자 : 최새암 파트너
	@apiParam {String} recipeId	레시피ID
	
	@apiParamExample {json} Request-Example :
	{
		"common" : {
			"apl_ver" : "2.1.2",
			"os_cd" : "20",
			"ts" : "20151203110355",
			"mobil_app_no": "1",
		},
		"params" : {
			"recipeId" : "1"
		}
	}
	
	@apiExample Example-Usage : 
	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/recipe/detail/datas.ssg  -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"recipeId" : "1"}}'
	
	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 		data.ingrdItemList							재료별 상품 리스트
	@apiSuccess {String} 	data.ingrdItemList.ingrdNm					재료명
	@apiSuccess {String} 	data.ingrdItemList.ingrdId					제료ID 
	@apiSuccess {List} 		data.ingrdItemList.itemList					재료별 상품 리스트 (공통 상품 유닛 리스트)
	@apiSuccess {String} 	data.detailData								레시피 상세 데이터
	@apiSuccess {String} 	data.detailData.recipeId					레시피ID 
	@apiSuccess {String} 	data.detailData.recipeNm					레시피명 
	@apiSuccess {String} 	data.detailData.regDts						등록일  
	@apiSuccess {String} 	data.detailData.chefNm						쉐프명
	@apiSuccess {String} 	data.detailData.cookServNm					인분정보
	@apiSuccess {String} 	data.detailData.cookDifclvlNm				난이도정보 
	@apiSuccess {String} 	data.detailData.cookTimeNm					시간정보    
	@apiSuccess {String} 	data.detailData.cooktipCntt					요리팁
	@apiSuccess {String} 	data.detailData.vodYn						동영상 유무
	@apiSuccess {String} 	data.detailData.vodUrl						동영상 URL
	@apiSuccess {String} 	data.detailData.imgUrl						이미지 URL
	@apiSuccess {String} 	data.detailData.item						공통 상품유닛
	@apiSuccess {String} 	data.detailData.itemId						상품ID
	@apiSuccess {String} 	data.detailData.cartLknd					레시피 장보기 상세 URL
	@apiSuccess {String} 	data.detailData.emSaleStrNm					이마트 지점명
	@apiSuccess {String} 	data.detailData.brwsCnt						조회수
	@apiSuccess {String} 	data.detailData.mthdId						방법별 카테고리ID
	@apiSuccess {String} 	data.detailData.situId						상황별 카테고리ID
	@apiSuccess {String} 	data.detailData.ingrdClsId					재료별 카테고리ID
	@apiSuccess {String} 	data.detailData.kindId						종류별 카테고리ID
	@apiSuccess {String} 	data.detailData.mthdNm						방법별 카테고리명
	@apiSuccess {String} 	data.detailData.situNm						상황별 카테고리명
	@apiSuccess {String} 	data.detailData.ingrdClsNm					재료별 카테고리명
	@apiSuccess {String} 	data.detailData.kindNm						종류별 카테고리명
	@apiSuccess {List} 		data.detailData.ingrdList					재료 리스트
	@apiSuccess {String} 	data.detailData.ingrdList.ingrdNm			재료명
	@apiSuccess {String} 	data.detailData.ingrdList.ingrdTitleNm		재료타이틀명
	@apiSuccess {List} 		data.detailData.fileList					파일리스트
	@apiSuccess {String} 	data.detailData.fileList.imgUrl				이미지URL
	@apiSuccess {String} 	data.detailData.fileList.rplcTextNm			대체텍스트
	@apiSuccess {String} 	data.detailData.fileList.fileTypeCd			10: 요리소개, 20:요리완성, 40 : VOD이미지
	@apiSuccess {List} 		data.detailData.cookList					요리순서리스트
	@apiSuccess {String} 	data.detailData.cookList.cookOrdr			요리순서
	@apiSuccess {String} 	data.detailData.cookList.cookDesc			요리내용
	@apiSuccess {String} 	data.detailData.cookList.cooktipCntt		요리팁
	@apiSuccess {String} 	data.detailData.cookList.cookIngrdNm		요리재료
	@apiSuccess {String} 	data.detailData.cookList.cookToolNm			요리도구
	@apiSuccess {String} 	data.detailData.cookList.cookFirepCntt		요리불세기
	@apiSuccess {String} 	data.detailData.cookList.cookImgUrl			요리이미지URL
	@apiSuccess {String} 	data.detailData.cookList.cookRplcTextNm		요리이미지 대체텍스트
	@apiSuccess {Object} 	data.detailData.clipInfo					공통 클립
	@apiSuccess {Object} 	data.detailData.shareInfo					공통 공유하기
	
	@apiSuccessExample Response-Example : 
	
{
    "cached": false,
    "method": "getRecipeDetail",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "ingrdItemList": [
            {
                "ingrdNm": "설탕",
                "ingrdId": "3821353",
                "itemList": [
                    {
                        "itemId": "0000006609236",
                        "itemNm": "[CJ 백설] 하얀설탕 (1kg) (정백당 백설탕)",
                        "displayPrc": "1630",
                        "strikeOutPrc": "",
                        "minOnetOrdPsblQty": "1",
                        "maxOnetOrdPsblQty": "999999",
                        "soldOutYn": "N",
                        "stoppedSellingYn": "N",
                        "siteNo": "6001",
                        "siteNm": "emart mall",
                        "salestrNo": "2034",
                        "salestrNm": "성수점",
                        "sellpntNm": "",
                        "brandNm": "CJ",
                        "goItemDetailYn": "N",
                        "msgWhenGoToItemDetail": "",
                        "attnTgtIdnfNo1": "0000006609236",
                        "attnTgtIdnfNo2": "2034",
                        "attnDivCd": "10",
                        "needAdultCertification": "false",
                        "itemLnkd": "http://dev-m.ssg.com/item/itemView.ssg?itemId=0000006609236&siteNo=6001&salestrNo=2034",
                        "itemImgUrl": "http://dev-item.ssgcdn.com/36/92/60/item/0000006609236_i1_500.jpg",
                        "planDt": "",
                        "dataFileNm": "",
                        "pickuItemYn": "N",
                        "qshppPsblYn": "N",
                        "mltSellQty": "1",
                        "uItemSamePrcYn": "Y",
                        "itemOrdQty": "",
                        "itemOrdQtyType": "DEAL",
                        "tildeDispYn": "N",
                        "recompPoint": "4.92",
                        "recomRegCnt": "9565",
                        "sellUnitPrc": "163",
                        "sellCapaUnitNmWithUnitCapa": "100g",
                        "replaceBtnDispYn": "N",
                        "arrivalNotiBtnDispYn": "N",
                        "advertAcctId": "",
                        "advertBidId": "",
                        "cartPsblType": "",
                        "zoomImgUrls": [],
                        "benefitGrp1": [],
                        "benefitGrp2": [
                            {
                                "type": "90",
                                "txt": "쓱-배송"
                            }
                        ],
                        "benefitGrp3": [],
                        "benefitGrp4": []
                    }
                ]
            }
        ],
        "detailData": {
            "recipeId": "242710",
            "recipeNm": "제철과일 자두로 만드는 예쁜 디저트 노오븐 자두타르트 만들기",
            "regDts": "2017.07.30",
            "chefNm": "불량엄마소자매마미",
            "cookServNm": "2인분",
            "cookDifclvlNm": "초급",
            "cookTimeNm": "60분이내",
            "cooktipCntt": null,
            "vodYn": "N",
            "vodUrl": "",
            "imgUrl": "",
            "item": null,
            "itemId": null,
            "cartLknd": "http://dev-m.ssg.com/recipe/app/cart.ssg?recipeId=242710",
            "today": "2017-08-07",
            "emSaleStrNm": "성수점",
            "brwsCnt": "233",
            "mthdId": "11",
            "situId": "17",
            "ingrdClsId": "48",
            "kindId": "60",
            "mthdNm": "기타",
            "situNm": "간식",
            "ingrdClsNm": "과일류",
            "kindNm": "디저트",
            "ingrdList": [
                {
                    "ingrdNm": "통밀쿠키, 버터, 종이컵",
                    "ingrdTitleNm": "타르트 시트"
                }
            ],
            "fileList": [
                {
                    "imgUrl": "http://dev-static.ssgcdn.com/cmpt/recipe/201707/2f99416cb25b8520a05939b9b63794b11.jpg",
                    "rplcTextNm": "타르트",
                    "fileTypeCd": "10"
                }
            ],
            "cookList": [
                {
                    "cookOrdr": "1",
                    "cookDesc": "자두는 베이킹소다와 식초를 넣은 물에 좀 담가놨다가 깨끗이 씻어주세요.",
                    "cooktipCntt": null,
                    "cookIngrdNm": null,
                    "cookToolNm": null,
                    "cookFirepCntt": null,
                    "cookImgUrl": "http://dev-static.ssgcdn.com/cmpt/recipe/201707/24db6c30e53c0b6766f93fa9a97f4f651.jpg",
                    "cookRplcTextNm": "타르트"
                }
            ],
            "clipInfo": {
                "attnDivCd": "80",
                "attnDivDtlCd": "82",
                "siteNo": "6005",
                "attnTgtIdnfNo1": "242710",
                "attnTgtIdnfNo2": "",
                "infloSiteNo": "6005"
            },
            "shareInfo": {
                "snsTitle": "[오늘은e-요리]제철과일 자두로 만드는 예쁜 디저트 노오븐 자두타르트 만들기",
                "snsSummary": "SSG.COM",
                "snsImg": "http://dev-static.ssgcdn.com/cmpt/recipe/201707/2f99416cb25b8520a05939b9b63794b11.jpg",
                "snsUrl": "http://dev-m.ssg.com/recipe/recipe/detail.ssg?recipeId=242710",
                "snsGbn": "FIVE_SHOPPING"
            }
        }
    }
}
	
	@apiError PARAM_NOT_EXIST 파라미터 없음 (카테고리가 null값일때)
	@apiError PARAM_NOT_VALID 파라미터 유효성 검사 실패
*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/recipe/list/datas.ssg  레시피 리스트
	@apiVersion 0.0.0
	@apiName TRecipeController.getRecipeData
	@apiGroup Recipe
	@apiPermission none
	@apiDescription 레시피 리스트 API
	
	담당자 : 최새암 파트너
	@apiParam {String} recipeType	레시피 타입(10:이슈, 20:추천, 30:레시피, 40:동영상, 50:클립, 60:히스토리) 
	@apiParam {String} page			페이지 번호(default:1)
	@apiParam {String} pageSize		페이지 사이즈(default:40)
	@apiParam {String} siteNo		사이트구분(default:6001)
	
	@apiParamExample {json} Request-Example :
	{
		"common" : {
			"apl_ver" : "2.1.2",
			"os_cd" : "20",
			"ts" : "20151203110355",
			"mobil_app_no": "1",
		},
		"params" : {
			"recipeType" : "10",
			"page" : "1",
			"siteNo" : "6005"
		}
	}
	
	@apiExample Example-Usage : 
	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/recipe/detail/datas.ssg  -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"recipeType" : "10","page" : "1","siteNo" : "6005"}}'
	
	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 		data.issuList							이슈 레시피 리스트
	@apiSuccess {String} 	data.issuList.hasNext					추가 페이지 여부
	@apiSuccess {String} 	data.issuList.banrUrl					피코크 배너 URL
	@apiSuccess {List} 		data.issuList.resultList				이슈 결과 리스트
	@apiSuccess {String} 	data.issuList.resultList.recipeId		레시피ID
	@apiSuccess {String} 	data.issuList.resultList.recipeNm		레시피명 
	@apiSuccess {String} 	data.issuList.resultList.imgUrl			레시피이미지URL 
	@apiSuccess {String} 	data.issuList.resultList.recipeLnkd		레시피상세링크URL
	@apiSuccess {String} 	data.issuList.resultList.vodYn			동영상유무
	@apiSuccess {String} 	data.issuList.resultList.vodUrl			동영상URL(유투브) 
	@apiSuccess {String} 	data.issuList.resultList.brwsCnt		조회수 
	@apiSuccess {String} 	data.issuList.resultList.dispOrdr		전시순서  
	@apiSuccess {String} 	data.issuList.resultList.iconBadge		아이콘뱃지
	@apiSuccess {String} 	data.issuList.resultList.textBadge		문구뱃지 
	@apiSuccess {String} 	data.issuList.resultList.ingrdBadge		재료뱃지 
	@apiSuccess {String} 	data.issuList.resultList.itemId			상품ID    
	@apiSuccess {String} 	data.issuList.resultList.clipInfo		클립 공통
	@apiSuccess {String} 	data.issuList.resultList.shareInfo		공유하기 공통
	@apiSuccess {Object} 	data.issuList.resultList.item			상품 공통유닛	
	@apiSuccess {List} 		data.recipeList							베스트 레시피 리스트
	@apiSuccess {String} 	data.recipeList.hasNext					추가 페이지 여부
	@apiSuccess {List} 		data.recipeList.resultList				베스트 결과 리스트
	@apiSuccess {String} 	data.recipeList.resultList.recipeId		레시피ID
	@apiSuccess {String} 	data.recipeList.resultList.recipeNm		레시피명 
	@apiSuccess {String} 	data.recipeList.resultList.imgUrl		레시피이미지URL 
	@apiSuccess {String} 	data.recipeList.resultList.recipeLnkd	레시피상세링크URL
	@apiSuccess {String} 	data.recipeList.resultList.vodYn		동영상유무
	@apiSuccess {String} 	data.recipeList.resultList.vodUrl		동영상URL(유투브) 
	@apiSuccess {String} 	data.recipeList.resultList.brwsCnt		조회수 
	@apiSuccess {String} 	data.recipeList.resultList.dispOrdr		전시순서  
	@apiSuccess {String} 	data.recipeList.resultList.iconBadge	아이콘뱃지
	@apiSuccess {String} 	data.recipeList.resultList.textBadge	문구뱃지 
	@apiSuccess {String} 	data.recipeList.resultList.ingrdBadge	재료뱃지 
	@apiSuccess {String} 	data.recipeList.resultList.itemId		상품ID    
	@apiSuccess {String} 	data.recipeList.resultList.clipInfo		클립 공통
	@apiSuccess {String} 	data.recipeList.resultList.shareInfo	공유하기 공통
	@apiSuccess {Object} 	data.recipeList.resultList.item			상품 공통유닛	
	@apiSuccess {List} 		data.historyList						히스토리 레시피 리스트
	@apiSuccess {String} 	data.historyList.hasNext				추가 페이지 여부
	@apiSuccess {List} 		data.historyList.resultList				히스토리 결과 리스트
	@apiSuccess {String} 	data.historyList.resultList.recipeId	레시피ID
	@apiSuccess {String} 	data.historyList.resultList.recipeNm	레시피명 
	@apiSuccess {String} 	data.historyList.resultList.imgUrl		레시피이미지URL 
	@apiSuccess {String} 	data.historyList.resultList.recipeLnkd	레시피상세링크URL
	@apiSuccess {String} 	data.historyList.resultList.vodYn		동영상유무
	@apiSuccess {String} 	data.historyList.resultList.vodUrl		동영상URL(유투브) 
	@apiSuccess {String} 	data.historyList.resultList.brwsCnt		조회수 
	@apiSuccess {String} 	data.historyList.resultList.dispOrdr	전시순서  
	@apiSuccess {String} 	data.historyList.resultList.iconBadge	아이콘뱃지
	@apiSuccess {String} 	data.historyList.resultList.textBadge	문구뱃지 
	@apiSuccess {String} 	data.historyList.resultList.ingrdBadge	재료뱃지 
	@apiSuccess {String} 	data.historyList.resultList.itemId		상품ID    
	@apiSuccess {String} 	data.historyList.resultList.clipInfo	클립 공통
	@apiSuccess {String} 	data.historyList.resultList.shareInfo	공유하기 공통
	@apiSuccess {Object} 	data.historyList.resultList.item		상품 공통유닛	
	@apiSuccess {List} 		data.clipList							클립 레시피 리스트
	@apiSuccess {String} 	data.clipList.hasNext					추가 페이지 여부
	@apiSuccess {List} 		data.clipList.resultList				클립 결과 리스트
	@apiSuccess {String} 	data.clipList.resultList.recipeId		레시피ID
	@apiSuccess {String} 	data.clipList.resultList.recipeNm		레시피명 
	@apiSuccess {String} 	data.clipList.resultList.imgUrl			레시피이미지URL 
	@apiSuccess {String} 	data.clipList.resultList.recipeLnkd		레시피상세링크URL
	@apiSuccess {String} 	data.clipList.resultList.vodYn			동영상유무
	@apiSuccess {String} 	data.clipList.resultList.vodUrl			동영상URL(유투브) 
	@apiSuccess {String} 	data.clipList.resultList.brwsCnt		조회수 
	@apiSuccess {String} 	data.clipList.resultList.dispOrdr		전시순서  
	@apiSuccess {String} 	data.clipList.resultList.iconBadge		아이콘뱃지
	@apiSuccess {String} 	data.clipList.resultList.textBadge		문구뱃지 
	@apiSuccess {String} 	data.clipList.resultList.ingrdBadge		재료뱃지 
	@apiSuccess {String} 	data.clipList.resultList.itemId			상품ID    
	@apiSuccess {String} 	data.clipList.resultList.clipInfo		클립 공통
	@apiSuccess {String} 	data.clipList.resultList.shareInfo		공유하기 공통
	@apiSuccess {Object} 	data.clipList.resultList.item			상품 공통유닛	
	@apiSuccess {List} 		data.recoList							추천 레시피 리스트
	@apiSuccess {String} 	data.recoList.hasNext					추가 페이지 여부
	@apiSuccess {List} 		data.recoList.resultList				추천 결과 리스트
	@apiSuccess {String} 	data.recoList.resultList.recipeId		레시피ID
	@apiSuccess {String} 	data.recoList.resultList.recipeNm		레시피명 
	@apiSuccess {String} 	data.recoList.resultList.imgUrl			레시피이미지URL 
	@apiSuccess {String} 	data.recoList.resultList.recipeLnkd		레시피상세링크URL
	@apiSuccess {String} 	data.recoList.resultList.vodYn			동영상유무
	@apiSuccess {String} 	data.recoList.resultList.vodUrl			동영상URL(유투브) 
	@apiSuccess {String} 	data.recoList.resultList.brwsCnt		조회수 
	@apiSuccess {String} 	data.recoList.resultList.dispOrdr		전시순서  
	@apiSuccess {String} 	data.recoList.resultList.iconBadge		아이콘뱃지
	@apiSuccess {String} 	data.recoList.resultList.textBadge		문구뱃지 
	@apiSuccess {String} 	data.recoList.resultList.ingrdBadge		재료뱃지 
	@apiSuccess {String} 	data.recoList.resultList.itemId			상품ID    
	@apiSuccess {String} 	data.recoList.resultList.clipInfo		클립 공통
	@apiSuccess {String} 	data.recoList.resultList.shareInfo		공유하기 공통
	@apiSuccess {Object} 	data.recoList.resultList.item			상품 공통유닛
	@apiSuccess {List} 		data.vodList							동영상 레시피 리스트
	@apiSuccess {String} 	data.vodList.hasNext					추가 페이지 여부
	@apiSuccess {List} 		data.vodList.resultList					동영상결과 리스트
	@apiSuccess {String} 	data.vodList.resultList.recipeId		레시피ID
	@apiSuccess {String} 	data.vodList.resultList.recipeNm		레시피명 
	@apiSuccess {String} 	data.vodList.resultList.imgUrl			레시피이미지URL 
	@apiSuccess {String} 	data.vodList.resultList.recipeLnkd		레시피상세링크URL
	@apiSuccess {String} 	data.vodList.resultList.vodYn			동영상유무
	@apiSuccess {String} 	data.vodList.resultList.vodUrl			동영상URL(유투브) 
	@apiSuccess {String} 	data.vodList.resultList.brwsCnt			조회수 
	@apiSuccess {String} 	data.vodList.resultList.dispOrdr		전시순서  
	@apiSuccess {String} 	data.vodList.resultList.iconBadge		아이콘뱃지
	@apiSuccess {String} 	data.vodList.resultList.textBadge		문구뱃지 
	@apiSuccess {String} 	data.vodList.resultList.ingrdBadge		재료뱃지 
	@apiSuccess {String} 	data.vodList.resultList.itemId			상품ID    
	@apiSuccess {String} 	data.vodList.resultList.clipInfo		클립 공통
	@apiSuccess {String} 	data.vodList.resultList.shareInfo		공유하기 공통
	@apiSuccess {Object} 	data.vodList.resultList.item			상품 공통유닛
	@apiSuccess {Object} 	data.recipeBanr							레시피 코너 배너
	@apiSuccess {String} 	data.recipeBanr.imgFileNm				레시피 코너 이미지URL
	@apiSuccess {String} 	data.recipeBanr.lnkdUrl					레시피 코너 링크URL
	@apiSuccess {String} 	data.recipeBanr.imgWidth				레시피 코너 이미지 width
	@apiSuccess {String} 	data.recipeBanr.imgHeigh				레시피 코너 이미지 heigh
	
	@apiSuccessExample Response-Example : 
	
{
    "cached": false,
    "method": "getRecipeData",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "historyList": null,
        "recipeList": {
            "hasNext": "true",
            "banrUrl": null,
            "resultList": [
                {
                    "recipeId": "243644",
                    "recipeNm": "아이스 바나나 쉐이크",
                    "imgUrl": "http://dev-static.ssgcdn.com/cmpt/recipe/201708/9f639cd0ad6a7f4f68f7a54b04b947fe1.jpg",
                    "recipeLnkd": "http://dev-m.ssg.com/recipe/recipe/detail.ssg?recipeId=243644",
                    "vodYn": "N",
                    "vodUrl": "",
                    "brwsCnt": "120",
                    "dispOrdr": "1",
                    "iconBadge": "30",
                    "textBadge": null,
                    "ingrdBadge": null,
                    "itemId": null,
                    "clipInfo": {
                        "attnDivCd": "80",
                        "attnDivDtlCd": "82",
                        "siteNo": "6005",
                        "attnTgtIdnfNo1": "243644",
                        "attnTgtIdnfNo2": "",
                        "infloSiteNo": "6005"
                    },
                    "shareInfo": {
                        "snsTitle": "[오늘은e-요리]아이스 바나나 쉐이크",
                        "snsSummary": "SSG.COM",
                        "snsImg": "http://dev-static.ssgcdn.com/cmpt/recipe/201708/9f639cd0ad6a7f4f68f7a54b04b947fe1.jpg",
                        "snsUrl": "http://dev-m.ssg.com/recipe/recipe/detail.ssg?recipeId=243644",
                        "snsGbn": "FIVE_SHOPPING"
                    },
                    "item": null
                }
            ]
        },
        "issuList": {
            "hasNext": "false",
            "banrUrl": "http://dev-m.emart.ssg.com/specialshop/main.ssg?dispCtgId=6000011773&sort=best#cate",
            "resultList": [
                {
                    "recipeId": "242738",
                    "recipeNm": "수제 동그랑땡 만들기",
                    "imgUrl": "http://dev-static.ssgcdn.com/cmpt/recipe/201707/cbf877d2e21d451839528a4fba64dbf81.jpg",
                    "recipeLnkd": "http://dev-m.ssg.com/recipe/recipe/detail.ssg?recipeId=242738",
                    "vodYn": "N",
                    "vodUrl": null,
                    "brwsCnt": null,
                    "dispOrdr": null,
                    "iconBadge": "10",
                    "textBadge": null,
                    "ingrdBadge": null,
                    "itemId": null,
                    "clipInfo": {
                        "attnDivCd": "80",
                        "attnDivDtlCd": "82",
                        "siteNo": "6005",
                        "attnTgtIdnfNo1": "242738",
                        "attnTgtIdnfNo2": "",
                        "infloSiteNo": "6005"
                    },
                    "shareInfo": {
                        "snsTitle": "[오늘은e-요리]수제 동그랑땡 만들기",
                        "snsSummary": "SSG.COM",
                        "snsImg": "http://dev-static.ssgcdn.com/cmpt/recipe/201707/cbf877d2e21d451839528a4fba64dbf81.jpg",
                        "snsUrl": "http://dev-m.ssg.com/recipe/recipe/detail.ssg?recipeId=242738",
                        "snsGbn": "FIVE_SHOPPING"
                    },
                    "item": null
                }
            ]
        },
        "recipeBanr": {
            "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201707/2017073114215337214113727421_532.jpg",
            "lnkdUrl": "http://emart.ssg.com",
            "imgWidth": "750",
            "imgHeight": "450"
        },
        "vodList": null,
        "clipList": null,
        "recoList": {
            "hasNext": "false",
            "banrUrl": null,
            "resultList": [
                {
                    "recipeId": "243423",
                    "recipeNm": "마늘향 솔솔~ 갈릭 삼겹 구이 ",
                    "imgUrl": "http://dev-static.ssgcdn.com/cmpt/recipe/201708/781d45cb5deade61b75e9393c1189ac4.jpg",
                    "recipeLnkd": "http://dev-m.ssg.com/recipe/recipe/detail.ssg?recipeId=243423",
                    "vodYn": "N",
                    "vodUrl": "",
                    "brwsCnt": "6951",
                    "dispOrdr": "27",
                    "iconBadge": "20",
                    "textBadge": "추천 레시피",
                    "ingrdBadge": null,
                    "itemId": null,
                    "clipInfo": {
                        "attnDivCd": "80",
                        "attnDivDtlCd": "82",
                        "siteNo": "6005",
                        "attnTgtIdnfNo1": "243423",
                        "attnTgtIdnfNo2": "",
                        "infloSiteNo": "6005"
                    },
                    "shareInfo": {
                        "snsTitle": "[오늘은e-요리]마늘향 솔솔~ 갈릭 삼겹 구이 ",
                        "snsSummary": "SSG.COM",
                        "snsImg": "http://dev-static.ssgcdn.com/cmpt/recipe/201708/781d45cb5deade61b75e9393c1189ac4.jpg",
                        "snsUrl": "http://dev-m.ssg.com/recipe/recipe/detail.ssg?recipeId=243423",
                        "snsGbn": "FIVE_SHOPPING"
                    },
                    "item": null
                }
            ]
        }
    }
}
	
	@apiError PARAM_NOT_EXIST 파라미터 없음 (카테고리가 null값일때)
	@apiError PARAM_NOT_VALID 파라미터 유효성 검사 실패
*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
	@api {post} /api/recipe/cart/datas.ssg  레시피 장보기
	@apiVersion 0.0.0
	@apiName TRecipeController.getRecipeCart
	@apiGroup Recipe
	@apiPermission none
	@apiDescription 레시피 장보기 API
	
	담당자 : 최새암 파트너
	@apiParam {String} recipeId	레시피ID
	
	@apiParamExample {json} Request-Example :
	{
		"common" : {
			"apl_ver" : "2.1.2",
			"os_cd" : "20",
			"ts" : "20151203110355",
			"mobil_app_no": "1",
		},
		"params" : {
			"recipeId" : "1"
		}
	}
	
	@apiExample Example-Usage : 
	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/recipe/cart/datas.ssg  -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"recipeId" : "1"}}'
	
	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 		data.ingrdItemList							재료별 상품 리스트
	@apiSuccess {String} 	data.ingrdItemList.ingrdNm					재료명
	@apiSuccess {String} 	data.ingrdItemList.ingrdId					제료ID 
	@apiSuccess {List} 		data.ingrdItemList.itemList					재료별 상품 리스트 (공통 상품 유닛 리스트)
	
	@apiSuccessExample Response-Example : 
	
{
    "cached": false,
    "method": "getRecipeDetail",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "ingrdItemList": [
            {
                "ingrdNm": "설탕",
                "ingrdId": "3821353",
                "itemList": [
                    {
                        "itemId": "0000006609236",
                        "itemNm": "[CJ 백설] 하얀설탕 (1kg) (정백당 백설탕)",
                        "displayPrc": "1630",
                        "strikeOutPrc": "",
                        "minOnetOrdPsblQty": "1",
                        "maxOnetOrdPsblQty": "999999",
                        "soldOutYn": "N",
                        "stoppedSellingYn": "N",
                        "siteNo": "6001",
                        "siteNm": "emart mall",
                        "salestrNo": "2034",
                        "salestrNm": "성수점",
                        "sellpntNm": "",
                        "brandNm": "CJ",
                        "goItemDetailYn": "N",
                        "msgWhenGoToItemDetail": "",
                        "attnTgtIdnfNo1": "0000006609236",
                        "attnTgtIdnfNo2": "2034",
                        "attnDivCd": "10",
                        "needAdultCertification": "false",
                        "itemLnkd": "http://dev-m.ssg.com/item/itemView.ssg?itemId=0000006609236&siteNo=6001&salestrNo=2034",
                        "itemImgUrl": "http://dev-item.ssgcdn.com/36/92/60/item/0000006609236_i1_500.jpg",
                        "planDt": "",
                        "dataFileNm": "",
                        "pickuItemYn": "N",
                        "qshppPsblYn": "N",
                        "mltSellQty": "1",
                        "uItemSamePrcYn": "Y",
                        "itemOrdQty": "",
                        "itemOrdQtyType": "DEAL",
                        "tildeDispYn": "N",
                        "recompPoint": "4.92",
                        "recomRegCnt": "9565",
                        "sellUnitPrc": "163",
                        "sellCapaUnitNmWithUnitCapa": "100g",
                        "replaceBtnDispYn": "N",
                        "arrivalNotiBtnDispYn": "N",
                        "advertAcctId": "",
                        "advertBidId": "",
                        "cartPsblType": "",
                        "zoomImgUrls": [],
                        "benefitGrp1": [],
                        "benefitGrp2": [
                            {
                                "type": "90",
                                "txt": "쓱-배송"
                            }
                        ],
                        "benefitGrp3": [],
                        "benefitGrp4": []
                    }
                ]
            }
        ]
    }
}
	
	@apiError PARAM_NOT_EXIST 파라미터 없음 (카테고리가 null값일때)
	@apiError PARAM_NOT_VALID 파라미터 유효성 검사 실패
*/