/**
	@api {post} /api/myssg/datas.ssg		MYSSG 정보조회
	@apiVersion 1.0.0
	@apiName MyssgController.customerInfo
	@apiGroup Personalized
	@apiPermission none

	@apiDescription MYSSG 정보조회 /vsApi/customerInfo.ssg(가상스토어), /api/refrigerator/myssg/datas.ssg(삼성냉장고)

	

	@apiParamExample {json} Request-Example :
	{
		"common":{
			"apl_ver":"2.1.2",
			"os_cd":"20",
			"ts":"20151203110355",
			"mobil_app_no":"1"
		},
		"params":{
		}
	}
	@apiExample Example usage:
	 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/myssg/datas.ssg -d '
	> {"common":{"apl_ver":"2.1.2","os_cd":"20","ts":"20151203110355","mobil_app_no":"1"},"params":{}}'

	@apiSuccess {String}     res_code 응답코드
	@apiSuccess {String}     res_message 응답메시지
	@apiSuccess {Object}     data 응답결과값
	@apiSuccess {String}		data.item_count		자주구매상품 개수
	@apiSuccess {List}			data.item_list		자주구매상품 LIST
	@apiSuccess {String}		data.item_list.item_id	상품ID
	@apiSuccess {String}		data.item_list.item_nm	상품명
	@apiSuccess {String}		data.item_list.item_cnt	구매횟수
	@apiSuccess {String}		data.mbr_nm			회원명
	@apiSuccess {String}		data.mbr_grd_cd		회원등급코드
	@apiSuccess {String}		data.mbr_grd_nm		회원등급명
	@apiSuccess {String}		data.my_clip_count	MY클립개수
	@apiSuccess {String}		data.cupon_count	쿠폰개수
	@apiSuccess {String}		data.sg_point_count	신세계포인트
	@apiSuccess {String}		data.sg_point_cardno	신세계포인트카드번호 (empty인경우 신세계포인트 미가입고객)
	@apiSuccess {String}		data.s_money_count	S머니
	@apiSuccess {String}		data.s_poket_count	S포켓
	@apiSuccess {String}		data.ord_rdp		주문접수개수
	@apiSuccess {String}		data.paymt_cmpt		결제완료개수
	@apiSuccess {String}		data.item_ready		상품준비중개수
	@apiSuccess {String}		data.shpp			배송중개수
	@apiSuccess {String}		data.shpp_cmpt		배송완료개수
	@apiSuccess {String}		data.addr_basic		배송지기본주소
	@apiSuccess {String}		data.addr_detail	배송지상세주조
	@apiSuccess {String}		data.addr_antnm		배송지별칭
	@apiSuccess {String}		data.addr_zip		배송지우편번호
	@apiSuccess {String}		data.mbr_url		개인정보수정URL
	@apiSuccess {String}		data.shpp_url		배송지관리URL
	@apiSuccess {String}		data.mbr_pass_url	비밀번호변경URL
	@apiSuccess {String}		data.ord_url		주문/배송 조회URL
	@apiSuccess {String}		data.mbr_grd_url	MY 등급별 혜택보기URL
	@apiSuccess {String}		data.my_ssg_url		MY SSG URL
	@apiSuccess {String}		data.my_clip_url	MY 클립URL
	@apiSuccess {String}		data.cupon_url		쿠폰URL
	@apiSuccess {String}		data.sg_point_url	신세계포인트URL
	@apiSuccess {String}		data.s_mony_url		S-머니URL
	@apiSuccess {String}		data.s_poket_url	S-포켓URL
	@apiSuccess {String}		data.free_item_url	자주구매상품URL
	@apiSuccess {String}		data.claim_proc_url		현재는 삼성냉장고에서만 사용(삼성냉장고외에 사용시 주석 수정해주세요.)
	@apiSuccess {String}		data.customer_main_url	현재는 삼성냉장고에서만 사용(삼성냉장고외에 사용시 주석 수정해주세요.)
	
	@apiSuccessExample Response (example):
	{
	    "cached": false,
	    "method": "customerInfo",
	    "res_code": "200",
	    "res_message": "성공",
	    "data": {
	        "shpp_cmpt": "5",
	        "paymt_cmpt": "0",
	        "item_ready": "0",
	        "my_clip_count": "nnnn",
	        "cupon_count": "nnn",
	        "addr_detail": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
	        "sg_point_url": "http://m.ssg.com/myssg/moneyMng/spointMain.ssg?_mpop=new",
	        "customer_main_url": "http://m.ssg.com/customer/main.ssg",
	        "shpp_url": "https://member.ssg.com/m/comm/shpplocList.ssg",
	        "free_item_url": "http://m.ssg.com/myssg/productMng/frequentlyOrderItem.ssg?_mpop=new",
	        "sg_point_count": "nnnnn",
	        "mbr_grd_nm": "XX",
	        "mbr_nm": "김XX무",
	        "item_count": 10,
	        "mbr_pass_url": "https://member.ssg.com/m/myssg/myinfoMng/changePwd.ssg?_mpop=new",
	        "s_poket_count": "0",
	        "mbr_url": "https://member.ssg.com/m/myssg/myinfoMng/password.ssg?_mpop=new",
	        "mbr_grd_cd": "30",
	        "item_list": [
	            {
	                "item_cnt": "2",
	                "item_id": "1000021031223",
	                "item_nm": "[피코크] 만능 파 기름 250ml"
	            },
	            {
	                "item_cnt": "2",
	                "item_id": "1000017367699",
	                "item_nm": "무명식당 오색현미1.5kg"
	            }
	        ],
	        "s_poket_url": "http://m.ssg.com/myssg/moneyMng/spocketMain.ssg?_mpop=new",
	        "my_ssg_url": "http://m.ssg.com/myssg/main.ssg",
	        "mbr_grd_url": "http://m.ssg.com/event/couponInfo.ssg",
	        "my_clip_url": "http://m.ssg.com/myssg/myClip/main.ssg?attnDivCd=10",
	        "s_mony_url": "http://m.ssg.com/myssg/moneyMng/smoneySavedMain.ssg?_mpop=new",
	        "cupon_url": "http://m.ssg.com/myssg/moneyMng/memberCpnOwnList.ssg",
	        "ord_url": "http://pay.ssg.com/m/myssg/orderList.ssg",
	        "ord_rdp": "0",
	        "addr_antnm": "삼도아파트",
	        "claim_proc_url": "http://pay.ssg.com/m/myssg/claimProcList.ssg",
	        "addr_basic": "서울 강서구 곰달래로20길",
	        "s_money_count": "0",
	        "shpp": "1",
	        "addr_zip": "07776"
	    }
	}
	@apiError FAIL_PARAM_NOT_EXIST	401 / 요청 파라미터가 없습니다
	@apiError FAIL_PARAM_NOT_VALID 402 / 요청 파라미터 유효성 검사 실패
	@apiError REQUIRED_LOGIN		403 / 로그인이 필요한 서비스입니다
 */

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
