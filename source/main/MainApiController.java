/**

@api {post} /api/ssg/hotDeal/datas.ssg SSG 메인
@apiVersion 1.0.0
@apiName SsgHomeController.getHotDealSsgDatas
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
SSG 메인 API

<br>- source : SsgHomeController.getHotDealSsgDatas()
<br>- 담당자 : 개발1팀 유현재P, 박정환P

@apiParam {String} [apiVersion=1.2] apiVersion api버전
@apiParam {String} itemImgSize 상품이미지 size
@apiParam {String} [page=1] page 페이지번호

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver":"2.4.0",
        "os_cd":"20",
        "ts":"20170804141303",
        "mobil_app_no":"12"
    },
    "params":{
        "itemImgSize":"500",
        "apiVersion":"1.2",
        "page":"1"
    }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/ssg/hotDeal/datas.ssg -d '
> {"common":{"apl_ver":"2.4.0","os_cd":"20","ts":"20170825135913","mobil_app_no":"12"},"params":{"itemImgSize":"500","apiVersion":"1.2","page":"1"}}'

@apiSuccess {String}     res_code 응답코드
@apiSuccess {String}     res_message 응답메시지
@apiSuccess {Object}     data 응답결과값
@apiSuccess {List} data.cornerList 응답결과목록
@apiSuccess {String="promotionBanner","cardBanner","videoBanner","textBanner","imageBanner","sellerBanner","planshop_cu","hotDealItem","obanjang","happyVirus","searchkeyword"} data.cornerList.unitType 유닛타입
@apiSuccess {String} data.cornerList.data 타입별 데이터
@apiSuccess {List} data.cornerList.data-unitType:promotionBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:cardBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:videoBanner 동영상배너리스트
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.title 제목
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.regTypeCd 틍록타입코드 10:직접등록, 20:url등록
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.subtlCntt 자막내용
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.dataFileNm 동영상URL
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.imgFileNm 이미지URL
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.banrTgtTypeCd 배너대상타입코드 (사용안함)
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.endDts 전시종료일
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.imgWidth 이미지 가로 사이즈
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.imgHeight 이미지 세로 사이즈
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.dispOrdr 전시순서
@apiSuccess {List} data.cornerList.data-unitType:textBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:imageBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:adBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr) 광고표시
@apiSuccess {List} data.cornerList.data-unitType:sellerBanner 셀러톡 데이터
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.sellerHomeName 셀러홈명
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.statusMessage 상태메세지
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.backgroundImageUrl 배경 이미지 경로
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.profileImageUrl 프로필 이미지 경로
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.lnkdUrl 링크 Url
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.lnkdType 링크 연결 방법
@apiSuccess {List} data.cornerList.data-unitType:planshop_cu 기획전 collection UI 데이터
@apiSuccess {String} data.cornerList.data-unitType:planshop_cu.pnshopAplSiteNo 기획전 적용 사이트 번호
@apiSuccess {Object} data.cornerList.data-unitType:planshop_cu.planshop [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:planshop_cu.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.cornerList.data-unitType:hotDealItem [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.maiTitleNm1 메인타이틀1
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.maiTitleNm2 메인타이틀2
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.subtitlNm1 서브타이틀1
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.subtitlNm2 서브타이틀2
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.usablInvQty 재고 수량
@apiSuccess {List} data.cornerList.data-unitType:obanjang [오반장 상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.cornerList.data-unitType:happyVirus [해피바이러스 상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.cornerList.data-unitType:searchkeyword 검색어 리스트
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.aplSiteNo 적용사이트번호
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.srchwdNm 검색어명
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.dispOrdr 전시순서
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.vrbRankg 변동순위
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.srchwdNewYn 검색어신규여부

@apiSuccessExample Response (example):
{
  "cached": false,
  "method": "",
  "res_code": "200",
  "res_message": "성공",
  "data": {
    "cornerList": [
      {
        "unitType": "promotionBanner",
        "data": [
          {
            "id": "",
            "title": "HOWDY GRAND OPEN",
            "desc": "HOWDY GRAND OPEN",
            "lnkdUrl": "http://m.ssg.com/plan/planShop.ssg?dispCmptId=6000159775",
            "lnkdType": "10",
            "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082308583509068290901929_633.jpg",
            "strtDts": "20170823000000",
            "endDts": "20170823235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "750",
            "imgHeight": "560",
            "dispOrdr": "1",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
          }
        ]
      },
      {
        "unitType": "cardBanner",
        "data": [
          {
            "id": "",
            "title": "KB 5%+5%(8/23~25)",
            "desc": "KB 5%+5%(8/23~25)",
            "lnkdUrl": "http://m.ssg.com/event/eventDetail.ssg?promId=1100248284",
            "lnkdType": "10",
            "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201706/2017061614153309082170902317_106.jpg",
            "strtDts": "20170823000000",
            "endDts": "20170825235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "302",
            "imgHeight": "62",
            "dispOrdr": "0",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
          }
        ]
      },
      {
        "unitType": "videoBanner",
        "data": []
      },
      {
        "unitType": "imageBanner",
        "data": [
          {
            "id": "",
            "title": "2017 쓱력 #SSG스럽다_14일",
            "desc": "2017 쓱력 #SSG스럽다_14일",
            "lnkdUrl": "http://m.ssg.com/event/eventDetail.ssg?promId=1100241638",
            "lnkdType": "10",
            "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017081018033109037120903912_227.jpg",
            "strtDts": "20170814000000",
            "endDts": "20170831235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "720",
            "imgHeight": "156",
            "dispOrdr": "1",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
          }
        ]
      },
	  {
	    "unitType": "sellerBanner",
		"data": [
		  {
		    "sellerHomeName": "MLB키즈 본점",
			"backgroundImageUrl": "http://img.ssgcdn.com/trans.ssg?src=/talk/85/61/98/s_230932495031353653136365.JPG",
			"lnkdUrl": "ssg://ssgtalk/opentab/seller",
			"profileImageUrl": "http://img.ssgcdn.com/trans.ssg?src=/talk/48/97/36/s_230929958289993659001365.JPG",
			"lnkdType": "60",
			"statusMessage": "신세계본점에서가을 신상품15만원이상 구매시 비치타월 선착순 드려요~"
		  }
		]
	  },
      {
        "unitType": "planshop_cu",
        "data": [
          {
            "itemList": [
              {
                상품유닛
              }
            ],
            "pnshopAplSiteNo": "6004",
            "planshop": {
              "id": "",
              "title": "",
              "desc": "",
              "lnkdUrl": "http://m.ssg.com/plan/planShop.ssg?dispCmptId=6000051146",
              "lnkdType": "10",
              "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082214412380478518042951_643.jpg",
              "strtDts": "20170823090000",
              "endDts": "20170826090059",
              "maiTitleNm1": "버버리 스페셜",
              "maiTitleNm2": "비스트 컬렉션",
              "subtitlNm1": "",
              "subtitlNm2": "",
              "iconTgtLst": "",
              "titleShadUseYn": "",
              "imgWidth": "720",
              "imgHeight": "720",
              "dispOrdr": "-4",
              "bakgrndColrCdVal": "",
              "iconTgtList": []
            }
          }
        ]
      },
      {
        "unitType": "hotDealItem",
        "data": [
          {
            상품유닛
          }
        ]
      },,
      {
        "unitType": "happyVirus",
        "data": [
          {
            해피바이러스 상품유닛
          }
        ]
      },
      {
        "unitType": "obanjang",
        "data": [
          {
		    오반장 상품유닛
          }
        ]
      },
      {
        "unitType": "searchkeyword",
        "data": [
          {
            "aplSiteNo": "6005",
            "srchwdNm": "소파패드",
            "dispOrdr": "1",
            "vrbRankg": "19",
            "srchwdNewYn": "N"
          },
          {
            "aplSiteNo": "6005",
            "srchwdNm": "드롱기 전기포트",
            "dispOrdr": "2",
            "vrbRankg": "19",
            "srchwdNewYn": "N"
          }
        ]
      }
    ],
    "hasNext": "true"
  }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/ssg/hotDeal/datas.ssg SSG 메인 (ABC테스트 B/C타입)
@apiVersion 1.0.0
@apiName SsgHomeController.getHotDealSsgDatas_bctype
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
SSG 메인 ABC테스트 B/C타입 API

<br>- source : SsgHomeController.getHotDealSsgDatas()
<br>- 담당자 : 개발1팀 유현재P, 박정환P

@apiParam {String="10","20","30"} abTestType ABC테스트 타입
@apiParam {String} [apiVersion=1.2] apiVersion api버전
@apiParam {String} itemImgSize 상품이미지 size
@apiParam {String} [page=1] page 페이지번호

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver":"2.4.0",
        "os_cd":"20",
        "ts":"20170804141303",
        "mobil_app_no":"12"
    },
    "params":{
        "abTestType":"20",
        "itemImgSize":"500",
        "apiVersion":"1.2",
        "page":"1"
    }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/ssg/hotDeal/datas.ssg -d '
> {"common":{"apl_ver":"2.4.0","os_cd":"20","ts":"20170825135913","mobil_app_no":"12"},"params":{"abTestType":"20", "itemImgSize":"500","apiVersion":"1.2","page":"1"}}'

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String}   data.hasNext 다음페이지 여부
@apiSuccess {List}   data.unitList 유닛리스트
@apiSuccess {String="cardbanner","sellerbanner","event","planshop","item","obanjang","happyVirus","searchkeyword"} data.unitList.unitType 유닛타입
@apiSuccess {String} data.unitList.unitData                타입별 데이터
@apiSuccess {String} data.unitList.unitData.aplSiteNo      적용사이트번호
@apiSuccess {String} data.unitList.unitData.lnkdUrl        링크 Url
@apiSuccess {String} data.unitList.unitData.lnkdType       링크 연결 방법
@apiSuccess {String} data.unitList.unitData.accumCritnDts  검색어집계기준일(YYYYMMDDHH24MISS)
@apiSuccess {Object} data.unitList.unitData.banner         [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List}   data.unitList.unitData.bannerList     [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object} data.unitList.unitData.item           [상품유닛-핫딜](#api-header-for-a-submenu-itemunit)
@apiSuccess {Object} data.unitList.unitData.obanjangItem   [상품유닛-오반장](#api-header-for-a-submenu-itemunit)
@apiSuccess {Object} data.unitList.unitData.happyVirusItem [상품유닛-해바유닛](#api-header-for-a-submenu-itemunit)
@apiSuccess {List}   data.unitList.unitData.itemList       [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {Object} data.unitList.unitData.event          이벤트 데이터
@apiSuccess {String} data.unitList.unitData.event.title 이벤트 타이틀
@apiSuccess {String} data.unitList.unitData.event.lnkdUrl 링크 Url
@apiSuccess {String} data.unitList.unitData.event.strtDts 이벤트 시작일
@apiSuccess {String} data.unitList.unitData.event.endDts 이벤트 종료일
@apiSuccess {String} data.unitList.unitData.event.siteNo 이벤트 사이트번호
@apiSuccess {String} data.unitList.unitData.event.endDts 이벤트 종료일
@apiSuccess {String} data.unitList.unitData.event.imgFileNm 이미지 경로
@apiSuccess {String} data.unitList.unitData.event.imgWidth 이미지 넓이값
@apiSuccess {String} data.unitList.unitData.event.imgHeight 이미지 높이값
@apiSuccess {String} data.unitList.unitData.event.eventTypeNm 이벤트 유형
@apiSuccess {String} data.unitList.unitData.event.maiTitleNm1 메인타이틀1
@apiSuccess {String} data.unitList.unitData.event.maiTitleNm2 메인타이틀2
@apiSuccess {String} data.unitList.unitData.event.subtitlNm1 서브타이틀1
@apiSuccess {String} data.unitList.unitData.event.subtitlNm2 서브타이틀2
@apiSuccess {Object} data.unitList.unitData.sellerbanner  셀러톡 데이터
@apiSuccess {String} data.unitList.unitData.sellerbanner.sellerHomeName 셀러홈명
@apiSuccess {String} data.unitList.unitData.sellerbanner.statusMessage 상태메세지
@apiSuccess {String} data.unitList.unitData.sellerbanner.backgroundImageUrl 배경 이미지 경로
@apiSuccess {String} data.unitList.unitData.sellerbanner.profileImageUrl 프로필 이미지 경로
@apiSuccess {String} data.unitList.unitData.sellerbanner.lnkdUrl 링크 Url
@apiSuccess {String} data.unitList.unitData.sellerbanner.lnkdType 링크 연결 방법
@apiSuccess {List}   data.unitList.unitData.titleList 기획전 구분 타이틀 리스트
@apiSuccess {List}   data.unitList.unitData.searchkeywordList 검색어 리스트
@apiSuccess {String} data.unitList.unitData.searchkeywordList.aplSiteNo 적용사이트번호
@apiSuccess {String} data.unitList.unitData.searchkeywordList.srchwdNm 검색어명
@apiSuccess {String} data.unitList.unitData.searchkeywordList.dispOrdr 전시순서
@apiSuccess {String} data.unitList.unitData.searchkeywordList.vrbRankg 변동순위
@apiSuccess {String} data.unitList.unitData.searchkeywordList.srchwdNewYn 검색어신규여부
@apiSuccess {String} data.unitList.unitData.searchkeywordList.accumCritnDts 검색어집계기준일(millisecond)
@apiSuccess {Object} data.unitList.unitData.clipInfo [클립 유닛](#api-header-for-a-submenu-clipunit)
@apiSuccess {String} data.unitList.unitData.shareInfo 공유 데이터
@apiSuccess {String} data.unitList.unitData.shareInfo.snsTitle 공유제목
@apiSuccess {String} data.unitList.unitData.shareInfo.snsSummary 공유내용
@apiSuccess {String} data.unitList.unitData.shareInfo.snsImg 공유이미지
@apiSuccess {String} data.unitList.unitData.shareInfo.snsUrl 공유URL
@apiSuccess {String} data.unitList.unitData.shareInfo.snsGbn 공유구분

@apiSuccessExample Response (example):
{
  "cached": false,
  "method": "",
  "res_code": "200",
  "res_message": "성공",
  "data": {
    "hasNext": "false",
    "unitList": [
      {
        "unitType": "event",
        "unitData": {
          "event": {
            "title": "구매합산 구간 체크",
            "lnkdUrl": "http://dev-m.ssg.com/event/eventDetail.ssg?promId=1100107833",
            "strtDts": "20170901000000",
            "endDts": "20171031235959",
            "siteNo": "",
            "imgFileNm": "http://dev-static.ssgcdn.com/promo/event/ssg/201710/1100107833_1507624027823.jpg",
            "imgWidth": "",
            "imgHeight": "",
            "eventTypeNm": "구매합산",
            "attnDivCd": "60",
            "attnTgtIdnfNo1": "1100107833",
            "attnTgtIdnfNo2": "",
            "maiTitleNm1": "아이폰X+순금 골드바 증정!",
            "maiTitleNm2": "",
            "subtitlNm1": "쓱배송으로 살자",
            "subtitlNm2": ""
          },
          "aplSiteNo": "6005"
        }
      },
      {
        "unitType": "cardbanner",
        "unitData": {
          "bannerList": [
            {
              "id": "",
              "title": "22",
              "desc": "22",
              "lnkdUrl": "22",
              "lnkdType": "20",
              "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201701/2017010315073837285673721767_443.jpg",
              "strtDts": "20170103000000",
              "endDts": "20180103235959",
              "maiTitleNm1": "SSG카드 청구할인",
              "maiTitleNm2": "",
              "subtitlNm1": "20%",
              "subtitlNm2": "",
              "iconTgtLst": "",
              "titleShadUseYn": "",
              "imgWidth": "302",
              "imgHeight": "62",
              "dispOrdr": "0",
              "bakgrndColrCdVal": "",
              "banrRplcTextNm": "22",
              "iconTgtList": []
            },
            {
              "id": "",
              "title": "22",
              "desc": "22",
              "lnkdUrl": "22",
              "lnkdType": "20",
              "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201701/2017010315073837285673721767_443.jpg",
              "strtDts": "20170103000000",
              "endDts": "20180103235959",
              "maiTitleNm1": "현대e카드 청구할인",
              "maiTitleNm2": "",
              "subtitlNm1": "5%",
              "subtitlNm2": "",
              "iconTgtLst": "",
              "titleShadUseYn": "",
              "imgWidth": "302",
              "imgHeight": "62",
              "dispOrdr": "0",
              "bakgrndColrCdVal": "",
              "banrRplcTextNm": "22",
              "iconTgtList": []
            }
          ],
          "lnkdUrl": "event",
          "aplSiteNo": "6005",
          "lnkdType": "20"
        }
      },
      {
        "unitType": "event",
        "unitData": {
          "event": {
            "title": "사다리타기",
            "lnkdUrl": "http://dev-m.ssg.com/event/eventDetail.ssg?promId=1100107849",
            "strtDts": "20170913000000",
            "endDts": "20171031235959",
            "siteNo": "",
            "imgFileNm": "http://dev-static.ssgcdn.com/promo/event/ssg/201710/1100107849_1507788106998.jpg",
            "imgWidth": "",
            "imgHeight": "",
            "eventTypeNm": "",
            "attnDivCd": "60",
            "attnTgtIdnfNo1": "1100107849",
            "attnTgtIdnfNo2": ""
            "maiTitleNm1": "사다리타기",
            "maiTitleNm2": "",
            "subtitlNm1": "사다리타기",
            "subtitlNm2": ""
          },
          "aplSiteNo": "6005"
        }
      },
      {
        "unitType": "planshop",
        "unitData": {
          "titleList": [
            "차렵 매커세트",
            "사계절이불 세트",
            "유아 침구",
            "차렵 요세트",
            "주니어 침구"
          ],
          "itemList": [
            상품유닛리스트
          ],
          "aplSiteNo": "6004",
          "banner": {
            "id": "",
            "title": "키즈돔 아동침구 기획전",
            "desc": "",
            "lnkdUrl": "http://local-m.ssg.com/plan/planShop.ssg?dispCmptId=3600114601",
            "lnkdType": "10",
            "imgFileNm": "http://dev-img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201508/20150825161105_325.jpg&w=720&h=452&edit=c&t=44b0bca8062b66eec28b7613ebd9353305696dd8",
            "strtDts": "",
            "endDts": "",
            "maiTitleNm1": "키즈돔 아동침구",
            "maiTitleNm2": "아이방 꾸미기!",
            "subtitlNm1": "다양한 디자인",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "720",
            "imgHeight": "452",
            "dispOrdr": "",
            "bakgrndColrCdVal": "",
            "banrRplcTextNm": "키즈돔 아동침구 아이방 꾸미기! 다양한 디자인",
            "iconTgtList": []
          }
        }
      },
      {
	    "unitType": "sellerBanner",
		"unitData": [
		  "sellerbanner": {
		    "sellerHomeName": "라움에디션 강남점",
			"backgroundImageUrl": "http://img.ssgcdn.com/trans.ssg?src=/talk/96/36/34/s_163232647199330909934090.jpg",
			"lnkdUrl": "ssg://ssgtalk/opentab/seller",
			"profileImageUrl": "http://img.ssgcdn.com/trans.ssg?src=/talk/01/36/34/s_163232646600370900038090.png",
			"lnkdType": "60",
			"statusMessage": ""
		  }
		]
	  },
      {
        "unitType": "item",
        "unitData": {
          "item": {
            상품유닛
          },
          "aplSiteNo": "6001"
        }
      },
      {
        "unitType": "obanjang",
        "unitData": {
          "obanjangItem": {
            오반장상품유닛
          },
          "aplSiteNo": "6001"
        }
      },
      {
        "unitType": "happyVirus",
        "data": [
          "happyVirusItem": {
            해바상품유닛
          }
		  "aplSiteNo": "6004"
        ]
      },
      {
        "unitType": "searchkeyword",
        "unitData": {
          "aplSiteNo": "6005",
          "searchkeywordList": [
            {
              "aplSiteNo": "6005",
              "srchwdNm": "아디다스",
              "dispOrdr": "1",
              "vrbRankg": "1",
              "srchwdNewYn": "N"
            },
            {
              "aplSiteNo": "6005",
              "srchwdNm": "나이키",
              "dispOrdr": "2",
              "vrbRankg": "1",
              "srchwdNewYn": "N"
            },
            {
              "aplSiteNo": "6005",
              "srchwdNm": "맨투맨",
              "dispOrdr": "3",
              "vrbRankg": "1",
              "srchwdNewYn": "N"
            },
            {
              "aplSiteNo": "6005",
              "srchwdNm": "빈",
              "dispOrdr": "4",
              "vrbRankg": "1",
              "srchwdNewYn": "N"
            },
            {
              "aplSiteNo": "6005",
              "srchwdNm": "야상",
              "dispOrdr": "5",
              "vrbRankg": "1",
              "srchwdNewYn": "N"
            }
          ]
        }
      }
    ]
  }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/small/hotDeal/datas.ssg 신세계몰 메인
@apiVersion 1.0.0
@apiName SmallHomeController.getHotDealSmallDatas
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
신세계몰 메인 API

<br>- source : SmallHomeController.getHotDealSmallDatas()
<br>- 담당자 : 개발1팀 유현재P, 박정환P

@apiParam {String} [apiVersion=1.2] apiVersion api버전
@apiParam {String} itemImgSize 상품이미지 size
@apiParam {String} [page=1] page 페이지번호

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver":"6.4.2",
        "os_cd":"20",
        "ts":"20170825135913",
        "mobil_app_no":"17"
    },
    "params":{
        "itemImgSize":"500",
        "apiVersion":"1.2",
        "page":"1"
    }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/small/hotDeal/datas.ssg -d '
> {"common":{"apl_ver":"6.4.2","os_cd":"20","ts":"20170825135913","mobil_app_no":"17"},"params":{"itemImgSize":"500","apiVersion":"1.2","page":"1"}}'

@apiSuccess {String}     res_code 응답코드
@apiSuccess {String}     res_message 응답메시지
@apiSuccess {Object}     data 응답결과값
@apiSuccess {List} data.cornerList 응답결과목록
@apiSuccess {String="promotionBanner","cardBanner","videoBanner","textBanner","imageBanner","sellerBanner","planshop_cu","hotDealItem","obanjang","happyVirus","searchkeyword"} data.cornerList.unitType 유닛타입
@apiSuccess {String} data.cornerList.data 타입별 데이터
@apiSuccess {List} data.cornerList.data-unitType:promotionBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:cardBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:videoBanner 동영상배너리스트
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.title 제목
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.regTypeCd 틍록타입코드 10:직접등록, 20:url등록
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.subtlCntt 자막내용
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.dataFileNm 동영상URL
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.imgFileNm 이미지URL
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.banrTgtTypeCd 배너대상타입코드 (사용안함)
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.endDts 전시종료일
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.imgWidth 이미지 가로 사이즈
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.imgHeight 이미지 세로 사이즈
@apiSuccess {String} data.cornerList.data-unitType:videoBanner.dispOrdr 전시순서
@apiSuccess {List} data.cornerList.data-unitType:textBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:imageBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:adBanner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr) 광고표시
@apiSuccess {List} data.cornerList.data-unitType:sellerBanner 셀러톡 데이터
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.sellerHomeName 셀러홈명
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.statusMessage 상태메세지
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.backgroundImageUrl 배경 이미지 경로
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.profileImageUrl 프로필 이미지 경로
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.lnkdUrl 링크 Url
@apiSuccess {String} data.cornerList.data-unitType:sellerBanner.lnkdType 링크 연결 방법
@apiSuccess {List} data.cornerList.data-unitType:planshop_cu 기획전 collection UI 데이터
@apiSuccess {String} data.cornerList.data-unitType:planshop_cu.pnshopAplSiteNo 기획전 적용 사이트 번호
@apiSuccess {Object} data.cornerList.data-unitType:planshop_cu.planshop [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:planshop_cu.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.cornerList.data-unitType:hotDealItem [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.maiTitleNm1 메인타이틀1
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.maiTitleNm2 메인타이틀2
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.subtitlNm1 서브타이틀1
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.subtitlNm2 서브타이틀2
@apiSuccess {String} data.cornerList.data-unitType:hotDealItem.usablInvQty 재고 수량
@apiSuccess {List} data.cornerList.data-unitType:happyVirus [해피바이러스 상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.cornerList.data-unitType:searchkeyword 검색어 리스트
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.aplSiteNo 적용사이트번호
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.srchwdNm 검색어명
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.dispOrdr 전시순서
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.vrbRankg 변동순위
@apiSuccess {String} data.cornerList.data-unitType:searchkeyword.srchwdNewYn 검색어신규여부

@apiSuccessExample Response (example):
{
  "cached": false,
  "method": "",
  "res_code": "200",
  "res_message": "성공",
  "data": {
    "cornerList": [
      {
        "unitType": "promotionBanner",
        "data": [
          {
            "id": "",
            "title": "HOWDY GRAND OPEN",
            "desc": "HOWDY GRAND OPEN",
            "lnkdUrl": "http://m.ssg.com/plan/planShop.ssg?dispCmptId=6000159775",
            "lnkdType": "10",
            "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082308583509068290901929_633.jpg",
            "strtDts": "20170823000000",
            "endDts": "20170823235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "750",
            "imgHeight": "560",
            "dispOrdr": "1",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
          }
        ]
      },
      {
        "unitType": "cardBanner",
        "data": [
          {
            "id": "",
            "title": "KB 5%+5%(8/23~25)",
            "desc": "KB 5%+5%(8/23~25)",
            "lnkdUrl": "http://m.ssg.com/event/eventDetail.ssg?promId=1100248284",
            "lnkdType": "10",
            "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201706/2017061614153309082170902317_106.jpg",
            "strtDts": "20170823000000",
            "endDts": "20170825235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "302",
            "imgHeight": "62",
            "dispOrdr": "0",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
          }
        ]
      },
      {
        "unitType": "videoBanner",
        "data": []
      },
      {
        "unitType": "imageBanner",
        "data": [
          {
            "id": "",
            "title": "2017 쓱력 #SSG스럽다_14일",
            "desc": "2017 쓱력 #SSG스럽다_14일",
            "lnkdUrl": "http://m.ssg.com/event/eventDetail.ssg?promId=1100241638",
            "lnkdType": "10",
            "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017081018033109037120903912_227.jpg",
            "strtDts": "20170814000000",
            "endDts": "20170831235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "720",
            "imgHeight": "156",
            "dispOrdr": "1",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
          }
        ]
      },
	  {
	    "unitType": "sellerBanner",
		"data": [
		  {
		    "sellerHomeName": "MLB키즈 본점",
			"backgroundImageUrl": "http://img.ssgcdn.com/trans.ssg?src=/talk/85/61/98/s_230932495031353653136365.JPG",
			"lnkdUrl": "ssg://ssgtalk/opentab/seller",
			"profileImageUrl": "http://img.ssgcdn.com/trans.ssg?src=/talk/48/97/36/s_230929958289993659001365.JPG",
			"lnkdType": "60",
			"statusMessage": "신세계본점에서가을 신상품15만원이상 구매시 비치타월 선착순 드려요~"
		  }
		]
	  },
      {
        "unitType": "planshop_cu",
        "data": [
          {
            "itemList": [
              {
                상품유닛
              }
            ],
            "pnshopAplSiteNo": "6004",
            "planshop": {
              "id": "",
              "title": "",
              "desc": "",
              "lnkdUrl": "http://m.ssg.com/plan/planShop.ssg?dispCmptId=6000051146",
              "lnkdType": "10",
              "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082214412380478518042951_643.jpg",
              "strtDts": "20170823090000",
              "endDts": "20170826090059",
              "maiTitleNm1": "버버리 스페셜",
              "maiTitleNm2": "비스트 컬렉션",
              "subtitlNm1": "",
              "subtitlNm2": "",
              "iconTgtLst": "",
              "titleShadUseYn": "",
              "imgWidth": "720",
              "imgHeight": "720",
              "dispOrdr": "-4",
              "bakgrndColrCdVal": "",
              "iconTgtList": []
            }
          }
        ]
      },
      {
        "unitType": "hotDealItem",
        "data": [
          {
            상품유닛
          }
        ]
      },,
      {
        "unitType": "happyVirus",
        "data": [
          {
            해피바이러스 상품유닛
          }
        ]
      },
      {
        "unitType": "searchkeyword",
        "data": [
          {
            "aplSiteNo": "6005",
            "srchwdNm": "소파패드",
            "dispOrdr": "1",
            "vrbRankg": "19",
            "srchwdNewYn": "N"
          },
          {
            "aplSiteNo": "6005",
            "srchwdNm": "드롱기 전기포트",
            "dispOrdr": "2",
            "vrbRankg": "19",
            "srchwdNewYn": "N"
          }
        ]
      }
    ],
    "hasNext": "true"
  }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/home/dept/datas.ssg 신세계백화점 메인
@apiVersion 1.0.0
@apiName DeptHomeController.getDeptHomeMain
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
신세계백화점 메인 API

<br>- source : DeptHomeController.getDeptHomeMain()
<br>- 담당자 : 개발1팀 유현재P, 박정환P

@apiParam {String} itemImgSize 상품이미지 size

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"6.4.2",
        "os_cd":"20",
        "ts":"20170825145615",
        "mobil_app_no":"17"
    },
    "params":{
        "itemImgSize":"500"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.osmuMainTopBanr 메인탑배너
@apiSuccess {List} data.osmuMainTopBanr.bannerList [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object} data.happyBuyrus 해피바이러스 상품
@apiSuccess {List} data.happyBuyrus.happyBuyrusItemList [해피바이러스 상품유닛리스트](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "happyBuyrus": {
            "happyBuyrusItemList": [
                상품유닛
            ]
        },
        "osmuMainTopBanr": {
            "bannerList": [
                {
                    "id": "",
                    "title": "광주신세계 개점 축하 페스티벌",
                    "desc": "",
                    "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/planShop.ssg?planShopId=6000056508",
                    "lnkdType": "10",
                    "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017081814392709051250904225_170.jpg",
                    "strtDts": "20170821085000",
                    "endDts": "20170828084959",
                    "maiTitleNm1": "광주신세계 개점 22주년",
                    "maiTitleNm2": "",
                    "subtitlNm1": "S머니 3% + 7% 더블쿠폰",
                    "subtitlNm2": "",
                    "iconTgtLst": "",
                    "titleShadUseYn": "",
                    "imgWidth": "848",
                    "imgHeight": "512",
                    "dispOrdr": "1",
                    "bakgrndColrCdVal": "",
                    "iconTgtList": []
                }
            ]
        }
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/home/boots/datas.ssg Boots 메인
@apiVersion 1.0.0
@apiName BootsHomeController.getHomeBootsDatas
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
Boots 메인 API

<br>- source : BootsHomeController.getHomeBootsDatas()
<br>- 담당자 : 개발1팀 유현재P, 박정환P

@apiParam {String} itemImgSize 상품이미지 size

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"6.4.2",
        "os_cd":"20",
        "ts":"20170825145615",
        "mobil_app_no":"17"
    },
    "params":{
        "itemImgSize":"500"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.mainBannerList 메인배너
@apiSuccess {List} data.mainBannerList.bannerList [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object} data.trendBannerList 트렌드배너
@apiSuccess {List} data.trendBannerList.bannerList [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object} data.brandBannerList 브랜드배너
@apiSuccess {List} data.brandBannerList.bannerList [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object} data.storeBannerList 스토어배너
@apiSuccess {List} data.storeBannerList.bannerList [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object} data.locatorBannerList Locator배너
@apiSuccess {List} data.locatorBannerList.bannerList [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object} data.brandItemList 브랜드 상품(Only Boots)
@apiSuccess {List} data.brandItemList.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {Object} data.saleItemList 세일 상품(3 for 2)
@apiSuccess {List} data.saleItemList.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "mainBannerList": {
            "bannerList": [
                {
                    "id": "",
                    "title": "광주신세계 개점 축하 페스티벌",
                    "desc": "",
                    "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/planShop.ssg?planShopId=6000056508",
                    "lnkdType": "10",
                    "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017081814392709051250904225_170.jpg",
                    "strtDts": "20170821085000",
                    "endDts": "20170828084959",
                    "maiTitleNm1": "광주신세계 개점 22주년",
                    "maiTitleNm2": "",
                    "subtitlNm1": "S머니 3% + 7% 더블쿠폰",
                    "subtitlNm2": "",
                    "iconTgtLst": "",
                    "titleShadUseYn": "",
                    "imgWidth": "848",
                    "imgHeight": "512",
                    "dispOrdr": "1",
                    "bakgrndColrCdVal": "",
                    "iconTgtList": []
                }
            ]
        },
        "trendBannerList": {
            "bannerList": [
                {
                    "id": "",
                    "title": "광주신세계 개점 축하 페스티벌",
                    "desc": "",
                    "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/planShop.ssg?planShopId=6000056508",
                    "lnkdType": "10",
                    "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017081814392709051250904225_170.jpg",
                    "strtDts": "20170821085000",
                    "endDts": "20170828084959",
                    "maiTitleNm1": "광주신세계 개점 22주년",
                    "maiTitleNm2": "",
                    "subtitlNm1": "S머니 3% + 7% 더블쿠폰",
                    "subtitlNm2": "",
                    "iconTgtLst": "",
                    "titleShadUseYn": "",
                    "imgWidth": "848",
                    "imgHeight": "512",
                    "dispOrdr": "1",
                    "bakgrndColrCdVal": "",
                    "iconTgtList": []
                }
            ]
        },
        "brandBannerList": {
            "bannerList": [
                {
                    "id": "",
                    "title": "광주신세계 개점 축하 페스티벌",
                    "desc": "",
                    "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/planShop.ssg?planShopId=6000056508",
                    "lnkdType": "10",
                    "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017081814392709051250904225_170.jpg",
                    "strtDts": "20170821085000",
                    "endDts": "20170828084959",
                    "maiTitleNm1": "광주신세계 개점 22주년",
                    "maiTitleNm2": "",
                    "subtitlNm1": "S머니 3% + 7% 더블쿠폰",
                    "subtitlNm2": "",
                    "iconTgtLst": "",
                    "titleShadUseYn": "",
                    "imgWidth": "848",
                    "imgHeight": "512",
                    "dispOrdr": "1",
                    "bakgrndColrCdVal": "",
                    "iconTgtList": []
                }
            ]
        },
        "storeBannerList": {
            "bannerList": [
                {
                    "id": "",
                    "title": "광주신세계 개점 축하 페스티벌",
                    "desc": "",
                    "lnkdUrl": "http://m.shinsegaemall.ssg.com/plan/planShop.ssg?planShopId=6000056508",
                    "lnkdType": "10",
                    "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017081814392709051250904225_170.jpg",
                    "strtDts": "20170821085000",
                    "endDts": "20170828084959",
                    "maiTitleNm1": "광주신세계 개점 22주년",
                    "maiTitleNm2": "",
                    "subtitlNm1": "S머니 3% + 7% 더블쿠폰",
                    "subtitlNm2": "",
                    "iconTgtLst": "",
                    "titleShadUseYn": "",
                    "imgWidth": "848",
                    "imgHeight": "512",
                    "dispOrdr": "1",
                    "bakgrndColrCdVal": "",
                    "iconTgtList": []
                }
            ]
        },
        "locatorBannerList": {
			"bannerList": [
			  	{
					"id": "",
					"title": "테스트1 배너제목영역",
					"desc": "명동점",
					"lnkdUrl": "https://goo.gl/maps/m5i1ua5XKTk",
					"lnkdType": "10",
					"imgFileNm": "",
					"strtDts": "20171129000000",
					"endDts": "20181231235959",
					"maiTitleNm1": "서울특별시 중구 명동길 43(명동1가) 신한빌딩",
					"maiTitleNm2": "02-779-7045",
					"subtitlNm1": "월~목 : AM 10:00 ~ PM 10 :30",
					"subtitlNm2": "금~일 : AM 10:00 ~ PM 11:00",
					"iconTgtLst": "",
					"titleShadUseYn": "",
					"imgWidth": "0",
					"imgHeight": "0",
					"dispOrdr": "0",
					"bakgrndColrCdVal": "",
					"banrRplcTextNm": "",
					"iconTgtList": [],
				}
			],
		},
        "brandItemList": {
            "itemList": [
                상품유닛
            ]
        },
        "saleItemList": {
            "itemList": [
                상품유닛
            ]
        }
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/home/howdy/datas.ssg HOWDY 메인
@apiVersion 1.0.0
@apiName HowdyHomeController.getHomeHowdyDatas
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
HOWDY 메인 API

<br>- source : HowdyHomeController.getHomeHowdyDatas()
<br>- 담당자 : 개발1팀 유현재P, 박정환P

@apiParam {String} itemImgSize 상품이미지 size

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"6.4.2",
        "os_cd":"20",
        "ts":"20170825145615",
        "mobil_app_no":"17"
    },
    "params":{
        "itemImgSize":"500"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.herosBannerList 히어로배너 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.articleAndNewsList Article & News
@apiSuccess {String} data.articleAndNewsList.shpgMgzId 매거진 ID
@apiSuccess {String} data.articleAndNewsList.contentNm 컨텐츠 타입명
@apiSuccess {String} data.articleAndNewsList.iconTgtLst 컨텐츠 타입명
@apiSuccess {String} data.articleAndNewsList.title 제목
@apiSuccess {String} data.articleAndNewsList.maiTitleNm1 제목
@apiSuccess {String} data.articleAndNewsList.desc 설명
@apiSuccess {String} data.articleAndNewsList.lnkdUrl 배너 링크
@apiSuccess {String} data.articleAndNewsList.lnkdType 링크 타입 (10 : 웹링크, 20 : 앱링크)
@apiSuccess {String} data.articleAndNewsList.imgFileNm 이미지 파일 절대경로
@apiSuccess {String} data.articleAndNewsList.strtDts 전시시작일
@apiSuccess {String} data.articleAndNewsList.endDts 전시종료일
@apiSuccess {String} data.articleAndNewsList.imgWidth 이미지 가로
@apiSuccess {String} data.articleAndNewsList.imgHeight 이미지 세로
@apiSuccess {String} data.articleAndNewsList.dispOrdr 전시순서
@apiSuccess {String} data.articleAndNewsList.bakgrndColrCdVal 배경색
@apiSuccess {String} data.articleAndNewsList.siteNo 클립을 위한 사이트번호
@apiSuccess {String} data.articleAndNewsList.attnDivCd 클립을 위한 구분코드
@apiSuccess {String} data.articleAndNewsList.attnDivDtlCd 클립을 위한 구분상세코드
@apiSuccess {String} data.articleAndNewsList.attnTgtIdnfNo1 클립을 위한 ID 1
@apiSuccess {String} data.articleAndNewsList.attnTgtIdnfNo2 클립을 위한 ID 2
@apiSuccess {List} data.pickItem1List TODAYS PICK 상품 1~12 [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.pickItem2List TODAYS PICK 상품 13~24 [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.wideBanner1List 와이드배너1 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.wideBanner2List 와이드배너2 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.socialBannerList 소셜미디어 배너 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.noticeBannerList 메인 공지레이어 배너 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "herosBannerList": [
            {
                "id": "",
                "title": "GRAND OPEN 20%",
                "desc": "GRAND OPEN 20%",
                "lnkdUrl": "http://m.howdy.ssg.com/plan/planShop.ssg?dispCmptId=6000159775&_mpop=new",
                "lnkdType": "10",
                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082216444880457618049761_731.jpg",
                "strtDts": "20170823000000",
                "endDts": "20170830000059",
                "maiTitleNm1": "PROMOTION",
                "maiTitleNm2": "GRAND OPEN",
                "subtitlNm1": "그랜드 오픈 기념 S-MONEY 20% 적립",
                "subtitlNm2": "\"How to be a Man\" 기획전 상품 구매 시 \\nS-MONEY 20% 적립 (행사기간:2017.08.23 - 08.29)",
                "iconTgtLst": "",
                "titleShadUseYn": "",
                "imgWidth": "750",
                "imgHeight": "540",
                "dispOrdr": "0",
                "bakgrndColrCdVal": "",
                "iconTgtList": []
            }
        ],
        "articleAndNewsList": [
            {
                "shpgMgzId": "7000000583",
                "contentNm": "NEWS",
                "iconTgtLst": "NEWS",
                "title": "한강의 가을",
                "maiTitleNm1": "한강의 가을",
                "desc": "한강에서 음악 축제가 펼쳐진다.",
                "lnkdUrl": "http://m.howdy.ssg.com/contents/journal.ssg?shpgMgzId=7000000583",
                "lnkdType": "10",
                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082418093180479758041085_575.png",
                "strtDts": "20170825000000",
                "endDts": "29991231235959",
                "imgWidth": "0",
                "imgHeight": "0",
                "dispOrdr": "0",
                "bakgrndColrCdVal": "",
                "siteNo": "6100",
                "attnDivCd": "80",
                "attnDivDtlCd": "81",
                "attnTgtIdnfNo1": "7000000583",
                "attnTgtIdnfNo2": ""
            }
        ],
        "pickItem1List": [
            {
                상품유닛
            }
        ],
        "wideBanner1List": [
            {
                "id": "",
                "title": "170823_PLAY BOY",
                "desc": "170823_PLAY BOY",
                "lnkdUrl": "http://m.howdy.ssg.com/disp/category.ssg?ctgId=6000027330",
                "lnkdType": "10",
                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082209074209045530902653_845.png",
                "strtDts": "20170823000000",
                "endDts": "29991231235959",
                "maiTitleNm1": "HOWDY PICK : PLAY",
                "maiTitleNm2": "PLAY BOY",
                "subtitlNm1": "어른들의 플레이 타임을 위한 드론과 게임기들.",
                "subtitlNm2": "",
                "iconTgtLst": "",
                "titleShadUseYn": "",
                "imgWidth": "750",
                "imgHeight": "540",
                "dispOrdr": "1",
                "bakgrndColrCdVal": "white",
                "iconTgtList": []
            }
        ],
        "pickItem2List": [
            {
                상품유닛
            }
        ],
        "wideBanner2List": [
            {
                "id": "",
                "title": "170818_GRADO",
                "desc": "170818_GRADO",
                "lnkdUrl": "http://m.howdy.ssg.com/disp/brandShop.ssg?brandId=1010020006",
                "lnkdType": "10",
                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082209181943306824335682_684.png",
                "strtDts": "20170823000000",
                "endDts": "29991231235959",
                "maiTitleNm1": "HOWDY PICK : BRAND",
                "maiTitleNm2": "GRADO",
                "subtitlNm1": "청량하고 섬세한 소리를 구현하는 미국의 프리미엄 헤드폰 브랜드.",
                "subtitlNm2": "",
                "iconTgtLst": "",
                "titleShadUseYn": "",
                "imgWidth": "750",
                "imgHeight": "540",
                "dispOrdr": "1",
                "bakgrndColrCdVal": "white",
                "iconTgtList": []
            }
        ],
        "socialBannerList": [
            {
                "id": "",
                "title": "GRANDOPEN_FB_170825",
                "desc": "#howdy #howdymakesman #howdytobeaman #howdy_formen #LIVING #TECH #STYLE #GROOMING #HOBBY #하우디 #남자 #라이프스타일 #쇼핑 #큐레이팅",
                "lnkdUrl": "https://www.facebook.com/thehowdy/photos/a.1868591890019162.1073741828.1833035463574805/1929757437235940/?type=3&theater",
                "lnkdType": "10",
                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082511014356346575630757_589.jpg",
                "strtDts": "20170825000000",
                "endDts": "20180825235959",
                "maiTitleNm1": "",
                "maiTitleNm2": "",
                "subtitlNm1": "",
                "subtitlNm2": "",
                "iconTgtLst": "",
                "titleShadUseYn": "",
                "imgWidth": "576",
                "imgHeight": "576",
                "dispOrdr": "1",
                "bakgrndColrCdVal": "",
                "iconTgtList": []
            }
        ],
        "noticeBannerList": [
            {
                "id": "",
                "title": "GRANDOPEN_FB_170825",
                "desc": "#howdy #howdymakesman #howdytobeaman #howdy_formen #LIVING #TECH #STYLE #GROOMING #HOBBY #하우디 #남자 #라이프스타일 #쇼핑 #큐레이팅",
                "lnkdUrl": "https://www.facebook.com/thehowdy/photos/a.1868591890019162.1073741828.1833035463574805/1929757437235940/?type=3&theater",
                "lnkdType": "10",
                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082511014356346575630757_589.jpg",
                "strtDts": "20170825000000",
                "endDts": "20180825235959",
                "maiTitleNm1": "",
                "maiTitleNm2": "",
                "subtitlNm1": "",
                "subtitlNm2": "",
                "iconTgtLst": "",
                "titleShadUseYn": "",
                "imgWidth": "576",
                "imgHeight": "576",
                "dispOrdr": "1",
                "bakgrndColrCdVal": "",
                "iconTgtList": []
            }
        ]
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/home/tv/datas.ssg 신세계TV쇼핑 메인
@apiVersion 1.0.0
@apiName TvHomeController.getHomeTvDatas
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
신세계TV쇼핑 메인 API

<br>- source : TvHomeController.getHomeTvDatas()
<br>- 담당자 : 개발1팀 유현재P, 박정환P

@apiParam {String} itemImgSize 상품이미지 size

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"6.4.2",
        "os_cd":"20",
        "ts":"20170825145615",
        "mobil_app_no":"17"
    },
    "params":{
        "itemImgSize":"500"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.onAirData 지금 방송중 정보
@apiSuccess {String} data.onAirData.brocStrtDts 방송 시작일
@apiSuccess {String} data.onAirData.brocEndDts 방송 종료일
@apiSuccess {String} data.onAirData.imgFileNm 동영상 스냅샷 이미지
@apiSuccess {String} data.onAirData.brocUrl 동영상 경로
@apiSuccess {List} data.onAirData.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.broadcastList 편성표리스트
@apiSuccess {String} data.broadcastList.dateDivNm 방송편성표 날짜 구분
@apiSuccess {String} data.broadcastList.date 방송편성표 날짜
@apiSuccess {List} data.broadcastList.broadcastDataList 방송편성표 상세정보 리스트
@apiSuccess {String} data.broadcastList.broadcastDataList.brocStrtDts 방송 시작일
@apiSuccess {String} data.broadcastList.broadcastDataList.brocEndDts 방송 종료일
@apiSuccess {String} data.broadcastList.broadcastDataList.onairYn 방송중 여부
@apiSuccess {List} data.broadcastList.broadcastDataList.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.mainbannerList 메인배너 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "broadcastList": [
            {
                "dateDivNm": "어제",
                "broadcastDataList": [
                    {
                        "brocEndDts": "20170824013800",
                        "onairYn": "N",
                        "brocStrtDts": "20170824003730",
                        "itemList": [
                            {
                                상품유닛
                            }
                        ]
                    }
                ],
                "date": "8/24"
            },
            {
                "dateDivNm": "오늘",
                "broadcastDataList": [
                    {
                        "brocEndDts": "20170826003730",
                        "onairYn": "N",
                        "brocStrtDts": "20170825233700",
                        "itemList": [
                            {
                                상품유닛
                            }
                        ]
                    }
                ],
                "date": "8/25"
            },
            {
                "dateDivNm": "내일",
                "broadcastDataList": [
                    {
                        "brocEndDts": "20170826023830",
                        "onairYn": "N",
                        "brocStrtDts": "20170826013800",
                        "itemList": [
                            {
                                상품유닛
                            }
                        ]
                    }
                ],
                "date": "8/26"
            }
        ],
        "mainbannerList": [
            {
                "id": "",
                "title": "신세계TV쇼핑 사용설명서",
                "desc": "",
                "lnkdUrl": "http://m.tv.ssg.com/event/eventDetail.ssg?promId=1100245355",
                "lnkdType": "10",
                "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201707/2017072322502243323454334445_118.jpg",
                "strtDts": "20170807000000",
                "endDts": "20200813235959",
                "maiTitleNm1": "",
                "maiTitleNm2": "",
                "subtitlNm1": "",
                "subtitlNm2": "",
                "iconTgtLst": "",
                "titleShadUseYn": "",
                "imgWidth": "720",
                "imgHeight": "156",
                "dispOrdr": "0",
                "bakgrndColrCdVal": "",
                "iconTgtList": []
            }
        ],
        "onAirData": {
            "brocStrtDts": "20170825113700",
            "brocEndDts": "20170825123830",
            "imgFileNm": "http://static.ssgcdn.com/cmpt/tvshopping/brocimg/20170825/broc_1000214651.jpg",
            "brocUrl": "http://liveout.catenoid.net/live-02-shinsegaetvshopping/shinsegaetvshopping_720p/playlist.m3u8",
            "itemList": [
                {
                    상품유닛
                }
            ]
        }
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/home/siv/datas.ssg S.I.VILLAGE 메인
@apiVersion 1.0.0
@apiName SivHomeController.getHomeSivDatas
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
S.I.VILLAGE 메인 API

<br>- source : SivHomeController.getHomeSivDatas()
<br>- 담당자 : 개발1팀 유현재P, 박정환P

@apiParam {String} itemImgSize 상품이미지 size

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"6.4.2",
        "os_cd":"20",
        "ts":"20170825145615",
        "mobil_app_no":"17"
    },
    "params":{
        "itemImgSize":"500"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.mainBanner 메인 테마 배너 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.mainBannerV 메인 테마 신규배너 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.mainLinebanner 메인 띠 배너 [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.mdPItemsList MD's Pick 상품 [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {Object} data.brandFa 브랜드 - 패션
@apiSuccess {String} data.brandFa.brandId 브랜드ID
@apiSuccess {String} data.brandFa.brandNm 브랜드명
@apiSuccess {String} data.brandFa.logoImgUrl 브랜드로고이미지URL
@apiSuccess {String} data.brandFa.barnImgUrl 브랜드배너이미지URL
@apiSuccess {String} data.brandFa.banrRplcTextNm 브랜드배너설명텍스트
@apiSuccess {List} data.brandFa.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {Object} data.brandBe 브랜드 - 뷰티
@apiSuccess {String} data.brandBe.brandId 브랜드ID
@apiSuccess {String} data.brandBe.brandNm 브랜드명
@apiSuccess {String} data.brandBe.logoImgUrl 브랜드로고이미지URL
@apiSuccess {String} data.brandBe.barnImgUrl 브랜드배너이미지URL
@apiSuccess {String} data.brandBe.banrRplcTextNm 브랜드배너설명텍스트
@apiSuccess {List} data.brandBe.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {Object} data.brandLi 브랜드 - 리빙
@apiSuccess {String} data.brandLi.brandId 브랜드ID
@apiSuccess {String} data.brandLi.brandNm 브랜드명
@apiSuccess {String} data.brandLi.logoImgUrl 브랜드로고이미지URL
@apiSuccess {String} data.brandLi.barnImgUrl 브랜드배너이미지URL
@apiSuccess {String} data.brandLi.banrRplcTextNm 브랜드배너설명텍스트
@apiSuccess {List} data.brandLi.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "mainBanner": {
            "id": "",
            "title": "t1_1",
            "desc": "t1_1",
            "lnkdUrl": "#",
            "lnkdType": "20",
            "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201706/2017060710564437214793727489_181.jpg",
            "strtDts": "20170607000000",
            "endDts": "20180930235959",
            "maiTitleNm1": "111111111111",
            "maiTitleNm2": "222222222222",
            "subtitlNm1": "33333333",
            "subtitlNm2": "44444444444",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "603",
            "imgHeight": "420",
            "dispOrdr": "0",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
        },
        "mainBannerV": {
			"id": "",
			"title": "텍스트분리 테스트",
			"desc": "텍스트분리 테스트",
			"lnkdUrl": ".",
			"lnkdType": "20",
			"imgFileNm": "http://qa-static.ssgcdn.com/cmpt/banner/201710/2017101012522651626805169680_698.jpg",
			"strtDts": "20171010000000",
			"endDts": "20181010235959",
			"maiTitleNm1": "메인타이틀(1)",
			"maiTitleNm2": "메인타이틀2",
			"subtitlNm1": "서브타이틀(1)",
			"subtitlNm2": "서브타이틀(2)",
			"iconTgtLst": "",
			"titleShadUseYn": "",
			"imgWidth": "750",
			"imgHeight": "380",
			"dispOrdr": "0",
			"bakgrndColrCdVal": "",
			"banrRplcTextNm": "테스트",
			"iconTgtList": [],
		},
        "mainLinebanner": {
            "id": "",
            "title": "ㅇㅇㅇㅇㅇㅇㅇㅇ",
            "desc": "ㅇㅇㅇㅇㅇㅇㅇ",
            "lnkdUrl": "#",
            "lnkdType": "20",
            "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201706/2017061417084137202293723339_483.png",
            "strtDts": "20170614000000",
            "endDts": "20180614235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "1020",
            "imgHeight": "100",
            "dispOrdr": "0",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
        },
        "mdPItemsList": [
            {
                상품유닛
            }
        ],
        "brandFa": {
            "brandNm": "EA7",
            "barnImgUrl": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017080216515680407208047720_366.jpg&w=1020&h=230&t=a4bc57832297ca42633dcea0b61c2d6e860f88ad",
            "logoImgUrl": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017082315420280433478042447_886.jpg&w=300&h=90&t=40ffd11060b893ad0734d303197f7c232e996304",
            "banrRplcTextNm": "ssg_brand_ea7",
            "brandLnkdUrl": "http://m.sivillage.ssg.com/disp/brandShop?brandId=3000006087"
            "itemList": [
                {
                    상품유닛
                }
            ]
        },
        "brandBe": {
            "brandNm": "비디비치",
            "barnImgUrl": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017080410123456379545633064_344.jpg&w=1020&h=230&t=d5e7e4882c85678587f3f2ea03d70020be70704e",
            "logoImgUrl": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017082315295380409048046904_118.jpg&w=300&h=90&t=49fa8d7a2356963cb84abe67f46cbd092783eaeb",
            "banrRplcTextNm": "ssg_brand_vdvc",
            "brandLnkdUrl": "http://m.sivillage.ssg.com/disp/brandShop?brandId=2000014938"
            "itemList": [
                {
                    상품유닛
                }
            ]
        },
        "brandLi": {
            "brandNm": "자주[JAJU]",
            "barnImgUrl": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017080216523509016600903760_751.jpg&w=1020&h=230&t=1d5223458d07d533f3ce6c4d9a0043ec4fbaae48",
            "logoImgUrl": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201708/2017082315422009076900904790_290.jpg&w=300&h=90&t=4507ef1c51e2cf109dfefa6751a6d1f309604b03",
            "banrRplcTextNm": "ssg_brand_JAJU",
            "brandLnkdUrl": "http://m.sivillage.ssg.com/disp/brandShop?brandId=3000006197"
            "itemList": [
                {
                    상품유닛
                }
            ]
        }
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/emall/ssgdeal/datas.ssg 이마트몰 쓱배송(메인)
@apiVersion 1.0.0
@apiName EmallHomeController.getEmallSsgDealDatas
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
이마트몰 핫딜(메인) API, view-cache 5분

<br>- source : EmallHomeController.getEmallSsgDealDatas()
<br>- 담당자 : 개발1팀 전보솔P, 유현재P, 박정환P

@apiParam {String} [itemImgSize=500] 상품이미지사이즈

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver":"6.4.2",
        "os_cd":"20",
        "ts":"20170825135913",
        "mobil_app_no":"17"
    },
    "params":{
        "itemImgSize":"500"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.cornerList 응답결과목록
@apiSuccess {String="mainBanner","cardBanner","quickMenuBanner","imageBanner","adBanner","videoBanner","loopPlanshop_cu","loopBanner","loopItem"} data.cornerList.unitType 유닛타입
@apiSuccess {Object} data.cornerList.data 타입별 데이터
@apiSuccess {List} data.cornerList.data-unitType:mainBanner 메인프로모션배너 리스트 [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:cardBanner 카드배너 리스트 [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:quickMenuBanner 추천서비스(퀵메뉴) 리스트 [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:videoBanner 동영상배너 리스트 [코너동영상유닛](#api-header-for-a-submenu-commonconrvod)
@apiSuccess {List} data.cornerList.data-unitType:imageBanner 이미지배너 리스트 [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:adBanner 광고배너 리스트 [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:loopPlanshop_cu 기획전 collection UI 데이터
@apiSuccess {String} data.cornerList.data-unitType:loopPlanshop_cu.pnshopAplSiteNo 기획전 적용 사이트 번호
@apiSuccess {Object} data.cornerList.data-unitType:loopPlanshop_cu.planshop 기획전 배너 [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:loopPlanshop_cu.itemList 기획전 상품리스트 [상품유닛](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.cornerList.data-unitType:loopBanner 반복배너 리스트 [배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.cornerList.data-unitType:loopItemList 반복상품 리스트 [상품유닛](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
    {
      "cached": false,
      "method": "",
      "res_code": "200",
      "res_message": "성공",
      "data": {
        "cornerList": [
          {
            "unitType": "mainBanner",
            "data": [
              배너유닛
            ]
          },
          {
            "unitType": "cardBanner",
            "data": [
              배너유닛
            ]
          },
          {
            "unitType": "quickMenuBanner",
            "data": [
              배너유닛
            ]
          },
          {
            "unitType": "videoBanner",
            "data": [
              {
                "title": "동영상 링크등록",
                "regTypeCd": "20",
                "subtlCntt": "",
                "dataFileNm": "http://123123123",
                "imgFileNm": "",
                "banrTgtTypeCd": "",
                "endDts": "20190130235959",
                "imgWidth": "0",
                "imgHeight": "0",
                "dispOrdr": "0"
              }
            ]
          },
          {
            "unitType": "imageBanner",
            "data": [
              배너유닛
            ]
          },
          {
            "unitType": "adBanner",
            "data": [
              배너유닛
            ]
          },
          {
            "unitType": "loopPlanshop_cu",
            "data": {
              "itemList": [
                상품유닛
              ],
              "pnshopAplSiteNo": "6001",
              "planshop": {
                배너유닛
              }
            }
          },
          {
            "unitType": "loopBanner",
            "data": {
              배너유닛
            }
          },
          {
            "unitType": "loopItemList",
            "data": [
              상품유닛
            ]
          }
          ...
        }
      }
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/emall/ssgdeal/shppinfo/datas.ssg 이마트몰 쓱배송(메인) 배송정보
@apiVersion 1.0.0
@apiName EmallHomeController.getEmallSsgDealShppInfoDatas
@apiGroup Main Page
@apiSampleRequest off
@apiPermission none

@apiDescription
이마트몰 메인 배송정보 조회 API, DTO cache 1분

<br>- source : EmallHomeController.getEmallSsgDealShppInfoDatas()
<br>- 담당자 : 개발1팀 전보솔P, 유현재P, 박정환P

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"6.4.2",
        "os_cd":"20",
        "ts":"20170825145615",
        "mobil_app_no":"17"
    },
    "params":{
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.shppInfo.shppType 유형 (login:비로그인, rsvt_y:예약배송, rsvt_n:점포택배)
@apiSuccess {String} data.shppInfo.headMsg 헤드메시지
@apiSuccess {String} data.shppInfo.subMsg 서브메시지
@apiSuccess {String} data.shppInfo.emallDeliveryUrl 쓱배송확인URL
@apiSuccess {String} data.shppInfo.shpplocListUrl 배송지변경URL
@apiSuccess {String} data.shppInfo.siteNm 사이트명
@apiSuccess {String} data.shppInfo.salestrNm 영업점명
@apiSuccess {String} data.shppInfo.salestrNo 영업점번호

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
      "shppInfo": {
        "shpplocListUrl": "http://local-member.ssg.com/m/comm/shpplocList.ssg",
        "headMsg": "지금 주문하면",
        "salestrNo": "2439",
        "salestrNm": "emart NE.O.001",
        "subMsg": "오늘 14:00부터 배송가능",
        "emallDeliveryUrl": "http://local-m.ssg.com/common/showMEmallDelivery.ssg?siteNo=6001",
        "siteNm": "이마트",
        "type": "rsvt_y"
      }
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
