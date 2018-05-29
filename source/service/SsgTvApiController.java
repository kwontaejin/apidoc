/**

@api {post} /api/ssgtv/tv/datas.ssg 쓱TV 컨텐츠
@apiVersion 1.0.0
@apiName TvShoppingSsgTvController.TvShoppingSsgTvContents
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
쓱TV 컨텐츠 API

<br>- source : ssg-mapi-webapp/src/main/java/ssg/mapi/na/service/TvShoppingSsgTvController.java TvShoppingSsgTvContents()
<br>- 담당자 : 전보솔P

@apiParam {String} [dataIndex="0"] 데이터 index : 0인 경우만 ssgTvCtgList 데이터 내림
@apiParam {String} [page="1"] 페이지
@apiParam {String} [pageSize="10"] 페이지사이즈
@apiParam {String} [dpvdCtgId=""] 카테고리ID

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
        "page":"1",
        "pageSize":"30",
        "dataIndex":"0",
        "dpvdCtgId":""
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext 다음페이지여부
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 갯수
@apiSuccess {List} data.ssgTvCtgList 쓱TV 카테고리 리스트
@apiSuccess {String} data.ssgTvCtgList.dpvdCtgId 카테고리ID
@apiSuccess {String} data.ssgTvCtgList.dpvdCtgNm 카테고리명
@apiSuccess {List} data.ssgTvDpvdList 쓱TV 동영상 리스트
@apiSuccess {String} data.ssgTvDpvdList.dpvdUrl 전시동영상url
@apiSuccess {String} data.ssgTvDpvdList.dpvdCtgId 쓱TV카테고리ID
@apiSuccess {String} data.ssgTvDpvdList.newYn NEW아이콘 여부
@apiSuccess {String} data.ssgTvDpvdList.vodPlyTime 동영상재생시간
@apiSuccess {String} data.ssgTvDpvdList.dpvdCtgNm 쓱TV카테고리명(컨텐츠그룹명)
@apiSuccess {String} data.ssgTvDpvdList.dpvdCntt 전시동영상내용
@apiSuccess {String} data.ssgTvDpvdList.dpvdTitleNm 전시동영상제목명
@apiSuccess {String} data.ssgTvDpvdList.dpvdId 전시동영상ID
@apiSuccess {String} data.ssgTvDpvdList.repImgPathNm 대표이미지경로명

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "mbrProgOrdCnt",
    "res_code": "200",
    "res_message": "성공",
    "data": {
		"hasNext": "Y",
		"pageSize": "10",
		"ssgTvCtgList": [
			{
			"dpvdCtgId": "",
			"dpvdCtgNm": "전체"
			},
			{
			"dpvdCtgId": "2016110277",
			"dpvdCtgNm": "디지털톡"
			},
			{
			"dpvdCtgId": "2017020328",
			"dpvdCtgNm": "아트레시피"
			},
			{
			"dpvdCtgId": "2017020332",
			"dpvdCtgNm": "뷰티박스"
			},
			{
			"dpvdCtgId": "2016110274",
			"dpvdCtgNm": "오늘의 싸군"
			},
			{
			"dpvdCtgId": "2016110276",
			"dpvdCtgNm": "혼밥남녀"
			},
			 {
			"dpvdCtgId": "2016110275",
			"dpvdCtgNm": "엄마를 부탁해"
			}
		],
		"ssgTvDpvdList": [
		 	{
				"dpvdUrl": "http://v.kr.kollus.com/sr/meida.mp4?key=D9C34B694FF4728E430E5E0F1D9FD78D3813CBD661884C6FD7B7993CB7FD46644370D08FB2E98C86A2A35AFCF0B18C3E393BFB94E7FC71BD3B03DAA6E56FE9DBEBC051E672AE9E9B9CC0FE397999D936F9B42B4164AED5CDBC81ACDAA5B81E0FA1B8C8D0357935D3602F43AFC00B8A0637DB1EAEAFFED887150616E004AB6BD9CD0BEBD1601A8CFB5954A6367464B778B7B50E6D4D958F0E74C3C19D7952B70B6620C493598A3AA423B509DC74634C3F0914B723AC3C6E618069523A4EA99026CF8EBBEE51837533670F7B32ABB36DC6CE052E80C0278D3A26527CBF6804086E00F12C0355500EB40FA30900ADD0965F63538F53FB5D4125AECFD8BC2ADA12FAC5C58D8B4ABF17702F7FCEFC638DA6A743606606A780651938E664BA5FD227CD|V1.0",
				"dpvdCtgId": "2017020332",
				"newYn": "N",
				"vodPlyTime": "128",
				"dpvdCtgNm": "뷰티박스",
				"dpvdCntt": "장미꽃 모양의 폼클렌징 거품으로 깨끗하게 기분좋게 클렌징하세요",
				"dpvdTitleNm": "[뷰티박스]백장미가 피어오르는 폼클렌징으로 뽀드득 세안하세요",
				"dpvdId": "568",
				"repImgPathNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/tvshopping/ssgtvimg/201708/ssgtv_200.jpg&w=500&t=4a80eeed823291231252948ed6eb11e012b2309d"
			}
		]
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/ssgtv/tv/items.ssg 쓱TV 상품리스트
@apiVersion 1.0.0
@apiName  TvShoppingSsgTvController.TvShoppingSsgTvItems
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
쓱TV 상품리스트 API

<br>- source : ssg-mapi-webapp/src/main/java/ssg/mapi/na/service/TvShoppingSsgTvController.java TvShoppingSsgTvItems()
<br>- 담당자 : 전보솔P

@apiParam {String} [page="1"] 페이지
@apiParam {String} [pageSize="10"] 페이지사이즈
@apiParam {String} [dpvdCtgId=""] 카테고리ID
@apiParam {String} dpvdId 전시동영상ID
@apiParam {String} itemImgSize 상품이미지사이즈


@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
		"page":"1",
		"pageSize":"1",
		"dpvdCtgId":"",
		"dpvdId":"533"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext 다음페이지 여부
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 갯수
@apiSuccess {List} data.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "mbrProgOrdCnt",
    "res_code": "200",
    "res_message": "성공",
    "data": {
		"hasNext": "N",
		"itemList": [
			 {
				"itemId": "1000022556341",
				"itemNm": "(특별 사은품)카이 SHUN SORA 칼블럭세트(c)",
				"displayPrc": "329000",
				"strikeOutPrc": "",
				"minOnetOrdPsblQty": "1",
				"maxOnetOrdPsblQty": "99",
				"soldOutYn": "N",
				"stoppedSellingYn": "N",
				"siteNo": "6200",
				"siteNm": "신세계TV쇼핑",
				"salestrNo": "6005",
				"salestrNm": "S.COM몰",
				"sellpntNm": "",
				"brandNm": "",
				"goItemDetailYn": "N",
				"msgWhenGoToItemDetail": "",
				"attnTgtIdnfNo1": "1000022556341",
				"attnTgtIdnfNo2": "6005",
				"attnDivCd": "10",
				"needAdultCertification": "false",
				"itemLnkd": "http://m.tv.ssg.com/item/itemView.ssg?itemId=1000022556341&siteNo=6200&salestrNo=6005",
				"itemImgUrl": "http://item.ssgcdn.com/41/63/55/item/1000022556341_i1_256.jpg",
				"planDt": "",
				"dataFileNm": "http://v.kr.kollus.com/sr/meida.mp4?key=D9C34B694FF4728E430E5E0F1D9FD78D0D32154FF19A7F9E552F9850D0BC2893F3CFDD0FD6DE6A8FB8460C8113B8514FBB63519D9269C844A284F0D246FE1EDDF26016898047B1CEDB643DD7A79CDE75F34F109DA7C6B27F1E06A012F54057263F7737C16437A2D2AFF50FFD9D73F44537BEE53075786CFFBB8E565E3E7F60441B6F14847792A456294D32665DF916B7B9C3EC5A4D859CD43F0E941108B7715698CD760C3B5476F63B17EADDB787532C016DE996A56E29497F992190F1A2CE0ABF81E1BA525F0FC8D89924D42834E5566865D1997E3CA89D8E195DC7ABDB925AE9A6EA73EDDCAB7DF4C70549044EBF58B633AB4CE2D0E99BF2BC80E27B84398D5E3FF90301783289B7F684CD95E32D0783B27B314D860B58BEC2F4C673FFAD60%7CV1.0",
				"pickuItemYn": "N",
				"qshppPsblYn": "N",
				"mltSellQty": "1",
				"uItemSamePrcYn": "Y",
				"itemOrdQty": "",
				"itemOrdQtyType": "DEAL",
				"tildeDispYn": "N",
				"recompPoint": "",
				"recomRegCnt": "",
				"sellUnitPrc": "",
				"sellCapaUnitNmWithUnitCapa": "",
				"replaceBtnDispYn": "N",
				"arrivalNotiBtnDispYn": "N",
				"advertAcctId": "",
				"advertBidId": "",
				"cartPsblType": "",
				"zoomImgUrls": [],
				"benefitGrp1": [],
				"benefitGrp2": [],
				"benefitGrp3": [
				  {
				"type": "160",
				"txt": "청구할인"
				},
				  {
				"type": "180",
				"txt": "무료배송"
				}
				],
				"benefitGrp4": [],
			}
		],
		"pageSize": "1"
		}
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
