/**

@api {post} /api/variable/datas.ssg 가변구좌
@apiVersion 1.0.0
@apiName VariableController.getVariableDatas
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
가변구좌 API
<br>- type 값에 따라 유닛이 다름.
<br>- planshop 타입과 item 타입은 동시에 나올수 없음. 둘 중 한가지만 노출 됨
<br>- planshop 타입 일 경우에만 /api/planshop/datas/allItem.ssg api 호출 (dispCmptId, siteNo 파라미터 필요)
<br>- item 타입 일 경우에는 페이징 처리 되어있음. 기존 파라미터 그대로두고 page 파라미터만 변경하여 호출

<br>- 담당자 : 유현재P


@apiParam {String} siteNo 사이트번호
@apiParam {String} itemImgSize 상품이미지 size
@apiParam {String} [page=1] page 페이지번호
@apiParam {String} [sortCd=best] sortCd 정렬코드
@apiParam {String} cornrSetId 코너세트 번호

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
        "siteNo": "6005",
        "itemImgSize": "202",
        "page": "1",
        "sortCd": "best",
        "cornrSetId": "7200237361"
    }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/variable/datas.ssg -d '
> {"common":{"ts":"20140619175133","mobil_app_no":"13","apl_ver":"2.0.2","os_cd":"40"},"params":{"itemImgSize":"202", "siteNo":"6005","cornrSetId":"7200237361","page":"1","sortCd":"best"}}'

@apiSuccess {String}     res_code 응답코드
@apiSuccess {String}     res_message 응답메시지
@apiSuccess {Object}     data 응답결과값
@apiSuccess {Array[]} data.variableContentList 응답결과목록
@apiSuccess {String="top_banner","vod","banner","recipe","planshop","item"} data.variableContentList.type 유닛타입
@apiSuccess {List} data.variableContentList.contentList 타입별 데이터리스트 (하단 필드는 실제 필드명이 아닌 type별 구분용도로 사용)
@apiSuccess {List} data.variableContentList.contentList-type:top_banner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.variableContentList.contentList-type:vod 동영상리스트
@apiSuccess {String} data.variableContentList.contentList-type:vod.title 제목
@apiSuccess {String} data.variableContentList.contentList-type:vod.regTypeCd 틍록타입코드 10:직접등록, 20:url등록
@apiSuccess {String} data.variableContentList.contentList-type:vod.subtlCntt 자막내용
@apiSuccess {String} data.variableContentList.contentList-type:vod.dataFileNm 동영상URL
@apiSuccess {String} data.variableContentList.contentList-type:vod.imgFileNm 이미지URL
@apiSuccess {String} data.variableContentList.contentList-type:vod.banrTgtTypeCd 배너대상타입코드 (사용안함)
@apiSuccess {String} data.variableContentList.contentList-type:vod.endDts 전시종료일
@apiSuccess {String} data.variableContentList.contentList-type:vod.imgWidth 이미지 가로 사이즈
@apiSuccess {String} data.variableContentList.contentList-type:vod.imgHeight 이미지 세로 사이즈
@apiSuccess {String} data.variableContentList.contentList-type:vod.dispOrdr 전시순서
@apiSuccess {List} data.variableContentList.contentList-type:banner [배너유닛리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.variableContentList.contentList-type:recipe recipe 타입 유닛
@apiSuccess {String} data.variableContentList.contentList-type:recipe.recipeNm 레시피 명
@apiSuccess {String} data.variableContentList.contentList-type:recipe.imgFileNm 배너 이미지
@apiSuccess {String} data.variableContentList.contentList-type:recipe.imgWidth 이미지 가로 사이즈
@apiSuccess {String} data.variableContentList.contentList-type:recipe.imgHeight 이미지 세로 사이즈
@apiSuccess {String} data.variableContentList.contentList-type:recipe.lnkdUrl 배너 링크
@apiSuccess {String} data.variableContentList.contentList-type:recipe.lnkdType 링크 연결 방법
@apiSuccess {List} data.variableContentList.contentList-type:planshop planshop 타입 유닛
@apiSuccess {String} data.variableContentList.contentList-type:planshop.title 기획전 타이틀
@apiSuccess {String} data.variableContentList.contentList-type:planshop.dispCmptId 기획전ID
@apiSuccess {String} data.variableContentList.contentList-type:planshop.strtDts 전시 시작일
@apiSuccess {String} data.variableContentList.contentList-type:planshop.endDts 전시 종료일
@apiSuccess {List} data.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {String} data.hasNext 다음페이지 존재 여부(item 타입 일 경우만 사용)
@apiSuccess {String} data.pageSize 한번에 가져올 상품리스트 크기 (item 타입 일 경우만 사용)
@apiSuccess {String} data.defaultCd 기본 정렬 타입 (item 타입 일 경우만 사용)
@apiSuccess {List} data.sortList 정렬리스트 (item 타입 일 경우만 사용)
@apiSuccess {String} data.sortList.sortCd 정렬코드 (item 타입 일 경우만 사용)
@apiSuccess {String} data.sortList.sortNm 정렬명 (item 타입 일 경우만 사용)

@apiSuccessExample Response (example):
{
  "cached": false,
  "method": "",
  "res_code": "200",
  "res_message": "성공",
  "data": {
    "variableContentList": [
      {
        "contentList": [
          {
            "id": "",
            "title": "상단배너배너",
            "desc": "상단배너배너",
            "lnkdUrl": "상단배너배너",
            "lnkdType": "20",
            "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201707/2017072817013937299213727931_169.jpg",
            "strtDts": "20170728000000",
            "endDts": "20180728235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "640",
            "imgHeight": "140",
            "dispOrdr": "0",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
          }
        ],
        "type": "top_banner"
      },
      {
        "contentList": [
          {
            "title": "111111",
            "regTypeCd": "10",
            "subtlCntt": "",
            "dataFileNm": "http://dev-ucc.ssgcdn.com/umov/corner/201707/960/8411334320355665501234_h.m4v",
            "imgFileNm": "http://dev-ucc.ssgcdn.com/umov/corner/201707/960/8411334320355665501234_1024x640.jpg",
            "banrTgtTypeCd": "",
            "endDts": "20180728235959",
            "imgWidth": "1024",
            "imgHeight": "640",
            "dispOrdr": "0"
          }
        ],
        "type": "vod"
      },
      {
        "contentList": [
          {
            "id": "",
            "title": "테스트배너",
            "desc": "테스트배너",
            "lnkdUrl": "테스트배너",
            "lnkdType": "20",
            "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201707/2017070512510737228083725908_167.jpg",
            "strtDts": "20170705000000",
            "endDts": "20180705235959",
            "maiTitleNm1": "",
            "maiTitleNm2": "",
            "subtitlNm1": "",
            "subtitlNm2": "",
            "iconTgtLst": "",
            "titleShadUseYn": "",
            "imgWidth": "750",
            "imgHeight": "560",
            "dispOrdr": "0",
            "bakgrndColrCdVal": "",
            "iconTgtList": []
          }
        ],
        "type": "banner"
      },
      {
        "contentList": [
          {
            "recipeNm": "참치야채볶음밥 간단한 저녁식사~!!",
            "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/recipe/201707/27aaeeff51ed9b79b4a6bfd8bf58978a1.jpg",
            "imgWidth": "936",
            "imgHeight": "624",
            "lnkdUrl": "http://dev-m.emart.ssg.com/recipe/recipe/detail.ssg?recipeId=242192",
            "lnkdType": "10"
          }
        ],
        "type": "recipe"
      },
      {
        "contentList": [
          {
            "title": "[팬텀]여름 미리보기+봄 최종가전",
            "dispCmptId": "6000006267",
            "strtDts": "20170728000000",
            "endDts": "20180728235959"
          }
        ],
        "type": "planshop"
      },
      {
        "type": "item"
      }
    ]},
    "defaultCd": "best",
    "hasNext": "false",
    "pageSize": "300",
    "itemList": [
      {
        상품유닛
      }
    ],
    "sortList": [
      {
        "sortNm": "추천상품순",
        "sortCd": "best"
      },
      {
        "sortNm": "신상품순",
        "sortCd": "regdt"
      },
      {
        "sortNm": "높은 가격순",
        "sortCd": "prcdsc"
      },
      {
        "sortNm": "낮은 가격순",
        "sortCd": "prcasc"
      },
      {
        "sortNm": "상품평 많은순",
        "sortCd": "cnt"
      }
    ]
  }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
