/**
@api {post} /api/launch/datas/info2.ssg 통합앱-Info2
@apiVersion 1.1.0
@apiName CommonController.getLaunchInfo2
@apiGroup App Run
@apiPermission none

@apiDescription 통합앱구동시 공통배너 및 팝업 정보를 제공하는 API

담당자 : 권태진

@apiParam {String="1.1.0","2.1.0"} [apiVersion=1.0.0] api버전
@apiParam {String} appBarCornrId
@apiParam {String} appBarDispCtgId
@apiParam {String} appBarSiteNo
@apiParam {String} siteNo

@apiParamExample {json} Request-Example :
 {
   "common":{
      "ts":"20170822143834",
      "mobil_app_no":"12",
      "apl_ver":"2.4.2",
      "os_cd":"20"
   },
   "params":{
      "appBarDispCtgId":"6000010537",
      "apiVersion":"2.1.0",
      "appBarCornrId":"",
      "appBarSiteNo":"6001",
      "siteNo":"6005"
   }
}
@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/api/launch/datas/info2.ssg -d '
 {"common":{"ts":"20170822143834","mobil_app_no":"12","apl_ver":"2.4.2","os_cd":"20"},"params":{"appBarDispCtgId":"6000010537","apiVersion":"2.1","appBarCornrId":"","appBarSiteNo":"6001","siteNo":"6005"}}'

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {Object}    data.mainBanner 앱구동시 보여줄 배너
@apiSuccess {Object}    data.mainBanner.chnlBanner 앱구동시 보여줄 채널배너
@apiSuccess {String}    data.mainBanner.chnlBanner.imgFileNm 이미지경로
@apiSuccess {String}    data.mainBanner.chnlBanner.lnkdType 링크유형
@apiSuccess {String}    data.mainBanner.chnlBanner.lnkdUrl  링크
@apiSuccess {String}    data.mainBanner.chnlBanner.title    제목
@apiSuccess {Object}    data.mainBanner.mallChangeBanner 몰이동하단 프로모션 배너, [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object}    data.mainPopup 앱구동시 보여줄 배너
@apiSuccess {Object}    data.mainPopup.chnlPopup
@apiSuccess {String}    data.mainPopup.chnlPopup.cookieNm 쿠키명
@apiSuccess {String}    data.mainPopup.chnlPopup.imgFileNm 이미지경로
@apiSuccess {String}    data.mainPopup.chnlPopup.lnkdType 링크유형
@apiSuccess {String}    data.mainPopup.chnlPopup.lnkdUrl 링크
@apiSuccess {String}    data.mainPopup.chnlPopup.title 제목
@apiSuccess {Object}    data.mainPopup.mainPopup 전체풀팝업, [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List}      data.mainPopup.servicePopup 스와이프용 팝업 리스트, [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object}    data.mainPopup.vvipPopup vvip팝업, [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {Object}    data.splashImage 스플래쉬 이미지 운영을 위한 데이터, [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)

@apiSuccessExample Response (example):
{
   "cached":true,
   "method":"",
   "res_code":"200",
   "res_message":"성공",
   "data":{
      "mallChngCornr":{

      },
      "mainPopup":{
         "mainPopup":{
            "id":"",
            "title":"",
            "desc":"",
            "lnkdUrl":"",
            "lnkdType":"",
            "imgFileNm":"",
            "strtDts":"",
            "endDts":"",
            "maiTitleNm1":"",
            "maiTitleNm2":"",
            "subtitlNm1":"",
            "subtitlNm2":"",
            "iconTgtLst":"",
            "titleShadUseYn":"",
            "imgWidth":"0",
            "imgHeight":"0",
            "dispOrdr":"",
            "bakgrndColrCdVal":"",
            "iconTgtList":[

            ]
         },
          "vvipPopup":{
            "id":"",
            "title":"",
            "desc":"",
            "lnkdUrl":"",
            "lnkdType":"",
            "imgFileNm":"",
            "strtDts":"",
            "endDts":"",
            "maiTitleNm1":"",
            "maiTitleNm2":"",
            "subtitlNm1":"",
            "subtitlNm2":"",
            "iconTgtLst":"",
            "titleShadUseYn":"",
            "imgWidth":"0",
            "imgHeight":"0",
            "dispOrdr":"",
            "bakgrndColrCdVal":"",
            "iconTgtList":[

            ]
         },
         "chnlPopup":{
            "title":"",
            "lnkdUrl":"",
            "cookieNm":"",
            "lnkdType":"",
            "imgFileNm":""
         },
         "servicePopup":[
            {
               "id":"",
               "title":"부츠&하우디 오픈안내",
               "desc":"",
               "lnkdUrl":"#",
               "lnkdType":"20",
               "imgFileNm":"http://static.ssgcdn.com/cmpt/banner/201708/2017080917352543316914339691_70.jpg",
               "strtDts":"20170810000000",
               "endDts":"20170823235959",
               "maiTitleNm1":"",
               "maiTitleNm2":"",
               "subtitlNm1":"",
               "subtitlNm2":"",
               "iconTgtLst":"",
               "titleShadUseYn":"",
               "imgWidth":"640",
               "imgHeight":"890",
               "dispOrdr":"0",
               "bakgrndColrCdVal":"",
               "iconTgtList":[

               ]
            }
         ]
      },
      "mainBanner":{
         "mallChangeBanner":{
            "id":"",
            "title":"",
            "desc":"",
            "lnkdUrl":"",
            "lnkdType":"",
            "imgFileNm":"",
            "strtDts":"",
            "endDts":"",
            "maiTitleNm1":"",
            "maiTitleNm2":"",
            "subtitlNm1":"",
            "subtitlNm2":"",
            "iconTgtLst":"",
            "titleShadUseYn":"",
            "imgWidth":"0",
            "imgHeight":"0",
            "dispOrdr":"",
            "bakgrndColrCdVal":"",
            "iconTgtList":[

            ]
         },
         "chnlBanner":{
            "title":"",
            "lnkdUrl":"",
            "lnkdType":"",
            "imgFileNm":""
         }
      },
      "splashImage":{
         "id":"",
         "title":"17_NEW_앱스플래시",
         "desc":"17_NEW_앱스플래시",
         "lnkdUrl":"#",
         "lnkdType":"20",
         "imgFileNm":"http://static.ssgcdn.com/cmpt/banner/201704/2017041209271709072590906359_808.png",
         "strtDts":"20170414090000",
         "endDts":"20180412235959",
         "maiTitleNm1":"",
         "maiTitleNm2":"",
         "subtitlNm1":"",
         "subtitlNm2":"",
         "iconTgtLst":"",
         "titleShadUseYn":"",
         "imgWidth":"1242",
         "imgHeight":"2208",
         "dispOrdr":"-1",
         "bakgrndColrCdVal":"",
         "iconTgtList":[

         ]
      }
   }
}
 */