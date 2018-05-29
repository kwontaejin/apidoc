 /**
 * @api {post} /api/launch/datas/info1.ssg 통합앱-Info1
 * @apiVersion 1.3.0
 * @apiName CommonController.getLaunchInfo1
 * @apiGroup App Run
 * @apiSampleRequest off
 * @apiPermission none
 *
 * @apiDescription 통합앱구동시 필요한 정보들을 제공하는 API
 *
 * @apiParam {Object} regist 기기 및 설정정보
 * @apiParam {String} regist.dvic_mdl_nm 기기모델명
 * @apiParam {String} regist.os_ver OS버전
 * @apiParam {String} regist.first_yn 앱최초설치여부
 * @apiParam {String} regist.push_rcv_chng_user 사용자에 의한 푸시 변경여부
 * @apiParam {String} [regist.fs0] fs0쿠키값
 * @apiParam {String} regist.mbr_dvic_uniq_no 기기고유번호
 * @apiParam {String} [regist.pcomnt_push_rcv_yn] 플리즈코멘트 수신여부
 * @apiParam {String} [regist.dvic_token_nm] 토큰명(푸시발송시 사용됨)
 * @apiParam {String} [regist.abTestYn] ab test 진행여부
 * @apiParam {Object} [user] 로그인관련 정보
 * @apiParam {Object} user.captcha_response 캡차 응답값
 * @apiParam {Object} user.keepLogin 자동로그인여부
 * @apiParam {Object} user.mbrLoginId MBR_LOGIN_ID
 * @apiParam {Object} user.password 비밀번호
 *
 * @apiParamExample {json} Request-Example :
 * {
 *    "common":{
 *       "mobil_app_no":"1",
 *       "ts":"20150128183059",
 *       "apl_ver":"2.0.2",
 *       "os_cd":"20"
 *    },
 *    "params":{
 *       "regist":{
 *          "dvic_mdl_nm":"1",
 *          "os_ver":"1",
 *          "first_yn":"N",
 *          "push_rcv_chng_user":"Y",
 *          "fs0":"",
 *          "mbr_dvic_uniq_no":"5c2e1ade3e1944ea2ab2e17dd062b89fc3881dcf",
 *          "pcomnt_push_rcv_yn":"N",
 *          "push_rcv_yn":"Y",
 *          "dvic_token_nm":"",
 *          "abTestYn":"Y"
 *       },
 *       "user":{
 *          "captcha_response":"",
 *          "keepLogin":"Y",
 *          "mbrLoginId":"ssg10_test01",
 *          "password":"ssg"
 *       }
 *    },
 *    "ckwhere":"ssg_app_iOS"
 * }
 * @apiExample Example usage:
 *  curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/api/launch/datas/info1.ssg -d '
 * 	{"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{"siteNo":"6005", "apiVersion:"1.0", "dispCmptId":"ALL"}}'
 *
 * @apiSuccess {String}    res_code 응답코드
 * @apiSuccess {String}    res_message 응답메시지
 * @apiSuccess {Object}    data 응답결과값
 * @apiSuccess {Object}    data.clip  클립데이터
 * @apiSuccess {Array[]}   data.clip.itemClipList 상품클립목록
 * @apiSuccess {Array[]}   data.clip.dispCmptList 기획전클립목록
 * @apiSuccess {Array[]}   data.clip.brandClipList 브랜드클립목록
 * @apiSuccess {Array[]}   data.clip.lifeMagazineList 매거진클립목록
 * @apiSuccess {Array[]}   data.clip.eventList 이벤트클릭목록

 * @apiSuccess {Object}    data.specific 특정정보모음
 * @apiSuccess {Object[]}  data.specific.siteNmDispInfo 몰명표기정보
 * @apiSuccess {String}    data.specific.siteNmDispInfo.siteNo 사이트번호
 * @apiSuccess {String}    data.specific.siteNmDispInfo.siteNoSeq 시퀀스(앱에서는 siteNo와 seq를 key로 한다.)
 * @apiSuccess {String}    data.specific.siteNmDispInfo.dispTxt 표기문구
 * @apiSuccess {String}    data.specific.siteNmDispInfo.dispColor 문구색상
 * @apiSuccess {String}    data.specific.siteNmDispInfo.imgFileNm 이미지파일명

 * @apiSuccess {Object}    data.menu 몰별정보모음

 * @apiSuccess {Object}    data.menu.footer 푸터정보
 * @apiSuccess {String}    data.menu.footer.youthProtectionLnkdUrl 청소년보호방침
 * @apiSuccess {String}    data.menu.footer.personInfoLnkdUrl 개인정보처리방침
 * @apiSuccess {String}    data.menu.footer.youthProtectPolcyLnkdUrl 청소년보호방침
 * @apiSuccess {String}    data.menu.footer.companyInfoLnkdUrl 회사소개
 * @apiSuccess {String}    data.menu.footer.emallCompanyInfoLnkdUrl 이마트몰회사소개
 * @apiSuccess {String}    data.menu.footer.smallCompanyInfoLnkdUrl 신세계몰회사소개
 * @apiSuccess {Object}    data.menu.footer.smallInfoMap 신세계몰정보
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.csTel 고객센터번호
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.businessInfo 통신판매업 사업번호
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.text 문구
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.usafeNm 소비자피해보상보험 가입 사실확인명
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.siteNm 사이트명
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.businessInfoLnkdUrl 통신판매사업자정보주소
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.csEmail 고객센터이메일
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.csEmailLnkdUrl 고객센터이메일링크
 * @apiSuccess {String}    data.menu.footer.smallInfoMap.usafeLnkdUrl 소비자피해보상보험 가입 사실확인 주소
 * @apiSuccess {Object}    data.menu.footer.emallInfoMap 이마트몰정보
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.csTel 고객센터번호
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.businessInfo 통신판매업 사업번호
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.text 문구
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.usafeNm 소비자피해보상보험 가입 사실확인명
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.siteNm 사이트명
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.businessInfoLnkdUrl 통신판매사업자정보주소
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.csEmail 고객센터이메일
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.csEmailLnkdUrl 고객센터이메일링크
 * @apiSuccess {String}    data.menu.footer.emallInfoMap.usafeLnkdUrl 소비자피해보상보험 가입 사실확인 주소
 * @apiSuccess {Object}    data.menu.footer.starFieldInfoMap 스타필드정보
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.csTel 고객센터번호
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.businessInfo 통신판매업 사업번호
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.text 문구
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.usafeNm 소비자피해보상보험 가입 사실확인명
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.siteNm 사이트명
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.businessInfoLnkdUrl 통신판매사업자정보주소
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.csEmail 고객센터이메일
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.csEmailLnkdUrl 고객센터이메일링크
 * @apiSuccess {String}    data.menu.footer.starFieldInfoMap.usafeLnkdUrl 소비자피해보상보험 가입 사실확인 주소
 * @apiSuccess {String}    data.menu.footer.smallPersonInfoLnkdUrl 개인정보처리방침
 * @apiSuccess {String}    data.menu.footer.emallPersonInfoLnkdUrl 개인정보처리방침
 * @apiSuccess {String}    data.menu.footer.clauseInfoLnkdUrl 이용약관
 * @apiSuccess {String}    data.menu.footer.smallClauseInfoLnkdUrl 이용약관
 * @apiSuccess {String}    data.menu.footer.emallClauseInfoLnkdUrl 이용약관
 * @apiSuccess {String}    data.menu.footer.emallPcLnkdUrl 이몰 PC보기 주소
 * @apiSuccess {String}    data.menu.footer.tvPcLnkdUrl TV쇼핑 PC보기 주소
 * @apiSuccess {String}    data.menu.footer.sdeptPcLnkdUrl 백화점 PC보기 주소
 * @apiSuccess {String}    data.menu.footer.boonsPcLnkdUrl 분스 PC보기 주소
 * @apiSuccess {String}    data.menu.footer.smallPcLnkdUrl 신세계몰 PC보기 주소
 * @apiSuccess {String}    data.menu.footer.smallPcLnkdUrl 신세계몰 PC보기 주소
 * @apiSuccess {String}    data.menu.footer.bootsPcLnkdUrl 부츠 PC보기 주소
 * @apiSuccess {String}    data.menu.footer.tradersPcLnkdUrl 트레이더스 PC보기 주소
 * @apiSuccess {String}    data.menu.footer.ssgPcLnkdUrl SSG PC보기 주소
 * @apiSuccess {Object[]}  data.menu.footer.footerMenuList 푸터메뉴목록
 * @apiSuccess {String}    data.menu.footer.footerMenuList.menuDispNm 메뉴명
 * @apiSuccess {String}    data.menu.footer.footerMenuList.lnkdUrl 메뉴주소

 * @apiSuccess {Object[]}  data.menu.memberMenuList MY SSG 영역의 메뉴목록
 * @apiSuccess {String}    data.menu.memberMenuList.menuId 메뉴ID
 * @apiSuccess {String}    data.menu.memberMenuList.title 타이틀
 * @apiSuccess {String}    data.menu.memberMenuList.lnkdUrl 링크

 * @apiSuccess {String}    data.menu.appCdnDomain APP전용 CDN경로
 * @apiSuccess {String}    data.menu.adTrackingUrl 광고트래킹URL
 * @apiSuccess {String}    data.menu.searchEngineDomain 검색엔진 도메인
 * @apiSuccess {Array[]}   data.menu.noNativeDispCmptIdList 네이티브로 표시하지 않을 기획전목록
 * @apiSuccess {Array[]}   data.menu.noNativeSpcshopIdList 네이티브로 표시하지 않을 전문관 목록
 * @apiSuccess {Array[]}   data.menu.noNavList Native Header를 표시 하지 않을 웹뷰 페이지
 * @apiSuccess {Array[]}   data.menu.promDeviceList LG 홈보이 기기정보
 * @apiSuccess {Array[]}   data.menu.supershopPsblYn 슈퍼샵모드 진입가능여부
 * @apiSuccess {String}    data.menu.serverDateTime 스와이프 메뉴데이터 업데이트를 위한 기준 서버 시간

 * @apiSuccess {Object[]}  data.menu.commonUrlInfo 공통URL정보
 * @apiSuccess {String}    data.menu.commonUrlInfo.title 타이틀
 * @apiSuccess {String}    data.menu.commonUrlInfo.lnkdUrl 링크
 * @apiSuccess {String}    data.menu.commonUrlInfo.type 유형코드

 * @apiSuccess {Object}    data.menu.viewType 상품리스트에서 표기할 view type 순서
 * @apiSuccess {Array[]}   data.menu.viewType.android 안드로이드목록
 * @apiSuccess {Array[]}   data.menu.viewType.ios IOS목록

 * @apiSuccess {Object[]}  data.menu.siteList 사이트별정보모음
 * @apiSuccess {String}    data.menu.siteList.totalSvcNewImg 전체서비스보기 new이미지 경로(미사용)
 * @apiSuccess {String}    data.menu.siteList.siteNo 사이트번호(key값으로 사용되며, 실제 사이트번호로는 사용하지 않는다.)
 * @apiSuccess {String}    data.menu.siteList.usageSiteNo 실제 사용할 사이트 번호
 * @apiSuccess {String}    data.menu.siteList.siteNm 사이트명
 * @apiSuccess {String}    data.menu.siteList.siteDomain 도메인
 * @apiSuccess {Object[]}  data.menu.siteList.menuList 메뉴목록
 * @apiSuccess {String}    data.menu.siteList.menuList.iconTypeCd 아이콘유형코드
 * @apiSuccess {String}    data.menu.siteList.menuList.endDts 메뉴종료시간
 * @apiSuccess {String}    data.menu.siteList.menuList.menuDispNm 메뉴표시명
 * @apiSuccess {String}    data.menu.siteList.menuList.menuType 메뉴유형, 고정구좌 or 가변구좌 (normal or temp)
 * @apiSuccess {String}    data.menu.siteList.menuList.trackingNm 트래킹명(가변구좌의 트래킹을 위함)
 * @apiSuccess {String}    data.menu.siteList.menuList.menuID 메뉴ID
 * @apiSuccess {Array[]}   data.menu.siteList.menuList.webUrls 메뉴와 매핑되는 web url 목록
 * @apiSuccess {Object[]}  data.menu.siteList.totalSvcMyList LNB 상단 메뉴 목록
 * @apiSuccess {String}    data.menu.siteList.totalSvcMyList.newYn 신규메뉴여부
 * @apiSuccess {String}    data.menu.siteList.totalSvcMyList.title 메뉴명
 * @apiSuccess {String}    data.menu.siteList.totalSvcMyList.lnkdUrl 링크
 * @apiSuccess {String}    data.menu.siteList.totalSvcMyList.lnkdType 링크유형, 웹화면인지 앱화면인지 구분
 * @apiSuccess {String}    data.menu.siteList.totalSvcMyList.imgFileNm 메뉴이미지경로
 * @apiSuccess {Object[]}  data.menu.siteList.recAppList 추천앱목록
 * @apiSuccess {String}    data.menu.siteList.recAppList.name 앱명
 * @apiSuccess {String}    data.menu.siteList.recAppList.subName 앱설명
 * @apiSuccess {String}    data.menu.siteList.recAppList.packageName 앱패키지이름
 * @apiSuccess {String}    data.menu.siteList.recAppList.lnkdUrl 앱설치주소
 * @apiSuccess {String}    data.menu.siteList.recAppList.imgFileNm 이미지경로

 * @apiSuccess {Object[]}  data.menu.siteList.etcUrlList 기타URL목록
 * @apiSuccess {Object}    data.menu.siteList.etcUrlList.itemSuggest 상품제안하기정보
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.itemSuggest.menuId 메뉴ID
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.itemSuggest.title 타이틀
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.itemSuggest.lnkdUrl 링크
 * @apiSuccess {Object}    data.menu.siteList.etcUrlList.searchEval 이런상품 구해주세요
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.searchEval.menuId 메뉴ID
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.searchEval.title 타이틀
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.searchEval.lnkdUrl 링크
 * @apiSuccess {Object}    data.menu.siteList.etcUrlList.intlGuide 외국인가이드
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.intlGuide.menuId 메뉴ID
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.intlGuide.title 타이틀
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.intlGuide.lnkdUrl 링크
 * @apiSuccess {Object}    data.menu.siteList.etcUrlList.customer 고객센터
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.customer.menuId 메뉴ID
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.customer.title 타이틀
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.customer.lnkdUrl 링크
 * @apiSuccess {Object}    data.menu.siteList.etcUrlList.shppPsblArea 쓱배송가능지역찾기
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.shppPsblArea.menuId 메뉴ID
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.shppPsblArea.title 타이틀
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.shppPsblArea.lnkdUrl 링크
 * @apiSuccess {Object}    data.menu.siteList.etcUrlList.shppPsblTime 쓱배송시간확인
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.shppPsblTime.menuId 메뉴ID
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.shppPsblTime.title 타이틀
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.shppPsblTime.lnkdUrl 링크
 * @apiSuccess {Object}    data.menu.siteList.etcUrlList.itemSuggestVVIP VVIP용 상품제안하기
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.itemSuggestVVIP.menuId 메뉴ID
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.itemSuggestVVIP.title 타이틀
 * @apiSuccess {String}    data.menu.siteList.etcUrlList.itemSuggestVVIP.lnkdUrl 링크

 * @apiSuccess {Object[]}  data.menu.siteList.themeShopList 테마샵목록
 * @apiSuccess {String}    data.menu.siteList.themeShopList.title 타이틀
 * @apiSuccess {String}    data.menu.siteList.themeShopList.lnkdUrl 링크
 * @apiSuccess {String}    data.menu.siteList.themeShopList.lnkdType 링크유형
 * @apiSuccess {String}    data.menu.siteList.themeShopList.imgFileNm 이미지경로

 * @apiSuccess {Object[]}  data.menu.siteList.additionalMenuList 추가메뉴목록
 * @apiSuccess {String}    data.menu.siteList.additionalMenuList.imgFileNm
 * @apiSuccess {String}    data.menu.siteList.additionalMenuList.lnkdUrl
 * @apiSuccess {String}    data.menu.siteList.additionalMenuList.lnkdType
 * @apiSuccess {String}    data.menu.siteList.additionalMenuList.menuId

 * @apiSuccess {Object[]}  data.menu.siteList.plusMenu 추가메뉴목록
 * @apiSuccess {String}    data.menu.siteList.plusMenu.imgFileNm
 * @apiSuccess {String}    data.menu.siteList.plusMenu.lnkdUrl
 * @apiSuccess {String}    data.menu.siteList.plusMenu.lnkdType

 * @apiSuccess {Object[]}  data.menu.siteList.usage 사이트 사용여부 정보
 * @apiSuccess {String}    data.menu.siteList.usage.serviceYn 사이트 사용여부 정보(Y or N)
 * @apiSuccess {String}    data.menu.siteList.usage.serviceMsg 사이트 종료시 표시할 문구

 * @apiSuccess {Object[]}  data.menu.siteList.noNativeList 몰별 Native App화면으로 표시하지 않을 대상
 * @apiSuccess {String}    data.menu.siteList.noNativeList.type 대상유형
 * @apiSuccess {String}    data.menu.siteList.noNativeList.list 대상목록

 * @apiSuccess {Object}    data.regist 앱등록 후 전달받는 공통정보
 * @apiSuccess {String}    data.regist.appCdnDomain APP전용 CDN경로
 * @apiSuccess {String}    data.regist.push_rcv_yn 푸시수신여부
 * @apiSuccess {String}    data.regist.apl_ver_link_url1 앱스토어주소
 * @apiSuccess {String}    data.regist.search_engine_domain 검색엔진 도메인
 * @apiSuccess {String}    data.regist.apl_ver 앱버전
 * @apiSuccess {Array[]}   data.regist.no_nav_page_list Native Header를 표시 하지 않을 웹뷰 페이지
 * @apiSuccess {Object[]}  data.regist.gnb_svc_list 신규앱에서는 미사용
 * @apiSuccess {String}    data.regist.gnb_svc_list.svc_link_url
 * @apiSuccess {String}    data.regist.gnb_svc_list.site_no
 * @apiSuccess {String}    data.regist.gnb_svc_list.svc_nm
 * @apiSuccess {String}    data.regist.pcomnt_push_rcv_yn 플리즈코멘트 수신여부
 * @apiSuccess {String}    data.regist.force_renew_yn 강제업데이트 여부
 * @apiSuccess {String}    data.regist.abTestType AB테스트유형
 * @apiSuccess {String="N","R","U"}    data.regist.dwldTypeCd 기기설치유형코드(N : 신규설치, R : 재설치, U : 업데이트)

 * @apiSuccess {Object}    data.notice 공지사항정보
 * @apiSuccess {Object[]}  data.notice.noticeGroupList 공지사항정보목록
 * @apiSuccess {Object[]}  data.notice.noticeGroupList.noticeList 공지사항목록
 * @apiSuccess {String}    data.notice.noticeGroupList.noticeList.title 공지사항제목
 * @apiSuccess {String}    data.notice.noticeGroupList.noticeList.lnkdUrl 공지사항개별링크
 * @apiSuccess {String}    data.notice.noticeGroupList.noticeList.wrtDt 공지날짜
 * @apiSuccess {String}    data.notice.noticeGroupList.siteNo 사이트번호
 * @apiSuccess {String}    data.notice.lnkdUrl 공지사항페이지링크

 * @apiSuccess {Object}    data.user 사용자정보
 * @apiSuccess {String}    data.user.mbrTypeCd 회원유형코드
 * @apiSuccess {String}    data.user.mbrGrdCd 회원등급코드
 * @apiSuccess {String}    data.user.mbrGrdNm 회원등급명
 * @apiSuccess {String}    data.user.mbrNm 회원명
 * @apiSuccess {String}    data.user.mbrCpnCnt 보유쿠폰개수
 * @apiSuccess {String}    data.user.mbrVvipYn 회원VVIP여부

 * @apiSuccess {Object} [data.user.mbrMainBirthBanrCornr] 회원메인생일배너
 * @apiSuccess {String} data.user.mbrMainBirthBanrCornr.siteNo 사이트번호
 * @apiSuccess {String} data.user.mbrMainBirthBanrCornr.dispCtgId 전시카테고리ID
 * @apiSuccess {String} data.user.mbrMainBirthBanrCornr.cornrId 코너번호

 * @apiSuccess {Object} [data.user.vipDeptBanrCornr] 백화점vip 특정대상 배너
 * @apiSuccess {String} data.user.vipDeptBanrCornr.siteNo 사이트번호
 * @apiSuccess {String} data.user.vipDeptBanrCornr.dispCtgId 전시카테고리ID
 * @apiSuccess {String} data.user.vipDeptBanrCornr.cornrId 코너번호
 *
 * @apiSuccessExample Response (example):
  *{
 *    "cached": false,
 *    "method": "",
 *    "res_code": "200",
 *    "res_message": "성공",
 *    "data": {
 *        "clip": {
 *            "itemClipList": [],
 *            "dispCmptList": [],
 *            "dispCtgClipList": [],
 *            "brandClipList": [],
 *            "lifeMagazineList": [],
 *            "eventList": []
 *        },
 *        "specific": {
 *            "siteNmDispInfo": [
 *                {
 *                    "siteNo": "6001",
 *                    "siteNoSeq": "1",
 *                    "dispTxt": "emartmall",
 *                    "dispColor": "#f29114",
 *                    "imgFileNm": ""
 *                }
 *            ]
 *        },
 *        "menu": {
 *            "footer": {
 *                "youthProtectionLnkdUrl": "http://qa-member.ssg.com/policies/youthProtection.ssg",
 *                "personInfoLnkdUrl": "http://qa-m.ssg.com/comm/commInfo.ssg?type=personInfo&_mpop=new",
 *                "youthProtectPolcyLnkdUrl": "http://qa-member.ssg.com/policies/youthProtection.ssg",
 *                "emallCompanyInfoLnkdUrl": "http://qa-m.emart.ssg.com/gate/textPage.ssg?_mpop=new&landingIdx=0&templId=9129845110",
 *                "smallInfoMap": {
 *                    "csTel": "1588-4249",
 *                    "businessInfo": "2012-서울중구-1308호",
 *                    "text": "대표자: 장재영    사업자등록번호: 201-81-32195\\n통신판매업 신고번호: 2012-서울중구-1308호\\n개인정보보호책임자: 김예철\\n주소: 서울특별시 중구 퇴계로 100\\n호스팅서비스 사업자 : (주)신세계",
 *                    "usafeNm": "신세계몰",
 *                    "siteNm": "(주)신세계 신세계몰",
 *                    "businessInfoLnkdUrl": "http://www.ftc.go.kr/info/bizinfo/communicationView.jsp?apv_perm_no=2012301010030201306&area1=&area2=&currpage=1&searchKey=04&searchVal=2018132195&stdate=&enddate=",
 *                    "csEmail": "shinsegaemall@shinsegae.com",
 *                    "usafeLnkdUrl": "https://www.usafe.co.kr/usafeShopView.asp?com_no=2018132195"
 *                },
 *                "smallPersonInfoLnkdUrl": "http://qa-m.ssg.com/comm/commInfo.ssg?type=personInfo&_mpop=new",
 *                "smallClauseInfoLnkdUrl": "http://qa-m.ssg.com/comm/commInfo.ssg?type=clause&_mpop=new",
 *                "clauseInfoLnkdUrl": "http://qa-m.ssg.com/comm/commInfo.ssg?type=clause&_mpop=new",
 *                "emallPersonInfoLnkdUrl": "http://qa-m.ssg.com/comm/commInfo.ssg?type=personInfo&_mpop=new",
 *                "emallPcLnkdUrl": "http://qa-emart.ssg.com/?usePCmode=Y",
 *                "tvPcLnkdUrl": "http://qa-tv.ssg.com/?usePCmode=Y",
 *                "sdeptPcLnkdUrl": "http://qa-department.ssg.com/?usePCmode=Y",
 *                "boonsPcLnkdUrl": "http://qa-boons.ssg.com/?usePCmode=Y",
 *                "smallCompanyInfoLnkdUrl": "http://qa-m.shinsegaemall.ssg.com/comm/companyInfo.ssg?tab=1&_mpop=new",
 *                "footerMenuList": [
 *                    {
 *                        "lnkdUrl": "http://qa-m.ssg.com/customer/main.ssg",
 *                        "menuDispNm": "고객센터"
 *                    },
 *                    {
 *                        "lnkdUrl": "http://qa-m.ssg.com/comm/recentViewItemList.ssg",
 *                        "menuDispNm": "최근본상품"
 *                    }
 *                ],
 *                "smallPcLnkdUrl": "http://qa-shinsegaemall.ssg.com/?usePCmode=Y",
 *                "companyInfoLnkdUrl": "http://qa-m.ssg.com/comm/commInfo.ssg?type=companyInfo",
 *                "bootsPcLnkdUrl": "http://qa-boots.ssg.com/?usePCmode=Y",
 *                "tradersPcLnkdUrl": "http://qa-traders.ssg.com/?usePCmode=Y",
 *                "ssgPcLnkdUrl": "http://qa-www.ssg.com/?usePCmode=Y",
 *                "emallInfoMap": {
 *                    "csTel": "1588-4349",
 *                    "businessInfo": "2012-서울중구-1323호",
 *                    "text": "대표자: 이갑수    사업자등록번호: 206-86-50913\\n통신판매업 신고번호: 2012-서울중구-1323호\\n개인정보보호책임자: 최우정\\n주소: 서울특별시 중구 퇴계로 100\\n호스팅서비스 사업자 : (주)이마트",
 *                    "usafeNm": "이마트몰",
 *                    "siteNm": "(주)이마트 이마트몰",
 *                    "businessInfoLnkdUrl": "http://www.ftc.go.kr/info/bizinfo/communicationView.jsp?apv_perm_no=2012301010030201324&area1=&area2=&currpage=1&searchKey=04&searchVal=2068650913&stdate=&enddate=",
 *                    "csEmail": "emart@emartmall.com",
 *                    "usafeLnkdUrl": "https://www.usafe.co.kr/usafeShopView.asp?com_no=2068650913"
 *                },
 *                "emallClauseInfoLnkdUrl": "http://qa-m.ssg.com/comm/commInfo.ssg?type=clause&_mpop=new"
 *            },
 *            "memberMenuList": [
 *                {
 *                    "menuId": "mypage",
 *                    "title": "MY\\nSSG",
 *                    "lnkdUrl": "http://qa-m.ssg.com/myssg/main.ssg"
 *                }
 *            ],
 *            "appCdnDomain": "http://qa-static.ssgcdn.com/ui/app/",
 *            "searchEngineDomain": "qa-search.ssglocal.com",
 *            "noNativeDispCmptIdList": [],
 *            "noNavList": [],
 *            "promDeviceList": [],
 *            "supershopPsblYn": "Y",
 *            "serverDateTime": "20171207163624",
 *            "commonUrlInfo": [
 *                {
 *                    "title": "사이즈 설정",
 *                    "lnkdUrl": "http://qa-m.ssg.com/myssg/myClip/sizeSetup.ssg",
 *                    "type": "sizesetting"
 *                }
 *            ],
 *            "viewType": {
 *                "android": [],
 *                "ios": []
 *            },
 *            "siteList": [
 *                {
 *                    "totalSvcNewImg": "http://static.ssgcdn.com/ui/app/6005/menu/i_icon_new2.png",
 *                    "siteNo": "6005",
 *                    "usageSiteNo": "6005",
 *                    "siteNm": "SSG",
 *                    "siteDomain": "http://qa-m.ssg.com",
 *                    "menuList": [
 *                        {
 *                            "iconTypeCd": "",
 *                            "endDts": "",
 *                            "menuDispNm": "쓱",
 *                            "menuType": "normal",
 *                            "trackingNm": "",
 *                            "menuID": "hot_deal",
 *                            "webUrls": [
 *                                "http://qa-m.ssg.com/main.ssg"
 *                            ]
 *                        }
 *                    ],
 *                    "totalSvcMyList": [
 *                        {
 *                            "newYn": "N",
 *                            "title": "MY SSG",
 *                            "lnkdUrl": "http://qa-m.ssg.com/myssg/main.ssg",
 *                            "lnkdType": "10",
 *                            "imgFileNm": "http://static.ssgcdn.com/ui/app/6005/menu/menu_01.png"
 *                        }
 *                    ],
 *                    "recAppList": [
 *                        {
 *                            "subName": "부러움을 사다 Beyond Shopping",
 *                            "packageName": "shinsegaemall",
 *                            "lnkdUrl": "http://qa-m.ssg.com/comm/app/appLink.ssg?mobilAppSvcNo=2",
 *                            "name": "신세계몰 모바일",
 *                            "imgFileNm": "http://static.ssgcdn.com/ui/app/6005/menu/app_03.png"
 *                        }
 *                    ],
 *                    "etcUrlList": [
 *                        {
 *                            "itemSuggest": {
 *                                "menuId": "itemSuggest",
 *                                "title": "상품 제안하기",
 *                                "lnkdUrl": "http://qa-m.ssg.com/comm/reportItem.ssg?divcTypeCd=60&siteNo=6005"
 *                            },
 *                            "searchEval": {
 *                                "menuId": "searchEvaluate",
 *                                "title": "이런 상품 구해주세요",
 *                                "lnkdUrl": "http://qa-m.ssg.com/searchEvaluate.ssg?suvyAnsExmplNo=3&srchwdNm="
 *                            }
 *                        }
 *                    ],
 *                    "additionalMenuList": [],
 *                    "themeShopList": [
 *                        {
 *                            "title": "스칸디나비안 디자인센터",
 *                            "lnkdUrl": "http://m.shinsegaemall.ssg.com/special/scandinavian/main.ssg",
 *                            "lnkdType": "10",
 *                            "imgFileNm": "http://qa-static.ssgcdn.com/cmpt/banner/201701/2017010417355056311495638149_354.png"
 *                        }
 *                    ],
 *                    "bottomMenuList": [],
 *                    "plusMenu": {},
 *                    "usage": {
 *                        "serviceYn": "Y",
 *                        "serviceMsg": ""
 *                    },
 *                    "noNativeList": [
 *                        {
 *                            "type": "brandshop",
 *                            "list": [
 *                                "1030770243",
 *                                "1030770239",
 *                                "1030770241",
 *                                "1030770240",
 *                                "1030770238",
 *                                "1030770237"
 *                            ]
 *                        }
 *                    ]
 *                }
 *            ]
 *        },
 *        "regist": {
 *            "appCdnDomain": "http://qa-static.ssgcdn.com/ui/app/",
 *            "push_rcv_yn": "Y",
 *            "apl_ver_link_url1": "https://itunes.apple.com/app/id588620185",
 *            "search_engine_domain": "qa-search.ssglocal.com",
 *            "apl_ver": "2.3.0",
 *            "no_nav_page_list": [],
 *            "gnb_svc_list": [
 *                {
 *                    "svc_link_url": "http://qa-m.ssg.com",
 *                    "site_no": "6005",
 *                    "svc_nm": "SSG.COM"
 *                }
 *            ],
 *            "pcomnt_push_rcv_yn": "N",
 *            "force_renew_yn": "F",
 *            "abTestType": "10"
 *        },
 *        "notice": {
 *            "noticeGroupList": [
 *                {
 *                    "noticeList": [
 *                        {
 *                            "title": "과천점 오픈 안내",
 *                            "lnkdUrl": "http://qa-m.ssg.com/customer/noticeList.ssg?bbsId=1&postngId=1036303343&postTeryIdnfNo=6001&siteNo=6001",
 *                            "wrtDt": "2017.03.14"
 *                        }
 *                    ],
 *                    "siteNo": "6001"
 *                }
 *            ],
 *            "lnkdUrl": "http://qa-m.ssg.com/customer/noticeList.ssg"
 *        },
 *        "user": {
 *            "mbrTypeCd": "",
 *            "mbrGrdCd": "",
 *            "mbrGrdNm": "",
 *            "mbrNm": "",
 *            "mbrCpnCnt": "",
 *            "mbrMainBirthBanrCornr": {
 *                "siteNo": "6005",
 *                "dispCtgId": "6000039706",
 *                "cornrId": "7000217921"
 *            },
 *            "vipDeptBanrCornr" : {
 *                "siteNo": "6005",
 *                "dispCtgId": "6000048531",
 *                "cornrId": "7000268070"
 *            }
 *        }
 *    }
 *}
 */

/**
@api {post} /api/launch/datas/info2.ssg 통합앱-Info2
@apiVersion 2.1.0
@apiName CommonController.getLaunchInfo2
@apiGroup App Run
@apiPermission none

@apiDescription 통합앱구동시 공통배너 및 팝업 정보를 제공하는 API

담당자 : 권태진

@apiParam {String="1.1.0","2.1.0"} [apiVersion=1.0.0] api버전
@apiParam {String} [mallChngCornrId] 몰이동 코너 조회를 위한 코너ID
@apiParam {String} mallChngDispCtgId 몰이동 코너 조회를 위한 카테고리ID(현재 사용하는 값은 6000010531)
@apiParam {String} mallChngSiteNo 몰이동 코너 조회를 위한 사이트No(현재 사용하는 값은 6005)
@apiParam {String} siteNo 앱기준의 siteNo(예, 이몰앱 : 6001, SSG앱 : 6005, 신세계몰앱 : 6004 등)

@apiParamExample {json} Request-Example :
 {
   "common":{
      "ts":"20170822143834",
      "mobil_app_no":"12",
      "apl_ver":"2.4.2",
      "os_cd":"20"
   },
   "params":{
      "apiVersion":"2.1.0",
      "mallChngCornrId":"",
      "mallChngDispCtgId":"6000010531",
      "mallChngSiteNo":"6005",
      "siteNo":"6001"
   }
}
@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/api/launch/datas/info2.ssg -d '
 {"common":{"ts":"20170823114406","apl_ver":"2.4.1","os_cd":"10","mobil_app_no":"3"},"params":{"apiVersion":"2.1","appBarSiteNo":"6001","mallChngDispCtgId":"6000010531","appBarCornrId":"","siteNo":"6001","mallChngCornrId":"","mallChngSiteNo":"6005","appBarDispCtgId":"6000010537"}}'

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
@apiSuccess {Object}    data.mainPopup.pushPopup 푸시안내를 위한 팝업, 푸시미허용 고객에게만 노출, [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List}      data.mainPopup.servicePopup 스와이프용 팝업 리스트, [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
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
         "pushPopup":{
            "id":"",
            "title":"(~8.31) 앱 수신 동의 팝업 프로모션",
            "desc":"1100379665",
            "lnkdUrl":"http://m.ssg.com/event/eventDetail.ssg?promId=1100245865",
            "lnkdType":"10",
            "imgFileNm":"http://static.ssgcdn.com/cmpt/banner/201708/2017081718242856358795634979_978.jpg",
            "strtDts":"20170818000000",
            "endDts":"20170831235959",
            "maiTitleNm1":"",
            "maiTitleNm2":"",
            "subtitlNm1":"",
            "subtitlNm2":"",
            "iconTgtLst":"",
            "titleShadUseYn":"",
            "imgWidth":"640",
            "imgHeight":"890",
            "dispOrdr":"-1",
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



/**
@api {post} /api/launch/datas/info3.ssg 통합앱-Info3
@apiVersion 1.0.0
@apiName CommonController.getLaunchInfo3
@apiGroup App Run
@apiPermission none

@apiDescription 앱이 background에서 foreground로 올라올때 호출하는 api중 하나

과거에는 슈퍼샵모드 진입가능여부만 판단했지만
VVIP 생일배너 정보도 추가되었다.

담당자 : 권태진

@apiParam {String} [apiVersion=1.0.0] api버전

@apiParamExample {json} Request-Example :
 {
   "common":{
      "ts":"20170822143834",
      "mobil_app_no":"12",
      "apl_ver":"2.4.2",
      "os_cd":"20"
   },
   "params":{

   }
}
@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/api/launch/datas/info3.ssg -d '
 {"common":{"apl_ver":"2.2.9","os_cd":"20","ts":"20170105094854","mobil_app_no":"12"},"params":{}}'

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {String}    data.supershopPsblYn 슈퍼샵모드 진입 가능 여부(00:00 ~ 06:59까지는 진입불가)
@apiSuccess {Object}    [data.mbrMainBirthBanrCornr] 회원메인생일배너
@apiSuccess {String}    data.mbrMainBirthBanrCornr.siteNo 사이트번호
@apiSuccess {String}    data.mbrMainBirthBanrCornr.dispCtgId 전시카테고리ID
@apiSuccess {String}    data.mbrMainBirthBanrCornr.cornrId 코너번호
@apiSuccess {Object}   [data.user.vipDeptBanrCornr] 백화점vip 특정대상 배너
@apiSuccess {String}    data.user.vipDeptBanrCornr.siteNo 사이트번호
@apiSuccess {String}    data.user.vipDeptBanrCornr.dispCtgId 전시카테고리ID
@apiSuccess {String}     data.user.vipDeptBanrCornr.cornrId 코너번호
@apiSuccess {String}    data.infoLastUpdateDateTime 앱 메뉴 최종 수정 시간

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "supershopPsblYn": "Y",
        "mbrMainBirthBanrCornr": {
            "siteNo": "6005",
            "dispCtgId": "6000039706",
            "cornrId": "7000217921"
        },
         "vipDeptBanrCornr" : {
            "siteNo": "6005",
            "dispCtgId": "6000048531",
            "cornrId": "7000268070"
        },
        "infoLastUpdateDateTime": "29991231235959"
    }
}
 */



/**
@api {post} /api/comm/checkversion/datas.ssg 앱업데이트 확인
@apiVersion 1.0.0
@apiName CommonController.checkVersion
@apiGroup App Run
@apiPermission none

@apiDescription 앱이 background에서 foreground로 올라올때 호출하는 api중 하나로 앱업데이트 여부를 조회한다.

담당자 : 권태진, 최새암

@apiParam {String} [mbr_dvic_uniq_no] 회원디바이스고유번호

@apiParamExample {json} Request-Example :
 {
   "common":{
      "ts":"20170823135341",
      "apl_ver":"2.4.1",
      "os_cd":"10",
      "mobil_app_no":"3"
   },
   "params":{
      "mbr_dvic_uniq_no":"ffffffff-e615-b329-73fa-f32121d55212"
   }
}
@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/api/comm/checkversion/datas.ssg -d '
 {"common":{"apl_ver":"2.4.2","os_cd":"20","ts":"20170823134848","mobil_app_no":"12"},"params":{"mbr_dvic_uniq_no":"E6419161-4E93-41CF-8082-A0F479C375BE"}}'

@apiSuccess {String}    res_code 응답코드
@apiSuccess {String}    res_message 응답메시지
@apiSuccess {Object}    data 응답결과값
@apiSuccess {String}    data.apl_ver 앱버전
@apiSuccess {String}    data.apl_ver_desc 업데이트 안내 문구
@apiSuccess {String}    data.apl_ver_link_url1 앱스토어 주소
@apiSuccess {String="F","U","S"}    data.force_renew_yn 업데이트 유형(F:강제업데이트, U:업데이트권유, S:업데이트안내 없음)

@apiSuccessExample Response (example):
{
   "cached":false,
   "method":"",
   "res_code":"200",
   "res_message":"성공",
   "data":{
      "apl_ver_link_url1":"https://itunes.apple.com/kr/app/ssg.com-baeghwajeom-eseo-imateukkaji/id786135420?mt=8",
      "apl_ver":"2.3.0",
      "apl_ver_desc":"",
      "force_renew_yn":"S"
   }
}
*/
