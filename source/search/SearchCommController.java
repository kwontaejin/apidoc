/**
 * @api {post} /api/search/comm/datas.ssg 공통 검색
 * @apiVersion 0.0.0
 * @apiName SearchCommController.search
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 통합검색 API
 *
 * 
 * @apiParam {String} [apiVersion]    api버전
 * @apiParam {String} [siteNo]    요청 사이트번호
 * @apiParam {String="mobile_all","mobile_dtl","mobile_item","mobile_book","mobile_pnshop","mobile_dtl_brand","chat_search_all","chat_gift_all","chat_search_item","chat_gift_item","chat_search_dtl","chat_gift_dtl"} [target="mobile_all"]	 검색을 요청할 대상
 * @apiParam {String} [query]		검색어
 * @apiParam {String} [include]   걸과내재검색어
 * @apiParam {String="best","sale","prcasc","prcdsc","regdt","cnt"} [sort="best"]        정렬코드
 * @apiParam {String} [page]          페이지번호
 * @apiParam {String} [count]         요청상품수
 * @apiParam {String} [filterSiteNo]   특정사이트상품요청
 * @apiParam {String} [ctgId]			 카테고리아이디
 * @apiParam {String} [ctgLv]			 카테고리레벨
 * @apiParam {String} [brand]		브랜드아이디
 * @apiParam {String} [filter]			혜택
 * @apiParam {String} [cls]			상품요소
 * @apiParam {String} [color]			색상
 * @apiParam {String} [minPrc]		최저가
 * @apiParam {String} [maxPrc]		최고가
 * @apiParam {String} [salestrNo]	백화점점포번호
 * @apiParam {String} [itemImgSize]   아이템이미지사이즈
 * @apiParam {String} [shpp]			배송유형
 * @apiParam {String} [pickuSalestr]  매직픽업 점포번호
 * @apiParam {String} [size]			사이즈
 * @apiParam {String} [clsFilter]		다면분류필터(하위분류 키들의 조합 같은 상위면 | 다른상위면 ^ 조합으로 받음 “L1000000028|L1000000029^L1000000026” )
 * @apiParam {String} [adYn]			광고노출여부
 *
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *       "apl_ver": "2.3.9",
 *       "os_cd": "20",
 *       "ts": "20170623133606",
 *       "mobil_app_no": "12"
 *   },
 *   "params": {
 *       "siteNo": "6005",
 *       "target" : "mobile_all",
 *       "adYn" : "Y",
 *       "query" : "원피스",
 *       "count" : "40",
 *       "itemImgSize" : "500",
 *       "page" : "1"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/search/comm/datas.ssg -d '
 * > {"common":{"apl_ver":"2.3.9","os_cd":"20","ts":"20170623133606","mobil_app_no":"12"},"params":{"siteNo":"6005","maxPrc":"","target":"mobile_all","minPrc":"","adYn":"Y","query":"1000018964648","count":"40","apiVersion":"3.2","itemImgSize":"500","page":"1"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {String} data.globalId                 		검색 트래킹용 globalId
 * @apiSuccess {List} data.areaIdList				        검색 트래킹용 areaIdList
 * @apiSuccess {String} data.typoErr						영문오탈자 치환 키워드
 * @apiSuccess {String} data.recomQuery					질의어 분석결과 쿼리
 * @apiSuccess {List} data.spellList							오타보정키워드 리스트
 * @apiSuccess {List} data.srchwdRlList						연관검색어 리스트
 * @apiSuccess {List} data.banrList							배너리스트
 * @apiSuccess {String} data.qshpp           				퀵배송 필터링조건 노출여부
 * @apiSuccess {List} data.extraDataByService           	실패검색어 여부
 * @apiSuccess {List} data.total
 * @apiSuccess {List} data.total.qshpp           			퀵배송 필터링조건 노출여부
 * @apiSuccess {List} data.total.clsYn							다면분류  			
 * @apiSuccess {List} data.total.useSizeYn					사이즈필터링 노출여부
 * @apiSuccess {List} data.total.salestrNoList				백화점점포 리스트
 * @apiSuccess {List} data.total.sortFilterList 				정렬필터
 * @apiSuccess {List} data.total.sizeFilterList 				사이즈그룹 리스트
 * @apiSuccess {List} data.total.pickuList 				    매직픽업 점포 리스트
 * @apiSuccess {List} data.total.clsFilterList 					다면분류 리스트
 * @apiSuccess {List} data.total.optionFilterList       		혜택그룹 리스트	
 * @apiSuccess {List} data.item
 * @apiSuccess {String} data.item.bookYn					도서컬렉션 존재여부
 * @apiSuccess {String} data.item.virtualCtgNm			가상카테고리명
 * @apiSuccess {List} data.item.virtualCtgWordList			가상카테고리리스트
 * @apiSuccess {String} data.item.accumCritnDts			가상카테고리인기검색어 집계기준일시
 * @apiSuccess {String} data.item.hasNext					다음페이지 존재여부
 * @apiSuccess {List} data.item.itemList				[상품유닛리스트](#api-header-for-a-submenu-itemunit)
 * @apiSuccess {List} data.item.bookList						도서검색결과 리스트
 * @apiSuccess {String} data.item.itemCount				상품검색결과 수
 * @apiSuccess {String} data.item.bookCount				도서검색결과 수
 * @apiSuccess {String} data.item.sppriceItemCount		특가상품(오반장,해바,딜) 검색결과 수
 * @apiSuccess {List} data.item.sppriceItemList				특가상품(오반장,해바,딜) 검색결과 리스트
 * @apiSuccess {String} data.item.ssgRecomCount			검색결과 없을 경우 - ssg상품 추천 검색결과 수
 * @apiSuccess {List} data.item.ssgRecomList				검색결과 없을 경우 - ssg상품 추천 검색결과 리스트
 * @apiSuccess {String} data.item.skipRecomCount		검색결과 없을 경우 - ssg상품추천 없을경우 - 질의어분석 결과 상품 수
 * @apiSuccess {List} data.item.skipRecomList				검색결과 없을 경우 - ssg상품추천 없을경우 - 질의어분석 결과 상품 리스트
 * @apiSuccess {List} data.item.srchwdrlRecomList			검색결과 없을 경우 - ssg상품추천 없을경우 - 질의어분석 결과 없을경우 - 연관검색어 상품 리스트
 * @apiSuccess {List} data.item.happyVirusRecomList		검색결과 없을 경우 - ssg상품추천 없을경우 - 질의어분석 결과 없을경우 - 연관검색어 상품 없을경우 - 특가상품(해바)
 * @apiSuccess {List} data.item.obanjangRecomList		검색결과 없을 경우 - ssg상품추천 없을경우 - 질의어분석 결과 없을경우 - 연관검색어 상품 없을경우 - 특가상품(오반장) 
 * @apiSuccess {List} data.item.advertisingExtItemList		검색결과 없을 경우 - ssg상품추천 없을경우 - 질의어분석 결과 없을경우 - 연관검색어 상품 없을경우 - 광고상품(apiVersion > 3.4 이상에서 Response, areaid(nr_advert_item)) 
 * @apiSuccess {String} data.item.crossRecomCount		교차사이트 상품추천 검색결과 수(이/트/분-->신몰, 신몰/신백-->이몰)
 * @apiSuccess {List} data.item.crossRecomList				교차사이트 상품추천 검색결과 리스트(이/트/분-->신몰, 신몰/신백-->이몰)
 * @apiSuccess {List} data.theme
 * @apiSuccess {List} data.theme.themeRecipe									오늘의e요리 리스트
 * @apiSuccess {List} data.theme.themeRecipe.themePnshopList				기획전리스트
 * @apiSuccess {List} data.theme.themeRecipe.themeKeywordItemList		키워드별상품리스트
 * @apiSuccess {List} data.theme.themeRecipe.themeIssueItemList			이슈상품리스트
 * @apiSuccess {List} data.theme.lifeMagazineCount							라이프매거진 갯수
 * @apiSuccess {List} data.theme.lifeMagazineList								라이프매거진 리스트
 * @apiSuccess {List} data.theme.themeRecipe									만개의레시피 검색결과 리스트
 * @apiSuccess {List} data.storePnshop
 * @apiSuccess {String} data.storePnshop.hasNext			기획전 다음페이지 존재여부
 * @apiSuccess {List} data.storePnshop.pnshopList			기획전 검색결과 리스트
 * @apiSuccess {String} data.storePnshop.pnshopCount		기획전 검색결과 수
 * @apiSuccess {String} data.storePnshop.storeCount			스토어 검색결과 수
 * @apiSuccess {List} data.storePnshop.storeList				스토어 검색결과 리스트
 * @apiSuccess {List} data.itemDtl								
 * @apiSuccess {List} data.itemDtl.brandFilterList					브랜드 그룹 리스트
 * @apiSuccess {List} data.itemDtl.categoryFilterList				카테고리 그룹 리스트
 * @apiSuccess {List} data.itemDtl.recomDispCategoryList			추천카테고리 그룹 리스트
 * @apiSuccess {List} data.itemDtl.benefitFilterList					혜택 필터 리스트
 * @apiSuccess {List} data.itemDtl.mallFilterList						사이트 필터 리스트
 * @apiSuccess {List} data.itemDtl.sortFilterList						정렬 필터 리스트
 * @apiSuccess {List} data.itemDtl.optionFilterList					상품유형 필터 리스트
 * @apiSuccess {List} data.itemDtl.prcGrpFilterList				가격그룹필터리스트
 * @apiSuccess {String} data.itemDtl.prcGrpFilterList.key		가격그룹필터 키값
 * @apiSuccess {String} data.itemDtl.prcGrpFilterList.minPrc		가격그룹필터 최소값
 * @apiSuccess {String} data.itemDtl.prcGrpFilterList.maxPrc		가격그룹필터 최대값
 * @apiSuccess {String} data.itemDtl.prcGrpFilterList.name		가격그룹필터 이름
 * @apiSuccess {String} data.itemDtl.maxPrc						최대가격
 * @apiSuccess {String} data.itemDtl.minPrc							최소가격
 * @apiSuccess {List} data.itemDtl.clsFilterList						다면분류 필터 리스트
 * @apiSuccess {String} data.itemDtl.clsYn							다면분류 사용 여부
 * @apiSuccess {Map} data.itemDtl.clipMore						myclip 브랜드 클립에 필요한 정보
 * @apiSuccess {List} data.giftTheme							선물테마 리스트 (apiVersion > 3.3 이상에서 Response)
 *
 *
 * @apiSuccessExample Response (example) - mobile_all:
 * {
 *  "cached": false,
 *  "method": "",
 *  "res_code": "200",
 *  "res_message": "성공",
 *  "data": {
 *    "total": {
 *      "qshpp": "Y",
 *      "clsYn": "N",
 *      "useSizeYn": "N",
 *      "salestrNoList": [
 *        {
 *          "key": "salestrNo",
 *          "value": "",
 *          "name": "전체",
 *          "useYn": "Y"
 *        },
 *        {
 *          "key": "salestrNo",
 *          "value": "1002",
 *          "name": "본점",
 *          "useYn": "Y"
 *        }
 *      ],
 *      "sortFilterList": [
 *        {
 *          "key": "sort",
 *          "value": "best",
 *          "name": "추천순",
 *          "useYn": "Y"
 *        }
 *      ],
 *      "clsFilterList": [],
 *      "optionFilterList": [
 *        {
 *          "key": "shpp",
 *          "value": "ssgem",
 *          "name": "e쓱배송",
 *          "useYn": "Y"
 *        }
 *      ]
 *    },
 *    "spellList": [],
 *    "typoErr": "",
 *    "theme": {
 *      "lifeMagazineCount": "0"
 *    },
 *    "item": {
 *      "bookYn": "Y",
 *      "virtualCtgNm": "스커트/원피스",
 *      "hasNext": "true",
 *      "itemList": [
 *        {
 *          "itemId": "1000012600176",
 *          "itemNm": "PACIFIC 자수 장식 원피스(9105241515)",
 *          "displayPrc": "59500",
 *          "strikeOutPrc": "",
 *          "minOnetOrdPsblQty": "1",
 *          "maxOnetOrdPsblQty": "20",
 *          "soldOutYn": "N",
 *          "stoppedSellingYn": "N",
 *          "siteNo": "6009",
 *          "siteNm": "신세계백화점",
 *          "salestrNo": "1006",
 *          "salestrNm": "",
 *          "sellpntNm": "",
 *          "brandNm": "TOMBOY",
 *          "goItemDetailYn": "Y",
 *          "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *          "attnTgtIdnfNo1": "1000012600176",
 *          "attnTgtIdnfNo2": "1006",
 *          "attnDivCd": "10",
 *          "needAdultCertification": "false",
 *          "itemLnkd": "http://dev-m.ssg.com/item/itemView.ssg?itemId=1000012600176&siteNo=6009&salestrNo=1006&tlidSrchWd=원피스&srchPgNo=1",
 *          "itemImgUrl": "http://dev-item.ssgcdn.com/76/01/60/item/1000012600176_i1_500.jpg",
 *          "planDt": "",
 *          "dataFileNm": "",
 *          "pickuItemYn": "N",
 *          "qshppPsblYn": "N",
 *          "mltSellQty": "1",
 *          "uItemSamePrcYn": "Y",
 *          "itemOrdQty": "",
 *          "itemOrdQtyType": "DEAL",
 *          "tildeDispYn": "N",
 *          "recompPoint": "",
 *          "recomRegCnt": "",
 *          "sellUnitPrc": "",
 *          "sellCapaUnitNmWithUnitCapa": "",
 *          "replaceBtnDispYn": "N",
 *          "arrivalNotiBtnDispYn": "N",
 *          "advertAcctId": "",
 *          "advertBidId": "",
 *          "AdvertExtensTeryDivCd": "",
 *          "cartPsblType": "",
 *          "zoomImgUrls": [],
 *          "benefitGrp1": [],
 *          "benefitGrp2": [],
 *          "benefitGrp3": [],
 *          "benefitGrp4": [],
 *          "itemTagNmList": [
			  "30들어있고오래먹네요",
			  "계속시켜먹고있어요",
			  "나갈때한병씩쓱",
			  "냉장느에넣고먹기편함",
			  "노브랜드가정답입니다",
			  "비싼생수안사도되겠네요",
			  "여행갈때쟁여갑니다",
			  "가성비최고네용"
			], 
 *        } 
 *      ],
 *      "virtualCtgWordList": [],
 *      "itemCount": "20655",
 *      "accumCritnDts": ""
 *    },
 *    "srchwdRlList": [
 *      "롱원피스",
 *      "플라스틱아일랜드 원피스",
 *      "쉬폰원피스",
 *      "르샵원피스",
 *      "에고이스트원피스",
 *      "타미힐피거 원피스",
 *      "써스데이아일랜드원피스",
 *      "LAP원피스",
 *      "비치웨어"
 *    ],
 *    "banrList": [
 *      {
 *        "linkUrl": "http://dev-m.tv.ssg.com",
 *        "siteNo": "6005",
 *        "popYn": "N",
 *        "banrRplcTextNm": "",
 *        "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201707/2017071314501437258723721082_257.jpg"
 *      }
 *    ],
 *    "storePnshop": {
 *      "pnshopCount": "26",
 *      "hasNext": "true",
 *      "pnshopList": [
 *        {
 *          "siteNo": "6005",
 *          "dispCmptId": "6000047751",
 *          "dispCmptNm": "[LAP]ALL NEW SPRING♥ 믿고보는 이성경 봄패션제안",
 *          "modDts": "20160226102656",
 *          "imgFileNm1": "http://dev-static.ssgcdn.com/cmpt/banner/201602/2016022610144259749855972095_822.jpg",
 *          "imgFileNm2": "",
 *          "imgFileNm3": "",
 *          "imgFileNm4": "",
 *          "dispCmptTypeDtlLst": "",
 *          "mobileDisplayYn": "N",
 *          "oriSiteNo": "6001",
 *          "maiTitleNm1": "SPRING FASHION",
 *          "maiTitleNm2": "믿고보는 이성경",
 *          "subtitlNm1": "넘나 예쁜것",
 *          "subtitlNm2": "",
 *          "osmuYn": "Y",
 *          "pnshopTypeCd": "10",
 *          "pnshopUrl": "http://dev-m.ssg.com/plan/planShop.ssg?dispCmptId=6000047751"
 *        }
 *      ],
 *      "storeCount": "0",
 *      "giftTheme" :  ["여친선물","아내선물","남친선물"]
 *    }
 *  }
 * }
 *
 *
 * @apiSuccessExample Response (example) - mobile_dtl:
 * {
 *  "cached": false,
 *  "method": "",
 *  "res_code": "200",
 *  "res_message": "성공",
 *  "data": {
 *    "itemDtl": {
 *      "maxPrc": "59500",
 *      "brandFilterList": [
 *        {
 *          "useYn": "Y",
 *          "recomYn": "N",
 *          "name": "TOMBOY",
 *          "value": "2000006729",
 *          "itemCount": "1",
 *          "key": "brand"
 *        }
 *      ],
 *      "categoryFilterList": [
 *        {
 *          "dispCtgLvl": "1",
 *          "dispCtgId": "5500000001",
 *          "dispCtgNm": "여성캐주얼/정장",
 *          "priorDispCtgId": "",
 *          "siteNo": "6005",
 *          "itemCount": "1",
 *          "hasChild": "true",
 *          "children": [
 *            {
 *              "dispCtgLvl": "2",
 *              "dispCtgId": "5500000019",
 *              "dispCtgNm": "원피스",
 *              "priorDispCtgId": "5500000001",
 *              "siteNo": "6005",
 *              "itemCount": "1",
 *              "hasChild": "true",
 *              "children": [
 *                {
 *                  "dispCtgLvl": "3",
 *                  "dispCtgId": "5500000020",
 *                  "dispCtgNm": "기본형/정장 원피스",
 *                  "priorDispCtgId": "5500000019",
 *                  "siteNo": "6005",
 *                  "itemCount": "1",
 *                  "hasChild": "false",
 *                  "children": []
 *                }
 *              ]
 *            }
 *          ]
 *        }
 *      ],
 *      "clsYn": "N",
 *      "clipMore": {
 *        "moblieYn": "Y",
 *        "dispCtgId": "",
 *        "query": "1000012600176",
 *        "target": "mobile_all",
 *        "brandIds": "000006729",
 *        "searchLayerYn": "Y"
 *      },
 *      "benefitFilterList": [
 *        {
 *          "key": "benefit",
 *          "value": "obanjang|spprice",
 *          "name": "특가상품",
 *          "useYn": "Y"
 *        }
 *      ],
 *      "minPrc": "59500",
 *      "mallFilterList": [
 *        {
 *          "key": "filterSiteNo",
 *          "value": "",
 *          "name": "SSG 전체",
 *          "useYn": "Y"
 *        },
 *        {
 *          "key": "filterSiteNo",
 *          "value": "6009",
 *          "name": "신세계 백화점",
 *          "useYn": "Y"
 *        }
 *      ],
 *      "sortFilterList": [
 *        {
 *          "key": "sort",
 *          "value": "best",
 *          "name": "추천순",
 *          "useYn": "Y"
 *        }
 *      ],
 *      "clsFilterList": [],
 *      "optionFilterList": [
 *        {
 *          "key": "cls",
 *          "value": "emart",
 *          "name": "이마트점포상품",
 *          "useYn": "Y"
 *        }
 *      ],
 *      "prcGrpFilterList" : [
 *        {
 *          "key" : "prcGrpFilterList",
 *          "name" : "~1만원",
 *          "minPrc" : "0",
 *          "maxPrc" : "10000"
 *        },
 *        {
 *          "key" : "prcGrpFilterList",
 *          "name" : "1만원~3만원",
 *          "minPrc" : "10000",
 *          "maxPrc" : "30000"
 *        }
 *      ]
 *    }
 *  }
 * }
*/