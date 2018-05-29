 /**
 * @api {get}  http://auto.ssglog.com:9095/WNRun.do 자동완성 추천검색어
 * @apiVersion 0.0.0
 * @apiName SearchAutoController.search
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 검색 자동완성(추천바로가기) URL 정리
 *
 * 
 * @apiParam {String} [query]    검색어
 *
 *
 * @apiParamExample {URL} Request-Example :
 * {
 *   "dev": {
 *       "SSG": "http://dev-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-total&query=",
 *       "신세계몰": "http://dev-search.ssglocal.com:9097/WNRun.do?datatype=jsonp&convert=fw&target=common-mall&query=",
 *		 "신세계백화점": "http://dev-search.ssglocal.com:9097/WNRun.do?datatype=jsonp&convert=fw&target=common-depart&query=",
 *       "이마트": "http://dev-search.ssglocal.com:9099/WNRun.do?datatype=jsonp&convert=fw&target=common-emart&query=",
 *		 "트레이더스": "http://dev-search.ssglocal.com:9099/WNRun.do?datatype=jsonp&convert=fw&target=common-traders&query=",
 *       "신세계TV쇼핑": "http://dev-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-tv&query=",
 *       "하우디": "http://dev-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-howdy&query=",
 *       "부츠": "http://dev-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-boots&query=",
 *       "SI빌리지": "http://dev-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-siv&query="
 *   },
 *   "qa": {
 *       "SSG": "http://qa-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-total&query=",
 *       "신세계몰": "http://qa-search.ssglocal.com:9097/WNRun.do?datatype=jsonp&convert=fw&target=common-mall&query=",
 *		 "신세계백화점": "http://qa-search.ssglocal.com:9097/WNRun.do?datatype=jsonp&convert=fw&target=common-depart&query=",
 *       "이마트": "http://qa-search.ssglocal.com:9099/WNRun.do?datatype=jsonp&convert=fw&target=common-emart&query=",
 *		 "트레이더스": "http://qa-search.ssglocal.com:9099/WNRun.do?datatype=jsonp&convert=fw&target=common-traders&query=",
 *       "신세계TV쇼핑": "http://qa-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-tv&query=",
 *       "하우디": "http://qa-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-howdy&query=",
 *       "부츠": "http://qa-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-boots&query=",
 *       "SI빌리지": "http://qa-search.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-siv&query="
 *   },
 *   "prod": {
 *       "SSG": "http://auto.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-total&query=",
 *       "신세계몰": "http://auto.ssglocal.com:9097/WNRun.do?datatype=jsonp&convert=fw&target=common-mall&query=",
 *		 "신세계백화점": "http://auto.ssglocal.com:9097/WNRun.do?datatype=jsonp&convert=fw&target=common-depart&query=",
 *       "이마트": "http://auto.ssglocal.com:9099/WNRun.do?datatype=jsonp&convert=fw&target=common-emart&query=",
 *		 "트레이더스": "http://auto.ssglocal.com:9099/WNRun.do?datatype=jsonp&convert=fw&target=common-traders&query=",
 *       "신세계TV쇼핑": "http://auto.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-tv&query=",
 *       "하우디": "http://auto.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-howdy&query=",
 *       "부츠": "http://auto.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-boots&query=",
 *       "SI빌리지": "http://auto.ssglocal.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-siv&query="
 *   }
 * }
 *
 * @apiExample Example usage:
 * > http://auto.ssglog.com:9095/WNRun.do?datatype=jsonp&convert=fw&target=common-total&query=%EB%8F%84%EC%8B%9C%EB%9D%BD&callback=callback9821224
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
 * 			"totalcount":10,
 * 			"items":
 * 			[
 * 				{
 * 					"hkeyword":"<font style='font-size:12px'><font style='color:#CC6633'>도시락</font></font>",
 * 					"keyword":"도시락",
 * 					"count":3290,
 * 					"type":1,
 * 					"linkname":"",
 * 					"linkurl":""
 * 				},
 * 				{
 * 					"hkeyword":"<font style='font-size:12px'><font style='color:#CC6633'>도시락</font>김</font>",
 * 					"keyword":"도시락김",
 * 					"count":1761,
 * 					"type":1,
 * 					"linkname":"",
 * 					"linkurl":""
 * 				}
 * 			]
 * 		}
 * 	]
 * }
*/