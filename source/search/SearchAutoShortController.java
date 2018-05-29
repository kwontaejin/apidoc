 /**
 * @api {get}  http://auto.ssglog.com:9094/WNRun.do 자동완성 바로가기(숏컷)
 * @apiVersion 0.0.0
 * @apiName SearchAutoShortController.search
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 검색 자동완성(바로가기 숏컷) URL 정리
 *
 * 
 * @apiParam {String} [query]    검색어
 *
 *
 * @apiParamExample {URL} Request-Example :
 * {
 *   "dev": {
 *       "SSG": "http://dev-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-total&query=",
 *       "신세계몰": "http://dev-search.ssglocal.com:9096/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-mall&query=",
 *		 "신세계백화점": "http://dev-search.ssglocal.com:9096/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-depart&query=",
 *       "이마트": "http://dev-search.ssglocal.com:9098/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-emart&query=",
 *		 "트레이더스": "http://dev-search.ssglocal.com:9098/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-traders&query=",
 *       "신세계TV쇼핑": "http://dev-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-tv&query=",
 *       "하우디": "http://dev-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-howdy&query=",
 *       "부츠": "http://dev-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-boots&query=",
 *       "SI빌리지": "http://dev-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-siv&query="
 *   },
 *   "qa": {
 *       "SSG": "http://qa-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-total&query=",
 *       "신세계몰": "http://qa-search.ssglocal.com:9096/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-mall&query=",
 *		 "신세계백화점": "http://qa-search.ssglocal.com:9096/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-depart&query=",
 *       "이마트": "http://qa-search.ssglocal.com:9098/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-emart&query=",
 *		 "트레이더스": "http://qa-search.ssglocal.com:9098/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-traders&query=",
 *       "신세계TV쇼핑": "http://qa-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-tv&query=",
 *       "하우디": "http://qa-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-howdy&query=",
 *       "부츠": "http://qa-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-boots&query=",
 *       "SI빌리지": "http://qa-search.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-siv&query="
 *   },
 *   "prod": {
 *       "SSG": "http://auto.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-total&query=",
 *       "신세계몰": "http://auto.ssglocal.com:9096/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-mall&query=",
 *		 "신세계백화점": "http://auto.ssglocal.com:9096/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-depart&query=",
 *       "이마트": "http://auto.ssglocal.com:9098/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-emart&query=",
 *		 "트레이더스": "http://auto.ssglocal.com:9098/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-traders&query=",
 *       "신세계TV쇼핑": "http://auto.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-tv&query=",
 *       "하우디": "http://auto.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-howdy&query=",
 *       "부츠": "http://auto.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-boots&query=",
 *       "SI빌리지": "http://auto.ssglocal.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-siv&query="
 *   }
 * }
 *
 * @apiExample Example usage:
 * > http://auto.ssglog.com:9094/WNRun.do?datatype=jsonp&convert=fw&target=shortcut-total&query=%EB%8F%84%EC%8B%9C%EB%9D%BD&callback=callback9821224
 *
 * @apiSuccess {String} responsestatus			응답코드
 * @apiSuccess {Object} result				    응답결과값
 * @apiSuccess {List} result.items						추천검색어 결과 리스트
 * @apiSuccess {String} result.totalcount				추천검색어 결과 갯수
 *
 *
 * @apiSuccessExample Response (example):
 * {
 * 	"responsestatus":0,
 * 	"result":
 * 	[
 * 		{
 * 			"totalcount":1,
 * 			"items":
 * 			[
 * 				{
 *					"banrurl" : "" ,
 * 					"count":200266,
 * 					"hkeyword":"<font style='font-size:12px'><font style='color:#CC6633'>육</font>심원</font>",
 * 					"keyword":"육심원",
 * 					"linkname":"육심원 매장습격 바로가기",
 * 					"linkurl": "lhttp://m.ssg.com/plan/shopAttack.ssg?dispCmptId=6000063983&amp;tlid="
 * 					"mediacd":"20",
 * 					"type":0,
 * 				}
 * 			]
 * 		}
 * 	]
 * }
*/