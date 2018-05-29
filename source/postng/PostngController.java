/**

@api {post} /api/postng/datas.ssg 상품평, 상품qna
@apiVersion 1.0.0
@apiName PostngController.postngMainList
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
상품평, 상품qna API

<br>- source : PostngController.java postngMainList()
<br>- 담당자 : 박정환P,전보솔P
<br>- 추가 사용처 : /api/signage/postng/datas, /api/emart/postng/datas

@apiParam {String} [type="all"] all : 상품평,상품문의 (cm : 상품평, qa : 상품문의)
@apiParam {String} [page="1"] 페이지
@apiParam {String} [pageSize="10"] 페이지사이즈
@apiParam {String} [sortCol="01"] 정렬코드 (01 : 최근등록순, 02 : 평점순 , 03 : 추천순)
@apiParam {String} [filterCol="10"] 필터코드 (10 : 전체, 20 : 포토, 30 : 동영상)
@apiParam {String} [siteNo="6005"] 사이트번호
@apiParam {String} [dispSiteNo="6005"] 노출사이트번호
@apiParam {String} itemId 상품ID
@apiParam {String} [saleStrNo=""] 영업점번호
@apiParam {String} [dealYn=""] 딜상품여부 Y/N
@apiParam {String} [splVenId=""] 공급업체ID
@apiParam {String} [lrnkSplVenId=""] 하위공급업체ID
@apiParam {String} [itemRegDivCd=""] 상품등록구분코드
@apiParam {String} [skuCode=""] 상품 SKU코드 (SKU코드로 해당하는 상품이 있는경우 itemId 대체됨)

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
    	"siteNo":"6005",
    	"dispSiteNo":"6005",
    	"itemId":"0000000420023",
    	"filterCol":"10",
    	"sortCol":"01",
    	"page":"1",
    	"pageSize":"1",
    	"type":"all"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.itemQnA 상품QnA
@apiSuccess {String} data.itemQnA.sellerTalkId 셀러톡ID
@apiSuccess {String} data.itemQnA.hasNext 다음페이지여부
@apiSuccess {String} data.itemQnA.pageSize 한페이지당 아이템 row 갯수
@apiSuccess {String} data.itemQnA.ansCnt 상품qna 답변 갯수
@apiSuccess {String} data.itemQnA.nAnsCnt 상품qna 미답변 갯수
@apiSuccess {String} data.itemQnA.qnaUrl qna문의하기 url
@apiSuccess {String} data.itemQnA.totalCnt 전체갯수
@apiSuccess {List} data.itemQnA.itemQnaList 상품QnA리스트
@apiSuccess {String} data.itemQnA.itemQnaList.postngId 게시글ID
@apiSuccess {String} data.itemQnA.itemQnaList.postngProcStatCd 답변상태코드
@apiSuccess {String} data.itemQnA.itemQnaList.mbrLoginId 회원로그인ID
@apiSuccess {String} data.itemQnA.itemQnaList.mbrId 회원ID
@apiSuccess {String} data.itemQnA.itemQnaList.wrtDt 작성일
@apiSuccess {String} data.itemQnA.itemQnaList.siteNo 사이트번호
@apiSuccess {String} data.itemQnA.itemQnaList.qsTitle 문의제목
@apiSuccess {String} data.itemQnA.itemQnaList.qsCntt 문의내용
@apiSuccess {String} data.itemQnA.itemQnaList.resDt 답변일
@apiSuccess {String} data.itemQnA.itemQnaList.resCntt 답변내용
@apiSuccess {String} data.itemQnA.itemQnaList.itemId 상품ID
@apiSuccess {String} data.itemQnA.itemQnaList.dispBtnYn 수정,삭제 버튼 노출 여부
@apiSuccess {String} data.itemQnA.itemQnaList.modUrl 수정URl
@apiSuccess {String} data.itemQnA.itemQnaList.delUrl 삭제URL
@apiSuccess {String} data.itemQnA.itemQnaList.postngCnttTypeCd 게시글내용유형코드
@apiSuccess {String} data.itemQnA.itemQnaList.inqSalestrNo 영업점번호
@apiSuccess {String} data.itemQnA.itemQnaList.chgSecretYn 답변완료 비밀글 설정 버튼 Y/N
@apiSuccess {Object} data.dealItem 딜상품정보
@apiSuccess {String} data.dealItem.itemId 상품ID
@apiSuccess {String} data.dealItem.itemNm 상품평
@apiSuccess {String} data.dealItem.itemImg 상품이미지URL
@apiSuccess {Object} data.itemComment 상품평
@apiSuccess {String} data.itemComment.vodCnt 동영상 상품평 수
@apiSuccess {String} data.itemComment.hasNext 페이지 더보기 유무
@apiSuccess {String} data.itemComment.imgCnt 이미지 상품평 수
@apiSuccess {String} data.itemComment.commentWtUrl 상품평작성페이지URL
@apiSuccess {String} data.itemComment.pageSize 한페이지당 아이템 row 갯수
@apiSuccess {String} data.itemComment.totalCnt 상품평 전체 수
@apiSuccess {String} data.itemComment.recomExpsrYn 상품평 노출 여부
@apiSuccess {Object} data.itemComment.summarry 상품평써머리
@apiSuccess {String} data.itemComment.summarry.recomAvgscr 상품평점
@apiSuccess {String} data.itemComment.summarry.teenRecomEvalScr 10대 상품평점
@apiSuccess {String} data.itemComment.summarry.twetRecomEvalScr 20대 상품평점
@apiSuccess {String} data.itemComment.summarry.thitRecomEvalScr 30대 상품평점
@apiSuccess {String} data.itemComment.summarry.fortRecomEvalScr 40대 상품평점
@apiSuccess {String} data.itemComment.summarry.fiftRecomEvalScr 50대(이상) 상품평점
@apiSuccess {String} data.itemComment.summarry.maleRecomEvalScr 남성 상품평점
@apiSuccess {String} data.itemComment.summarry.fmaleRecomEvalScr 여성 상품평점
@apiSuccess {String} data.itemComment.summarry.teenRecomPer 10대 비율
@apiSuccess {String} data.itemComment.summarry.twetRecomPer 20대 비율
@apiSuccess {String} data.itemComment.summarry.thitRecomPer 30대 비율
@apiSuccess {String} data.itemComment.summarry.fortRecomPer 40대 비율
@apiSuccess {String} data.itemComment.summarry.fiftRecomPer 50대(이상) 비율
@apiSuccess {String} data.itemComment.summarry.maleRecomPer 남성 비율
@apiSuccess {String} data.itemComment.summarry.fmaleRecomPer 여성 비율
@apiSuccess {String} data.itemComment.summarry.recomIcoRv 상품평점 아이콘 등급
@apiSuccess {String} data.itemComment.summarry.recomIcoRvTxt 상품평점 아이콘 등급 텍스트
@apiSuccess {String} data.itemComment.summarry.maxRecomPer 최대 상품평 비율(10~50대 비율 중 최대 상품평 비율과 같은 연령대 강조 효과)
@apiSuccess {String} data.itemComment.summarry.recomSiteStr 상품평 기준몰 정보
@apiSuccess {String} data.itemComment.summarry.summaryFullViewYn 상품평서머리 FULL노출 Y/N
@apiSuccess {String} data.itemComment.optionYn
@apiSuccess {List} data.itemComment.optionList
@apiSuccess {String} data.itemComment.optionList.uitemId 옵션ID
@apiSuccess {String} data.itemComment.optionList.uitemNM 옵션명
@apiSuccess {List} data.itemComment.itemCommentList 상품평리스트
@apiSuccess {String} data.itemComment.itemCommentList.siteNo 사이트번호
@apiSuccess {String} data.itemComment.itemCommentList.mbrLoginId 회원로그인ID
@apiSuccess {String} data.itemComment.itemCommentList.strRegDts 작성일
@apiSuccess {String} data.itemComment.itemCommentList.postngCntt 상품평 내용
@apiSuccess {String} data.itemComment.itemCommentList.uitemNm 구매옵션명
@apiSuccess {String} data.itemComment.itemCommentList.recomEvalAvg 상품평점
@apiSuccess {String} data.itemComment.itemCommentList.imgUrl1 상품평이미지URL
@apiSuccess {String} data.itemComment.itemCommentList.imgUrl2 상품평이미지URL
@apiSuccess {String} data.itemComment.itemCommentList.imgUrl3 상품평이미지URL
@apiSuccess {String} data.itemComment.itemCommentList.vodThumbUrl 동영상썸네일이미지URL
@apiSuccess {String} data.itemComment.itemCommentList.vodUrl 동영상mp4 URL
@apiSuccess {String} data.itemComment.itemCommentList.premYn 프리미엄 상품평 여부
@apiSuccess {Object} data.itemImgComment 이미지상품평
@apiSuccess {List} data.itemImgComment.itemImgCommentList 이미지URL리스트

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
		"itemQnA": {
			"sellerTalkId": "",
			"itemQnaList": [
				 {
					"postngId": "1041544699",
					"postngProcStatCd": "20",
					"mbrLoginId": "hon*******",
					"mbrId": "0006375544",
					"wrtDt": "20170811",
					"siteNo": "6009",
					"qsTitle": "선물포장 부탁드립니다.",
					"qsCntt": "방금 결제하였습니다. 어머님 생신선물이니, 제품 꼼꼼히 확인 후 보내주시고, 선물포장및 쇼핑백 동봉 부탁드립니다. ",
					"resDt": "20170812",
					"resCntt": "꼼꼼히 검수 후 상품 포장하여 출고시켜드리겠습니다",
					"itemId": "0000000420023",
					"dispBtnYn": "N",
					"modUrl": "",
					"delUrl": "",
					"postngCnttTypeCd": "10",
					"inqSalestrNo": "1004",
					"chgSecretYn": "N"
				}
			],
			"hasNext": "Y",
			"nAnsCnt": "14",
			"ansCnt": "222",
			"pageSize": "1",
			"qnaUrl": "",
			"totalCnt": "236"
		},
		"itemImgComment": {
			"itemImgCommentList": [
			  "http://img.ssgcdn.com/trans.ssg?src=/uphoto/201510/20151007205920_1018857560_1.jpg&w=500&t=78d74bb376ac5ffc9946f4bdaf4ecd9857a286a8",
			  "http://img.ssgcdn.com/trans.ssg?src=/uphoto/201304/4_228757359_2.jpg&w=500&t=39aa1c12c158014ab4087c2bbd7134f2c3295c78",
			  "http://img.ssgcdn.com/trans.ssg?src=/uphoto/201304/4_228757359_1.jpg&w=500&t=c87b7d0267a978ab0bd006e36caa6dc76e8f136b",
			  "http://img.ssgcdn.com/trans.ssg?src=/uphoto/201208/4_228060332_1.gif&w=500&t=28f6797b9aaff7cd38df10a5ba8822f94d156af7"
			],
		},
		"itemComment": {
			"itemCommentList": [
				 {
					"siteNo": "6009",
					"mbrLoginId": "sum*******",
					"strRegDts": "2017.05.23",
					"postngCntt": "배송도 빠르고 엄마 선물드렸는데 마음에 들어하시네요",
					"uitemNm": "",
					"recomEvalAvg": "5",
					"imgUrl1": "",
					"imgUrl2": "",
					"imgUrl3": "",
					"vodThumbUrl": "",
					"vodUrl": "",
					"extendImgLnk": "",
					"premYn": "N"
				}
			],
			"vodCnt": "1",
			"hasNext": "Y",
			"imgCnt": "3",
			"commentWtUrl": "http://m.ssg.com/myssg/activityMng/pdtEvalList.ssg?page=1&tabDiv=item",
			"pageSize": "1",
			"totalCnt": "127",
			"optionList": [],
			"summarry": {},
			"recomExpsrYn": "Y",
			"optionYn": "N"
		}
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/postng/commentFilterList.ssg 상품평필터
@apiVersion 1.0.0
@apiName PostngController.postngOptionList()
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
상품평필터(점포,옵션)

<br>- source : PostngController.java postngOptionList()
<br>- 담당자 : 전보솔P

@apiParam {String} type 타입(option : 옵션상품평, mystrore : 내점포상품평)
@apiParam {String} [page="1"] 페이지
@apiParam {String} [pageSize="10"] 페이지사이즈
@apiParam {String} [siteNo=""] 사이트번호
@apiParam {String} [dispSiteNo=""] 노출사이트번호
@apiParam {String} itemId 상품ID
@apiParam {String} [uitemId=""] 옵션ID
@apiParam {String} [saleStrNo=""] 영업점번호

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
	    "siteNo":"6005",
	    "dispSiteNo":"6005",
	    "itemId":"1000022950832",
	    "uitemId":"",
	    "salestrNo":"",
	    "page":"1",
	    "pageSize":"1",
	    "type":"option"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.itemComment 상품평
@apiSuccess {String} data.itemComment.hasNext 페이지 더보기 유무
@apiSuccess {String} data.itemComment.pageSize 한페이지당 아이템 row 갯수
@apiSuccess {String} data.itemComment.totalCnt 상품평 전체 수
@apiSuccess {String} data.itemComment.salestrNm 영업점명
@apiSuccess {List} data.itemComment.itemCommentList 상품평리스트
@apiSuccess {String} data.itemComment.itemCommentList.siteNo 사이트번호
@apiSuccess {String} data.itemComment.itemCommentList.mbrLoginId 회원로그인ID
@apiSuccess {String} data.itemComment.itemCommentList.strRegDts 작성일
@apiSuccess {String} data.itemComment.itemCommentList.postngCntt 상품평 내용
@apiSuccess {String} data.itemComment.itemCommentList.uitemNm 구매옵션명
@apiSuccess {String} data.itemComment.itemCommentList.recomEvalAvg 상품평점
@apiSuccess {String} data.itemComment.itemCommentList.imgUrl1 상품평이미지URL
@apiSuccess {String} data.itemComment.itemCommentList.imgUrl2 상품평이미지URL
@apiSuccess {String} data.itemComment.itemCommentList.imgUrl3 상품평이미지URL
@apiSuccess {String} data.itemComment.itemCommentList.vodThumbUrl 동영상썸네일이미지URL
@apiSuccess {String} data.itemComment.itemCommentList.vodUrl 동영상mp4 URL
@apiSuccess {String} data.itemComment.itemCommentList.premYn 프리미엄 상품평 여부


@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
		"itemComment": {
			"itemCommentList":
			[
				{
				"siteNo": "6009",
				"mbrLoginId": "viv*******",
				"strRegDts": "2017.08.23",
				"postngCntt": "색도 맘에 들고.촉촉하니 좋아요",
				"uitemNm": "색상:506",
				"recomEvalAvg": "5",
				"imgUrl1": "",
				"imgUrl2": "",
				"imgUrl3": "",
				"vodThumbUrl": "",
				"vodUrl": "",
				"extendImgLnk": "",
				"premYn": "N"
				}
			],
			"hasNext": "Y",
			"salestrNm": null,
			"pageSize": "1",
			"totalCnt": "73"
		}
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/postng/imgCommentNew.ssg 이미지 상품평
@apiVersion 1.0.0
@apiName PostngController.itemImgCommentNew()
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
이미지 상품평

<br>- source : PostngController.java itemImgCommentNew()
<br>- 담당자 : 전보솔P

@apiParam {String} [page="1"] 페이지
@apiParam {String} [pageSize="100"] 페이지사이즈 (100개 고정)
@apiParam {String} [siteNo=""] 사이트번호
@apiParam {String} [dispSiteNo=""] 노출사이트번호
@apiParam {String} itemId 상품ID

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
	    "siteNo":"6005",
	    "dispSiteNo":"6005",
	    "itemId":"0000006614771",
	    "page":"1",
	    "pageSize":"1"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.itemImgComment 이미지상품평
@apiSuccess {String} data.itemImgComment.hasNext 페이지 더보기 유무
@apiSuccess {String} data.itemImgComment.pageSize 한페이지당 아이템 row 갯수
@apiSuccess {String} data.itemImgComment.imgCnt 이미지 상품평  수
@apiSuccess {List} data.itemImgComment.itemImgCommentList 이미지상품평리스트
@apiSuccess {String} data.itemImgComment.itemImgCommentList.siteNo 사이트번호
@apiSuccess {String} data.itemImgComment.itemImgCommentList.mbrLoginId 회원로그인ID
@apiSuccess {String} data.itemImgComment.itemImgCommentList.strRegDts 작성일
@apiSuccess {String} data.itemImgComment.itemImgCommentList.postngCntt 상품평 내용
@apiSuccess {String} data.itemImgComment.itemImgCommentList.uitemNm 구매옵션명
@apiSuccess {String} data.itemImgComment.itemImgCommentList.recomEvalAvg 상품평점
@apiSuccess {String} data.itemImgComment.itemImgCommentList.premYn 프리미엄 상품평 여부
@apiSuccess {List} data.itemImgComment.itemImgCommentList.arrImgUrl 상품평이미지URL배열


@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
		"itemImgComment": {
			"itemImgCommentList":
			[
				{
				"siteNo": "6001",
				"mbrLoginId": "ssg*******",
				"strRegDts": "2016.05.12",
				"postngCntt": "324234324324234234234",
				"uitemNm": "",
				"recomEvalAvg": "5",
				"arrImgUrl": [
					"http://dev-img.ssgcdn.com/trans.ssg?src=/uphoto/201605/20160512100459_1018480286_1.jpg&w=500&t=527434fe2a130f2bc785977baf964398377610f4",
					"http://dev-img.ssgcdn.com/trans.ssg?src=/uphoto/201605/20160512100459_1018480286_2.jpg&w=500&t=215e260c7e451fa7739df5fd1c67439972ae0fb5",
					"http://dev-img.ssgcdn.com/trans.ssg?src=/uphoto/201605/20160512100459_1018480286_3.jpg&w=500&t=cdec8e70e200fcc194ff8feb77aac286f6111d1e"
				],
				"premYn": "Y"
				},
			],
			"page": "1",
			"hasNext": "N",
			"imgCnt": "8",
			"pageSize": "6",
		}
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/postng/ajaxItemQaSecretPostng.ssg 상품QnA 답변완료 문의 비밀글 설정
@apiVersion 1.0.0
@apiName PostngController.ItemQaSecretPostng()
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
상품QnA 답변완료 문의 비밀글 설정


<br>- source : PostngController.java ItemQaSecretPostng()
<br>- 담당자 : 전보솔P

@apiParam {String} postngId 게시글ID

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
	    "postngId":"1018487247",
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.qnaSecretPostngRes 비밀글설정
@apiSuccess {String} data.qnaSecretPostngRes.resultYn 비밀글 설정여부
@apiSuccess {String} data.qnaSecretPostngRes.resultMsg 비밀글 설정 완료 메시지



@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
		"qnaSecretPostngRes": {
			"resultYn": "Y",
			"resultMsg": "비밀글로 설정되었습니다."
		}
	}
}

*/

//========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/postng/qnaDelete.ssg 상품QnA 삭제
@apiVersion 1.0.0
@apiName PostngController.itemQaDelReg()
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
상품QnA 삭제

<br>- source : PostngController.java itemQaDelReg()
<br>- 담당자 : 전보솔P

@apiParam {String} postngId 게시글ID

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
	    "postngId":"1018487247",
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.qnaDelRes 상품문의 삭제
@apiSuccess {String} data.qnaDelRes.resultYn 상품문의 삭제 여부
@apiSuccess {String} data.qnaDelRes.resultMsg 상품문의 삭제 결과 메시지



@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
		"qnaDelRes": {
			"resultYn": "Y",
			"resultMsg": "삭제되었습니다."
		}
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/postng/myPdtCommReg.ssg 상품평 등록 화면
@apiVersion 1.0.0
@apiName PostngController.myPdtCommReg()
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
레드마인 : #265239

<br>- source : PostngController.java myPdtCommReg()
<br>- 담당자 : 박정환P

@apiParam {String} ordNo 주문번호
@apiParam {String} ordItemSeq 주문상품순번
@apiParam {String} itemId 상품ID
@apiParam {String} uitemId 단품ID(옵션)
@apiParam {String} [itemImgSize="202"] 아이템이미지사이즈

@apiParamExample {json} Request-Example :
{
    "common": {
        ...
    },
    "params": {
	    "ordNo": "20171212123456",
        "ordItemSeq": "1",
        "itemId": "1234567890",
        "uitemId": "00000"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.ordNo 주문번호
@apiSuccess {String} data.ordItemSeq 주문상품순번
@apiSuccess {String} data.siteNo 사이트번호
@apiSuccess {String} data.siteNm 사이트명
@apiSuccess {String} data.infloSiteNo 유입사이트번호
@apiSuccess {String} data.inqSalestrNo 영업점번호
@apiSuccess {String} data.itemId 상품ID
@apiSuccess {String} data.itemNm 상품명
@apiSuccess {String} data.itemImgUrl 상품이미지URL
@apiSuccess {String} data.uitemId 단품ID
@apiSuccess {String} data.uitemNm 단품명
@apiSuccess {String} data.impsblSaveSmoneyMsg S머니 적립불가 메시지
@apiSuccess {String} data.recomExpsrYn 상품평 노출여부
@apiSuccess {String} data.recomExpsrYnMsg 상품평 노출여부 메시지 (N일경우 작성제한 문구)
@apiSuccess {String} data.premCommEntryPsblYn 프리미엄 상품평 응모 가능여부
@apiSuccess {String} data.premCommEvntLnkdUrl 프리미엄 상품평 이벤트 URL
@apiSuccess {String} data.maxPostngCnttCnt 상품평 내용 최대입력 수

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "ordItemSeq": 1,
        "ordNo": "20170929320099",
        "inqSalestrNo": "6004",
        "itemNm": "[배스킨라빈스] 패밀리 아이스크림",
        "siteNo": "6004",
        "siteNm": "shinsegae mall",
        "maxPostngCnttCnt": "2000",
        "itemId": "1000007038867",
        "infloSiteNo": "6005",
        "premCommEntryPsblYn": "N",
        "uitemId": "00000",
        "uitemNm": "[배스킨라빈스] 패밀리 아이스크림",
        "premCommEvntLnkdUrl": "",
        "itemImgUrl": "http://dev-item.ssgcdn.com/67/88/03/item/1000007038867_i1_202.jpg",
        "impsblSaveSmoneyMsg": "",
        "recomExpsrYn": "Y"
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/postng/myPdtCommMod.ssg 상품평 수정 화면
@apiVersion 1.0.0
@apiName PostngController.myPdtCommMod()
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
레드마인 : #265239

<br>- source : PostngController.java myPdtCommMod()
<br>- 담당자 : 박정환P

@apiParam {String} postngId 게시글ID
@apiParam {String} ordNo 주문번호
@apiParam {String} ordItemSeq 주문상품순번
@apiParam {String} itemId 상품ID
@apiParam {String} uitemId 단품ID(옵션)
@apiParam {String} [itemImgSize="202"] 아이템이미지사이즈

@apiParamExample {json} Request-Example :
{
    "common": {
        ...
    },
    "params": {
        "postngId": "12345",
	    "ordNo": "20171212123456",
        "ordItemSeq": "1",
        "itemId": "1234567890",
        "uitemId": "00000"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.postngId 게시글ID (상품평ID)
@apiSuccess {String} data.postngCntt 상품평 내용
@apiSuccess {String} data.qualityEval 상품평점
@apiSuccess {List} data.postngImgList 상품평 이미지 리스트
@apiSuccess {String} data.postngImgList.fileName 이미지 파일명
@apiSuccess {String} data.postngImgList.url 이미지 URL
@apiSuccess {List} data.postngvodList 동영상 이미지 리스트
@apiSuccess {String} data.postngImgList.vodUrl 동영상 URL
@apiSuccess {String} data.postngImgList.vodThmnlImgUrl 동영상 썸네일 이미지 URL
@apiSuccess {String} data.ordNo 주문번호
@apiSuccess {String} data.ordItemSeq 주문상품순번
@apiSuccess {String} data.siteNo 사이트번호
@apiSuccess {String} data.siteNm 사이트명
@apiSuccess {String} data.infloSiteNo 유입사이트번호
@apiSuccess {String} data.inqSalestrNo 영업점번호
@apiSuccess {String} data.itemId 상품ID
@apiSuccess {String} data.itemNm 상품명
@apiSuccess {String} data.itemImgUrl 상품이미지URL
@apiSuccess {String} data.uitemId 단품ID
@apiSuccess {String} data.uitemNm 단품명
@apiSuccess {String} data.recomExpsrYn 상품평 노출여부
@apiSuccess {String} data.recomExpsrYnMsg 상품평 노출여부 메시지 (N일경우 작성제한 문구)
@apiSuccess {String} data.premCommEntryPsblYn 프리미엄 상품평 응모 가능여부
@apiSuccess {String} data.premCommEvntLnkdUrl 프리미엄 상품평 이벤트 URL
@apiSuccess {String} data.maxPostngCnttCnt 상품평 내용 최대입력 수

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "ordItemSeq": 1,
        "ordNo": "20171017320381",
        "inqSalestrNo": "2034",
        "itemNm": "성수권역 > 퀵배송 ",
        "postngCntt": "1ㅊㄱ1ㄱc1ㄱㅊㄱ1ㄱㅊ",
        "siteNo": "6001",
        "postngvodList": [
          {
            "vodThmnlImgUrl": "http://dev-ucc.ssgcdn.com/umov/vc/ITEMEVAL_NEW/201712/281/6344246979755665510896_300x200.jpg",
            "vodUrl": "http://dev-ucc.ssgcdn.com/umov/vc/ITEMEVAL_NEW/201712/281/6344246979755665510896_s.mp4"
          }
        ],
        "siteNm": "emart mall",
        "maxPostngCnttCnt": "2000",
        "itemId": "1000000037970",
        "infloSiteNo": "6005",
        "postngImgList": [
          {
            "fileName": "20171215171836_1018488130_1.PNG",
            "url": "http://dev-ucc.ssgcdn.com/uphoto/201712/20171215171836_1018488130_1.PNG"
          },
          {
            "fileName": "20171215171934_1018488130_2.PNG",
            "url": "http://dev-ucc.ssgcdn.com/uphoto/201712/20171215171934_1018488130_2.PNG"
          }
        ],
        "premCommEntryPsblYn": "N",
        "postngId": 1018488130,
        "premCommentEntryYn": "N",
        "qualityEval": 5,
        "uitemId": "00000",
        "uitemNm": "성수권역 > 퀵배송 ",
        "premCommEvntLnkdUrl": "",
        "itemImgUrl": "http://dev-item.ssgcdn.com/70/79/03/item/1000000037970_i1_202.jpg",
        "recomExpsrYn": "Y"
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/postng/savePdtComm.ssg 상품평 등록 처리
@apiVersion 1.0.0
@apiName PostngController.savePdtComm()
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
레드마인 : #265239

<br>- source : PostngController.java savePdtComm()
<br>- 담당자 : 박정환P

@apiParam {String} ordNo 주문번호
@apiParam {String} ordItemSeq 주문상품순번
@apiParam {String} siteNo 사이트번호
@apiParam {String} itemId 상품ID
@apiParam {String} uitemId 단품ID(옵션)
@apiParam {String} [inqSalestrNo] 영업점번호
@apiParam {String} [infloSiteNo="6005"] 유입사이트번호
@apiParam {String="Y", "N"} recomExpsrYn 상품평 노출여부
@apiParam {String} [postngCntt] 상품평 내용
@apiParam {String="Y", "N"} premCommentEntryYn 프리미엄상품평 지원여부
@apiParam {String} qualityEval 상품평점
@apiParam {String="Y", "N"} imgBeingYn 이미지 포함여부
@apiParam {String[]} [fileNames] 이미지 파일명 배열
@apiParam {String[]} [urls] 이미지 URL 배열
@apiParam {String="Y", "N"} vodBeingYn 동영상포함여부
@apiParam {String} [vodUrl] 동영상 URL
@apiParam {String} [vodThmnlImgUrl] 동영상 썸네일 이미지 URL
@apiParam {String} [itemImgSize="202"] 아이템이미지사이즈 (등록 후 미작성 상품평 상품이미지)

@apiParamExample {json} Request-Example :
{
    "common": {
        ...
    },
    "params": {
	    "ordNo": "20171212123456",
        "ordItemSeq": "1",
        "siteNo": "6004",
        "itemId": "1234567890",
        "uitemId": "00000",
        "inqSalestrNo": "2818",
        "infloSiteNo": "6005",
        "recomExpsrYn": "Y",
        "postngCntt": "상품평 내용",
        "premCommentEntryYn": "N",
        "qualityEval": "5",
        "imgBeingYn": "Y",
        "fileNames": ["htmlhint1.PNG", "htmlhint2.PNG"],
        "urls": ["http://dev-ucc.ssgcdn.com/temp_up/2017121815171153797985379109_6171.PNG", "http://dev-ucc.ssgcdn.com/temp_up/2017121815171153797985379109_6172.PNG"],
        "vodBeingYn": "Y",
        "vodUrl": "http://dev-vpot.ssg.com/umov/vc/ITEMEVAL_NEW/201712/593/8492460385455665595830_s.mp4",
        "vodThmnlImgUrl": "http://dev-vpot.ssg.com/umov/vc/ITEMEVAL_NEW/201712/5/4200488840355665590488_300x200.jpg"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.notPdtEvalList 미등록상품리스트
@apiSuccess {String} data.notPdtEvalList.ordNo 주문번호
@apiSuccess {String} data.notPdtEvalList.ordItemSeq 주문상품순번
@apiSuccess {String} data.notPdtEvalList.itemId 상품ID
@apiSuccess {String} data.notPdtEvalList.uitemId 단품ID(옵션ID)
@apiSuccess {String} data.notPdtEvalList.itemNm 상품명
@apiSuccess {String} data.notPdtEvalList.uitemNm 단품명
@apiSuccess {String} data.notPdtEvalList.itemImgUrl 상품이미지URL
@apiSuccess {String} data.notPdtEvalList.siteNo 사이트번호
@apiSuccess {String} data.notPdtEvalList.siteNm 사이트명
@apiSuccess {String} data.notPdtEvalList.infloSiteNo 유입사이트번호
@apiSuccess {String} data.notPdtEvalList.inqSalestrNo 영업점번호

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "notPdtEvalList": [
            {
                "ordNo": "20171212123456",
                "ordItemSeq": "1",
                "itemId": "1234567890",
                "uitemId": "00001",
                "itemNm": "상품명",
                "uitemNm": "옵션명",
                "itemImgUrl": "http://dev-item.ssgcdn.com/81/31/84/item/0000008843181_i1_70.jpg",
                "siteNo": "6004",
                "siteNm": "신세계몰",
                "infloSiteNo": "6005",
                "inqSalestrNo": "2018"
            },
            ...(생략)
        ]
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/postng/modifyPdtComm.ssg 상품평 수정 처리
@apiVersion 1.0.0
@apiName PostngController.modifyPdtComm()
@apiGroup Postng
@apiSampleRequest off
@apiPermission none

@apiDescription
레드마인 : #265239

<br>- source : PostngController.java modifyPdtComm()
<br>- 담당자 : 박정환P

@apiParam {String} postngId 게시글ID
@apiParam {String} siteNo 사이트번호
@apiParam {String} itemId 상품ID
@apiParam {String} uitemId 단품ID(옵션)
@apiParam {String="Y", "N"} recomExpsrYn 상품평 노출여부
@apiParam {String} [postngCntt] 상품평 내용
@apiParam {String="Y", "N"} premCommentEntryYn 프리미엄상품평 지원여부
@apiParam {String} qualityEval 상품평점
@apiParam {String="Y", "N"} imgBeingYn 이미지 포함여부
@apiParam {String[]} [fileNames] 이미지 파일명 배열
@apiParam {String[]} [urls] 이미지 URL 배열
@apiParam {String="Y", "N"} vodBeingYn 동영상포함여부
@apiParam {String} [vodUrl] 동영상 URL
@apiParam {String} [vodThmnlImgUrl] 동영상 썸네일 이미지 URL

@apiParamExample {json} Request-Example :
{
    "common": {
        ...
    },
    "params": {
		"postngId": "123456",
        "siteNo": "6004",
        "itemId": "1234567890",
        "uitemId": "00000",
        "recomExpsrYn": "Y",
        "postngCntt": "상품평 내용",
        "premCommentEntryYn": "N",
        "qualityEval": "5",
        "imgBeingYn": "Y",
        "fileNames": ["htmlhint1.PNG", "htmlhint2.PNG"],
        "urls": ["http://dev-ucc.ssgcdn.com/temp_up/2017121815171153797985379109_6171.PNG", "http://dev-ucc.ssgcdn.com/temp_up/2017121815171153797985379109_6172.PNG"],
        "vodBeingYn": "Y",
        "vodUrl": "http://dev-vpot.ssg.com/umov/vc/ITEMEVAL_NEW/201712/593/8492460385455665595830_s.mp4",
        "vodThmnlImgUrl": "http://dev-vpot.ssg.com/umov/vc/ITEMEVAL_NEW/201712/5/4200488840355665590488_300x200.jpg"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
