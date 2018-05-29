/**
	@api {post} /api/mobilWidgtMenu/datas 모바일 위젯 메뉴 리스트
	@apiVersion 0.0.0
	@apiName MobilWidgtController.mobilWidgtMenu
	@apiGroup Widgt
	@apiPermission none
	@apiDescription 모바일 위젯 메뉴 리스트 API
	
	담당자 : 최새암 파트너
	@apiParam {String} mobilAppSvcNo APP_SVC_NO
	
	@apiParamExample {json} Request-Example :
	{
		"common" : {
			"apl_ver" : "2.1.2",
			"os_cd" : "20",
			"ts" : "20151203110355",
			"mobil_app_no": "1",
		},
		"params" : {
			"mobilAppSvcNo" : "1"
		}
	}
	
	@apiExample Example-Usage : 
	curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://qa-m.apps.ssg.com/api/mobilWidgtMenu/datas.ssg -d '
	> {"common":{"ts":"20160101105910","mobil_app_no":"12","apl_ver":"2.0.1","os_cd":"20"},"params":{"mobilAppSvcNo":"3"}}'
	
	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {List} 		 data.resultList	위젯 전체 리스트
	@apiSuccess {Object} 	 data.resultList.widgtMenuInfo	위젯 메뉴 정보
	@apiSuccess {String} 	 data.resultList.widgtMenuInfo.menuTitle	메뉴타이틀
	@apiSuccess {List} 	 	 data.resultList.widgtMenuInfo.menuList	메뉴리스트
	@apiSuccess {String} 	 data.resultList.widgtMenuInfo.menuList.dispMenuNm	전시메뉴이름
	@apiSuccess {String} 	 data.resultList.widgtMenuInfo.menuList.webUrl	웹URL
	@apiSuccess {String} 	 data.resultList.widgtMenuInfo.menuList.appUrl	앱URL
	@apiSuccess {Object} 	 data.resultList.widgtSsgShopInfo	위젯 SSG매장 정보
	@apiSuccess {String} 	 data.resultList.widgtSsgShopInfo.menuTitle	메뉴타이틀
	@apiSuccess {List} 	 	 data.resultList.widgtSsgShopInfo.menuList	메뉴리스트
	@apiSuccess {String} 	 data.resultList.widgtSsgShopInfo.menuList.dispMenuNm	전시메뉴이름
	@apiSuccess {String} 	 data.resultList.widgtSsgShopInfo.menuList.webUrl	웹URL
	@apiSuccess {String} 	 data.resultList.widgtSsgShopInfo.menuList.appUrl	앱URL
	@apiSuccess {Object} 	 data.resultList.widgtSmallShopInfo	위젯 신몰매장 정보
	@apiSuccess {String} 	 data.resultList.widgtSmallShopInfo.menuTitle	메뉴타이틀
	@apiSuccess {List} 	 	 data.resultList.widgtSmallShopInfo.menuList	메뉴리스트
	@apiSuccess {String} 	 data.resultList.widgtSmallShopInfo.menuList.dispMenuNm	전시메뉴이름
	@apiSuccess {String} 	 data.resultList.widgtSmallShopInfo.menuList.webUrl	웹URL
	@apiSuccess {String} 	 data.resultList.widgtSmallShopInfo.menuList.appUrl	앱URL
	@apiSuccess {Object} 	 data.resultList.widgtEmallShopInfo	위젯 이몰매장 정보
	@apiSuccess {String} 	 data.resultList.widgtEmallShopInfo.menuTitle	메뉴타이틀
	@apiSuccess {List} 	 	 data.resultList.widgtEmallShopInfo.menuList	메뉴리스트
	@apiSuccess {String} 	 data.resultList.widgtEmallShopInfo.menuList.dispMenuNm	전시메뉴이름
	@apiSuccess {String} 	 data.resultList.widgtEmallShopInfo.menuList.webUrl	웹URL
	@apiSuccess {String} 	 data.resultList.widgtEmallShopInfo.menuList.appUrl	앱URL
	@apiSuccess {Object} 	 data.resultList.widgtStroeInfo	위젯 가상스토어 정보
	@apiSuccess {String} 	 data.resultList.widgtStroeInfo.menuTitle	메뉴타이틀
	@apiSuccess {List} 	 	 data.resultList.widgtStroeInfo.menuList	메뉴리스트
	@apiSuccess {String} 	 data.resultList.widgtStroeInfo.menuList.dispMenuNm	전시메뉴이름
	@apiSuccess {String} 	 data.resultList.widgtStroeInfo.menuList.webUrl	웹URL
	@apiSuccess {String} 	 data.resultList.widgtStroeInfo.menuList.appUrl	앱URL
	@apiSuccess {Object} 	 data.resultList.widgtDefaultMenu	위젯 디폴트매장 정보
	@apiSuccess {String} 	 data.resultList.widgtDefaultMenu.menuTitle	메뉴타이틀
	@apiSuccess {List} 	 	 data.resultList.widgtDefaultMenu.menuList	메뉴리스트
	@apiSuccess {String} 	 data.resultList.widgtDefaultMenu.menuList.dispMenuNm	전시메뉴이름
	@apiSuccess {String} 	 data.resultList.widgtDefaultMenu.menuList.webUrl	웹URL
	@apiSuccess {String} 	 data.resultList.widgtDefaultMenu.menuList.appUrl	앱URL
	
	
	@apiSuccessExample Response-Example : 
	
	{
	    "cached": false,
	    "method": "mobilWidgtMenu",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "resultList": {
	            "widgtMenuInfo": {
	                "menuTitle": "메뉴",
	                "menuList": []
	            },
	            "widgtSsgShopInfo": {
	                "menuTitle": "SSG.COM 인기매장",
	                "menuList": []
	            },
	            "widgtSmallShopInfo": {
	                "menuTitle": "신세계 인기매장",
	                "menuList": []
	            },
	            "widgtEmallShopInfo": {
	                "menuTitle": "이마트 인기매장",
	                "menuList": [
	                    {
	                        "dispMenuNm": "123122",
	                        "webUrl": "333123",
	                        "appUrl": "123123",
	                        "siteNo": "6001"
	                    }
	                ]
	            },
	            "widgtStroeInfo": {
	                "menuTitle": "공식스토어",
	                "menuList": []
	            },
	            "widgtDefaultMenu": {
	                "menuTitle": "디폴트메뉴",
	                "menuList": [
	                    {
	                        "dispMenuNm": "오반장 ",
	                        "webUrl": "http://m.ssg.com/service/obanjang.ssg",
	                        "appUrl": "happy",
	                        "siteNo": "6005"
	                    },
	                    {
	                        "dispMenuNm": "해피바이러스",
	                        "webUrl": "http://m.ssg.com/service/happybuyrus.ssg",
	                        "appUrl": "happy",
	                        "siteNo": "6005"
	                    },
	                    {
	                        "dispMenuNm": "검색",
	                        "webUrl": "",
	                        "appUrl": "Widget_Quick_Search",
	                        "siteNo": "6005"
	                    }
	                ]
	            }
	        }
	    }
	}
	
	@apiError PARAM_NOT_EXIST 파라미터 없음 (카테고리가 null값일때)
	@apiError PARAM_NOT_VALID 파라미터 유효성 검사 실패
*/