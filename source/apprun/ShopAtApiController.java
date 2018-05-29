 /**
 * @api {post} /api/shopat/launch/datas/info1 샤벳-Info1
 * @apiVersion 1.0.0
 * @apiName ShopAtApiController.getShopAtInfo1
 * @apiGroup App Run
 * @apiSampleRequest off
 * @apiPermission none
 *
 * @apiDescription 샤벳앱구동시 필요한 정보들을 제공하는 API
 *
 * @apiParam {String} [apiVersion=1.0.0] api버전
 * @apiParam {Object} [regist] 기기 및 설정정보
 * @apiParam {String} regist.dvic_mdl_nm 기기모델명
 * @apiParam {String} regist.os_ver OS버전
 * @apiParam {String} regist.first_yn 앱최초설치여부
 * @apiParam {String} regist.mbr_dvic_uniq_no 기기고유번호
 * @apiParam {String} [regist.mbr_dvic_uniq_id] 기기고유ID
 * @apiParam {String} [regist.fs0] fs0쿠키값
 *
 * @apiParamExample {json} Request-Example :
 * {
 *    "common":{
 *       "apl_ver":"1.1.4",
 *       "os_cd":"20",
 *       "ts":"20170821180340",
 *       "mobil_app_no":"51"
 *    },
 *    "params":{
 *       "regist":{
 *          "first_yn":"N",
 *          "fs0":"",
 *          "mbr_dvic_uniq_no":"90BB5965-FE9A-45B3-BB4D-2EC08E1D3B09",
 *          "dvic_mdl_nm":"iPhone6",
 *          "os_ver":"10.3.3",
 *          "mbr_dvic_uniq_id":"f32c7aba6b74ef314ac55373ca9088a601892ccf"
 *       }
 *    }
 * }
 * @apiExample Example usage:
 *  curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/api/shopat/launch/datas/info1.ssg -d '
 *  {"common":{"apl_ver":"1.1.4","os_cd":"20","ts":"20170821180340","mobil_app_no":"51"},"params":{"regist":{"first_yn":"N","fs0":"","mbr_dvic_uniq_no":"90BB5965-FE9A-45B3-BB4D-2EC08E1D3B09","dvic_mdl_nm":"iPhone6","os_ver":"10.3.3","mbr_dvic_uniq_id":"f32c7aba6b74ef314ac55373ca9088a601892ccf"}}}

 * @apiSuccess {String} res_code 응답코드
 * @apiSuccess {String} res_message 응답메시지
 * @apiSuccess {Object} data
 * @apiSuccess {String} data.eventCornrId 이벤트코너ID
 * @apiSuccess {Object} data.footer 푸터정보
 * @apiSuccess {String} data.footer.youthProtectionLnkdUrl 청소년보호방침
 * @apiSuccess {String} data.footer.emallCompanyInfoLnkdUrl 이마트몰회사소개
 * @apiSuccess {String} data.footer.smallPersonInfoLnkdUrl 개인정보처리방침
 * @apiSuccess {String} data.footer.smallClauseInfoLnkdUrl 이용약관
 * @apiSuccess {String} data.footer.emallPersonInfoLnkdUrl 개인정보처리방침
 * @apiSuccess {Object} data.footer.emallInfo 이마트몰정보
 * @apiSuccess {String} data.footer.emallInfo.csTel 고객센터번호
 * @apiSuccess {String} data.footer.emallInfo.businessInfo 통신판매업 사업번호
 * @apiSuccess {String} data.footer.emallInfo.text 문구
 * @apiSuccess {String} data.footer.emallInfo.usafeNm소비자피해보상보험 가입 사실확인명
 * @apiSuccess {String} data.footer.emallInfo.siteNm 사이트명
 * @apiSuccess {String} data.footer.emallInfo.businessInfoLnkdUrl 통신판매사업자정보주소
 * @apiSuccess {String} data.footer.emallInfo.csEmail 고객센터이메일
 * @apiSuccess {String} data.footer.emallInfo.usafeLnkdUrl 소비자피해보상보험 가입 사실확인 주소
 * @apiSuccess {String} data.footer.emallClauseInfoLnkdUrl 이용약관
 * @apiSuccess {String} data.footer.smallCompanyInfoLnkdUrl 신세계몰회사소개
 * @apiSuccess {Object} data.footer.smallInfo 신세계몰정보
 * @apiSuccess {String} data.footer.smallInfo.csTel 고객센터번호
 * @apiSuccess {String} data.footer.smallInfo.businessInfo 통신판매업 사업번호
 * @apiSuccess {String} data.footer.smallInfo.text 문구
 * @apiSuccess {String} data.footer.smallInfo.usafeNm 소비자피해보상보험 가입 사실확인명
 * @apiSuccess {String} data.footer.smallInfo.siteNm 사이트명
 * @apiSuccess {String} data.footer.smallInfo.businessInfoLnkdUrl 통신판매사업자정보주소
 * @apiSuccess {String} data.footer.smallInfo.csEmail 고객센터이메일
 * @apiSuccess {String} data.footer.smallInfo.usafeLnkdUrl 소비자피해보상보험 가입 사실확인 주소
 * @apiSuccess {String} data.appCdnDomain APP전용 CDN경로
 * @apiSuccess {String} data.searchEngineDomain 검색엔진 도메인
 * @apiSuccess {Object[]} data.menu 몰별정보모음
 * @apiSuccess {String} data.menu.menuId 메뉴ID
 * @apiSuccess {String} data.menu.title 타이틀
 * @apiSuccess {String} data.menu.lnkdUrl 링크
 * @apiSuccess {String} data.promCornrId
 * @apiSuccess {Object[]} data.recAppList 추천앱목록
 * @apiSuccess {String} data.recAppList.subName 앱설명
 * @apiSuccess {String} data.recAppList.packageName 앱패키지이름
 * @apiSuccess {String} data.recAppList.lnkdUrl 앱설치주소
 * @apiSuccess {String} data.recAppList.name 앱명
 * @apiSuccess {String} data.recAppList.imgFileNm 이미지경로
 * @apiSuccess {Object} data.regist 앱등록 후 전달받는 공통정보
 * @apiSuccess {String} data.regist.appCdnDomain APP전용 CDN경로
 * @apiSuccess {String} data.regist.apl_ver_link_url1 앱스토어주소
 * @apiSuccess {String} data.regist.push_rcv_yn 플리즈코멘트 수신여부
 * @apiSuccess {String} data.regist.search_engine_domain 검색엔진 도메인
 * @apiSuccess {String} data.regist.apl_ver 앱버전
 * @apiSuccess {Array[]} data.regist.no_nav_page_list Native Header를 표시 하지 않을 웹뷰 페이지
 * @apiSuccess {Object[]} data.regist.gnb_svc_list 신규앱에서는 미사용
 * @apiSuccess {String} data.regist.gnb_svc_list.svc_link_url
 * @apiSuccess {String} data.regist.gnb_svc_list.site_no
 * @apiSuccess {String} data.regist.gnb_svc_list.svc_nm
 * @apiSuccess {String} data.regist.apl_ver_desc
 * @apiSuccess {String} data.regist.pcomnt_push_rcv_yn 플리즈코멘트 수신여부
 * @apiSuccess {String} data.regist.force_renew_yn 강제업데이트 여부
 * @apiSuccess {String} data.cdnDomain
 * @apiSuccess {Object[]} data.checkFileList
 * @apiSuccess {String} data.checkFileList.title
 * @apiSuccess {String} data.checkFileList.lnkdUrl
 * @apiSuccess {String} data.checkFileList.type
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "eventCornrId": "7000134746",
 *         "footer": {
 *             "youthProtectionLnkdUrl": "http://member.ssg.com/policies/youthProtection.ssg",
 *             "emallCompanyInfoLnkdUrl": "http://m.emart.ssg.com/gate/textPage.ssg?_mpop=new&landingIdx=0&templId=9129845110",
 *             "smallPersonInfoLnkdUrl": "http://m.ssg.com/comm/commInfo.ssg?type=personInfo&_mpop=new",
 *             "smallClauseInfoLnkdUrl": "http://m.ssg.com/comm/commInfo.ssg?type=clause&_mpop=new",
 *             "emallPersonInfoLnkdUrl": "http://m.ssg.com/comm/commInfo.ssg?type=personInfo&_mpop=new",
 *             "emallInfo": {
 *                 "csTel": "1588-4349",
 *                 "businessInfo": "2012-서울중구-1323호",
 *                 "text": "대표자: 이갑수    사업자등록번호: 206-86-50913\\n통신판매업 신고번호: 2012-서울중구-1323호\\n개인정보보호책임자: 강영태\\n주소: 서울특별시 중구 퇴계로 100\\n호스팅서비스 사업자 : (주)이마트",
 *                 "usafeNm": "이마트몰",
 *                 "siteNm": "(주)이마트 이마트몰",
 *                 "businessInfoLnkdUrl": "http://www.ftc.go.kr/info/bizinfo/communicationView.jsp?apv_perm_no=2012301010030201324&area1=&area2=&currpage=1&searchKey=04&searchVal=2068650913&stdate=&enddate=",
 *                 "csEmail": "emart@emartmall.com",
 *                 "usafeLnkdUrl": "https://www.usafe.co.kr/usafeShopView.asp?com_no=2068650913"
 *             },
 *             "emallClauseInfoLnkdUrl": "http://m.ssg.com/comm/commInfo.ssg?type=clause&_mpop=new",
 *             "smallCompanyInfoLnkdUrl": "http://m.shinsegaemall.ssg.com/comm/companyInfo.ssg?tab=1&_mpop=new",
 *             "smallInfo": {
 *                 "csTel": "1588-4249",
 *                 "businessInfo": "2012-서울중구-1308호",
 *                 "text": "대표자: 장재영    사업자등록번호: 201-81-32195\\n통신판매업 신고번호: 2012-서울중구-1308호\\n개인정보보호책임자: 김예철\\n주소: 서울특별시 중구 퇴계로 100\\n호스팅서비스 사업자 : (주)신세계",
 *                 "usafeNm": "신세계몰",
 *                 "siteNm": "(주)신세계 신세계몰",
 *                 "businessInfoLnkdUrl": "http://www.ftc.go.kr/info/bizinfo/communicationView.jsp?apv_perm_no=2012301010030201306&area1=&area2=&currpage=1&searchKey=04&searchVal=2018132195&stdate=&enddate=",
 *                 "csEmail": "shinsegaemall@shinsegae.com",
 *                 "usafeLnkdUrl": "https://www.usafe.co.kr/usafeShopView.asp?com_no=2018132195"
 *             }
 *         },
 *         "appCdnDomain": "http://static.ssgcdn.com/ui/app/",
 *         "searchEngineDomain": "auto.ssglog.com",
 *         "menu": [
 *             {
 *                 "menuId": "mypage",
 *                 "title": "MY\\nSSG",
 *                 "lnkdUrl": "http://m.ssg.com/myssg/main.ssg"
 *             }
 *         ],
 *         "promCornrId": "7000163672",
 *         "recAppList": [
 *             {
 *                 "subName": "백화점에서 이마트까지 한눈에 한번에 신세계적 쇼핑포털",
 *                 "packageName": "ssg",
 *                 "lnkdUrl": "http://m.ssg.com/comm/app/appLink.ssg?mobilAppSvcNo=3",
 *                 "name": "SSG 모바일",
 *                 "imgFileNm": "http://static.ssgcdn.com/ui/app/6005/menu/app_04.png"
 *             }
 *         ],
 *         "regist": {
 *             "appCdnDomain": "http://static.ssgcdn.com/ui/app/",
 *             "apl_ver_link_url1": "https://itunes.apple.com/kr/app/sinsegyemol/id1061864593?mt=8",
 *             "push_rcv_yn": "Y",
 *             "search_engine_domain": "auto.ssglog.com",
 *             "apl_ver": "1.1.4",
 *             "no_nav_page_list": [
 *                 "m.ssg.com/event/eventHappyTypeDtl.ssg"
 *             ],
 *             "gnb_svc_list": [
 *                 {
 *                     "svc_link_url": "http://m.ssg.com",
 *                     "site_no": "6005",
 *                     "svc_nm": "SSG.COM"
 *                 }
 *             ],
 *             "apl_ver_desc": "",
 *             "pcomnt_push_rcv_yn": "",
 *             "force_renew_yn": "S"
 *         },
 *         "cdnDomain": "http://static.ssgcdn.com",
 *         "checkFileList": [
 *             {
 *                 "title": "브랜드카테고리",
 *                 "lnkdUrl": "http://static.ssgcdn.com/common/ui/json/bshop_list_NORMAL.json",
 *                 "type": "categoryfile"
 *             }
 *         ]
 *     }
 * }
 */